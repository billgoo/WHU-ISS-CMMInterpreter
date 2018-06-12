package compiler;

import cmm.CMMBaseVisitor;
import cmm.CMMParser;
import gui.OutStreamGUI;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import scope.GlobalScope;
import scope.Scope;
import scope.Symbol;

/**
 * Created by BG on 2016/12/13.
 */
public class RefPhaseVisitor extends CMMBaseVisitor<ExprReturnVal> {

    private OutStreamGUI gui;

    ParseTreeProperty<Scope> scopes;
    GlobalScope globals;
    Scope currentScope;

    // break的判断标志
    ExprReturnVal erv = new ExprReturnVal(Symbol.Type.NOBREAK,"PDD");

    public RefPhaseVisitor(GlobalScope globals, ParseTreeProperty<Scope> scopes, OutStreamGUI gui) {
        this.gui = gui;
        this.globals = globals;
        this.scopes = scopes;
    }

    @Override
    public ExprReturnVal visitProg(CMMParser.ProgContext ctx) {
        currentScope = globals;
        super.visitProg(ctx);
        return null;
    }

    @Override
    public ExprReturnVal visitStmt(CMMParser.StmtContext ctx) {
        super.visitStmt(ctx);
        return null;
    }

    @Override
    public ExprReturnVal visitStmt_block(CMMParser.Stmt_blockContext ctx) {
        currentScope = scopes.get(ctx);
        super.visitStmt_block(ctx);
        currentScope = currentScope.getEnclosingScope();
        return null;
    }

    @Override
    public ExprReturnVal visitVar_list(CMMParser.Var_listContext ctx) {
        //super.visitVar_list(ctx);

        // 变量类型，变量列表里的变量类型都是相同的
        String typeStr = ctx.getParent().getChild(0).getText();

        // 数组声明
        for(CMMParser.ArrayContext arrayContext: ctx.array()){
            String name = arrayContext.ID().getSymbol().getText();
            if (arrayContext.INT_CONSTANT()==null){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR : array index can not be anything " +
                        "except integer number in line "
                        + arrayContext.ID().getSymbol().getLine());
                return null;
            }
            int size = Integer.parseInt(arrayContext.INT_CONSTANT().getText());
            if(Constant.DEBUG){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("DEBUG: <"
                        + typeStr + " "
                        + name + " size="
                        + size
                        + " >");
            }
            // 在当前作用域内定义，名称，类型，值
            if(typeStr.equals("int")){
                currentScope.define(new Symbol(name, Symbol.Type.tINTARRAY, new int[size]));
            }else if(typeStr.equals("double")){
                currentScope.define(new Symbol(name, Symbol.Type.tDOUBLEARRAY, new double[size]));
            }else if(typeStr.equals("bool")){
                currentScope.define(new Symbol(name, Symbol.Type.tBOOLARRAY, new boolean[size]));
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: unknown type of <"
                        + typeStr
                        + "> in line "
                        + arrayContext.ID().getSymbol().getLine()
                        + " at Line start. ");
            }

        }

        // 普通变量声明
        for(TerminalNode node : ctx.getTokens(CMMParser.ID)){
            if(Constant.DEBUG){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("DEBUG: <"
                        + typeStr + " "
                        + node.getSymbol().getText()
                        + " >");
            }
            // 在当前作用域内定义，这里往符号表里只是添加了变量名和类型，没有值
            if(typeStr.equals("int")){
                currentScope.define(new Symbol(node.getSymbol().getText(),
                        Symbol.Type.tINT));
            }else if(typeStr.equals("double")){
                currentScope.define(new Symbol(node.getSymbol().getText(),
                        Symbol.Type.tDOUBLE));
            }else if(typeStr.equals("bool")){
                currentScope.define(new Symbol(node.getSymbol().getText(),
                        Symbol.Type.tBOOL));
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: unknown type of <"
                        + typeStr
                        + "> in line "
                        + node.getSymbol().getLine()
                        + " at Line start. ");
            }
        }

        // 普通变量在声明时赋值
        for(CMMParser.Decl_assignContext decl_assignContext : ctx.decl_assign()){
            Token token = decl_assignContext.ID().getSymbol();
            String varName = token.getText();
            Symbol symbol = currentScope.resolve(varName);
            ExprComputeVisitor exprComputeVisitor = new ExprComputeVisitor(currentScope, gui);
            ExprReturnVal value = exprComputeVisitor.visit(decl_assignContext.expr());
            if(value.getType() != Symbol.Type.tINT && value.getType() != Symbol.Type.tDOUBLE
                    && value.getType() != Symbol.Type.tBOOL){
                System.setOut(gui);
                System.out.println("ERROR: unmatched type on two side of <"
                        + token.getText()
                        + "> in line "
                        + token.getLine()
                        +":"
                        + token.getCharPositionInLine());
                return null;
            }
            if(Constant.DEBUG){
                System.setOut(gui);
                System.out.println("DEBUG: <"
                        + typeStr + " "
                        + token.getText() + " value="
                        + value.getValue()
                        + " >");
            }
            // 新值覆盖旧值
            if(typeStr.equals("int")){
                currentScope.define(new Symbol(token.getText(),
                        Symbol.Type.tINT,
                        Integer.valueOf(value.getValue().toString())));
            }else if(typeStr.equals("double")){
                currentScope.define(new Symbol(token.getText(),
                        Symbol.Type.tDOUBLE,
                        Double.valueOf(value.getValue().toString())));
            }else if(typeStr.equals("bool")){
                currentScope.define(new Symbol(token.getText(),
                        Symbol.Type.tBOOL,
                        Boolean.valueOf(value.getValue().toString())));
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: unknown type of <"
                        + typeStr
                        + "> in line "
                        + token.getLine()
                        + " at Line start. ");
            }
        }
        return null;
    }



    @Override
    public ExprReturnVal visitAssign_stmt(CMMParser.Assign_stmtContext ctx) {
        super.visitAssign_stmt(ctx);

        if (erv.getType()== Symbol.Type.BREAKPDD){
            return null;
        }

        // 非左值
        if (ctx.value().constant()!=null) {
            TerminalNode[] tokens = {ctx.value().constant().INT_CONSTANT(),
                    ctx.value().constant().HEX_CONSTANT(),
                    ctx.value().constant().FLOAT_LITERAL(),
                    ctx.value().constant().TRUE(),
                    ctx.value().constant().FALSE()};
            for (int i=0; i<5; i++){
                if (tokens[i]!=null){
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: unchangeable left value <"
                            + tokens[i].getSymbol().getText()
                            + "> in line "
                            + tokens[i].getSymbol().getLine()
                            + ":" + tokens[i].getSymbol().getCharPositionInLine());
                    // break;
                    return null;
                }
            }
        }

        if(ctx.value().ID() == null) { // 数组
            Token token = ctx.value().array().ID().getSymbol();
            String varName = token.getText();
            Symbol var = currentScope.resolve(varName);
            if(var == null){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: no such variable <"
                        + varName
                        + "> in line "
                        + token.getLine()
                        + ":" + token.getCharPositionInLine());
                return null;
            }else{// 存在变量
                ExprComputeVisitor exprComputeVisitor = new ExprComputeVisitor(currentScope, gui);
                ExprReturnVal value = exprComputeVisitor.visit(ctx.expr()); // 右边表达式计算得到的值
                int varIndex;

                // 分类索引
                if(ctx.value().array().INT_CONSTANT() != null){ // 索引为int常量
                    varIndex = Integer.parseInt(ctx.value().array().INT_CONSTANT().getText());
                }else{ // 索引为表达式
                    ExprComputeVisitor indexComputeVisitor = new ExprComputeVisitor(currentScope, gui);
                    ExprReturnVal indexValue = indexComputeVisitor.visit(ctx.value().array().expr());
                    if(indexValue.getType() != Symbol.Type.tINT){
                        System.setErr(gui);
                        System.setOut(gui);
                        System.out.println("ERROR: invalid index for <"
                                + varName
                                + "> in line "
                                + token.getLine()
                                + ":" + token.getCharPositionInLine());
                        return null;
                    }
                    varIndex = (Integer) indexValue.getValue();
                }

                TerminalNode[] ops = { ctx.assignment_operator().ASSIGNMENT(),
                        ctx.assignment_operator().MULTI_ASSIG(),
                        ctx.assignment_operator().DIV_ASSIG(),
                        ctx.assignment_operator().PLUS_ASSIG(),
                        ctx.assignment_operator().MINUS_ASSIG() };
                int op_counter = 0;
                for (int i=0; i<5; i++){
                    if (ops[i] != null){
                        op_counter = i + 1;
                        break;
                    }
                }
                // 判断左值类型并计算
                if(var.getType() == Symbol.Type.tINTARRAY){ // int数组
                    int[] varArray = (int[]) var.getValue();
                    // 数组越界检查
                    if(0 <= varIndex && varIndex < varArray.length){
                        if(value.getValue() instanceof Integer){
                            switch (op_counter) {
                                case 1:
                                    varArray[varIndex] = (Integer) value.getValue();
                                    break;
                                case 2:
                                    varArray[varIndex] *= (Integer) value.getValue();
                                    break;
                                case 3:
                                    varArray[varIndex] /= (Integer) value.getValue();
                                    break;
                                case 4:
                                    varArray[varIndex] += (Integer) value.getValue();
                                case 5:
                                    varArray[varIndex] -= (Integer) value.getValue();
                                    break;
                                default:
                                    System.setErr(gui);
                                    System.setOut(gui);
                                    System.out.println("ERROR: do not get operator.");
                                    return null;
                            }
                            // varArray[varIndex] = (Integer) value.getValue();
                        }else{
                            System.setErr(gui);
                            System.setOut(gui);
                            System.out.println("ERROR: unmatched or uncast type during assignment of <"
                                    + varName
                                    + "> in line "
                                    + token.getLine()
                                    +":"
                                    + token.getCharPositionInLine());
                            return null;
                        }
                    }else{
                        System.setErr(gui);
                        System.setOut(gui);
                        System.out.println("ERROR: index out of boundary of array <"
                                + varName
                                + "> in line "
                                + token.getLine()
                                + ":" + token.getCharPositionInLine());
                        return null;
                    }

                }else if(var.getType() == Symbol.Type.tDOUBLEARRAY) { // double数组
                    double[] varArray = (double[]) var.getValue();
                    // 数组越界检查
                    if(0 <= varIndex && varIndex < varArray.length){
                        if(value.getValue() instanceof Double){
                            switch (op_counter) {
                                case 1:
                                    varArray[varIndex] = (Double) value.getValue();
                                    break;
                                case 2:
                                    varArray[varIndex] *= (Double) value.getValue();
                                    break;
                                case 3:
                                    varArray[varIndex] /= (Double) value.getValue();
                                    break;
                                case 4:
                                    varArray[varIndex] += (Double) value.getValue();
                                case 5:
                                    varArray[varIndex] -= (Double) value.getValue();
                                    break;
                                default:
                                    System.setErr(gui);
                                    System.setOut(gui);
                                    System.out.println("ERROR: do not get operator.");
                                    return null;
                            }
                            // varArray[varIndex] = (Double) value.getValue();
                        }else{
                            System.setErr(gui);
                            System.setOut(gui);
                            System.out.println("ERROR: unmatched or uncast type during assignment of <"
                                    + varName
                                    + "> in line "
                                    + token.getLine()
                                    +":"
                                    + token.getCharPositionInLine());
                            return null;
                        }
                    }else{
                        System.setErr(gui);
                        System.setOut(gui);
                        System.out.println("ERROR: index out of boundary of array <"
                                + varName
                                + "> in line "
                                + token.getLine()
                                + ":" + token.getCharPositionInLine());
                        return null;
                    }

                }else { // bool数组
                    boolean[] varArray = (boolean[]) var.getValue();
                    // 数组越界检查
                    if(0 <= varIndex && varIndex < varArray.length){
                        if(value.getValue() instanceof Boolean){
                            switch (op_counter) {
                                case 1:
                                    varArray[varIndex] = (Boolean) value.getValue();
                                    break;
                                case 2:
                                    System.setErr(gui);
                                    System.setOut(gui);
                                    System.out.println("ERROR: operator < "
                                            + ops[op_counter-1].getSymbol().getText()
                                            + " > in line "
                                            + ops[op_counter-1].getSymbol().getLine()
                                            + ":"
                                            + ops[op_counter-1].getSymbol().getCharPositionInLine()
                                            + " can not be applied to \'bool\'");
                                    return null;
                                case 3:
                                    System.setErr(gui);
                                    System.setOut(gui);
                                    System.out.println("ERROR: operator < "
                                            + ops[op_counter-1].getSymbol().getText()
                                            + " > in line "
                                            + ops[op_counter-1].getSymbol().getLine()
                                            + ":"
                                            + ops[op_counter-1].getSymbol().getCharPositionInLine()
                                            + " can not be applied to \'bool\'");
                                    return null;
                                case 4:
                                    System.setErr(gui);
                                    System.setOut(gui);
                                    System.out.println("ERROR: operator < "
                                            + ops[op_counter-1].getSymbol().getText()
                                            + " > in line "
                                            + ops[op_counter-1].getSymbol().getLine()
                                            + ":"
                                            + ops[op_counter-1].getSymbol().getCharPositionInLine()
                                            + " can not be applied to \'bool\'");
                                    return null;
                                case 5:
                                    System.setErr(gui);
                                    System.setOut(gui);
                                    System.out.println("ERROR: operator < "
                                            + ops[op_counter-1].getSymbol().getText()
                                            + " > in line "
                                            + ops[op_counter-1].getSymbol().getLine()
                                            + ":"
                                            + ops[op_counter-1].getSymbol().getCharPositionInLine()
                                            + " can not be applied to \'bool\'");
                                    return null;
                                default:
                                    System.setErr(gui);
                                    System.setOut(gui);
                                    System.out.println("ERROR: do not get operator.");
                                    return null;
                            }
                            // varArray[varIndex] = (Boolean) value.getValue();
                        }else{
                            System.setErr(gui);
                            System.setOut(gui);
                            System.out.println("ERROR: unmatched or uncast type during assignment of <"
                                    + varName
                                    + "> in line "
                                    + token.getLine()
                                    +":"
                                    + token.getCharPositionInLine());
                            return null;
                        }
                    }else{
                        System.setErr(gui);
                        System.setOut(gui);
                        System.out.println("ERROR: index out of boundary of array <"
                                + varName
                                + "> in line "
                                + token.getLine()
                                + ":" + token.getCharPositionInLine());
                        return null;
                    }

                }
            }
        }else{ // 普通变量
            Token token = ctx.value().ID().getSymbol();
            String varName = token.getText();
            Symbol var = currentScope.resolve(varName);
            if(var == null){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: no such variable <"
                        + varName
                        + "> in line "
                        + token.getLine()
                        + ":" + token.getCharPositionInLine());
                return null;
            }else{ // 变量存在
                ExprComputeVisitor exprComputeVisitor = new ExprComputeVisitor(currentScope, gui);
                ExprReturnVal value = exprComputeVisitor.visit(ctx.expr());
                // 赋值符号
                TerminalNode[] ops = { ctx.assignment_operator().ASSIGNMENT(),
                        ctx.assignment_operator().MULTI_ASSIG(),
                        ctx.assignment_operator().DIV_ASSIG(),
                        ctx.assignment_operator().PLUS_ASSIG(),
                        ctx.assignment_operator().MINUS_ASSIG() };
                int op_counter = 0;
                for (int i=0; i<5; i++){
                    if (ops[i] != null){
                        op_counter = i + 1;
                        break;
                    }
                }

                if(var.getType() != value.getType()){
                    Token assign = ops[op_counter-1].getSymbol(); // 找到等号方便定位错误

                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: unmatched type on two side of <"
                            + assign.getText()
                            + "> in line "
                            + assign.getLine()
                            +":"
                            + assign.getCharPositionInLine());
                    return null;
                }else{
                    // 先判断是否是bool
                    if(value.getValue() instanceof Boolean) {
                        switch (op_counter) {
                            case 1:
                                var.setValue(value.getValue());
                                break;
                            case 2:
                                System.setErr(gui);
                                System.setOut(gui);
                                System.out.println("ERROR: operator < "
                                        + ops[op_counter-1].getSymbol().getText()
                                        + " > in line "
                                        + ops[op_counter-1].getSymbol().getLine()
                                        + ":"
                                        + ops[op_counter-1].getSymbol().getCharPositionInLine()
                                        + " can not be applied to \'bool\'");
                                return null;
                            case 3:
                                System.setErr(gui);
                                System.setOut(gui);
                                System.out.println("ERROR: operator < "
                                        + ops[op_counter-1].getSymbol().getText()
                                        + " > in line "
                                        + ops[op_counter-1].getSymbol().getLine()
                                        + ":"
                                        + ops[op_counter-1].getSymbol().getCharPositionInLine()
                                        + " can not be applied to \'bool\'");
                                return null;
                            case 4:
                                System.setErr(gui);
                                System.setOut(gui);
                                System.out.println("ERROR: operator < "
                                        + ops[op_counter-1].getSymbol().getText()
                                        + " > in line "
                                        + ops[op_counter-1].getSymbol().getLine()
                                        + ":"
                                        + ops[op_counter-1].getSymbol().getCharPositionInLine()
                                        + " can not be applied to \'bool\'");
                                return null;
                            case 5:
                                System.setErr(gui);
                                System.setOut(gui);
                                System.out.println("ERROR: operator < "
                                        + ops[op_counter-1].getSymbol().getText()
                                        + " > in line "
                                        + ops[op_counter-1].getSymbol().getLine()
                                        + ":"
                                        + ops[op_counter-1].getSymbol().getCharPositionInLine()
                                        + " can not be applied to \'bool\'");
                                return null;
                            default:
                                System.setErr(gui);
                                System.setOut(gui);
                                System.out.println("ERROR: do not get operator.");
                                return null;
                        }
                    }else if(value.getValue() instanceof Double){
                        // 新值覆盖旧值
                        // 方法待调试
                        switch (op_counter) {
                            case 1:
                                var.setValue(value.getValue());
                                break;
                            case 2:
                                var.setValue( (Double)var.getValue()
                                        * (Double)value.getValue() );
                                break;
                            case 3:
                                var.setValue( (Double)var.getValue()
                                        / (Double)value.getValue() );
                                break;
                            case 4:
                                var.setValue( (Double)var.getValue()
                                        + (Double)value.getValue() );
                            case 5:
                                var.setValue( (Double)var.getValue()
                                        - (Double)value.getValue() );
                                break;
                            default:
                                System.setErr(gui);
                                System.setOut(gui);
                                System.out.println("ERROR: do not get operator.");
                                return null;
                        }
                    }else if(value.getValue() instanceof Integer){
                        // 新值覆盖旧值
                        // 方法待调试
                        switch (op_counter) {
                            case 1:
                                var.setValue(value.getValue());
                                break;
                            case 2:
                                var.setValue( (Integer)var.getValue()
                                        * (Integer)value.getValue() );
                                break;
                            case 3:
                                var.setValue( (Integer)var.getValue()
                                        / (Integer)value.getValue() );
                                break;
                            case 4:
                                var.setValue( (Integer)var.getValue()
                                        + (Integer)value.getValue() );
                            case 5:
                                var.setValue( (Integer)var.getValue()
                                        - (Integer)value.getValue() );
                                break;
                            default:
                                System.setErr(gui);
                                System.setOut(gui);
                                System.out.println("ERROR: do not get operator.");
                                return null;
                        }
                    }

                    // var.setValue(value.getValue());
                }
            }
        }

        return null;
    }

    // 重写read函数，引入输入控制台机制
    @Override
    public ExprReturnVal visitRead_stmt(CMMParser.Read_stmtContext ctx) {
        super.visitRead_stmt(ctx);

        if (erv.getType()== Symbol.Type.BREAKPDD){
            return null;
        }

        Token token = null;
        if(ctx.ID() == null){ // 数组
            token = ctx.array().ID().getSymbol();
            String varName = token.getText();
            Symbol var = currentScope.resolve(varName);
            if(var == null){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: no such variable <"
                        + varName
                        + "> in line "
                        + token.getLine()
                        + ":" + token.getCharPositionInLine());
                return null;
            }
            int varIndex = Integer.parseInt(ctx.array().INT_CONSTANT().getText());
            if(var.getType() == Symbol.Type.tINTARRAY){ // int数组

                int[] varArray = (int[]) var.getValue();

                // 数组越界检查
                if(0 <= varIndex && varIndex < varArray.length){
                    String txtInput = "";
                    int in = Integer.parseInt(gui.input());
                    varArray[varIndex] = in;
                    //FrameBottom.getInstance().getTab(2).getJTextArea().setText("");

                }else{
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: index out of boundary of array <"
                            + varName
                            + "> in line "
                            + token.getLine()
                            + ":" + token.getCharPositionInLine());
                }

            }else if(var.getType() == Symbol.Type.tDOUBLEARRAY){ // doublet数组

                double[] varArray = (double[]) var.getValue();

                // 数组越界检查
                if(0 <= varIndex && varIndex < varArray.length){
                    String txtInput = "";
                    double in = Double.parseDouble(gui.input());
                    varArray[varIndex] = in;
                }else{
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: index out of boundary of array <"
                            + varName
                            + "> in line "
                            + token.getLine()
                            + ":" + token.getCharPositionInLine());
                }

            }else{ // bool数组

                boolean[] varArray = (boolean[]) var.getValue();

                // 数组越界检查
                if(0 <= varIndex && varIndex < varArray.length){
                    String txtInput = "";
                    boolean in = Boolean.parseBoolean(gui.input());
                    varArray[varIndex] = in;
                    //FrameBottom.getInstance().getTab(2).getJTextArea().setText("");

                }else{
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: index out of boundary of array <"
                            + varName
                            + "> in line "
                            + token.getLine()
                            + ":" + token.getCharPositionInLine());
                }

            }
        }else{ // 普通变量
            token = ctx.ID().getSymbol();
            String varName = token.getText();
            Symbol var = currentScope.resolve(varName);
            if(var == null){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: no such variable <"
                        + varName
                        + "> in line "
                        + token.getLine()
                        + ":" + token.getCharPositionInLine());
                return null;
            }

            if(var.getType() == Symbol.Type.tINT){
                String txtInput = "";
                int in = Integer.parseInt(gui.input());
                var.setValue(in);
            }else if(var.getType() == Symbol.Type.tDOUBLE) {
                String txtInput = "";
                double in = Double.parseDouble(gui.input());
                var.setValue(in);
            }else { // bool
                String txtInput = "";
                boolean in = Boolean.parseBoolean(gui.input());
                var.setValue(in);
            }

        }
        return null;
    }

    /**
     * 重写write方法
     * 设置了各种write的变种
     * 为了方便判断
     * 将文法进行了拆分
     * 最终重定向输出打印结果
     */
    // 最基本的直接打印表达式
    @Override
    public ExprReturnVal visitW_E(CMMParser.W_EContext ctx) {
        // return visitChildren(ctx);
        super.visitW_E(ctx);

        if (erv.getType()== Symbol.Type.BREAKPDD){
            return null;
        }

        ExprComputeVisitor exprComputeVisitor = new ExprComputeVisitor(currentScope, gui);
        Object value = exprComputeVisitor.visit(ctx.expr()).getValue();
        // io.output(value);
        System.setErr(gui);
        System.setOut(gui);
        System.out.println(value);
        return null;
    }
    // 打印字符串
    @Override
    public ExprReturnVal visitW_S(CMMParser.W_SContext ctx) {
        // return visitChildren(ctx);
        super.visitW_S(ctx);

        if (erv.getType()== Symbol.Type.BREAKPDD){
            return null;
        }

        int len = ctx.STRING_LITERAL().getText().length();
        String s = ctx.STRING_LITERAL().getText().substring(1,len-1);
        // 这里的string未处理，可能存在头尾有""和转义字符的问题，调试时再说
        // io.output(value);
        System.setErr(gui);
        System.setOut(gui);
        if (s.contains("\"")) {
            System.out.println("ERROR: have illegal character "
                    + " single < \" > in \'String\' "
                    + "in line "
                    + ctx.STRING_LITERAL().getSymbol().getLine()
                    + " : "
                    + ctx.STRING_LITERAL().getSymbol().getCharPositionInLine());
            return null;
        }else {
            System.out.println(s);
        }
        // System.out.println(s);
        return null;
    }

    // 打印字符串或等式
    @Override
    public ExprReturnVal visitW_ES_C(CMMParser.W_ES_CContext ctx) {
        // return visitChildren(ctx);
        super.visitW_ES_C(ctx);

        if (erv.getType()== Symbol.Type.BREAKPDD){
            return null;
        }

        int size = ctx.getChildCount();
        String output = "";
        for (int i=2;i<size-2;){
            if (ctx.getChild(i).getText().contains("\"")){
                int len = ctx.getChild(i).getText().length();
                String s = ctx.getChild(i).getText().substring(1,len-1);
                // 这里的string未处理，可能存在头尾有""和转义字符的问题，调试时再说
                // 还有不明确的是用node这个方法能否get到真正的文字
                // io.output(value);
                System.setErr(gui);
                System.setOut(gui);
                if (s.contains("\"")) {
                    System.out.println("ERROR: have illegal character "
                            + " single < \" > in \'String\' "
                            + "in line "
                            + ctx.WRITE().getSymbol().getLine()
                            + " in WRITE function.");
                    return null;
                }else {
                    //System.out.println(s);
                    output += s;
                }
                /*for (TerminalNode node : ctx.getTokens(CMMParser.STRING_LITERAL)){

                }*/
            }
            else {
                ExprComputeVisitor exprComputeVisitor = new ExprComputeVisitor(currentScope, gui);
                Object value = exprComputeVisitor.visit(ctx.getChild(i)).getValue();
                // io.output(value);
                System.setErr(gui);
                System.setOut(gui);
                //System.out.println(value);
                output += value;
                /*for (CMMParser.ExprContext exprContext : ctx.expr()){

                }*/
            }
            i+=2;
        }
        System.out.println(output);
        return null;
    }

    //格式化输出
    @Override
    public ExprReturnVal visitW_E_E(CMMParser.W_E_EContext ctx) {
        // return visitChildren(ctx);
        super.visitW_E_E(ctx);

        if (erv.getType()== Symbol.Type.BREAKPDD){
            return null;
        }


        // 先计算
        ExprComputeVisitor exprComputeVisitor = new ExprComputeVisitor(currentScope, gui);
        Object value = exprComputeVisitor.visit(ctx.expr()).getValue();

        // 处理格式控制符
        // 强制类型转换
        System.setErr(gui);
        System.setOut(gui);
        Token eff = ctx.EFFECTOR().getSymbol();

        if (eff.getText().equals("\'%d\'")){
            if (exprComputeVisitor.visit(ctx.expr()).getType() == Symbol.Type.tINT){
                System.out.println(value);
            }else if (exprComputeVisitor.visit(ctx.expr()).getType()
                    == Symbol.Type.tDOUBLE) {
                System.out.println(value);
            }else { // bool and other
                System.out.println("ERROR: can not use this effector to cast value < "
                        + value.toString()
                        + " > in line "
                        + ctx.EFFECTOR().getSymbol().getLine()
                        + " : "
                        + ctx.EFFECTOR().getSymbol().getCharPositionInLine());
                return null;
            }
            // System.out.println(value);
        }else if (eff.getText().equals("\'%f\'")){
            if (exprComputeVisitor.visit(ctx.expr()).getType() == Symbol.Type.tINT){
                System.out.println(Double.valueOf(value.toString()));
            }else if (exprComputeVisitor.visit(ctx.expr()).getType()
                    == Symbol.Type.tDOUBLE) {
                System.out.println(value);
            }else { // bool and other
                System.out.println("ERROR: can not use this effector to cast value < "
                        + value.toString()
                        + " > in line "
                        + ctx.EFFECTOR().getSymbol().getLine()
                        + " : "
                        + ctx.EFFECTOR().getSymbol().getCharPositionInLine());
                return null;
            }

        }else if (eff.getText().equals("\'%h\'")){
            if (exprComputeVisitor.visit(ctx.expr()).getType() == Symbol.Type.tINT){
                int hex_num = Integer.valueOf(value.toString());
                System.out.println(Integer.toHexString(hex_num));
            }else { // bool and other
                System.out.println("ERROR: can not cast value < "
                        + value.toString()
                        + " > in line "
                        + ctx.EFFECTOR().getSymbol().getLine()
                        + " to HEX number use effector %h at "
                        + ctx.EFFECTOR().getSymbol().getLine()
                        + ":"
                        + ctx.EFFECTOR().getSymbol().getCharPositionInLine());
                return null;
            }
        }else { // other effector
            System.out.println("ERROR: undefined effector < "
                    + eff.getText()
                    + " > in line "
                    + ctx.EFFECTOR().getSymbol().getLine()
                    + ":"
                    + ctx.EFFECTOR().getSymbol().getCharPositionInLine());
            return null;
        }
        // System.out.println(value);
        return null;
    }

    /**
     * if else的各种变种
     * 为了减少判断
     * 在文法了进行了拆分
     * I--If
     * S--Stmt
     * SB--Stmt_Block
     * E--Else
     * --@isExprTrue 是定义条件是否正确的函数
     *
     */

    @Override
    public ExprReturnVal visitI_S(CMMParser.I_SContext ctx) {
        if(isExprTrue(ctx.expr())){
            visit(ctx.stmt());

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }
        return null;
    }

    @Override
    public ExprReturnVal visitI_SB(CMMParser.I_SBContext ctx) {
        if(isExprTrue(ctx.expr())){
            visit(ctx.stmt_block());

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }
        return null;
    }

    @Override
    public ExprReturnVal visitI_S_E_S(CMMParser.I_S_E_SContext ctx) {
        if(isExprTrue(ctx.expr())){
            visit(ctx.stmt(0));

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }else{
            visit(ctx.stmt(1));

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }
        return null;
    }

    @Override
    public ExprReturnVal visitI_S_E_SB(CMMParser.I_S_E_SBContext ctx) {
        if(isExprTrue(ctx.expr())){
            visit(ctx.stmt());

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }else{
            visit(ctx.stmt_block());

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }
        return null;
    }

    @Override
    public ExprReturnVal visitI_SB_E_S(CMMParser.I_SB_E_SContext ctx) {
        if(isExprTrue(ctx.expr())){
            visit(ctx.stmt_block());

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }else{
            visit(ctx.stmt());

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }
        return null;
    }

    @Override
    public ExprReturnVal visitI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx) {
        if(isExprTrue(ctx.expr())){
            visit(ctx.stmt_block(0));

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }else{
            visit(ctx.stmt_block(1));

            if (erv.getType()== Symbol.Type.BREAKPDD){
                return null;
            }
        }
        return null;
    }

    //
    private boolean isExprTrue(CMMParser.ExprContext ctx){
        ExprComputeVisitor exprComputeVisitor = new ExprComputeVisitor(currentScope, gui);
        ExprReturnVal value = exprComputeVisitor.visit(ctx);
        if(value.getType() == Symbol.Type.tBOOL){
            return (Boolean) value.getValue();
        }else if(value.getType() == Symbol.Type.tINT){
            return (Integer) value.getValue() > 0;
        }else{
            return (Double) value.getValue() > 0;
        }
    }
    //============================= end if else ==========================

    @Override
    public ExprReturnVal visitWH_SB(CMMParser.WH_SBContext ctx) {
        int loop = 0;
        int breakSymbol = 0;

        if (erv.getType()== Symbol.Type.BREAKPDD){
            return null;
        }
        while (isExprTrue(ctx.expr())) {
            visit(ctx.stmt_block());
            if (erv.getType()== Symbol.Type.BREAKPDD){
                breakSymbol=1;
            }
            if (breakSymbol==1){
                erv.setType(Symbol.Type.NOBREAK);
                break;
            }
            //visit(ctx.stmt_block());
            loop++;
            if (loop==32768){
                // 暂时定义到2^10
                // 应该不会用超了
                System.setOut(gui);
                System.out.println("Error : infinite loop");
                return null;
            }
        }
        return null;
    }

    @Override
    public ExprReturnVal visitBreak_stmt(CMMParser.Break_stmtContext ctx) {
        super.visitBreak_stmt(ctx);
        erv.setType(Symbol.Type.BREAKPDD);
        return erv;
    }

    @Override
    public ExprReturnVal visitVar_decl(CMMParser.Var_declContext ctx) {

        if (erv.getType()== Symbol.Type.BREAKPDD){
            return null;
        }
        return null;
    }

}
