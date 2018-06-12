package generatecode;

import cmm.CMMBaseListener;
import cmm.CMMParser;
import generatecode.scope.*;
import gui.FrameCenter;
import gui.OutStreamGUI;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import generatecode.util.element;
import org.antlr.v4.runtime.tree.TerminalNode;
import scope.GlobalScope;
import scope.LocalScope;
import scope.Scope;
import scope.Symbol;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by BG on 2016/12/03.
 * 中间代码生成模块
 */
public class DefPhase extends CMMBaseListener {

    HashMap<String,String> templist=new HashMap<String, String>();
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    public GlobalScope globalScope;
    public Scope currentScope;
    int tempNum=0;

    OutStreamGUI gui = new OutStreamGUI(
            System.out, FrameCenter.getInstance().getTab(3).getJTextArea());

    Stack if_stack = new Stack();
    Stack while_stack = new Stack();
    Stack else_stack = new Stack();
    Stack temp_stack = new Stack();

    // 子表达式1，2的临时判断参数
    boolean b1 = false, b2 = false, c1 = false, c2 = false;
    // 子表达式1，2和比较运算符
    String op1 = "" , op2 = "", operator = "";

    LinkedList<element> intermediateCode = new LinkedList<element>();

    @Override
    public void enterProg(CMMParser.ProgContext ctx) {
        globalScope = new GlobalScope(null);
        currentScope = globalScope;
    }

    @Override
    public void exitProg(CMMParser.ProgContext ctx) {
        System.out.println(globalScope);
    }

    @Override
    public void enterStmt_block(CMMParser.Stmt_blockContext ctx) {
        // super.enterStmt_block(ctx);
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitStmt_block(CMMParser.Stmt_blockContext ctx) {
        // super.exitStmt_block(ctx);
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void exitVar_decl(CMMParser.Var_declContext ctx) {

        int varNum = 0;
        int arrNum = 0;
        String type = ctx.getChild(0).getText();
        int size = ctx.getChild(1).getChildCount();
        for (int i=0;i<size;i++){
            if (ctx.getChild(1).getChild(i).getText().contains("=")){
                interpretExp(ctx.getChild(1).getChild(i).getChild(2));
                element formula = new element(type,
                        ctx.getChild(1).getChild(i).getChild(0).getText(),
                        getLastTempName(), " ");
                intermediateCode.add(formula);
            }else if (ctx.getChild(1).getChild(i).getText().contains("[")){
                String s = ctx.getChild(1).getChild(i).getText().substring(
                        ctx.getChild(1).getChild(i).getText().indexOf("[")+1,
                        ctx.getChild(1).getChild(i).getText().indexOf("]")
                );
                if (!isNum(s)){
                    System.out.println(s+" is not available in [] when declare array!");
                }else {

                    element formula = new element(type,
                            ctx.getChild(1).getChild(i).getText(), " ", " ");
                    intermediateCode.add(formula);
                }
            }else if (ctx.getChild(1).getChild(i).getText().contains("_")
                    || isIdent(ctx.getChild(1).getChild(i).getText())){
                interpretExp(ctx.getChild(1).getChild(i));
                element formula = new element(type,
                        ctx.getChild(1).getChild(i).getText(), " ", " ");
                intermediateCode.add(formula);
            }
        }
    }

    /*======= if begin =======*/
    //
    @Override
    public void enterI_S(CMMParser.I_SContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        // String s = ctx.expr();

        // 中间代码生成
        intermediateCode.add(new element("in", " ", " ", " "));

        int if_startPosition = intermediateCode.size()+1;
        if_stack.push(if_startPosition);

        // value
        interpretExp(ctx.expr());

        element jump1 = new element("jmp", getLastTempName(), " ", " ");
        intermediateCode.add(jump1);
    }

    @Override
    public void exitI_S(CMMParser.I_SContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        // generation code
        int count = ctx.getChildCount();

        int endPosition = intermediateCode.size()+1;
        String if_startPosition = if_stack.pop().toString();
        intermediateCode.get(Integer.parseInt(if_startPosition)).setResult(endPosition+"");
        intermediateCode.add(new element("out", " ", " ", " "));
    }

    //
    @Override
    public void enterI_SB(CMMParser.I_SBContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        // String s = ctx.expr();

        // 中间代码生成
        intermediateCode.add(new element("in", " ", " ", " "));

        int if_startPosition = intermediateCode.size()+1;
        if_stack.push(if_startPosition);
        // value
        interpretExp(ctx.expr());

        element jump1 = new element("jmp", getLastTempName(), " ", " ");
        intermediateCode.add(jump1);
    }

    @Override
    public void exitI_SB(CMMParser.I_SBContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        // generation code
        int count = ctx.getChildCount();

        int endPosition = intermediateCode.size()+1;
        String if_startPosition = if_stack.pop().toString();
        intermediateCode.get(Integer.parseInt(if_startPosition)).setResult(endPosition+"");
        intermediateCode.add(new element("out", " ", " ", " "));
    }

    //
    @Override
    public void enterI_S_E_S(CMMParser.I_S_E_SContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        // String s = ctx.expr();

        // 中间代码生成
        intermediateCode.add(new element("in", " ", " ", " "));

        int if_startPosition = intermediateCode.size()+1;
        if_stack.push(if_startPosition);

        // value
        interpretExp(ctx.expr());

        element jump1 = new element("jmp", getLastTempName(), " ", " ");
        intermediateCode.add(jump1);
    }

    @Override
    public void exitI_S_E_S(CMMParser.I_S_E_SContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        // generation code
        int count = ctx.getChildCount();

        // ELSE
        intermediateCode.add(new element("jmp", " ", " ", " "));
        int position1 = intermediateCode.size()+1;
        String if_startPosition = if_stack.pop().toString();

        intermediateCode.get(Integer.parseInt(if_startPosition)).setResult(position1+"");
        int else_startPosition1 = position1-2;
        else_stack.push(else_startPosition1);

        // EXIT IF
        int position2 = intermediateCode.size()+1;
        String else_startPosition2 = else_stack.pop().toString();
        intermediateCode.get(Integer.parseInt(else_startPosition2)).setResult(position2+"");
        intermediateCode.add(new element("out", " ", " ", " "));
    }

    //
    @Override
    public void enterI_S_E_SB(CMMParser.I_S_E_SBContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        // String s = ctx.expr();

        // 中间代码生成
        intermediateCode.add(new element("in", " ", " ", " "));

        int if_startPosition = intermediateCode.size()+1;
        if_stack.push(if_startPosition);
        // value
        interpretExp(ctx.expr());

        element jump1 = new element("jmp", getLastTempName(), " ", " ");
        intermediateCode.add(jump1);
    }

    @Override
    public void exitI_S_E_SB(CMMParser.I_S_E_SBContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        // generation code
        int count = ctx.getChildCount();

        // ELSE
        intermediateCode.add(new element("jmp", " ", " ", " "));
        int position1 = intermediateCode.size()+1;
        String if_startPosition = if_stack.pop().toString();

        intermediateCode.get(Integer.parseInt(if_startPosition)).setResult(position1+"");
        int else_startPosition1 = position1-2;
        else_stack.push(else_startPosition1);

        // EXIT IF
        int position2 = intermediateCode.size()+1;
        String else_startPosition2 = else_stack.pop().toString();
        intermediateCode.get(Integer.parseInt(else_startPosition2)).setResult(position2+"");
        intermediateCode.add(new element("out", " ", " ", " "));
    }

    //
    @Override
    public void enterI_SB_E_S(CMMParser.I_SB_E_SContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        // String s = ctx.expr();

        // 中间代码生成
        intermediateCode.add(new element("in", " ", " ", " "));

        int if_startPosition = intermediateCode.size()+1;
        if_stack.push(if_startPosition);
        // value
        interpretExp(ctx.expr());

        element jump1 = new element("jmp", getLastTempName(), " ", " ");
        intermediateCode.add(jump1);
    }

    @Override
    public void exitI_SB_E_S(CMMParser.I_SB_E_SContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        // generation code
        int count = ctx.getChildCount();

        // ELSE
        intermediateCode.add(new element("jmp", " ", " ", " "));
        int position1 = intermediateCode.size()+1;
        String if_startPosition = if_stack.pop().toString();

        intermediateCode.get(Integer.parseInt(if_startPosition)).setResult(position1+"");
        int else_startPosition1 = position1-2;
        else_stack.push(else_startPosition1);

        // EXIT IF
        int position2 = intermediateCode.size()+1;
        String else_startPosition2 = else_stack.pop().toString();
        intermediateCode.get(Integer.parseInt(else_startPosition2)).setResult(position2+"");
        intermediateCode.add(new element("out", " ", " ", " "));
    }

    //
    @Override
    public void enterI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        // String s = ctx.expr();

        // 中间代码生成
        intermediateCode.add(new element("in", " ", " ", " "));

        int if_startPosition = intermediateCode.size()+1;
        if_stack.push(if_startPosition);
        // value
        interpretExp(ctx.expr());

        element jump1 = new element("jmp", getLastTempName(), " ", " ");
        intermediateCode.add(jump1);
    }

    @Override
    public void exitI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        // generation code
        int count = ctx.getChildCount();

        // ELSE
        intermediateCode.add(new element("jmp", " ", " ", " "));
        int position1 = intermediateCode.size()+1;
        String if_startPosition = if_stack.pop().toString();

        intermediateCode.get(Integer.parseInt(if_startPosition)).setResult(position1+"");
        int else_startPosition1 = position1-2;
        else_stack.push(else_startPosition1);

        // EXIT IF
        int position2 = intermediateCode.size()+1;
        String else_startPosition2 = else_stack.pop().toString();
        intermediateCode.get(Integer.parseInt(else_startPosition2)).setResult(position2+"");
        intermediateCode.add(new element("out", " ", " ", " "));
    }
    /*======= if end =======*/

    /*===== WHILE =====*/
    @Override
    public void enterWH_SB(CMMParser.WH_SBContext ctx) {
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
        // String s = ctx.expr();

        // 中间代码生成
        intermediateCode.add(new element("in", " ", " ", " "));

        int while_startPosition = intermediateCode.size()+1;
        while_stack.push(while_startPosition);

        // value
        interpretExp(ctx.expr());

        element jump1 = new element("jmp", getLastTempName(), " ", " ");
        intermediateCode.add(jump1);
    }

    @Override
    public void exitWH_SB(CMMParser.WH_SBContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        // generation code
        String while_startPosition = while_stack.pop().toString();
        intermediateCode.add(new element("jmp", " ", " ", while_startPosition+""));
        int endposition = intermediateCode.size()+1;
        intermediateCode.get(Integer.parseInt(while_startPosition)).setResult(endposition+"");
        intermediateCode.add(new element("out", " ", " ", " "));
    }
    /*===== WHILE =====*/

    /*======= WRITE =======*/
    @Override
    public void exitW_E(CMMParser.W_EContext ctx) {
        interpretExp(ctx.expr().getChild(0));
        element formula = new element("write", " ", " ", getLastTempName());
        intermediateCode.add(formula);
    }

    @Override
    public void exitW_S(CMMParser.W_SContext ctx) {
        int size = ctx.STRING_LITERAL().getText().length();
        element formula = new element("write_string", " ", " ",
                ctx.STRING_LITERAL().getText().substring(1,size-1));
        intermediateCode.add(formula);
    }

    @Override
    public void exitW_ES_C(CMMParser.W_ES_CContext ctx) {
        int count = ctx.expr().size();
        for (int i=0; i<count; i++){
            interpretExp(ctx.expr(i).getChild(0));
            element formula = new element("write", " ", " ", getLastTempName());
            intermediateCode.add(formula);
        }
        for (TerminalNode node : ctx.STRING_LITERAL()){
            element formula = new element("write_string", " ", " ",
                    node.toString());
            intermediateCode.add(formula);
        }

    }
    @Override
    public void exitW_E_E(CMMParser.W_E_EContext ctx) {
        interpretExp(ctx.expr());
        String eff = ctx.EFFECTOR().getSymbol().getText();
        element formula = new element("write_format", eff, " ", getLastTempName());
        intermediateCode.add(formula);
    }
    /*======= WRITE =======*/

    @Override
    public void exitAssign_stmt(CMMParser.Assign_stmtContext ctx) {

        interpretExp(ctx.expr());
        String exp_value = getLastTempName();
        interpretExp(ctx.value());
        String value_temp = getLastTempName();
        element formula = new element(ctx.assignment_operator().getText(),
                exp_value, " ", value_temp);
        intermediateCode.add(formula);
    }

    void saveScope(ParserRuleContext ctx, Scope s) { scopes.put(ctx, s); }

    @Override
    public void exitRead_stmt(CMMParser.Read_stmtContext ctx) {
        if (ctx.ID()==null){
            //interpretExp(ctx.array());
            String index = ctx.getChild(2).getText().substring(ctx.getChild(2).getText().indexOf("[")+1,
                    ctx.getChild(2).getText().indexOf("]"));
            op1=ctx.getChild(2).getText().substring(0, ctx.getChild(2).getText().indexOf("["));
            if (!isNum(index)){
                interpretExp(ctx.getChild(2).getChild(2));
                element condition = new element("array",op1+"["+getLastTempName()+"]",
                        " ",generateTempName());
                intermediateCode.add(condition);
            }else {
                element condition = new element("array",op1+"["+index+"]",
                        " ",generateTempName());
                intermediateCode.add(condition);
            }
            element formula = new element("read"," "," ", getLastTempName());
            intermediateCode.add(formula);
        }else {
            element formula = new element("read"," "," ",
                    ctx.ID().getSymbol().getText());
            intermediateCode.add(formula);
        }
    }

    void defineVar(CMMParser.Base_typeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = CheckSymbols.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var); // Define symbol in current scope
    }

    void defineArr(CMMParser.Base_typeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = CheckSymbols.getArrType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var); // Define symbol in current scope
    }

    public boolean isNum(String str){
        if (str.equals("true") || str.equals("TRUE")
                || str.equals("false") || str.equals("FALSE")){
            return true;
        }
        if (str.startsWith("(") && str.endsWith(")")){
            str = str.substring(1,str.length()-1);
        }
        if(str.startsWith("-")){
            str = str.substring(1,str.length());
        }
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))) {
                if (!str.substring(i,i+1).equals(".")) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isIdent(String str){
        if (str.equals("true") || str.equals("TRUE")
                || str.equals("false") || str.equals("FALSE")){
            return false;
        }else {
            boolean isWord = str.matches("[a-zA-Z0-9]+");
            return isWord;
        }
    }

    public boolean isExpr(String s){
        String ops[]={"<",">","==","!=","<=",">=","<>","+","-","*","/","%"};
        if(s.startsWith("-")) {
            s=s.substring(1);
            for (int i = 0; i < ops.length; i++) {
                if (s.contains(ops[i])) return true;
            }
        }else{
            for (int i = 0; i < ops.length; i++) {
                if (s.contains(ops[i])) return true;
            }
        }
        return false;
    }

    public element createformula(String l, String op, String r,String temp){
        element formula = new element(op,l,r,temp);
        intermediateCode.add(formula);
        return formula;
    }

    private String generateTempName(){
        String name = "#temp"+tempNum;
        tempNum++;
        temp_stack.push(name);
        return name;
    }

    private String getLastTempName(){
        temp_stack.pop();
        return intermediateCode.get(intermediateCode.size()-1).getResult();
    }

    // 翻译EXPR用
    private void interpretExp(ParseTree exp) {
        if (exp.getChildCount()==3){ // 多项式
            Stack<String> ops1 = new Stack<String>();
            Stack<String> ops2 = new Stack<String>();
            if (exp.getChild(0).getText().equals("("))
            {
                interpretExp(exp.getChild(1));
            }else { //math logic
                if (!isNum(exp.getChild(0).getText()) && !isIdent(exp.getChild(0).getText())){
                    interpretExp(exp.getChild(0));
                    //op1=getLastTempName();
                    ops1.push(getLastTempName());
                }else {
                    //op1=exp.getChild(0).getText();
                    ops1.push(exp.getChild(0).getText());
                }
                if (!isNum(exp.getChild(2).getText()) && !isIdent(exp.getChild(2).getText())){
                    interpretExp(exp.getChild(2));
                    //op2=getLastTempName();
                    ops2.push(getLastTempName());
                }else {
                    //op2=exp.getChild(2).getText();
                    ops2.push(exp.getChild(2).getText());
                }
                operator = exp.getChild(1).getText();
                element condition = new element(operator,ops1.pop(),ops2.pop(),generateTempName());
                intermediateCode.add(condition);
            }
        }else if (exp.getChildCount()==2){ // 项
            op1=exp.getText();
            element condition = new element("unary",op1," ",generateTempName());
            intermediateCode.add(condition);
        }else if (exp.getChildCount()==1){
            if (exp.getText().contains("[")){ // 数组
                String index = exp.getText().substring(exp.getText().indexOf("[")+1,
                        exp.getText().indexOf("]"));
                   op1=exp.getText().substring(0, exp.getText().indexOf("["));
                if (!isNum(index)){
                    interpretExp(exp.getChild(0).getChild(2));
                    element condition = new element("array",op1+"["+getLastTempName()+"]",
                            " ",generateTempName());
                    intermediateCode.add(condition);
                }else {
                    element condition = new element("array",op1+"["+index+"]",
                            " ",generateTempName());
                    intermediateCode.add(condition);
                }
            }else { // value
                op1=exp.getText();
                element condition = new element("value",op1," ",generateTempName());
                intermediateCode.add(condition);
            }
        }
    }

    // 测试用
    public void display(){
        for(int i=0;i<intermediateCode.size();i++){
            String a = intermediateCode.get(i).getType();
            String b = intermediateCode.get(i).getOperator1();
            String c = intermediateCode.get(i).getOperator2();
            String d = intermediateCode.get(i).getResult();
            System.out.println((i+1)+"\t:\t("+a+",\t"+b+",\t"+c+",\t"+d+")");
        }
    }

    public LinkedList getList(){ return intermediateCode;}
}
