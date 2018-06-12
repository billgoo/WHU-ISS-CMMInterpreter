// Generated from D:/Program Files/JetBrains/Project/JSQ/cnm3\CMMPARSER.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMPARSERParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, READ=4, WRITE=5, INT=6, DOUBLE=7, TRUE=8, FALSE=9, 
		BREAK=10, PLUS=11, MINUS=12, MULTIPLICATION=13, DIVISION=14, MOD=15, ASSIGNMENT=16, 
		LESSTHAN=17, LESS_EQUAL=18, MORETHAN=19, MORE_EQUAL=20, EQUAL=21, UNEQUAL=22, 
		LEFT_LITTLE_BRACE=23, RIGHT_LITTLE_BRACE=24, SEMICOLONE=25, COMMA=26, 
		LEFT_BRACE=27, RIGHT_BRACE=28, LEFT_ARRAY_BRACE=29, RIGHT_ARRAY_BRACE=30, 
		ID=31, WS=32, LINE_COMMENT=33, COMMENT=34, INTCONSTANT=35, HEXCONSTANT=36, 
		DOUBLECONSTANT=37, HEXFLOATCONSTANT=38;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_stmtBlock = 2, RULE_varDecl = 3, RULE_type = 4, 
		RULE_varList = 5, RULE_varArray = 6, RULE_varAssign = 7, RULE_ifStmt = 8, 
		RULE_whileStmt = 9, RULE_breakStmt = 10, RULE_readStmt = 11, RULE_writeStmt = 12, 
		RULE_assignStmt = 13, RULE_value = 14, RULE_constant = 15, RULE_expr = 16;
	public static final String[] ruleNames = {
		"prog", "stmt", "stmtBlock", "varDecl", "type", "varList", "varArray", 
		"varAssign", "ifStmt", "whileStmt", "breakStmt", "readStmt", "writeStmt", 
		"assignStmt", "value", "constant", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'read'", "'write'", "'int'", "'double'", 
		null, null, "'break'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'<'", 
		"'<='", "'>'", "'>='", "'=='", null, "'('", "')'", "';'", "','", "'{'", 
		"'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "WHILE", "READ", "WRITE", "INT", "DOUBLE", "TRUE", 
		"FALSE", "BREAK", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "MOD", 
		"ASSIGNMENT", "LESSTHAN", "LESS_EQUAL", "MORETHAN", "MORE_EQUAL", "EQUAL", 
		"UNEQUAL", "LEFT_LITTLE_BRACE", "RIGHT_LITTLE_BRACE", "SEMICOLONE", "COMMA", 
		"LEFT_BRACE", "RIGHT_BRACE", "LEFT_ARRAY_BRACE", "RIGHT_ARRAY_BRACE", 
		"ID", "WS", "LINE_COMMENT", "COMMENT", "INTCONSTANT", "HEXCONSTANT", "DOUBLECONSTANT", 
		"HEXFLOATCONSTANT"
	};
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
	public String getGrammarFileName() { return "CMMPARSER.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMMPARSERParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << INT) | (1L << DOUBLE) | (1L << BREAK) | (1L << LEFT_BRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(34);
				stmt();
				}
				}
				setState(39);
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

	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				varDecl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				whileStmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				breakStmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				assignStmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				readStmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				writeStmt();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				stmtBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmtBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(CMMPARSERParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(CMMPARSERParser.RIGHT_BRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtBlockContext stmtBlock() throws RecognitionException {
		StmtBlockContext _localctx = new StmtBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LEFT_BRACE);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << INT) | (1L << DOUBLE) | (1L << BREAK) | (1L << LEFT_BRACE) | (1L << ID))) != 0)) {
				{
				{
				setState(51);
				stmt();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(RIGHT_BRACE);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TerminalNode SEMICOLONE() { return getToken(CMMPARSERParser.SEMICOLONE, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			type(0);
			setState(60);
			varList();
			setState(61);
			match(SEMICOLONE);
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
		public TerminalNode INT() { return getToken(CMMPARSERParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CMMPARSERParser.DOUBLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFT_ARRAY_BRACE() { return getToken(CMMPARSERParser.LEFT_ARRAY_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_ARRAY_BRACE() { return getToken(CMMPARSERParser.RIGHT_ARRAY_BRACE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(64);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				setState(65);
				match(DOUBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(68);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(69);
					match(LEFT_ARRAY_BRACE);
					setState(70);
					expr(0);
					setState(71);
					match(RIGHT_ARRAY_BRACE);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CMMPARSERParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMMPARSERParser.ID, i);
		}
		public List<VarAssignContext> varAssign() {
			return getRuleContexts(VarAssignContext.class);
		}
		public VarAssignContext varAssign(int i) {
			return getRuleContext(VarAssignContext.class,i);
		}
		public List<VarArrayContext> varArray() {
			return getRuleContexts(VarArrayContext.class);
		}
		public VarArrayContext varArray(int i) {
			return getRuleContext(VarArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMMPARSERParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMMPARSERParser.COMMA, i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(78);
				match(ID);
				}
				break;
			case 2:
				{
				setState(79);
				varAssign();
				}
				break;
			case 3:
				{
				setState(80);
				varArray();
				}
				break;
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83);
				match(COMMA);
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(84);
					match(ID);
					}
					break;
				case 2:
					{
					setState(85);
					varAssign();
					}
					break;
				case 3:
					{
					setState(86);
					varArray();
					}
					break;
				}
				}
				}
				setState(93);
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

	public static class VarArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMPARSERParser.ID, 0); }
		public TerminalNode LEFT_ARRAY_BRACE() { return getToken(CMMPARSERParser.LEFT_ARRAY_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_ARRAY_BRACE() { return getToken(CMMPARSERParser.RIGHT_ARRAY_BRACE, 0); }
		public VarArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterVarArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitVarArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitVarArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarArrayContext varArray() throws RecognitionException {
		VarArrayContext _localctx = new VarArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
			setState(95);
			match(LEFT_ARRAY_BRACE);
			setState(96);
			expr(0);
			setState(97);
			match(RIGHT_ARRAY_BRACE);
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

	public static class VarAssignContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CMMPARSERParser.ASSIGNMENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CMMPARSERParser.ID, 0); }
		public TerminalNode LEFT_ARRAY_BRACE() { return getToken(CMMPARSERParser.LEFT_ARRAY_BRACE, 0); }
		public TerminalNode RIGHT_ARRAY_BRACE() { return getToken(CMMPARSERParser.RIGHT_ARRAY_BRACE, 0); }
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(99);
				match(ID);
				}
				break;
			case 2:
				{
				{
				setState(100);
				match(ID);
				setState(101);
				match(LEFT_ARRAY_BRACE);
				setState(102);
				expr(0);
				setState(103);
				match(RIGHT_ARRAY_BRACE);
				}
				}
				break;
			}
			setState(107);
			match(ASSIGNMENT);
			setState(108);
			expr(0);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CMMPARSERParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CMMPARSERParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			expr(0);
			setState(112);
			stmt();
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(113);
				match(ELSE);
				setState(114);
				stmt();
				}
				break;
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CMMPARSERParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WHILE);
			setState(118);
			expr(0);
			setState(119);
			stmt();
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CMMPARSERParser.BREAK, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMPARSERParser.SEMICOLONE, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(BREAK);
			setState(122);
			match(SEMICOLONE);
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

	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CMMPARSERParser.READ, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMPARSERParser.LEFT_LITTLE_BRACE, 0); }
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMPARSERParser.RIGHT_LITTLE_BRACE, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMPARSERParser.SEMICOLONE, 0); }
		public TerminalNode ID() { return getToken(CMMPARSERParser.ID, 0); }
		public TerminalNode LEFT_ARRAY_BRACE() { return getToken(CMMPARSERParser.LEFT_ARRAY_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_ARRAY_BRACE() { return getToken(CMMPARSERParser.RIGHT_ARRAY_BRACE, 0); }
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(READ);
			setState(125);
			match(LEFT_LITTLE_BRACE);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(126);
				match(ID);
				}
				break;
			case 2:
				{
				{
				setState(127);
				match(ID);
				setState(128);
				match(LEFT_ARRAY_BRACE);
				setState(129);
				expr(0);
				setState(130);
				match(RIGHT_ARRAY_BRACE);
				}
				}
				break;
			}
			setState(134);
			match(RIGHT_LITTLE_BRACE);
			setState(135);
			match(SEMICOLONE);
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

	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CMMPARSERParser.WRITE, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMPARSERParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMPARSERParser.RIGHT_LITTLE_BRACE, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMPARSERParser.SEMICOLONE, 0); }
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(WRITE);
			setState(138);
			match(LEFT_LITTLE_BRACE);
			setState(139);
			expr(0);
			setState(140);
			match(RIGHT_LITTLE_BRACE);
			setState(141);
			match(SEMICOLONE);
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

	public static class AssignStmtContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CMMPARSERParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLONE() { return getToken(CMMPARSERParser.SEMICOLONE, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			value();
			setState(144);
			match(ASSIGNMENT);
			setState(145);
			expr(0);
			setState(146);
			match(SEMICOLONE);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMPARSERParser.ID, 0); }
		public TerminalNode LEFT_ARRAY_BRACE() { return getToken(CMMPARSERParser.LEFT_ARRAY_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_ARRAY_BRACE() { return getToken(CMMPARSERParser.RIGHT_ARRAY_BRACE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(148);
				match(ID);
				setState(149);
				match(LEFT_ARRAY_BRACE);
				setState(150);
				expr(0);
				setState(151);
				match(RIGHT_ARRAY_BRACE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(ID);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTCONSTANT() { return getToken(CMMPARSERParser.INTCONSTANT, 0); }
		public TerminalNode DOUBLECONSTANT() { return getToken(CMMPARSERParser.DOUBLECONSTANT, 0); }
		public TerminalNode TRUE() { return getToken(CMMPARSERParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CMMPARSERParser.FALSE, 0); }
		public TerminalNode HEXCONSTANT() { return getToken(CMMPARSERParser.HEXCONSTANT, 0); }
		public TerminalNode HEXFLOATCONSTANT() { return getToken(CMMPARSERParser.HEXFLOATCONSTANT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INTCONSTANT) | (1L << HEXCONSTANT) | (1L << DOUBLECONSTANT) | (1L << HEXFLOATCONSTANT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(CMMPARSERParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CMMPARSERParser.ID, 0); }
		public TerminalNode LEFT_ARRAY_BRACE() { return getToken(CMMPARSERParser.LEFT_ARRAY_BRACE, 0); }
		public TerminalNode RIGHT_ARRAY_BRACE() { return getToken(CMMPARSERParser.RIGHT_ARRAY_BRACE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMPARSERParser.LEFT_LITTLE_BRACE, 0); }
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMPARSERParser.RIGHT_LITTLE_BRACE, 0); }
		public TerminalNode MULTIPLICATION() { return getToken(CMMPARSERParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(CMMPARSERParser.DIVISION, 0); }
		public TerminalNode MOD() { return getToken(CMMPARSERParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CMMPARSERParser.PLUS, 0); }
		public TerminalNode MORETHAN() { return getToken(CMMPARSERParser.MORETHAN, 0); }
		public TerminalNode MORE_EQUAL() { return getToken(CMMPARSERParser.MORE_EQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(CMMPARSERParser.LESSTHAN, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(CMMPARSERParser.LESS_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CMMPARSERParser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(CMMPARSERParser.UNEQUAL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMPARSERListener ) ((CMMPARSERListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMPARSERVisitor ) return ((CMMPARSERVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(159);
				match(MINUS);
				setState(160);
				expr(10);
				}
				break;
			case 2:
				{
				setState(161);
				match(ID);
				}
				break;
			case 3:
				{
				setState(162);
				match(ID);
				setState(163);
				match(LEFT_ARRAY_BRACE);
				setState(164);
				expr(0);
				setState(165);
				match(RIGHT_ARRAY_BRACE);
				}
				break;
			case 4:
				{
				setState(167);
				constant();
				}
				break;
			case 5:
				{
				setState(168);
				match(LEFT_LITTLE_BRACE);
				setState(169);
				expr(0);
				setState(170);
				match(RIGHT_LITTLE_BRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(175);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICATION || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(176);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						match(MOD);
						setState(179);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(182);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSTHAN) | (1L << LESS_EQUAL) | (1L << MORETHAN) | (1L << MORE_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(185);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==UNEQUAL) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(188);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\5\6E\n\6\3\6\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3\7\5"+
		"\7T\n\7\3\7\3\7\3\7\3\7\5\7Z\n\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\5\nv\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0087\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009d\n\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00af\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00c0\n\22\f\22\16\22\u00c3\13\22\3\22"+
		"\2\4\n\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\4\2\n\13%(\3"+
		"\2\17\20\3\2\r\16\3\2\23\26\3\2\27\30\u00d0\2\'\3\2\2\2\4\62\3\2\2\2\6"+
		"\64\3\2\2\2\b=\3\2\2\2\nD\3\2\2\2\fS\3\2\2\2\16`\3\2\2\2\20k\3\2\2\2\22"+
		"p\3\2\2\2\24w\3\2\2\2\26{\3\2\2\2\30~\3\2\2\2\32\u008b\3\2\2\2\34\u0091"+
		"\3\2\2\2\36\u009c\3\2\2\2 \u009e\3\2\2\2\"\u00ae\3\2\2\2$&\5\4\3\2%$\3"+
		"\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)\'\3\2\2\2*\63\5\b\5"+
		"\2+\63\5\22\n\2,\63\5\24\13\2-\63\5\26\f\2.\63\5\34\17\2/\63\5\30\r\2"+
		"\60\63\5\32\16\2\61\63\5\6\4\2\62*\3\2\2\2\62+\3\2\2\2\62,\3\2\2\2\62"+
		"-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2"+
		"\2\2\648\7\35\2\2\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\2"+
		"89\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\36\2\2<\7\3\2\2\2=>\5\n\6\2>?\5\f\7"+
		"\2?@\7\33\2\2@\t\3\2\2\2AB\b\6\1\2BE\7\b\2\2CE\7\t\2\2DA\3\2\2\2DC\3\2"+
		"\2\2EM\3\2\2\2FG\f\3\2\2GH\7\37\2\2HI\5\"\22\2IJ\7 \2\2JL\3\2\2\2KF\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OM\3\2\2\2PT\7!\2\2QT"+
		"\5\20\t\2RT\5\16\b\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T]\3\2\2\2UY\7\34\2"+
		"\2VZ\7!\2\2WZ\5\20\t\2XZ\5\16\b\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\\\3\2"+
		"\2\2[U\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_]\3\2\2\2`a\7"+
		"!\2\2ab\7\37\2\2bc\5\"\22\2cd\7 \2\2d\17\3\2\2\2el\7!\2\2fg\7!\2\2gh\7"+
		"\37\2\2hi\5\"\22\2ij\7 \2\2jl\3\2\2\2ke\3\2\2\2kf\3\2\2\2lm\3\2\2\2mn"+
		"\7\22\2\2no\5\"\22\2o\21\3\2\2\2pq\7\3\2\2qr\5\"\22\2ru\5\4\3\2st\7\4"+
		"\2\2tv\5\4\3\2us\3\2\2\2uv\3\2\2\2v\23\3\2\2\2wx\7\5\2\2xy\5\"\22\2yz"+
		"\5\4\3\2z\25\3\2\2\2{|\7\f\2\2|}\7\33\2\2}\27\3\2\2\2~\177\7\6\2\2\177"+
		"\u0086\7\31\2\2\u0080\u0087\7!\2\2\u0081\u0082\7!\2\2\u0082\u0083\7\37"+
		"\2\2\u0083\u0084\5\"\22\2\u0084\u0085\7 \2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\32"+
		"\2\2\u0089\u008a\7\33\2\2\u008a\31\3\2\2\2\u008b\u008c\7\7\2\2\u008c\u008d"+
		"\7\31\2\2\u008d\u008e\5\"\22\2\u008e\u008f\7\32\2\2\u008f\u0090\7\33\2"+
		"\2\u0090\33\3\2\2\2\u0091\u0092\5\36\20\2\u0092\u0093\7\22\2\2\u0093\u0094"+
		"\5\"\22\2\u0094\u0095\7\33\2\2\u0095\35\3\2\2\2\u0096\u0097\7!\2\2\u0097"+
		"\u0098\7\37\2\2\u0098\u0099\5\"\22\2\u0099\u009a\7 \2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u009d\7!\2\2\u009c\u0096\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\37\3\2\2\2\u009e\u009f\t\2\2\2\u009f!\3\2\2\2\u00a0\u00a1\b\22\1\2\u00a1"+
		"\u00a2\7\16\2\2\u00a2\u00af\5\"\22\f\u00a3\u00af\7!\2\2\u00a4\u00a5\7"+
		"!\2\2\u00a5\u00a6\7\37\2\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\7 \2\2\u00a8"+
		"\u00af\3\2\2\2\u00a9\u00af\5 \21\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\5"+
		"\"\22\2\u00ac\u00ad\7\32\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a0\3\2\2\2\u00ae"+
		"\u00a3\3\2\2\2\u00ae\u00a4\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2"+
		"\2\2\u00af\u00c1\3\2\2\2\u00b0\u00b1\f\13\2\2\u00b1\u00b2\t\3\2\2\u00b2"+
		"\u00c0\5\"\22\f\u00b3\u00b4\f\n\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00c0\5"+
		"\"\22\13\u00b6\u00b7\f\t\2\2\u00b7\u00b8\t\4\2\2\u00b8\u00c0\5\"\22\n"+
		"\u00b9\u00ba\f\b\2\2\u00ba\u00bb\t\5\2\2\u00bb\u00c0\5\"\22\t\u00bc\u00bd"+
		"\f\7\2\2\u00bd\u00be\t\6\2\2\u00be\u00c0\5\"\22\b\u00bf\u00b0\3\2\2\2"+
		"\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"#\3\2\2\2\u00c3\u00c1\3\2\2\2\21\'\628DMSY]ku\u0086\u009c\u00ae\u00bf"+
		"\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}