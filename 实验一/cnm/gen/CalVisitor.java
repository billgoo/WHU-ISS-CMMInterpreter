// Generated from D:/Program Files/JetBrains/Project/cnm\Cal.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalParser#setExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(CalParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalParser#calExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalExpr(CalParser.CalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalParser#writeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExpr(CalParser.WriteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalParser#endExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndExpr(CalParser.EndExprContext ctx);
}