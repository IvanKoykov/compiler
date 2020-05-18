// Generated from D:/иван/compyle/src\kid.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link kidParser}.
 */
public interface kidListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link kidParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(kidParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(kidParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(kidParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(kidParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(kidParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(kidParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(kidParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(kidParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(kidParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(kidParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(kidParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(kidParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(kidParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(kidParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void enterCallstmt(kidParser.CallstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#callstmt}.
	 * @param ctx the parse tree
	 */
	void exitCallstmt(kidParser.CallstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#writestmt}.
	 * @param ctx the parse tree
	 */
	void enterWritestmt(kidParser.WritestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#writestmt}.
	 * @param ctx the parse tree
	 */
	void exitWritestmt(kidParser.WritestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#bangstmt}.
	 * @param ctx the parse tree
	 */
	void enterBangstmt(kidParser.BangstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#bangstmt}.
	 * @param ctx the parse tree
	 */
	void exitBangstmt(kidParser.BangstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#beginstmt}.
	 * @param ctx the parse tree
	 */
	void enterBeginstmt(kidParser.BeginstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#beginstmt}.
	 * @param ctx the parse tree
	 */
	void exitBeginstmt(kidParser.BeginstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(kidParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(kidParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(kidParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(kidParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#breakstmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakstmt(kidParser.BreakstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#breakstmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakstmt(kidParser.BreakstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#continuestmt}.
	 * @param ctx the parse tree
	 */
	void enterContinuestmt(kidParser.ContinuestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#continuestmt}.
	 * @param ctx the parse tree
	 */
	void exitContinuestmt(kidParser.ContinuestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(kidParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(kidParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(kidParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(kidParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(kidParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(kidParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(kidParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(kidParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(kidParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(kidParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(kidParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(kidParser.NumberContext ctx);
}