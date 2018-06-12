package cmm;// Generated from D:/Program Files/JetBrains/Project/JSQ/CMMInterpreterV1.0\CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, READ=4, WRITE=5, BOOL=6, INT=7, DOUBLE=8, VOID=9, 
		TRUE=10, FALSE=11, BREAK=12, PLUS=13, MINUS=14, MULTIPLICATION=15, DIVISION=16, 
		MOD=17, ASSIGNMENT=18, PLUS_ASSIG=19, MINUS_ASSIG=20, MULTI_ASSIG=21, 
		DIV_ASSIG=22, LESSTHAN=23, LESS_EQUAL=24, MORETHAN=25, MORE_EQUAL=26, 
		EQUAL=27, UNEQUAL=28, LOGIC_OR=29, LOGIC_AND=30, LEFT_LITTLE_BRACE=31, 
		RIGHT_LITTLE_BRACE=32, SEMICOLONE=33, COMMA=34, COLON=35, LEFT_BRACE=36, 
		RIGHT_BRACE=37, LEFT_ARRAY_BRACE=38, RIGHT_ARRAY_BRACE=39, ID=40, INT_CONSTANT=41, 
		HEX_CONSTANT=42, FLOAT_LITERAL=43, EFFECTOR=44, STRING_LITERAL=45, WS=46, 
		LINE_COMMENT=47, COMMENT=48;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_stmt_block = 2, RULE_assignment_operator = 3, 
		RULE_var_decl = 4, RULE_base_type = 5, RULE_var_list = 6, RULE_decl_assign = 7, 
		RULE_if_stmt = 8, RULE_while_stmt = 9, RULE_break_stmt = 10, RULE_read_stmt = 11, 
		RULE_write_stmt = 12, RULE_assign_stmt = 13, RULE_value = 14, RULE_array = 15, 
		RULE_constant = 16, RULE_expr = 17;
	public static final String[] ruleNames = {
		"prog", "stmt", "stmt_block", "assignment_operator", "var_decl", "base_type", 
		"var_list", "decl_assign", "if_stmt", "while_stmt", "break_stmt", "read_stmt", 
		"write_stmt", "assign_stmt", "value", "array", "constant", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'read'", "'write'", "'bool'", "'int'", 
		"'double'", "'void'", null, null, "'break'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'='", "'+='", "'-='", "'*='", "'/='", "'<'", "'<='", "'>'", "'>='", 
		"'=='", null, "'||'", "'&&'", "'('", "')'", "';'", "','", "':'", "'{'", 
		"'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "WHILE", "READ", "WRITE", "BOOL", "INT", "DOUBLE", 
		"VOID", "TRUE", "FALSE", "BREAK", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", 
		"MOD", "ASSIGNMENT", "PLUS_ASSIG", "MINUS_ASSIG", "MULTI_ASSIG", "DIV_ASSIG", 
		"LESSTHAN", "LESS_EQUAL", "MORETHAN", "MORE_EQUAL", "EQUAL", "UNEQUAL", 
		"LOGIC_OR", "LOGIC_AND", "LEFT_LITTLE_BRACE", "RIGHT_LITTLE_BRACE", "SEMICOLONE", 
		"COMMA", "COLON", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_ARRAY_BRACE", "RIGHT_ARRAY_BRACE", 
		"ID", "INT_CONSTANT", "HEX_CONSTANT", "FLOAT_LITERAL", "EFFECTOR", "STRING_LITERAL", 
		"WS", "LINE_COMMENT", "COMMENT"
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
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMMParser(TokenStream input) {
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
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitProg(this);
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
			do {
				{
				{
				setState(36);
				stmt();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << BOOL) | (1L << INT) | (1L << DOUBLE) | (1L << TRUE) | (1L << FALSE) | (1L << BREAK) | (1L << LEFT_BRACE) | (1L << ID) | (1L << INT_CONSTANT) | (1L << HEX_CONSTANT) | (1L << FLOAT_LITERAL))) != 0) );
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
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				var_decl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				while_stmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				break_stmt();
				}
				break;
			case TRUE:
			case FALSE:
			case ID:
			case INT_CONSTANT:
			case HEX_CONSTANT:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				assign_stmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				read_stmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				write_stmt();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				stmt_block();
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

	public static class Stmt_blockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(CMMParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(CMMParser.RIGHT_BRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LEFT_BRACE);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				stmt();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << BOOL) | (1L << INT) | (1L << DOUBLE) | (1L << TRUE) | (1L << FALSE) | (1L << BREAK) | (1L << LEFT_BRACE) | (1L << ID) | (1L << INT_CONSTANT) | (1L << HEX_CONSTANT) | (1L << FLOAT_LITERAL))) != 0) );
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CMMParser.ASSIGNMENT, 0); }
		public TerminalNode MULTI_ASSIG() { return getToken(CMMParser.MULTI_ASSIG, 0); }
		public TerminalNode DIV_ASSIG() { return getToken(CMMParser.DIV_ASSIG, 0); }
		public TerminalNode PLUS_ASSIG() { return getToken(CMMParser.PLUS_ASSIG, 0); }
		public TerminalNode MINUS_ASSIG() { return getToken(CMMParser.MINUS_ASSIG, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGNMENT) | (1L << PLUS_ASSIG) | (1L << MINUS_ASSIG) | (1L << MULTI_ASSIG) | (1L << DIV_ASSIG))) != 0)) ) {
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

	public static class Var_declContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public Var_listContext var_list() {
			return getRuleContext(Var_listContext.class,0);
		}
		public TerminalNode SEMICOLONE() { return getToken(CMMParser.SEMICOLONE, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			base_type();
			setState(62);
			var_list();
			setState(63);
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

	public static class Base_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CMMParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(CMMParser.BOOL, 0); }
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_base_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << DOUBLE))) != 0)) ) {
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

	public static class Var_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CMMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMMParser.ID, i);
		}
		public List<Decl_assignContext> decl_assign() {
			return getRuleContexts(Decl_assignContext.class);
		}
		public Decl_assignContext decl_assign(int i) {
			return getRuleContext(Decl_assignContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMMParser.COMMA, i);
		}
		public Var_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVar_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVar_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVar_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_listContext var_list() throws RecognitionException {
		Var_listContext _localctx = new Var_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(67);
				match(ID);
				}
				break;
			case 2:
				{
				setState(68);
				decl_assign();
				}
				break;
			case 3:
				{
				setState(69);
				array();
				}
				break;
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(73);
					match(ID);
					}
					break;
				case 2:
					{
					setState(74);
					decl_assign();
					}
					break;
				case 3:
					{
					setState(75);
					array();
					}
					break;
				}
				}
				}
				setState(82);
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

	public static class Decl_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(CMMParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Decl_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterDecl_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitDecl_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitDecl_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_assignContext decl_assign() throws RecognitionException {
		Decl_assignContext _localctx = new Decl_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ID);
			setState(84);
			match(ASSIGNMENT);
			setState(85);
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

	public static class If_stmtContext extends ParserRuleContext {
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	 
		public If_stmtContext() { }
		public void copyFrom(If_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class I_SB_E_SBContext extends If_stmtContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CMMParser.ELSE, 0); }
		public I_SB_E_SBContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterI_SB_E_SB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitI_SB_E_SB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitI_SB_E_SB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class I_S_E_SContext extends If_stmtContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CMMParser.ELSE, 0); }
		public I_S_E_SContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterI_S_E_S(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitI_S_E_S(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitI_S_E_S(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class I_SBContext extends If_stmtContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public I_SBContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterI_SB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitI_SB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitI_SB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class I_S_E_SBContext extends If_stmtContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CMMParser.ELSE, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public I_S_E_SBContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterI_S_E_SB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitI_S_E_SB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitI_S_E_SB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class I_SB_E_SContext extends If_stmtContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CMMParser.ELSE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public I_SB_E_SContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterI_SB_E_S(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitI_SB_E_S(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitI_SB_E_S(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class I_SContext extends If_stmtContext {
		public TerminalNode IF() { return getToken(CMMParser.IF, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public I_SContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterI_S(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitI_S(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitI_S(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_stmt);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new I_SBContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(IF);
				setState(88);
				match(LEFT_LITTLE_BRACE);
				setState(89);
				expr(0);
				setState(90);
				match(RIGHT_LITTLE_BRACE);
				setState(91);
				stmt_block();
				}
				break;
			case 2:
				_localctx = new I_SContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(IF);
				setState(94);
				match(LEFT_LITTLE_BRACE);
				setState(95);
				expr(0);
				setState(96);
				match(RIGHT_LITTLE_BRACE);
				setState(97);
				stmt();
				}
				break;
			case 3:
				_localctx = new I_SB_E_SBContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(IF);
				setState(100);
				match(LEFT_LITTLE_BRACE);
				setState(101);
				expr(0);
				setState(102);
				match(RIGHT_LITTLE_BRACE);
				setState(103);
				stmt_block();
				setState(104);
				match(ELSE);
				setState(105);
				stmt_block();
				}
				break;
			case 4:
				_localctx = new I_SB_E_SContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(IF);
				setState(108);
				match(LEFT_LITTLE_BRACE);
				setState(109);
				expr(0);
				setState(110);
				match(RIGHT_LITTLE_BRACE);
				setState(111);
				stmt_block();
				setState(112);
				match(ELSE);
				setState(113);
				stmt();
				}
				break;
			case 5:
				_localctx = new I_S_E_SBContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(IF);
				setState(116);
				match(LEFT_LITTLE_BRACE);
				setState(117);
				expr(0);
				setState(118);
				match(RIGHT_LITTLE_BRACE);
				setState(119);
				stmt();
				setState(120);
				match(ELSE);
				setState(121);
				stmt_block();
				}
				break;
			case 6:
				_localctx = new I_S_E_SContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(IF);
				setState(124);
				match(LEFT_LITTLE_BRACE);
				setState(125);
				expr(0);
				setState(126);
				match(RIGHT_LITTLE_BRACE);
				setState(127);
				stmt();
				setState(128);
				match(ELSE);
				setState(129);
				stmt();
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

	public static class While_stmtContext extends ParserRuleContext {
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	 
		public While_stmtContext() { }
		public void copyFrom(While_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WH_SBContext extends While_stmtContext {
		public TerminalNode WHILE() { return getToken(CMMParser.WHILE, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public WH_SBContext(While_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWH_SB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWH_SB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWH_SB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			_localctx = new WH_SBContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(WHILE);
			setState(134);
			match(LEFT_LITTLE_BRACE);
			setState(135);
			expr(0);
			setState(136);
			match(RIGHT_LITTLE_BRACE);
			setState(137);
			stmt_block();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CMMParser.BREAK, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMParser.SEMICOLONE, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(BREAK);
			setState(140);
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

	public static class Read_stmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CMMParser.READ, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMParser.SEMICOLONE, 0); }
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitRead_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitRead_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(READ);
			setState(143);
			match(LEFT_LITTLE_BRACE);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(144);
				match(ID);
				}
				break;
			case 2:
				{
				setState(145);
				array();
				}
				break;
			}
			setState(148);
			match(RIGHT_LITTLE_BRACE);
			setState(149);
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

	public static class Write_stmtContext extends ParserRuleContext {
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
	 
		public Write_stmtContext() { }
		public void copyFrom(Write_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class W_E_EContext extends Write_stmtContext {
		public TerminalNode WRITE() { return getToken(CMMParser.WRITE, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public TerminalNode EFFECTOR() { return getToken(CMMParser.EFFECTOR, 0); }
		public TerminalNode COMMA() { return getToken(CMMParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMParser.SEMICOLONE, 0); }
		public W_E_EContext(Write_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterW_E_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitW_E_E(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitW_E_E(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class W_SContext extends Write_stmtContext {
		public TerminalNode WRITE() { return getToken(CMMParser.WRITE, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CMMParser.STRING_LITERAL, 0); }
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMParser.SEMICOLONE, 0); }
		public W_SContext(Write_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterW_S(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitW_S(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitW_S(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class W_ES_CContext extends Write_stmtContext {
		public TerminalNode WRITE() { return getToken(CMMParser.WRITE, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMParser.SEMICOLONE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(CMMParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(CMMParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMMParser.COMMA, i);
		}
		public W_ES_CContext(Write_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterW_ES_C(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitW_ES_C(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitW_ES_C(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class W_EContext extends Write_stmtContext {
		public TerminalNode WRITE() { return getToken(CMMParser.WRITE, 0); }
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public TerminalNode SEMICOLONE() { return getToken(CMMParser.SEMICOLONE, 0); }
		public W_EContext(Write_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterW_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitW_E(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitW_E(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_write_stmt);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new W_EContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(WRITE);
				setState(152);
				match(LEFT_LITTLE_BRACE);
				setState(153);
				expr(0);
				setState(154);
				match(RIGHT_LITTLE_BRACE);
				setState(155);
				match(SEMICOLONE);
				}
				break;
			case 2:
				_localctx = new W_SContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(WRITE);
				setState(158);
				match(LEFT_LITTLE_BRACE);
				setState(159);
				match(STRING_LITERAL);
				setState(160);
				match(RIGHT_LITTLE_BRACE);
				setState(161);
				match(SEMICOLONE);
				}
				break;
			case 3:
				_localctx = new W_ES_CContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(WRITE);
				setState(163);
				match(LEFT_LITTLE_BRACE);
				setState(166);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case PLUS:
				case MINUS:
				case LEFT_LITTLE_BRACE:
				case ID:
				case INT_CONSTANT:
				case HEX_CONSTANT:
				case FLOAT_LITERAL:
					{
					setState(164);
					expr(0);
					}
					break;
				case STRING_LITERAL:
					{
					setState(165);
					match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(168);
					match(COMMA);
					setState(171);
					switch (_input.LA(1)) {
					case TRUE:
					case FALSE:
					case PLUS:
					case MINUS:
					case LEFT_LITTLE_BRACE:
					case ID:
					case INT_CONSTANT:
					case HEX_CONSTANT:
					case FLOAT_LITERAL:
						{
						setState(169);
						expr(0);
						}
						break;
					case STRING_LITERAL:
						{
						setState(170);
						match(STRING_LITERAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(RIGHT_LITTLE_BRACE);
				setState(179);
				match(SEMICOLONE);
				}
				break;
			case 4:
				_localctx = new W_E_EContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(WRITE);
				setState(181);
				match(LEFT_LITTLE_BRACE);
				setState(182);
				match(EFFECTOR);
				setState(183);
				match(COMMA);
				setState(184);
				expr(0);
				setState(185);
				match(RIGHT_LITTLE_BRACE);
				setState(186);
				match(SEMICOLONE);
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLONE() { return getToken(CMMParser.SEMICOLONE, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			value();
			setState(191);
			assignment_operator();
			setState(192);
			expr(0);
			setState(193);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				array();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TerminalNode LEFT_ARRAY_BRACE() { return getToken(CMMParser.LEFT_ARRAY_BRACE, 0); }
		public TerminalNode RIGHT_ARRAY_BRACE() { return getToken(CMMParser.RIGHT_ARRAY_BRACE, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CMMParser.INT_CONSTANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
			match(LEFT_ARRAY_BRACE);
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(202);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(203);
				expr(0);
				}
				break;
			}
			setState(206);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(CMMParser.INT_CONSTANT, 0); }
		public TerminalNode HEX_CONSTANT() { return getToken(CMMParser.HEX_CONSTANT, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(CMMParser.FLOAT_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(CMMParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CMMParser.FALSE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INT_CONSTANT) | (1L << HEX_CONSTANT) | (1L << FLOAT_LITERAL))) != 0)) ) {
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SignExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CMMParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CMMParser.MINUS, 0); }
		public SignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueExprContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(CMMParser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(CMMParser.DIVISION, 0); }
		public TerminalNode MOD() { return getToken(CMMParser.MOD, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddMinExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CMMParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CMMParser.MINUS, 0); }
		public AddMinExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAddMinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAddMinExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAddMinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(CMMParser.LESS_EQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(CMMParser.LESSTHAN, 0); }
		public TerminalNode MORE_EQUAL() { return getToken(CMMParser.MORE_EQUAL, 0); }
		public TerminalNode MORETHAN() { return getToken(CMMParser.MORETHAN, 0); }
		public TerminalNode EQUAL() { return getToken(CMMParser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(CMMParser.UNEQUAL, 0); }
		public CompareExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesExprContext extends ExprContext {
		public TerminalNode LEFT_LITTLE_BRACE() { return getToken(CMMParser.LEFT_LITTLE_BRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_LITTLE_BRACE() { return getToken(CMMParser.RIGHT_LITTLE_BRACE, 0); }
		public ParenthesesExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterParenthesesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitParenthesesExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitParenthesesExpr(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			switch (_input.LA(1)) {
			case LEFT_LITTLE_BRACE:
				{
				_localctx = new ParenthesesExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(211);
				match(LEFT_LITTLE_BRACE);
				setState(212);
				expr(0);
				setState(213);
				match(RIGHT_LITTLE_BRACE);
				}
				break;
			case TRUE:
			case FALSE:
			case ID:
			case INT_CONSTANT:
			case HEX_CONSTANT:
			case FLOAT_LITERAL:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				value();
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				((SignExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((SignExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(217);
				expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(221);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MOD))) != 0)) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(222);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddMinExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(224);
						((AddMinExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddMinExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(225);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(227);
						((CompareExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSTHAN) | (1L << LESS_EQUAL) | (1L << MORETHAN) | (1L << MORE_EQUAL) | (1L << EQUAL) | (1L << UNEQUAL))) != 0)) ) {
							((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(228);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00ed\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\6\48\n\4\r\4\16\49\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\5\bI\n\b\3\b\3\b\3\b\3\b\5\bO\n\b\7\bQ\n\b\f\b\16\bT"+
		"\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0086\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0095"+
		"\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00a9\n\16\3\16\3\16\3\16\5\16\u00ae\n\16\7"+
		"\16\u00b0\n\16\f\16\16\16\u00b3\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00bf\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\5\20\u00c9\n\20\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00dd\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e8\n\23\f\23\16\23\u00eb"+
		"\13\23\3\23\2\3$\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\b\3\2"+
		"\24\30\3\2\b\n\4\2\f\r+-\3\2\17\20\3\2\21\23\3\2\31\36\u00fc\2\'\3\2\2"+
		"\2\4\63\3\2\2\2\6\65\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fC\3\2\2\2\16H\3\2"+
		"\2\2\20U\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u008d\3\2\2\2\30"+
		"\u0090\3\2\2\2\32\u00be\3\2\2\2\34\u00c0\3\2\2\2\36\u00c8\3\2\2\2 \u00ca"+
		"\3\2\2\2\"\u00d2\3\2\2\2$\u00dc\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+\64\5\n\6\2,\64\5\22\n\2-\64\5\24\13"+
		"\2.\64\5\26\f\2/\64\5\34\17\2\60\64\5\30\r\2\61\64\5\32\16\2\62\64\5\6"+
		"\4\2\63+\3\2\2\2\63,\3\2\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60"+
		"\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\67\7&\2\2\668\5\4"+
		"\3\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\'\2\2"+
		"<\7\3\2\2\2=>\t\2\2\2>\t\3\2\2\2?@\5\f\7\2@A\5\16\b\2AB\7#\2\2B\13\3\2"+
		"\2\2CD\t\3\2\2D\r\3\2\2\2EI\7*\2\2FI\5\20\t\2GI\5 \21\2HE\3\2\2\2HF\3"+
		"\2\2\2HG\3\2\2\2IR\3\2\2\2JN\7$\2\2KO\7*\2\2LO\5\20\t\2MO\5 \21\2NK\3"+
		"\2\2\2NL\3\2\2\2NM\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3"+
		"\2\2\2S\17\3\2\2\2TR\3\2\2\2UV\7*\2\2VW\7\24\2\2WX\5$\23\2X\21\3\2\2\2"+
		"YZ\7\3\2\2Z[\7!\2\2[\\\5$\23\2\\]\7\"\2\2]^\5\6\4\2^\u0086\3\2\2\2_`\7"+
		"\3\2\2`a\7!\2\2ab\5$\23\2bc\7\"\2\2cd\5\4\3\2d\u0086\3\2\2\2ef\7\3\2\2"+
		"fg\7!\2\2gh\5$\23\2hi\7\"\2\2ij\5\6\4\2jk\7\4\2\2kl\5\6\4\2l\u0086\3\2"+
		"\2\2mn\7\3\2\2no\7!\2\2op\5$\23\2pq\7\"\2\2qr\5\6\4\2rs\7\4\2\2st\5\4"+
		"\3\2t\u0086\3\2\2\2uv\7\3\2\2vw\7!\2\2wx\5$\23\2xy\7\"\2\2yz\5\4\3\2z"+
		"{\7\4\2\2{|\5\6\4\2|\u0086\3\2\2\2}~\7\3\2\2~\177\7!\2\2\177\u0080\5$"+
		"\23\2\u0080\u0081\7\"\2\2\u0081\u0082\5\4\3\2\u0082\u0083\7\4\2\2\u0083"+
		"\u0084\5\4\3\2\u0084\u0086\3\2\2\2\u0085Y\3\2\2\2\u0085_\3\2\2\2\u0085"+
		"e\3\2\2\2\u0085m\3\2\2\2\u0085u\3\2\2\2\u0085}\3\2\2\2\u0086\23\3\2\2"+
		"\2\u0087\u0088\7\5\2\2\u0088\u0089\7!\2\2\u0089\u008a\5$\23\2\u008a\u008b"+
		"\7\"\2\2\u008b\u008c\5\6\4\2\u008c\25\3\2\2\2\u008d\u008e\7\16\2\2\u008e"+
		"\u008f\7#\2\2\u008f\27\3\2\2\2\u0090\u0091\7\6\2\2\u0091\u0094\7!\2\2"+
		"\u0092\u0095\7*\2\2\u0093\u0095\5 \21\2\u0094\u0092\3\2\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7#\2\2\u0098"+
		"\31\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u009b\7!\2\2\u009b\u009c\5$\23\2"+
		"\u009c\u009d\7\"\2\2\u009d\u009e\7#\2\2\u009e\u00bf\3\2\2\2\u009f\u00a0"+
		"\7\7\2\2\u00a0\u00a1\7!\2\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\7\"\2\2\u00a3"+
		"\u00bf\7#\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a8\7!\2\2\u00a6\u00a9\5$\23"+
		"\2\u00a7\u00a9\7/\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00b1"+
		"\3\2\2\2\u00aa\u00ad\7$\2\2\u00ab\u00ae\5$\23\2\u00ac\u00ae\7/\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00bf\7#"+
		"\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\7!\2\2\u00b8\u00b9\7.\2\2\u00b9\u00ba"+
		"\7$\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\7#\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u0099\3\2\2\2\u00be\u009f\3\2\2\2\u00be\u00a4\3\2"+
		"\2\2\u00be\u00b6\3\2\2\2\u00bf\33\3\2\2\2\u00c0\u00c1\5\36\20\2\u00c1"+
		"\u00c2\5\b\5\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7#\2\2\u00c4\35\3\2\2\2"+
		"\u00c5\u00c9\5\"\22\2\u00c6\u00c9\7*\2\2\u00c7\u00c9\5 \21\2\u00c8\u00c5"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\37\3\2\2\2\u00ca"+
		"\u00cb\7*\2\2\u00cb\u00ce\7(\2\2\u00cc\u00cf\7+\2\2\u00cd\u00cf\5$\23"+
		"\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\7)\2\2\u00d1!\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3#\3\2\2\2\u00d4\u00d5"+
		"\b\23\1\2\u00d5\u00d6\7!\2\2\u00d6\u00d7\5$\23\2\u00d7\u00d8\7\"\2\2\u00d8"+
		"\u00dd\3\2\2\2\u00d9\u00dd\5\36\20\2\u00da\u00db\t\5\2\2\u00db\u00dd\5"+
		"$\23\3\u00dc\u00d4\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e9\3\2\2\2\u00de\u00df\f\b\2\2\u00df\u00e0\t\6\2\2\u00e0\u00e8\5$"+
		"\23\t\u00e1\u00e2\f\7\2\2\u00e2\u00e3\t\5\2\2\u00e3\u00e8\5$\23\b\u00e4"+
		"\u00e5\f\6\2\2\u00e5\u00e6\t\7\2\2\u00e6\u00e8\5$\23\7\u00e7\u00de\3\2"+
		"\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea%\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\23)\639HNR\u0085\u0094\u00a8\u00ad\u00b1\u00be\u00c8\u00ce\u00dc\u00e7"+
		"\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}