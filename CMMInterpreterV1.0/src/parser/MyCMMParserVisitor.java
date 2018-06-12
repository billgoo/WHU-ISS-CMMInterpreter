package parser;

import cmm.CMMBaseVisitor;
import cmm.CMMParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

/**
 * Created by lhhxkj on 2016/12/13.
 * 语法检查
 */
public class MyCMMParserVisitor extends CMMBaseVisitor<ArrayList<String>> {

    public String result = "";

    @Override
    public ArrayList<String> visitProg(CMMParser.ProgContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        for(int i = 0; i<ctx.getChildCount(); i++){
            lresult.addAll(visit((ctx.getChild(i))));
        }
        return lresult;
    }

    @Override
    public ArrayList<String> visitStmt(CMMParser.StmtContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        for(int i = 0; i<ctx.getChildCount(); i++){
            lresult.addAll(visit((ctx.getChild(i))));
        }
        //lresult.addAll(visit(ctx.getChild(0)));
        return lresult;
    }

    @Override
    public ArrayList<String> visitStmt_block(CMMParser.Stmt_blockContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        for(int i = 1; i<ctx.getChildCount()-1; i++){
            lresult.addAll(visit((ctx.getChild(i))));
        }
        return lresult;
    }

    @Override
    public ArrayList<String> visitVar_decl(CMMParser.Var_declContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();

        for (CMMParser.ArrayContext arrayContext : ctx.var_list().array()){
            lresult.add("Array Variable declaration to : " + arrayContext.ID().getText() + "\n");
            lresult.add("      Type : " + ctx.getChild(0).getText() + "[]" + "\n");
        }
        // 非数组的声明
        // 多变量
        for (TerminalNode node : ctx.var_list().getTokens(CMMParser.ID)){
            String name = node.getSymbol().getText();
            lresult.add("Variable declaration to : " + name + "\n");
            lresult.add("      Type : " + ctx.getChild(0).getText() + "\n");
        }
        // 声明时赋值
        for (CMMParser.Decl_assignContext decl_assignContext : ctx.var_list().decl_assign()){
            lresult.add("Variable declaration and assignment to : "
                    + decl_assignContext.ID().getSymbol().getText() + "\n");
            lresult.add("      Type : " + ctx.getChild(0).getText() + "\n");
            lresult.add("      Value : " + decl_assignContext.getChild(2).getText() + "\n");
        }
        return lresult;
    }

    @Override
    public ArrayList<String> visitVar_list(CMMParser.Var_listContext ctx) {
        return null;
    }

    /*======= if begin =======*/
    @Override
    public ArrayList<String> visitI_S(CMMParser.I_SContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("If statement : " + "\n");
        lresult.add("      Condition : " + ctx.getChild(2).getText() + "\n");
        // IF语句不包括左括号，只要执行一条语句

        // if语句内的语句用缩进表示层次关系
        for(String tmp : visit(ctx.getChild(4))) {
            lresult.add("      : " + tmp);
        }
        return lresult;
    }

    @Override
    public ArrayList<String> visitI_SB(CMMParser.I_SBContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("If statement : " + "\n");
        lresult.add("      Condition : " + ctx.getChild(2).getText() + "\n");

        //执行多条，直到碰到右括号为止
        for(int i = 1; i<ctx.stmt_block().getChildCount();i++){
            if(ctx.stmt_block().getChild(i).getText().equals("}")) {
                break;
            }else{
                for(String tmp : visit(ctx.stmt_block().getChild(i))){
                    lresult.add("      : " + tmp);
                }
            }
        }

        return lresult;
    }

    @Override
    public ArrayList<String> visitI_S_E_S(CMMParser.I_S_E_SContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("If statement : " + "\n");
        lresult.add("   Condition : " + ctx.getChild(2).getText() + "\n");
        //IF语句不包括左括号，只要执行一条语句
        for(String tmp: visit(ctx.getChild(4))){
            lresult.add("      : " + tmp);
        }
        lresult.add("Else : " + "\n");
        for(String tmp: visit(ctx.getChild(6))){
            lresult.add("      : " + tmp);
        }

        return lresult;
    }

    @Override
    public ArrayList<String> visitI_S_E_SB(CMMParser.I_S_E_SBContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();

        lresult.add("If statement : " + "\n");
        lresult.add("   Condition : " + ctx.getChild(2).getText() + "\n");
        //IF语句不包括左括号，只要执行一条语句
        for(String tmp: visit(ctx.getChild(4))){
            lresult.add("      : " + tmp);
        }

        lresult.add("Else : " + "\n");
        //执行多条，直到碰到右括号为止
        for(int i = 1; i<ctx.getChild(6).getChildCount();i++){
            if(ctx.getChild(6).getChild(i).getText().equals("}")) {
                break;
            }else{
                for(String tmp : visit(ctx.getChild(6).getChild(i))){
                    lresult.add("      : " + tmp);
                }
            }
        }

        return lresult;
    }

    @Override
    public ArrayList<String> visitI_SB_E_S(CMMParser.I_SB_E_SContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();

        lresult.add("If statement : " + "\n");
        lresult.add("   Condition : " + ctx.getChild(2).getText() + "\n");

        //IF语句
        for(int i = 1; i<ctx.getChild(4).getChildCount();i++){
            if(ctx.getChild(4).getChild(i).getText().equals("}")) {
                break;
            }else{
                for(String tmp : visit(ctx.getChild(4).getChild(i))){
                    lresult.add("      : " + tmp);
                }
            }
        }

        lresult.add("Else : " + "\n");
        for(String tmp: visit(ctx.getChild(6))){
            lresult.add("      : " + tmp);
        }

        return lresult;
    }

    @Override
    public ArrayList<String> visitI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();

        lresult.add("If statement : " + "\n");
        lresult.add("   Condition : " + ctx.getChild(2).getText() + "\n");

        //IF语句
        for(int i = 1; i<ctx.getChild(4).getChildCount();i++){
            if(ctx.getChild(4).getChild(i).getText().equals("}")) {
                break;
            }else{
                for(String tmp : visit(ctx.getChild(4).getChild(i))){
                    lresult.add("      : " + tmp);
                }
            }
        }

        //ELSE
        lresult.add("Else : " + "\n");
        for(int i = 1; i<ctx.getChild(6).getChildCount();i++){
            if(ctx.getChild(6).getChild(i).getText().equals("}")) {
                break;
            }else{
                for(String tmp : visit(ctx.getChild(6).getChild(i))){
                    lresult.add("      : " + tmp);
                }
            }
        }

        return lresult;
    }
    /*======= if end =======*/

    @Override
    public ArrayList<String> visitWH_SB(CMMParser.WH_SBContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("While statement : " + "\n");
        lresult.add("      Condition : " + ctx.getChild(2).getText() + "\n");

        for(int i = 1; i<ctx.stmt_block().getChildCount()-1;i++){
            for(String tmp : visit(ctx.stmt_block().getChild(i))){
                lresult.add("      : " + tmp);
            }
        }

        return lresult;
    }

    @Override
    public ArrayList<String> visitBreak_stmt(CMMParser.Break_stmtContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("Break : "+"\n");
        lresult.add("      Jump out!\n");
        return lresult;
    }

    @Override
    public ArrayList<String> visitRead_stmt(CMMParser.Read_stmtContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("Read : "+"\n");
        lresult.add("      ID : " +ctx.getChild(2).getText()+"\n");
        return lresult;
    }

    /*======= write begin =======*/
    @Override
    public ArrayList<String> visitW_E(CMMParser.W_EContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("Write : "+"\n");
        lresult.add("      Expr : " +ctx.getChild(2).getText()+"\n");
        return lresult;
    }

    @Override
    public ArrayList<String> visitW_S(CMMParser.W_SContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("Write : "+"\n");
        lresult.add("      STRING : " +ctx.getChild(2).getText()+"\n");
        return lresult;
    }

    @Override
    public ArrayList<String> visitW_ES_C(CMMParser.W_ES_CContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        for (CMMParser.ExprContext exprContext : ctx.expr()){
            lresult.add("Write : "+"\n");
            lresult.add("      Expr : " +exprContext.getText()+"\n");
        }
        for (TerminalNode node : ctx.getTokens(CMMParser.STRING_LITERAL)){
            lresult.add("Write : "+"\n");
            lresult.add("      STRING : " +node.getText()+"\n");
        }
        return lresult;
    }

    @Override
    public ArrayList<String> visitW_E_E(CMMParser.W_E_EContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        String effector = ctx.EFFECTOR().getSymbol().getText();
        if (effector.equals("\'%d\'")){
            lresult.add("Write : "+"\n");
            lresult.add("      Expr : " +ctx.getChild(4).getText()+"\n");
            lresult.add("      Format : Decimal\n");
        }else if (effector.equals("\'%f\'")){
            lresult.add("Write : "+"\n");
            lresult.add("      Expr : " +ctx.getChild(4).getText()+"\n");
            lresult.add("      Format : Float\n");
        }else if (effector.equals("\'%h\'")) {
            lresult.add("Write : " + "\n");
            lresult.add("      Expr : " + ctx.getChild(4).getText() + "\n");
            lresult.add("      Format : Hexadecimal\n");
        }
        return lresult;
    }
    /*======= write end =======*/

    @Override
    public ArrayList<String> visitAssign_stmt(CMMParser.Assign_stmtContext ctx) {
        ArrayList<String> lresult = new ArrayList<String>();
        lresult.add("Assign value to : " + ctx.getChild(0).getText() + "\n");
        lresult.add("      Value: " + ctx.getChild(2).getText() + "\n");
        lresult.add("      Operator: " + ctx.getChild(1).getText() + "\n");
        return lresult;
    }

    @Override
    public ArrayList<String> visitValue(CMMParser.ValueContext ctx) {
        return null;
    }

    @Override
    public ArrayList<String> visitConstant(CMMParser.ConstantContext ctx) {
        return null;
    }

    /*======= expr =======*/
    @Override
    public ArrayList<String> visitMulDivExpr(CMMParser.MulDivExprContext ctx) {
        return null;
    }

    @Override
    public ArrayList<String> visitAddMinExpr(CMMParser.AddMinExprContext ctx) {
        return null;
    }

    @Override
    public ArrayList<String> visitCompareExpr(CMMParser.CompareExprContext ctx) {
        return null;
    }

    @Override
    public ArrayList<String> visitParenthesesExpr(CMMParser.ParenthesesExprContext ctx) {
        return null;
    }

    @Override
    public ArrayList<String> visitValueExpr(CMMParser.ValueExprContext ctx) {
        return null;
    }

    @Override
    public ArrayList<String> visitSignExpr(CMMParser.SignExprContext ctx) {
        return null;
    }

}
