// Generated from D:/иван/compyle/src\kid.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kidParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, STRING=40, NUMBER=41, WS=42, BlockComment=43, LineComment=44;
	public static final int
		RULE_program = 0, RULE_glavprog = 1, RULE_block = 2, RULE_consts = 3, 
		RULE_vars = 4, RULE_type = 5, RULE_functions = 6, RULE_parametr = 7, RULE_statement = 8, 
		RULE_callFunct = 9, RULE_assignstmt = 10, RULE_writestmt = 11, RULE_ifstmt = 12, 
		RULE_whilestmt = 13, RULE_forstmt = 14, RULE_breakstmt = 15, RULE_continuestmt = 16, 
		RULE_beginFor = 17, RULE_condition = 18, RULE_conditionunion = 19, RULE_expressionunion = 20, 
		RULE_expression = 21, RULE_term = 22, RULE_factor = 23, RULE_literal = 24, 
		RULE_integerLiteral = 25, RULE_floatingPointLiteral = 26, RULE_booleanLiteral = 27, 
		RULE_charLiteral = 28, RULE_nullLiteral = 29, RULE_ident = 30, RULE_number = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "glavprog", "block", "consts", "vars", "type", "functions", 
			"parametr", "statement", "callFunct", "assignstmt", "writestmt", "ifstmt", 
			"whilestmt", "forstmt", "breakstmt", "continuestmt", "beginFor", "condition", 
			"conditionunion", "expressionunion", "expression", "term", "factor", 
			"literal", "integerLiteral", "floatingPointLiteral", "booleanLiteral", 
			"charLiteral", "nullLiteral", "ident", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main()'", "'{'", "'}'", "'const'", "';'", "'='", "'char'", "'int'", 
			"'bool'", "'float'", "'funct'", "'('", "')'", "','", "'write'", "'if'", 
			"'else'", "'while'", "'for'", "'break'", "'continue'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'.'", "'true'", "'false'", "'''", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "NUMBER", "WS", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "kid.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public kidParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public GlavprogContext glavprog() {
			return getRuleContext(GlavprogContext.class,0);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(64);
				consts();
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(67);
				functions();
				}
			}

			setState(70);
			glavprog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlavprogContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GlavprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glavprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterGlavprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitGlavprog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitGlavprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlavprogContext glavprog() throws RecognitionException {
		GlavprogContext _localctx = new GlavprogContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_glavprog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(73);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__30) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstsContext extends ParserRuleContext {
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_consts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__3);
			setState(85);
			vars();
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(T__4);
					setState(87);
					match(T__3);
					setState(88);
					vars();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(94);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			ident();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(98);
				match(T__5);
				setState(99);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParametrContext parametr() {
			return getRuleContext(ParametrContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__10);
			setState(105);
			ident();
			setState(106);
			match(T__11);
			setState(107);
			parametr();
			setState(108);
			match(T__12);
			setState(109);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrContext extends ParserRuleContext {
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public ParametrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterParametr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitParametr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitParametr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrContext parametr() throws RecognitionException {
		ParametrContext _localctx = new ParametrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(111);
				vars();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(112);
					match(T__13);
					setState(113);
					vars();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public WritestmtContext writestmt() {
			return getRuleContext(WritestmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallFunctContext callFunct() {
			return getRuleContext(CallFunctContext.class,0);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				assignstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				writestmt();
				setState(123);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				ifstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				whilestmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				forstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				expression();
				setState(129);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				callFunct();
				setState(132);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				consts();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(135);
				vars();
				setState(136);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				functions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFunctContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionunionContext expressionunion() {
			return getRuleContext(ExpressionunionContext.class,0);
		}
		public CallFunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterCallFunct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitCallFunct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitCallFunct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctContext callFunct() throws RecognitionException {
		CallFunctContext _localctx = new CallFunctContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callFunct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			ident();
			setState(142);
			match(T__11);
			setState(143);
			expressionunion();
			setState(144);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignstmtContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitAssignstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitAssignstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			ident();
			setState(147);
			match(T__5);
			setState(148);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritestmtContext extends ParserRuleContext {
		public ExpressionunionContext expressionunion() {
			return getRuleContext(ExpressionunionContext.class,0);
		}
		public WritestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterWritestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitWritestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitWritestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritestmtContext writestmt() throws RecognitionException {
		WritestmtContext _localctx = new WritestmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_writestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__14);
			setState(151);
			match(T__11);
			setState(152);
			expressionunion();
			setState(153);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public ConditionunionContext conditionunion() {
			return getRuleContext(ConditionunionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__15);
			setState(156);
			match(T__11);
			setState(157);
			conditionunion();
			setState(158);
			match(T__12);
			setState(159);
			block();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(160);
				match(T__16);
				setState(161);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestmtContext extends ParserRuleContext {
		public ConditionunionContext conditionunion() {
			return getRuleContext(ConditionunionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__17);
			setState(165);
			match(T__11);
			setState(166);
			conditionunion();
			setState(167);
			match(T__12);
			setState(168);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstmtContext extends ParserRuleContext {
		public BeginForContext beginFor() {
			return getRuleContext(BeginForContext.class,0);
		}
		public ConditionunionContext conditionunion() {
			return getRuleContext(ConditionunionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitForstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitForstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__18);
			setState(171);
			match(T__11);
			setState(172);
			beginFor();
			setState(173);
			match(T__4);
			setState(174);
			conditionunion();
			setState(175);
			match(T__4);
			setState(176);
			expression();
			setState(177);
			match(T__12);
			setState(178);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakstmtContext extends ParserRuleContext {
		public BreakstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterBreakstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitBreakstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitBreakstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakstmtContext breakstmt() throws RecognitionException {
		BreakstmtContext _localctx = new BreakstmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breakstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinuestmtContext extends ParserRuleContext {
		public ContinuestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterContinuestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitContinuestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitContinuestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuestmtContext continuestmt() throws RecognitionException {
		ContinuestmtContext _localctx = new ContinuestmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_continuestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginForContext extends ParserRuleContext {
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BeginForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterBeginFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitBeginFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitBeginFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginForContext beginFor() throws RecognitionException {
		BeginForContext _localctx = new BeginForContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_beginFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				{
				setState(184);
				vars();
				}
				break;
			case T__11:
			case T__29:
			case T__30:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case STRING:
			case NUMBER:
				{
				setState(185);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(188);
				match(T__13);
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case T__7:
				case T__8:
				case T__9:
					{
					setState(189);
					vars();
					}
					break;
				case T__11:
				case T__29:
				case T__30:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case STRING:
				case NUMBER:
					{
					setState(190);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallFunctContext callFunct() {
			return getRuleContext(CallFunctContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				callFunct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				expression();
				setState(201);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionunionContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionunionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionunion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterConditionunion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitConditionunion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitConditionunion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionunionContext conditionunion() throws RecognitionException {
		ConditionunionContext _localctx = new ConditionunionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionunion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			condition();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__28) {
				{
				{
				setState(207);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				condition();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionunionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionunionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionunion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterExpressionunion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitExpressionunion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitExpressionunion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionunionContext expressionunion() throws RecognitionException {
		ExpressionunionContext _localctx = new ExpressionunionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionunion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << T__30) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(214);
				expression();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(215);
					match(T__13);
					setState(216);
					expression();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==T__30) {
				{
				setState(224);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(227);
			term();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__30) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(229);
					term();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			factor();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(237);
					factor();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public CallFunctContext callFunct() {
			return getRuleContext(CallFunctContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(T__11);
				setState(246);
				factor();
				setState(247);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				assignstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				callFunct();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				floatingPointLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				booleanLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				charLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				nullLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(kidParser.NUMBER, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(kidParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(kidParser.NUMBER, i);
		}
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitFloatingPointLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitFloatingPointLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floatingPointLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(NUMBER);
			setState(263);
			match(T__34);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					match(NUMBER);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(kidParser.STRING, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__37);
			setState(273);
			match(STRING);
			setState(274);
			match(T__37);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(kidParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(kidParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(kidParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(kidParser.NUMBER, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(STRING);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(kidParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kidListener ) ((kidListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kidVisitor ) return ((kidVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\5\2D\n\2\3\2\5\2G\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4P\n\4\f\4"+
		"\16\4S\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\7\tu\n\t\f\t\16\tx\13\t\5\tz\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00a5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23"+
		"\u00bd\n\23\3\23\3\23\3\23\5\23\u00c2\n\23\7\23\u00c4\n\23\f\23\16\23"+
		"\u00c7\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cf\n\24\3\25\3\25\3"+
		"\25\7\25\u00d4\n\25\f\25\16\25\u00d7\13\25\3\26\3\26\3\26\7\26\u00dc\n"+
		"\26\f\26\16\26\u00df\13\26\5\26\u00e1\n\26\3\27\5\27\u00e4\n\27\3\27\3"+
		"\27\3\27\7\27\u00e9\n\27\f\27\16\27\u00ec\13\27\3\30\3\30\3\30\7\30\u00f1"+
		"\n\30\f\30\16\30\u00f4\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u00fe\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0105\n\32\3\33\3\33\3\34"+
		"\3\34\3\34\7\34\u010c\n\34\f\34\16\34\u010f\13\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \7 \u011b\n \f \16 \u011e\13 \3!\3!\3!\2\2\""+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\t"+
		"\3\2\t\f\3\2\30\35\3\2\36\37\3\2 !\3\2\"$\3\2&\'\3\2*+\2\u0127\2C\3\2"+
		"\2\2\4J\3\2\2\2\6M\3\2\2\2\bV\3\2\2\2\nb\3\2\2\2\fh\3\2\2\2\16j\3\2\2"+
		"\2\20y\3\2\2\2\22\u008d\3\2\2\2\24\u008f\3\2\2\2\26\u0094\3\2\2\2\30\u0098"+
		"\3\2\2\2\32\u009d\3\2\2\2\34\u00a6\3\2\2\2\36\u00ac\3\2\2\2 \u00b6\3\2"+
		"\2\2\"\u00b8\3\2\2\2$\u00bc\3\2\2\2&\u00ce\3\2\2\2(\u00d0\3\2\2\2*\u00e0"+
		"\3\2\2\2,\u00e3\3\2\2\2.\u00ed\3\2\2\2\60\u00fd\3\2\2\2\62\u0104\3\2\2"+
		"\2\64\u0106\3\2\2\2\66\u0108\3\2\2\28\u0110\3\2\2\2:\u0112\3\2\2\2<\u0116"+
		"\3\2\2\2>\u0118\3\2\2\2@\u011f\3\2\2\2BD\5\b\5\2CB\3\2\2\2CD\3\2\2\2D"+
		"F\3\2\2\2EG\5\16\b\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\5\4\3\2I\3\3\2\2"+
		"\2JK\7\3\2\2KL\5\6\4\2L\5\3\2\2\2MQ\7\4\2\2NP\5\22\n\2ON\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\5\2\2U\7\3\2\2\2VW\7"+
		"\6\2\2W]\5\n\6\2XY\7\7\2\2YZ\7\6\2\2Z\\\5\n\6\2[X\3\2\2\2\\_\3\2\2\2]"+
		"[\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\7\2\2a\t\3\2\2\2bc\5\f\7\2"+
		"cf\5> \2de\7\b\2\2eg\5,\27\2fd\3\2\2\2fg\3\2\2\2g\13\3\2\2\2hi\t\2\2\2"+
		"i\r\3\2\2\2jk\7\r\2\2kl\5> \2lm\7\16\2\2mn\5\20\t\2no\7\17\2\2op\5\6\4"+
		"\2p\17\3\2\2\2qv\5\n\6\2rs\7\20\2\2su\5\n\6\2tr\3\2\2\2ux\3\2\2\2vt\3"+
		"\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yq\3\2\2\2yz\3\2\2\2z\21\3\2\2\2{"+
		"\u008e\5\26\f\2|}\5\30\r\2}~\7\7\2\2~\u008e\3\2\2\2\177\u008e\5\32\16"+
		"\2\u0080\u008e\5\34\17\2\u0081\u008e\5\36\20\2\u0082\u0083\5,\27\2\u0083"+
		"\u0084\7\7\2\2\u0084\u008e\3\2\2\2\u0085\u0086\5\24\13\2\u0086\u0087\7"+
		"\7\2\2\u0087\u008e\3\2\2\2\u0088\u008e\5\b\5\2\u0089\u008a\5\n\6\2\u008a"+
		"\u008b\7\7\2\2\u008b\u008e\3\2\2\2\u008c\u008e\5\16\b\2\u008d{\3\2\2\2"+
		"\u008d|\3\2\2\2\u008d\177\3\2\2\2\u008d\u0080\3\2\2\2\u008d\u0081\3\2"+
		"\2\2\u008d\u0082\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090\5> \2"+
		"\u0090\u0091\7\16\2\2\u0091\u0092\5*\26\2\u0092\u0093\7\17\2\2\u0093\25"+
		"\3\2\2\2\u0094\u0095\5> \2\u0095\u0096\7\b\2\2\u0096\u0097\5,\27\2\u0097"+
		"\27\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7\16\2\2\u009a\u009b\5*\26"+
		"\2\u009b\u009c\7\17\2\2\u009c\31\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f"+
		"\7\16\2\2\u009f\u00a0\5(\25\2\u00a0\u00a1\7\17\2\2\u00a1\u00a4\5\6\4\2"+
		"\u00a2\u00a3\7\23\2\2\u00a3\u00a5\5\6\4\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8\7\16\2\2\u00a8"+
		"\u00a9\5(\25\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\5\6\4\2\u00ab\35\3\2\2"+
		"\2\u00ac\u00ad\7\25\2\2\u00ad\u00ae\7\16\2\2\u00ae\u00af\5$\23\2\u00af"+
		"\u00b0\7\7\2\2\u00b0\u00b1\5(\25\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5,"+
		"\27\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\5\6\4\2\u00b5\37\3\2\2\2\u00b6"+
		"\u00b7\7\26\2\2\u00b7!\3\2\2\2\u00b8\u00b9\7\27\2\2\u00b9#\3\2\2\2\u00ba"+
		"\u00bd\5\n\6\2\u00bb\u00bd\5,\27\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\u00c5\3\2\2\2\u00be\u00c1\7\20\2\2\u00bf\u00c2\5\n\6\2\u00c0"+
		"\u00c2\5,\27\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00be\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6%\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cf\5,\27\2"+
		"\u00c9\u00cf\5\24\13\2\u00ca\u00cb\5,\27\2\u00cb\u00cc\t\3\2\2\u00cc\u00cd"+
		"\5,\27\2\u00cd\u00cf\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00cf\'\3\2\2\2\u00d0\u00d5\5&\24\2\u00d1\u00d2\t\4\2\2"+
		"\u00d2\u00d4\5&\24\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6)\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00dd\5,\27\2\u00d9\u00da\7\20\2\2\u00da\u00dc\5,\27\2\u00db\u00d9\3"+
		"\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1+\3\2\2\2\u00e2\u00e4\t\5\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ea\5.\30\2\u00e6\u00e7\t\5\2\2\u00e7"+
		"\u00e9\5.\30\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb-\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f2"+
		"\5\60\31\2\u00ee\u00ef\t\6\2\2\u00ef\u00f1\5\60\31\2\u00f0\u00ee\3\2\2"+
		"\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3/"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fe\5> \2\u00f6\u00fe\5\62\32\2\u00f7"+
		"\u00f8\7\16\2\2\u00f8\u00f9\5\60\31\2\u00f9\u00fa\7\17\2\2\u00fa\u00fe"+
		"\3\2\2\2\u00fb\u00fe\5\26\f\2\u00fc\u00fe\5\24\13\2\u00fd\u00f5\3\2\2"+
		"\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\61\3\2\2\2\u00ff\u0105\5\64\33\2\u0100\u0105\5\66\34\2"+
		"\u0101\u0105\58\35\2\u0102\u0105\5:\36\2\u0103\u0105\5<\37\2\u0104\u00ff"+
		"\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\63\3\2\2\2\u0106\u0107\7+\2\2\u0107\65\3\2\2\2\u0108"+
		"\u0109\7+\2\2\u0109\u010d\7%\2\2\u010a\u010c\7+\2\2\u010b\u010a\3\2\2"+
		"\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\67"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\t\7\2\2\u01119\3\2\2\2\u0112"+
		"\u0113\7(\2\2\u0113\u0114\7*\2\2\u0114\u0115\7(\2\2\u0115;\3\2\2\2\u0116"+
		"\u0117\7)\2\2\u0117=\3\2\2\2\u0118\u011c\7*\2\2\u0119\u011b\t\b\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d?\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7+\2\2\u0120A\3\2"+
		"\2\2\31CFQ]fvy\u008d\u00a4\u00bc\u00c1\u00c5\u00ce\u00d5\u00dd\u00e0\u00e3"+
		"\u00ea\u00f2\u00fd\u0104\u010d\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}