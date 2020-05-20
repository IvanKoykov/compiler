// Generated from D:/����/compyle/src\kid.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link kidParser#glavprog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlavprog(kidParser.GlavprogContext ctx);
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
	 * Visit a parse tree produced by {@link kidParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(kidParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(kidParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#parametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametr(kidParser.ParametrContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(kidParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#callFunct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunct(kidParser.CallFunctContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(kidParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#writestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritestmt(kidParser.WritestmtContext ctx);
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
	 * Visit a parse tree produced by {@link kidParser#forstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmt(kidParser.ForstmtContext ctx);
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
	 * Visit a parse tree produced by {@link kidParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(kidParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(kidParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointLiteral(kidParser.FloatingPointLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(kidParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(kidParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link kidParser#nullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(kidParser.NullLiteralContext ctx);
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