// Generated from D:/иван/compyle/src/kid\kid.g4 by ANTLR 4.8
package kid;
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
	 * Enter a parse tree produced by {@link kidParser#glavprog}.
	 * @param ctx the parse tree
	 */
	void enterGlavprog(kidParser.GlavprogContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#glavprog}.
	 * @param ctx the parse tree
	 */
	void exitGlavprog(kidParser.GlavprogContext ctx);
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
	 * Enter a parse tree produced by {@link kidParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(kidParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(kidParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(kidParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(kidParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#parametr}.
	 * @param ctx the parse tree
	 */
	void enterParametr(kidParser.ParametrContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#parametr}.
	 * @param ctx the parse tree
	 */
	void exitParametr(kidParser.ParametrContext ctx);
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
	 * Enter a parse tree produced by {@link kidParser#callFunct}.
	 * @param ctx the parse tree
	 */
	void enterCallFunct(kidParser.CallFunctContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#callFunct}.
	 * @param ctx the parse tree
	 */
	void exitCallFunct(kidParser.CallFunctContext ctx);
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
	 * Enter a parse tree produced by {@link kidParser#expressionunion}.
	 * @param ctx the parse tree
	 */
	void enterExpressionunion(kidParser.ExpressionunionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#expressionunion}.
	 * @param ctx the parse tree
	 */
	void exitExpressionunion(kidParser.ExpressionunionContext ctx);
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
	 * Enter a parse tree produced by {@link kidParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(kidParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(kidParser.ForstmtContext ctx);
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
	 * Enter a parse tree produced by {@link kidParser#conditionunion}.
	 * @param ctx the parse tree
	 */
	void enterConditionunion(kidParser.ConditionunionContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#conditionunion}.
	 * @param ctx the parse tree
	 */
	void exitConditionunion(kidParser.ConditionunionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorMult}
	 * labeled alternative in {@link kidParser#expression()}.
	 * @param ctx the parse tree
	 */
	void enterFactorMult(kidParser.FactorMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorMult}
	 * labeled alternative in {@link kidParser#expression()}.
	 * @param ctx the parse tree
	 */
	void exitFactorMult(kidParser.FactorMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SummExpression}
	 * labeled alternative in {@link kidParser#expression()}.
	 * @param ctx the parse tree
	 */
	void enterSummExpression(kidParser.SummExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SummExpression}
	 * labeled alternative in {@link kidParser#expression()}.
	 * @param ctx the parse tree
	 */
	void exitSummExpression(kidParser.SummExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorExp}
	 * labeled alternative in {@link kidParser#expression()}.
	 * @param ctx the parse tree
	 */
	void enterFactorExp(kidParser.FactorExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorExp}
	 * labeled alternative in {@link kidParser#expression()}.
	 * @param ctx the parse tree
	 */
	void exitFactorExp(kidParser.FactorExpContext ctx);
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
	 * Enter a parse tree produced by {@link kidParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(kidParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(kidParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(kidParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(kidParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(kidParser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#floatingPointLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(kidParser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(kidParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(kidParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(kidParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(kidParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link kidParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(kidParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link kidParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(kidParser.NullLiteralContext ctx);
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