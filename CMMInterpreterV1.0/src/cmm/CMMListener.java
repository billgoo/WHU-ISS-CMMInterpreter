package cmm;// Generated from D:/Program Files/JetBrains/Project/JSQ/CMMInterpreterV1.0\CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMMParser}.
 */
public interface CMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMMParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CMMParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CMMParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CMMParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CMMParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(CMMParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(CMMParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(CMMParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(CMMParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CMMParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CMMParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(CMMParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(CMMParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(CMMParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(CMMParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#decl_assign}.
	 * @param ctx the parse tree
	 */
	void enterDecl_assign(CMMParser.Decl_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#decl_assign}.
	 * @param ctx the parse tree
	 */
	void exitDecl_assign(CMMParser.Decl_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_SB(CMMParser.I_SBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_SB(CMMParser.I_SBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_S(CMMParser.I_SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_S(CMMParser.I_SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_SB_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_SB_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_SB_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_SB_E_S(CMMParser.I_SB_E_SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_SB_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_SB_E_S(CMMParser.I_SB_E_SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_S_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_S_E_SB(CMMParser.I_S_E_SBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_S_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_S_E_SB(CMMParser.I_S_E_SBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code I_S_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterI_S_E_S(CMMParser.I_S_E_SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code I_S_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitI_S_E_S(CMMParser.I_S_E_SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WH_SB}
	 * labeled alternative in {@link CMMParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWH_SB(CMMParser.WH_SBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WH_SB}
	 * labeled alternative in {@link CMMParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWH_SB(CMMParser.WH_SBContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(CMMParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(CMMParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(CMMParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(CMMParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code W_E}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterW_E(CMMParser.W_EContext ctx);
	/**
	 * Exit a parse tree produced by the {@code W_E}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitW_E(CMMParser.W_EContext ctx);
	/**
	 * Enter a parse tree produced by the {@code W_S}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterW_S(CMMParser.W_SContext ctx);
	/**
	 * Exit a parse tree produced by the {@code W_S}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitW_S(CMMParser.W_SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code W_ES_C}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterW_ES_C(CMMParser.W_ES_CContext ctx);
	/**
	 * Exit a parse tree produced by the {@code W_ES_C}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitW_ES_C(CMMParser.W_ES_CContext ctx);
	/**
	 * Enter a parse tree produced by the {@code W_E_E}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterW_E_E(CMMParser.W_E_EContext ctx);
	/**
	 * Exit a parse tree produced by the {@code W_E_E}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitW_E_E(CMMParser.W_E_EContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(CMMParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(CMMParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CMMParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CMMParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(CMMParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(CMMParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CMMParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CMMParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignExpr(CMMParser.SignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignExpr(CMMParser.SignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(CMMParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(CMMParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(CMMParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(CMMParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddMinExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddMinExpr(CMMParser.AddMinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddMinExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddMinExpr(CMMParser.AddMinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(CMMParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(CMMParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpr(CMMParser.ParenthesesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpr(CMMParser.ParenthesesExprContext ctx);
}