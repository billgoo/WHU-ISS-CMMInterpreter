// Generated from D:/Program Files/JetBrains/Project/cnm\Cal.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUMBER=11, ADD=12, SUB=13, MUL=14, DIV=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"ID", "NUMBER", "ADD", "SUB", "MUL", "DIV", "WS"
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


	public CalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\7\13E\n\13\f\13"+
		"\16\13H\13\13\3\f\6\fK\n\f\r\f\16\fL\3\f\3\f\6\fQ\n\f\r\f\16\fR\5\fU\n"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21`\n\21\r\21\16\21a\3"+
		"\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\3#\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2"+
		"\2\2\17\65\3\2\2\2\21<\3\2\2\2\23?\3\2\2\2\25B\3\2\2\2\27J\3\2\2\2\31"+
		"V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37\\\3\2\2\2!_\3\2\2\2#$\7h\2\2$%\7"+
		"n\2\2%&\7q\2\2&\'\7c\2\2\'(\7v\2\2(\4\3\2\2\2)*\7=\2\2*\6\3\2\2\2+,\7"+
		"k\2\2,-\7p\2\2-.\7v\2\2.\b\3\2\2\2/\60\7?\2\2\60\n\3\2\2\2\61\62\7*\2"+
		"\2\62\f\3\2\2\2\63\64\7+\2\2\64\16\3\2\2\2\65\66\7y\2\2\66\67\7t\2\2\67"+
		"8\7k\2\289\7v\2\29:\7g\2\2:;\7*\2\2;\20\3\2\2\2<=\7+\2\2=>\7=\2\2>\22"+
		"\3\2\2\2?@\7+\2\2@A\7\60\2\2A\24\3\2\2\2BF\t\2\2\2CE\t\3\2\2DC\3\2\2\2"+
		"EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\26\3\2\2\2HF\3\2\2\2IK\t\4\2\2JI\3\2\2"+
		"\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MT\3\2\2\2NP\7\60\2\2OQ\t\4\2\2PO\3\2"+
		"\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TN\3\2\2\2TU\3\2\2\2U\30\3"+
		"\2\2\2VW\7-\2\2W\32\3\2\2\2XY\7/\2\2Y\34\3\2\2\2Z[\7,\2\2[\36\3\2\2\2"+
		"\\]\7\61\2\2] \3\2\2\2^`\t\5\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2bc\3\2\2\2cd\b\21\2\2d\"\3\2\2\2\t\2DFLRTa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}