// Generated from D:/иван/compyle/src\kid.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link kidParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface kidVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link kidParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(kidParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(kidParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(kidParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(kidParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(kidParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(kidParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(kidParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#callstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallstmt(kidParser.CallstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#writestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritestmt(kidParser.WritestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#bangstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBangstmt(kidParser.BangstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#beginstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginstmt(kidParser.BeginstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(kidParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(kidParser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#breakstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakstmt(kidParser.BreakstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#continuestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuestmt(kidParser.ContinuestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(kidParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(kidParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(kidParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(kidParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(kidParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(kidParser.NumberContext ctx);
}