// Generated from D:/Program Files/JetBrains/Project/JSQ/cnm3\CMMPARSER.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMMPARSERParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMMPARSERVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CMMPARSERParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CMMPARSERParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#stmtBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBlock(CMMPARSERParser.StmtBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CMMPARSERParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CMMPARSERParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(CMMPARSERParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#varArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArray(CMMPARSERParser.VarArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(CMMPARSERParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CMMPARSERParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CMMPARSERParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(CMMPARSERParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(CMMPARSERParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(CMMPARSERParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(CMMPARSERParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CMMPARSERParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CMMPARSERParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMPARSERParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CMMPARSERParser.ExprContext ctx);
}