// Generated from D:/Program Files/JetBrains/Project/cnm\Cal.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalParser}.
 */
public interface CalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(CalParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalParser#setExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(CalParser.SetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalParser#calExpr}.
	 * @param ctx the parse tree
	 */
	void enterCalExpr(CalParser.CalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalParser#calExpr}.
	 * @param ctx the parse tree
	 */
	void exitCalExpr(CalParser.CalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalParser#writeExpr}.
	 * @param ctx the parse tree
	 */
	void enterWriteExpr(CalParser.WriteExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalParser#writeExpr}.
	 * @param ctx the parse tree
	 */
	void exitWriteExpr(CalParser.WriteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalParser#endExpr}.
	 * @param ctx the parse tree
	 */
	void enterEndExpr(CalParser.EndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalParser#endExpr}.
	 * @param ctx the parse tree
	 */
	void exitEndExpr(CalParser.EndExprContext ctx);
}