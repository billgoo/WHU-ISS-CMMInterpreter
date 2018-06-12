// Generated from D:/Program Files/JetBrains/Project/cnm\Cal.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUMBER=11, ADD=12, SUB=13, MUL=14, DIV=15, WS=16;
	public static final int
		RULE_prog = 0, RULE_setExpr = 1, RULE_calExpr = 2, RULE_expr = 3, RULE_writeExpr = 4, 
		RULE_endExpr = 5;
	public static final String[] ruleNames = {
		"prog", "setExpr", "calExpr", "expr", "writeExpr", "endExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'float'", "';'", "'int'", "'='", "'('", "')'", "'write('", "');'", 
		"').'", null, null, "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "NUMBER", 
		"ADD", "SUB", "MUL", "DIV", "WS"
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
	public String getGrammarFileName() { return "Cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public EndExprContext endExpr() {
			return getRuleContext(EndExprContext.class,0);
		}
		public List<SetExprContext> setExpr() {
			return getRuleContexts(SetExprContext.class);
		}
		public SetExprContext setExpr(int i) {
			return getRuleContext(SetExprContext.class,i);
		}
		public List<CalExprContext> calExpr() {
			return getRuleContexts(CalExprContext.class);
		}
		public CalExprContext calExpr(int i) {
			return getRuleContext(CalExprContext.class,i);
		}
		public List<WriteExprContext> writeExpr() {
			return getRuleContexts(WriteExprContext.class);
		}
		public WriteExprContext writeExpr(int i) {
			return getRuleContext(WriteExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalVisitor ) return ((CalVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				setExpr();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__2 );
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				calExpr();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(22);
					writeExpr();
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(28);
			endExpr();
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

	public static class SetExprContext extends ParserRuleContext {
		public Token id;
		public TerminalNode ID() { return getToken(CalParser.ID, 0); }
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).exitSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalVisitor ) return ((CalVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setExpr);
		try {
			setState(36);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__0);
				setState(31);
				((SetExprContext)_localctx).id = match(ID);
				setState(32);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__2);
				setState(34);
				((SetExprContext)_localctx).id = match(ID);
				setState(35);
				match(T__1);
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

	public static class CalExprContext extends ParserRuleContext {
		public Token id;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(CalParser.ID, 0); }
		public CalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).enterCalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).exitCalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalVisitor ) return ((CalVisitor<? extends T>)visitor).visitCalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalExprContext calExpr() throws RecognitionException {
		CalExprContext _localctx = new CalExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_calExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((CalExprContext)_localctx).id = match(ID);
			setState(39);
			match(T__3);
			setState(40);
			expr(0);
			setState(41);
			match(T__1);
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
		public Token sign;
		public Token num;
		public Token id;
		public Token op;
		public TerminalNode NUMBER() { return getToken(CalParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(CalParser.SUB, 0); }
		public TerminalNode ID() { return getToken(CalParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CalParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(CalParser.ADD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalVisitor ) return ((CalVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			switch (_input.LA(1)) {
			case NUMBER:
			case SUB:
				{
				setState(45);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(44);
					((ExprContext)_localctx).sign = match(SUB);
					}
				}

				setState(47);
				((ExprContext)_localctx).num = match(NUMBER);
				}
				break;
			case ID:
				{
				setState(48);
				((ExprContext)_localctx).id = match(ID);
				}
				break;
			case T__4:
				{
				setState(49);
				match(T__4);
				setState(50);
				expr(0);
				setState(51);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(56);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(57);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(59);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(60);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class WriteExprContext extends ParserRuleContext {
		public Token id;
		public TerminalNode ID() { return getToken(CalParser.ID, 0); }
		public WriteExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).enterWriteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).exitWriteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalVisitor ) return ((CalVisitor<? extends T>)visitor).visitWriteExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteExprContext writeExpr() throws RecognitionException {
		WriteExprContext _localctx = new WriteExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_writeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__6);
			setState(67);
			((WriteExprContext)_localctx).id = match(ID);
			setState(68);
			match(T__7);
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

	public static class EndExprContext extends ParserRuleContext {
		public Token id;
		public TerminalNode ID() { return getToken(CalParser.ID, 0); }
		public EndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).enterEndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalListener ) ((CalListener)listener).exitEndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalVisitor ) return ((CalVisitor<? extends T>)visitor).visitEndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndExprContext endExpr() throws RecognitionException {
		EndExprContext _localctx = new EndExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__6);
			setState(71);
			((EndExprContext)_localctx).id = match(ID);
			setState(72);
			match(T__8);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\6\2"+
		"\25\n\2\r\2\16\2\26\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5\60\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5"+
		"C\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\3\b\b\2\4\6\b\n\f\2\4\3\2"+
		"\20\21\3\2\16\17O\2\17\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b\67\3\2\2\2\nD\3"+
		"\2\2\2\fH\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2"+
		"\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\25\5\6\4\2\24\23\3\2\2\2\25\26\3\2"+
		"\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\33\3\2\2\2\30\32\5\n\6\2\31\30\3\2"+
		"\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2"+
		"\2\2\36\37\5\f\7\2\37\3\3\2\2\2 !\7\3\2\2!\"\7\f\2\2\"\'\7\4\2\2#$\7\5"+
		"\2\2$%\7\f\2\2%\'\7\4\2\2& \3\2\2\2&#\3\2\2\2\'\5\3\2\2\2()\7\f\2\2)*"+
		"\7\6\2\2*+\5\b\5\2+,\7\4\2\2,\7\3\2\2\2-/\b\5\1\2.\60\7\17\2\2/.\3\2\2"+
		"\2/\60\3\2\2\2\60\61\3\2\2\2\618\7\r\2\2\628\7\f\2\2\63\64\7\7\2\2\64"+
		"\65\5\b\5\2\65\66\7\b\2\2\668\3\2\2\2\67-\3\2\2\2\67\62\3\2\2\2\67\63"+
		"\3\2\2\28A\3\2\2\29:\f\7\2\2:;\t\2\2\2;@\5\b\5\b<=\f\6\2\2=>\t\3\2\2>"+
		"@\5\b\5\7?9\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2"+
		"CA\3\2\2\2DE\7\t\2\2EF\7\f\2\2FG\7\n\2\2G\13\3\2\2\2HI\7\t\2\2IJ\7\f\2"+
		"\2JK\7\13\2\2K\r\3\2\2\2\n\21\26\33&/\67?A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}