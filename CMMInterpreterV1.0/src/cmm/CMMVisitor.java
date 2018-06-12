package cmm;// Generated from D:/Program Files/JetBrains/Project/JSQ/CMMInterpreterV1.0\CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMMParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CMMParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CMMParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(CMMParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(CMMParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(CMMParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(CMMParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(CMMParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#decl_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_assign(CMMParser.Decl_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code I_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_SB(CMMParser.I_SBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code I_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_S(CMMParser.I_SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code I_SB_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_SB_E_SB(CMMParser.I_SB_E_SBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code I_SB_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_SB_E_S(CMMParser.I_SB_E_SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code I_S_E_SB}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_S_E_SB(CMMParser.I_S_E_SBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code I_S_E_S}
	 * labeled alternative in {@link CMMParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI_S_E_S(CMMParser.I_S_E_SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WH_SB}
	 * labeled alternative in {@link CMMParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWH_SB(CMMParser.WH_SBContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(CMMParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(CMMParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code W_E}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitW_E(CMMParser.W_EContext ctx);
	/**
	 * Visit a parse tree produced by the {@code W_S}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitW_S(CMMParser.W_SContext ctx);
	/**
	 * Visit a parse tree produced by the {@code W_ES_C}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitW_ES_C(CMMParser.W_ES_CContext ctx);
	/**
	 * Visit a parse tree produced by the {@code W_E_E}
	 * labeled alternative in {@link CMMParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitW_E_E(CMMParser.W_E_EContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(CMMParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CMMParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(CMMParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CMMParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpr(CMMParser.SignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(CMMParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(CMMParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddMinExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMinExpr(CMMParser.AddMinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(CMMParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesExpr}
	 * labeled alternative in {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpr(CMMParser.ParenthesesExprContext ctx);
}