// Generated from D:/Program Files/JetBrains/Project/JSQ/cnm3\CMMPARSER.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMMPARSERParser}.
 */
public interface CMMPARSERListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CMMPARSERParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CMMPARSERParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CMMPARSERParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CMMPARSERParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(CMMPARSERParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(CMMPARSERParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CMMPARSERParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CMMPARSERParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMMPARSERParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMMPARSERParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(CMMPARSERParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(CMMPARSERParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#varArray}.
	 * @param ctx the parse tree
	 */
	void enterVarArray(CMMPARSERParser.VarArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#varArray}.
	 * @param ctx the parse tree
	 */
	void exitVarArray(CMMPARSERParser.VarArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(CMMPARSERParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(CMMPARSERParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CMMPARSERParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CMMPARSERParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CMMPARSERParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CMMPARSERParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(CMMPARSERParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(CMMPARSERParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(CMMPARSERParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(CMMPARSERParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(CMMPARSERParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(CMMPARSERParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(CMMPARSERParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(CMMPARSERParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CMMPARSERParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CMMPARSERParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CMMPARSERParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CMMPARSERParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMPARSERParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CMMPARSERParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMPARSERParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CMMPARSERParser.ExprContext ctx);
}