package compiler;

import cmm.CMMBaseListener;
import cmm.CMMParser;
import gui.FrameBottom;
import gui.OutStreamGUI;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import scope.GlobalScope;
import scope.LocalScope;
import scope.Scope;
import scope.Symbol;

/**
 * Created by BG on 2016/12/13.
 * 变量定义阶段的监听器
 */
public class DefPhaseListener extends CMMBaseListener {

    private OutStreamGUI gui = new OutStreamGUI(
            System.out, FrameBottom.getInstance().getTab(1).getJTextArea());;

    // System.setErr(gui);
    // System.setOut(gui);

    public DefPhaseListener(OutStreamGUI gui) {
        this.gui = gui;
    }

    // 是一个IdentityHashMap<ParseTree,T>
    public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    public GlobalScope globals;
    Scope currentScope;

    public void saveScope(ParserRuleContext ctx, Scope scope){
        scopes.put(ctx, scope);
    }

    @Override
    public void enterProg(CMMParser.ProgContext ctx) {
        super.enterProg(ctx);
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    @Override
    public void exitProg(CMMParser.ProgContext ctx) {
        super.exitProg(ctx);
    }

    @Override
    public void enterStmt_block(CMMParser.Stmt_blockContext ctx) {
        super.enterStmt_block(ctx);
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitStmt_block(CMMParser.Stmt_blockContext ctx) {
        super.exitStmt_block(ctx);
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterVar_list(CMMParser.Var_listContext ctx) {
        super.enterVar_list(ctx);

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
                return;
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
            if(currentScope.redundant(name)){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: redundant definition of <"
                        + name
                        + "> in same scope in line "
                        + arrayContext.ID().getSymbol().getLine()
                        + ":"
                        + arrayContext.ID().getSymbol().getCharPositionInLine());
                return;
            }else{
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
            if(currentScope.redundant(node.getSymbol().getText())){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: redundant definition of <"
                        + node.getSymbol().getText()
                        + "> in same scope in line "
                        + node.getSymbol().getLine()
                        + " :"
                        + node.getSymbol().getCharPositionInLine());
                return;
            }else{
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
        }

        // 普通变量在声明时赋值
        for(CMMParser.Decl_assignContext decl_assignContext : ctx.decl_assign()){
            Token token = decl_assignContext.ID().getSymbol();
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
                return;
            }
            if(Constant.DEBUG){
                System.setOut(gui);
                System.out.println("DEBUG: <"
                        + typeStr + " "
                        + token.getText() + " value="
                        + value.getValue()
                        + " >");
            }
            // 在当前作用域内定义，这里往符号表里只是添加了变量名和类型，没有值
            if(currentScope.redundant(token.getText())){
                System.setOut(gui);
                System.out.println("ERROR: redundant definition of <"
                        + token.getText()
                        + "> in same scope in line "
                        + token.getLine()
                        + ":"
                        + token.getCharPositionInLine());
                return;
            }else{
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
        }

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
        System.setOut(gui);
        System.out.println("ERROR: " + node.getText()
                +" in line " + node.getSymbol().getLine()
                +":" + node.getSymbol().getCharPositionInLine());
    }

}
