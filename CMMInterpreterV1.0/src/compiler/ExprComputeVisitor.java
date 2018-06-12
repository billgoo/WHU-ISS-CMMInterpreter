package compiler;

import cmm.CMMBaseVisitor;
import cmm.CMMParser;
import gui.OutStreamGUI;
import org.antlr.v4.runtime.Token;
import scope.Scope;
import scope.Symbol;

/**
 * Created by BG on 2016/12/13.
 * 运算阶段监听器
 */
public class ExprComputeVisitor extends CMMBaseVisitor<ExprReturnVal> {

    Scope currentScope;
    private OutStreamGUI gui;

    public ExprComputeVisitor(Scope currentScope, OutStreamGUI gui) {
        this.currentScope = currentScope;
        this.gui = gui;
    }

    @Override
    public ExprReturnVal visitMulDivExpr(CMMParser.MulDivExprContext ctx) {
        // 操作符
        ExprReturnVal leftValue = visit(ctx.expr(0)); // 左值
        ExprReturnVal rightValue = visit(ctx.expr(1)); // 右值
        // 运算时做类型检查
        ExprReturnVal returnVal = new ExprReturnVal();
        if(leftValue.getType() == Symbol.Type.tDOUBLE && rightValue.getType() == Symbol.Type.tINT){
            returnVal.setType(Symbol.Type.tDOUBLE);
            if(ctx.op.getText().equals("*")){
                returnVal.setValue((Double)leftValue.getValue() * (Integer) rightValue.getValue());
            }else if(ctx.op.getText().equals("/")){
                if((Integer)rightValue.getValue() == 0){
                    Token opDi = ctx.DIVISION().getSymbol();
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: divide zero"
                            + " in line "
                            + opDi.getLine()
                            +":"
                            + opDi.getCharPositionInLine());
                    return null;
                }
                returnVal.setValue((Double)leftValue.getValue() / (Integer) rightValue.getValue());
            }else if(ctx.op.getText().equals("%")){
                if((Integer)rightValue.getValue() == 0){
                    Token opMo = ctx.MOD().getSymbol();
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: divide zero"
                            + " in line "
                            + opMo.getLine()
                            +":"
                            + opMo.getCharPositionInLine());
                    return null;
                }
                returnVal.setValue((Double)leftValue.getValue() % (Integer) rightValue.getValue());
            }
        }else if(leftValue.getType() == Symbol.Type.tINT && rightValue.getType() == Symbol.Type.tDOUBLE){
            returnVal.setType(Symbol.Type.tDOUBLE);
            if(ctx.op.getText().equals("*")){
                returnVal.setValue((Integer)leftValue.getValue() * (Double) rightValue.getValue());
            }else if(ctx.op.getText().equals("/")){
                if((Double)rightValue.getValue() == 0.0){
                    Token opDi = ctx.DIVISION().getSymbol();
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: divide zero"
                            + " in line "
                            + opDi.getLine()
                            +":"
                            + opDi.getCharPositionInLine());
                    return null;
                }
                returnVal.setValue((Integer)leftValue.getValue() / (Double) rightValue.getValue());
            }else if(ctx.op.getText().equals("%")){
                if((Double)rightValue.getValue() == 0.0){
                    Token opMo = ctx.MOD().getSymbol();
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: divide zero"
                            + " in line "
                            + opMo.getLine()
                            +":"
                            + opMo.getCharPositionInLine());
                    return null;
                }
                returnVal.setValue((Integer)leftValue.getValue() % (Double) rightValue.getValue());
            }
        }else if(leftValue.getType() == Symbol.Type.tDOUBLE && rightValue.getType() == Symbol.Type.tDOUBLE){
            returnVal.setType(Symbol.Type.tDOUBLE);
            if(ctx.op.getText().equals("*")){
                returnVal.setValue((Double)leftValue.getValue() * (Double) rightValue.getValue());
            }else if(ctx.op.getText().equals("/")){
                if((Double)rightValue.getValue() == 0.0){
                    Token opDi = ctx.DIVISION().getSymbol();
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: divide zero"
                            + " in line "
                            + opDi.getLine()
                            +":"
                            + opDi.getCharPositionInLine());
                    return null;
                }
                returnVal.setValue((Double)leftValue.getValue() / (Double) rightValue.getValue());
            }else if(ctx.op.getText().equals("%")){
                if((Double)rightValue.getValue() == 0.0){
                    Token opMo = ctx.MOD().getSymbol();
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: divide zero"
                            + " in line "
                            + opMo.getLine()
                            +":"
                            + opMo.getCharPositionInLine());
                    return null;
                }
                returnVal.setValue((Double)leftValue.getValue() % (Double) rightValue.getValue());
            }
        }else if(leftValue.getType() == Symbol.Type.tINT && rightValue.getType() == Symbol.Type.tINT){
            returnVal.setType(Symbol.Type.tINT);
            if(ctx.op.getText().equals("*")){
                returnVal.setValue((Integer)leftValue.getValue() * (Integer) rightValue.getValue());
            }else if(ctx.op.getText().equals("/")){
                if((Integer)rightValue.getValue() == 0){
                    Token opDi = ctx.DIVISION().getSymbol();
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: divide zero"
                            + " in line "
                            + opDi.getLine()
                            +":"
                            + opDi.getCharPositionInLine());
                    return null;
                }
                returnVal.setValue((Integer)leftValue.getValue() / (Integer) rightValue.getValue());
            }else if(ctx.op.getText().equals("%")){
                if((Integer)rightValue.getValue() == 0){
                    Token opMo = ctx.MOD().getSymbol();
                    System.setErr(gui);
                    System.setOut(gui);
                    System.out.println("ERROR: divide zero"
                            + " in line "
                            + opMo.getLine()
                            +":"
                            + opMo.getCharPositionInLine());
                    return null;
                }
                returnVal.setValue((Integer)leftValue.getValue() % (Integer) rightValue.getValue());
            }
        }else{
            Token op1 = ctx.op;
            System.setErr(gui);
            System.setOut(gui);
            System.out.println("ERROR: unmatched or uncast type on two side of <"
                    + op1.getText()
                    + "> in line "
                    + op1.getLine()
                    +":"
                    + op1.getCharPositionInLine());
        }

        return returnVal;
    }

    @Override
    public ExprReturnVal visitAddMinExpr(CMMParser.AddMinExprContext ctx) {

        Token op1 = ctx.op; // 操作符
        ExprReturnVal leftValue = visit(ctx.expr(0)); // 左值
        ExprReturnVal rightValue = visit(ctx.expr(1)); // 右值
        ExprReturnVal returnVal = new ExprReturnVal();
        // 运算时做类型检查
        if(leftValue.getType() == Symbol.Type.tDOUBLE && rightValue.getType() == Symbol.Type.tINT){
            returnVal.setType(Symbol.Type.tDOUBLE);
            if(op1.getText().equals("+")){
                returnVal.setValue((Double)leftValue.getValue() + (Integer) rightValue.getValue());
            }else{
                returnVal.setValue((Double)leftValue.getValue() - (Integer) rightValue.getValue());
            }
        }else if(leftValue.getType() == Symbol.Type.tINT && rightValue.getType() == Symbol.Type.tDOUBLE){
            returnVal.setType(Symbol.Type.tDOUBLE);
            if(op1.getText().equals("+")){
                returnVal.setValue((Integer)leftValue.getValue() + (Double) rightValue.getValue());
            }else{
                returnVal.setValue((Integer)leftValue.getValue() - (Double) rightValue.getValue());
            }
        }else if(leftValue.getType() == Symbol.Type.tDOUBLE && rightValue.getType() == Symbol.Type.tDOUBLE){
            returnVal.setType(Symbol.Type.tDOUBLE);
            if(op1.getText().equals("+")){
                returnVal.setValue((Double)leftValue.getValue() + (Double) rightValue.getValue());
            }else{
                returnVal.setValue((Double)leftValue.getValue() - (Double) rightValue.getValue());
            }
        }else if(leftValue.getType() == Symbol.Type.tINT && rightValue.getType() == Symbol.Type.tINT){
            returnVal.setType(Symbol.Type.tINT);
            if(op1.getText().equals("+")){
                returnVal.setValue((Integer)leftValue.getValue() + (Integer)rightValue.getValue());
            }else{
                returnVal.setValue((Integer)leftValue.getValue() - (Integer)rightValue.getValue());
            }
        }else{
            /*
            io.output("ERROR: unmatched or uncast type on two side of <"
                    + op.getText()
                    + "> in line "
                    + op.getLine()
                    +":"
                    + op.getCharPositionInLine());
                    */
            System.setErr(gui);
            System.setOut(gui);
            System.out.println("ERROR: unmatched or uncast type on two side of <"
                    + op1.getText()
                    + "> in line "
                    + op1.getLine()
                    +":"
                    + op1.getCharPositionInLine());
        }
        return returnVal;
    }

    @Override
    public ExprReturnVal visitCompareExpr(CMMParser.CompareExprContext ctx) {
        Token op1 = ctx.op; // 比较符
        ExprReturnVal leftValue = visit(ctx.expr(0)); // 左值
        ExprReturnVal rightValue = visit(ctx.expr(1)); // 右值
        // 运算时做类型检查
        if(leftValue.getType() != rightValue.getType()){
            // 比较的时候不允许任何形式的强制类型转换
            System.setErr(gui);
            System.setOut(gui);
            System.out.println("ERROR: unmatched type on two side of <"
                    + op1.getText()
                    + "> in line "
                    + op1.getLine()
                    +":"
                    + op1.getCharPositionInLine());
            return null;
        }
        ExprReturnVal returnVal = new ExprReturnVal();
        returnVal.setType(Symbol.Type.tBOOL);
        if(op1.getText().equals(">")){
            if(leftValue.getType() == Symbol.Type.tINT){
                returnVal.setValue((Integer)leftValue.getValue() > (Integer)rightValue.getValue());
            }else if(leftValue.getType() == Symbol.Type.tDOUBLE) {
                returnVal.setValue((Double)leftValue.getValue() > (Double) rightValue.getValue());
            }else if(leftValue.getType() == Symbol.Type.tBOOL){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: boolean type can not charge < "
                        + op1.getText()
                        + " > in line "
                        + op1.getLine()
                        +" : "
                        + op1.getCharPositionInLine());
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: unknown type can't charge at both sides of < "
                        + op1.getText()
                        + " > in line "
                        + op1.getLine()
                        +" : "
                        + op1.getCharPositionInLine());
            }
        }else if(op1.getText().equals("<")){
            if(leftValue.getType() == Symbol.Type.tINT){
                returnVal.setValue((Integer)leftValue.getValue() < (Integer)rightValue.getValue());
            }else if(leftValue.getType() == Symbol.Type.tDOUBLE) {
                returnVal.setValue((Double)leftValue.getValue() < (Double) rightValue.getValue());
            }else if(leftValue.getType() == Symbol.Type.tBOOL){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: boolean type can not charge < "
                        + op1.getText()
                        + " > in line "
                        + op1.getLine()
                        +" : "
                        + op1.getCharPositionInLine());
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: unknown type can't charge at both sides of < "
                        + op1.getText()
                        + " > in line "
                        + op1.getLine()
                        +" : "
                        + op1.getCharPositionInLine());
            }
        }else if(op1.getText().equals(">=")){
            if(leftValue.getType() == Symbol.Type.tINT){
                returnVal.setValue((Integer)leftValue.getValue() >= (Integer)rightValue.getValue());
            }else if(leftValue.getType() == Symbol.Type.tDOUBLE) {
                returnVal.setValue((Double)leftValue.getValue() >= (Double) rightValue.getValue());
            }else if(leftValue.getType() == Symbol.Type.tBOOL){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: boolean type can not charge < "
                        + op1.getText()
                        + " > in line "
                        + op1.getLine()
                        +" : "
                        + op1.getCharPositionInLine());
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: unknown type can't charge at both sides of < "
                        + op1.getText()
                        + " > in line "
                        + op1.getLine()
                        +" : "
                        + op1.getCharPositionInLine());
            }
        }else if(op1.getText().equals("<=")){
            if(leftValue.getType() == Symbol.Type.tINT){
                returnVal.setValue((Integer)leftValue.getValue() <= (Integer)rightValue.getValue());
            }else if(leftValue.getType() == Symbol.Type.tDOUBLE) {
                returnVal.setValue((Double)leftValue.getValue() <= (Double) rightValue.getValue());
            }else if(leftValue.getType() == Symbol.Type.tBOOL){
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: boolean type can not charge < "
                        + op1.getText()
                        + " > in line "
                        + op1.getLine()
                        +" : "
                        + op1.getCharPositionInLine());
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: unknown type can't charge at both sides of < "
                        + op1.getText()
                        + " > in line "
                        + op1.getLine()
                        +" : "
                        + op1.getCharPositionInLine());
            }
        }else if(op1.getText().equals("==")){
            returnVal.setValue(leftValue.getValue().equals(rightValue.getValue()));
        }else if(op1.getText().equals("!=") || op1.getText().equals("<>")){
            returnVal.setValue(!leftValue.getValue().equals(rightValue.getValue()));
        }

        return returnVal;
    }

    @Override
    public ExprReturnVal visitParenthesesExpr(CMMParser.ParenthesesExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ExprReturnVal visitValueExpr(CMMParser.ValueExprContext ctx) {

        // 直接是字面值的运算
        if(ctx.value().constant() != null){
            if(ctx.value().constant().INT_CONSTANT() != null){
                return new ExprReturnVal(Symbol.Type.tINT,
                        Integer.valueOf(ctx.value().constant().INT_CONSTANT().getText()));
            }
            else if (ctx.value().constant().HEX_CONSTANT() != null) {
                return new ExprReturnVal(Symbol.Type.tINT,
                        Integer.valueOf(ctx.value().constant().HEX_CONSTANT().getText()));
            }
            else if (ctx.value().constant().FLOAT_LITERAL() != null) {
                if (ctx.value().constant().FLOAT_LITERAL() != null)
                return new ExprReturnVal(Symbol.Type.tDOUBLE,
                        Double.valueOf(ctx.value().constant().FLOAT_LITERAL().getText()));
            }
            else if (ctx.value().constant().TRUE() != null) {
                return new ExprReturnVal(Symbol.Type.tBOOL,
                        Boolean.valueOf(ctx.value().constant().TRUE().getText()));
            }
            else if (ctx.value().constant().FALSE() != null) {
                return new ExprReturnVal(Symbol.Type.tBOOL,
                        Boolean.valueOf(ctx.value().constant().FALSE().getText()));
            }
        }else if(ctx.value().ID() != null){ // 表达式里包含变量
            Token varToken = ctx.value().ID().getSymbol();
            String name = varToken.getText();
            Symbol varSymbol = currentScope.resolve(name);
            if(varSymbol != null ){
                return new ExprReturnVal(varSymbol.getType(), varSymbol.getValue());
            }else{
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: no such variable <"
                        + name
                        + "> in line "
                        + varToken.getLine()
                        + ":" + varToken.getCharPositionInLine());
                return null;
            }
        }else{ // 表达式里面包含数组
            Token varToken = ctx.value().array().ID().getSymbol();
            String name = varToken.getText();
            int varIndex;
            if(ctx.value().array().INT_CONSTANT() != null){ // 索引为int常量
                varIndex = Integer.parseInt(ctx.value().array().INT_CONSTANT().getText());
            }else{ // 索引为表达式
                ExprComputeVisitor indexComputeVisitor = new ExprComputeVisitor(currentScope, gui);
                ExprReturnVal indexValue = indexComputeVisitor.visit(ctx.value().array().expr());
                varIndex = (Integer) indexValue.getValue();
            }
            Symbol varSymbol = currentScope.resolve(name);
            if(varSymbol != null ){
                if(varSymbol.getType() == Symbol.Type.tINTARRAY) { // int数组

                    int[] varArray = (int[]) varSymbol.getValue();

                    // 数组越界检查
                    if(varIndex < varArray.length){
                        return new ExprReturnVal(Symbol.Type.tINT, varArray[varIndex]);
                    }else{
                        System.setErr(gui);
                        System.setOut(gui);
                        System.out.println("ERROR: index out of boundary of array <"
                                + name
                                + "> in line "
                                + varToken.getLine()
                                + ":" + varToken.getCharPositionInLine());
                        return null;
                    }

                }else if(varSymbol.getType() == Symbol.Type.tDOUBLEARRAY) { // double数组

                    double[] varArray = (double[]) varSymbol.getValue();

                    // 数组越界检查
                    if(varIndex < varArray.length){
                        return new ExprReturnVal(Symbol.Type.tDOUBLE, varArray[varIndex]);
                    }else{
                        System.setErr(gui);
                        System.setOut(gui);
                        System.out.println("ERROR: index out of boundary of array <"
                                + name
                                + "> in line "
                                + varToken.getLine()
                                + ":" + varToken.getCharPositionInLine());
                        return null;
                    }

                }else if(varSymbol.getType() == Symbol.Type.tBOOLARRAY) { // double数组

                    boolean[] varArray = (boolean[]) varSymbol.getValue();

                    // 数组越界检查
                    if(varIndex < varArray.length){
                        return new ExprReturnVal(Symbol.Type.tBOOL, varArray[varIndex]);
                    }else{
                        System.setErr(gui);
                        System.setOut(gui);
                        System.out.println("ERROR: index out of boundary of array <"
                                + name
                                + "> in line "
                                + varToken.getLine()
                                + ":" + varToken.getCharPositionInLine());
                        return null;
                    }

                }
            }else{
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: no such variable <"
                        + name
                        + "> in line "
                        + varToken.getLine()
                        + ":" + varToken.getCharPositionInLine());
                return null;
            }
        }
        /* 这句有点问题，本来可以不加的 */
        return null;
    }

    @Override
    public ExprReturnVal visitSignExpr(CMMParser.SignExprContext ctx) {
        String sign = ctx.op.getText();
        if(sign.equals("+")){ExprReturnVal value = visit(ctx.expr());
            if (value.getType() != Symbol.Type.tBOOL) {
                return visit(ctx.expr());
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: operator < "
                        + sign
                        + " > in line "
                        + ctx.op.getLine()
                        + ":" + ctx.op.getCharPositionInLine()
                        + " can not be applied to \'bool\'");
                return null;
            }
        }else{
            ExprReturnVal value = visit(ctx.expr());
            if(value.getType() == Symbol.Type.tINT){
                return new ExprReturnVal(value.getType(), -(Integer)value.getValue());
            }else if(value.getType() == Symbol.Type.tDOUBLE) {
                return new ExprReturnVal(value.getType(), -(Double)value.getValue());
            }else {
                System.setErr(gui);
                System.setOut(gui);
                System.out.println("ERROR: operator < "
                        + sign
                        + " > in line "
                        + ctx.op.getLine()
                        + ":" + ctx.op.getCharPositionInLine()
                        + " can not be applied to \'bool\'");
                return null;
            }

        }
    }
}
