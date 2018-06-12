package cmm;// Generated from D:/Program Files/JetBrains/Project/JSQ/CMMInterpreterV1.0\CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "WHILE", "READ", "WRITE", "BOOL", "INT", "DOUBLE", "VOID", 
		"TRUE", "FALSE", "BREAK", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", 
		"MOD", "ASSIGNMENT", "PLUS_ASSIG", "MINUS_ASSIG", "MULTI_ASSIG", "DIV_ASSIG", 
		"LESSTHAN", "LESS_EQUAL", "MORETHAN", "MORE_EQUAL", "EQUAL", "UNEQUAL", 
		"LOGIC_OR", "LOGIC_AND", "LEFT_LITTLE_BRACE", "RIGHT_LITTLE_BRACE", "SEMICOLONE", 
		"COMMA", "COLON", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_ARRAY_BRACE", "RIGHT_ARRAY_BRACE", 
		"ID", "LETTER", "DecDigit", "HexDigit", "INT_CONSTANT", "HEX_CONSTANT", 
		"FLOAT_LITERAL", "EscapeSequence", "EFFECTOR", "STRING_LITERAL", "WS", 
		"LINE_COMMENT", "COMMENT"
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
	// 词法分析用
	public static final String[] _TOKEN_TAGS = {
			null, "reserved word:", "reserved word:", "reserved word:", "IO function:", "IO function:",
			"reserved word:", "reserved word:", "reserved word:", "reserved word:", "reserved word:",
			"reserved word:", "reserved word:", "operator:", "operator:", "operator:", "operator:",
			"operator:", "operator:", "operator:", "operator:", "operator:", "operator:",
			"operator:", "operator:", "operator:", "operator:", "operator:", "operator:",
			"operator:", "operator:", "delimiter:", "delimiter:", "delimiter:",
			"delimiter:", "delimiter:", "delimiter:", "delimiter:", "delimiter:", "delimiter:",
			"ID, name=", "NUM, val=", "NUM, val=", "NUM, val=", "effector:", "STRING, val=",
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


	public CMMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0173\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00ae\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00df\n\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\7)\u00fe\n)\f)\16)\u0101\13)\3)\3)\5)\u0105"+
		"\n)\5)\u0107\n)\3*\5*\u010a\n*\3+\3+\3,\5,\u010f\n,\3-\3-\3-\7-\u0114"+
		"\n-\f-\16-\u0117\13-\5-\u0119\n-\3.\3.\3.\6.\u011e\n.\r.\16.\u011f\3/"+
		"\3/\3/\7/\u0125\n/\f/\16/\u0128\13/\3/\3/\6/\u012c\n/\r/\16/\u012d\5/"+
		"\u0130\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u0141\n\61\3\62\3\62\3\62\7\62\u0146\n\62\f\62\16"+
		"\62\u0149\13\62\3\62\3\62\3\63\6\63\u014e\n\63\r\63\16\63\u014f\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\7\64\u0158\n\64\f\64\16\64\u015b\13\64\3\64\5"+
		"\64\u015e\n\64\3\64\3\64\5\64\u0162\n\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\7\65\u016a\n\65\f\65\16\65\u016d\13\65\3\65\3\65\3\65\3\65\3\65\3\u016b"+
		"\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y+[,]-_\2a.c/e\60g\61i\62\3\2\13"+
		"\4\2C\\c|\3\2\62;\5\2\62;CHch\3\2\63;\4\2ZZzz\7\2$$^^ppttvv\4\2$$^^\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\u0185\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5n\3\2\2\2\7s\3"+
		"\2\2\2\ty\3\2\2\2\13~\3\2\2\2\r\u0084\3\2\2\2\17\u0089\3\2\2\2\21\u008d"+
		"\3\2\2\2\23\u0094\3\2\2\2\25\u00a1\3\2\2\2\27\u00ad\3\2\2\2\31\u00af\3"+
		"\2\2\2\33\u00b5\3\2\2\2\35\u00b7\3\2\2\2\37\u00b9\3\2\2\2!\u00bb\3\2\2"+
		"\2#\u00bd\3\2\2\2%\u00bf\3\2\2\2\'\u00c1\3\2\2\2)\u00c4\3\2\2\2+\u00c7"+
		"\3\2\2\2-\u00ca\3\2\2\2/\u00cd\3\2\2\2\61\u00cf\3\2\2\2\63\u00d2\3\2\2"+
		"\2\65\u00d4\3\2\2\2\67\u00d7\3\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e3"+
		"\3\2\2\2?\u00e6\3\2\2\2A\u00e8\3\2\2\2C\u00ea\3\2\2\2E\u00ec\3\2\2\2G"+
		"\u00ee\3\2\2\2I\u00f0\3\2\2\2K\u00f2\3\2\2\2M\u00f4\3\2\2\2O\u00f6\3\2"+
		"\2\2Q\u0106\3\2\2\2S\u0109\3\2\2\2U\u010b\3\2\2\2W\u010e\3\2\2\2Y\u0118"+
		"\3\2\2\2[\u011a\3\2\2\2]\u012f\3\2\2\2_\u0131\3\2\2\2a\u0140\3\2\2\2c"+
		"\u0142\3\2\2\2e\u014d\3\2\2\2g\u0153\3\2\2\2i\u0165\3\2\2\2kl\7k\2\2l"+
		"m\7h\2\2m\4\3\2\2\2no\7g\2\2op\7n\2\2pq\7u\2\2qr\7g\2\2r\6\3\2\2\2st\7"+
		"y\2\2tu\7j\2\2uv\7k\2\2vw\7n\2\2wx\7g\2\2x\b\3\2\2\2yz\7t\2\2z{\7g\2\2"+
		"{|\7c\2\2|}\7f\2\2}\n\3\2\2\2~\177\7y\2\2\177\u0080\7t\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7v\2\2\u0082\u0083\7g\2\2\u0083\f\3\2\2\2\u0084\u0085"+
		"\7d\2\2\u0085\u0086\7q\2\2\u0086\u0087\7q\2\2\u0087\u0088\7n\2\2\u0088"+
		"\16\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c"+
		"\20\3\2\2\2\u008d\u008e\7f\2\2\u008e\u008f\7q\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7d\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\22\3\2\2\2\u0094"+
		"\u0095\7x\2\2\u0095\u0096\7q\2\2\u0096\u0097\7k\2\2\u0097\u0098\7f\2\2"+
		"\u0098\24\3\2\2\2\u0099\u009a\7v\2\2\u009a\u009b\7t\2\2\u009b\u009c\7"+
		"w\2\2\u009c\u00a2\7g\2\2\u009d\u009e\7V\2\2\u009e\u009f\7T\2\2\u009f\u00a0"+
		"\7W\2\2\u00a0\u00a2\7G\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7\u00ae\7g\2\2\u00a8\u00a9\7H\2\2\u00a9\u00aa\7C\2\2"+
		"\u00aa\u00ab\7N\2\2\u00ab\u00ac\7U\2\2\u00ac\u00ae\7G\2\2\u00ad\u00a3"+
		"\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7d\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7m\2\2"+
		"\u00b4\32\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7/\2"+
		"\2\u00b8\36\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba \3\2\2\2\u00bb\u00bc\7\61"+
		"\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7\'\2\2\u00be$\3\2\2\2\u00bf\u00c0\7"+
		"?\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c3\7?\2\2\u00c3(\3\2"+
		"\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6\7?\2\2\u00c6*\3\2\2\2\u00c7\u00c8"+
		"\7,\2\2\u00c8\u00c9\7?\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc"+
		"\7?\2\2\u00cc.\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\60\3\2\2\2\u00cf\u00d0"+
		"\7>\2\2\u00d0\u00d1\7?\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3\64"+
		"\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5\u00d6\7?\2\2\u00d6\66\3\2\2\2\u00d7"+
		"\u00d8\7?\2\2\u00d8\u00d9\7?\2\2\u00d98\3\2\2\2\u00da\u00db\7#\2\2\u00db"+
		"\u00df\7?\2\2\u00dc\u00dd\7>\2\2\u00dd\u00df\7@\2\2\u00de\u00da\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df:\3\2\2\2\u00e0\u00e1\7~\2\2\u00e1\u00e2\7"+
		"~\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7(\2\2\u00e4\u00e5\7(\2\2\u00e5>\3\2"+
		"\2\2\u00e6\u00e7\7*\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9B\3\2\2"+
		"\2\u00ea\u00eb\7=\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7.\2\2\u00edF\3\2\2\2"+
		"\u00ee\u00ef\7<\2\2\u00efH\3\2\2\2\u00f0\u00f1\7}\2\2\u00f1J\3\2\2\2\u00f2"+
		"\u00f3\7\177\2\2\u00f3L\3\2\2\2\u00f4\u00f5\7]\2\2\u00f5N\3\2\2\2\u00f6"+
		"\u00f7\7_\2\2\u00f7P\3\2\2\2\u00f8\u0107\5S*\2\u00f9\u00ff\5S*\2\u00fa"+
		"\u00fe\5S*\2\u00fb\u00fe\5U+\2\u00fc\u00fe\7a\2\2\u00fd\u00fa\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0104\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0105\5S*\2\u0103\u0105\5U+\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2"+
		"\u0105\u0107\3\2\2\2\u0106\u00f8\3\2\2\2\u0106\u00f9\3\2\2\2\u0107R\3"+
		"\2\2\2\u0108\u010a\t\2\2\2\u0109\u0108\3\2\2\2\u010aT\3\2\2\2\u010b\u010c"+
		"\t\3\2\2\u010cV\3\2\2\2\u010d\u010f\t\4\2\2\u010e\u010d\3\2\2\2\u010f"+
		"X\3\2\2\2\u0110\u0119\7\62\2\2\u0111\u0115\t\5\2\2\u0112\u0114\5U+\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0110\3\2\2\2\u0118"+
		"\u0111\3\2\2\2\u0119Z\3\2\2\2\u011a\u011b\7\62\2\2\u011b\u011d\t\6\2\2"+
		"\u011c\u011e\5W,\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\\\3\2\2\2\u0121\u0122\5Y-\2\u0122\u0126"+
		"\7\60\2\2\u0123\u0125\t\3\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0130\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012b\7\60\2\2\u012a\u012c\t\3\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u0121\3\2\2\2\u012f\u0129\3\2\2\2\u0130^\3\2\2\2\u0131"+
		"\u0132\7^\2\2\u0132\u0133\t\7\2\2\u0133`\3\2\2\2\u0134\u0135\7)\2\2\u0135"+
		"\u0136\7\'\2\2\u0136\u0137\7f\2\2\u0137\u0141\7)\2\2\u0138\u0139\7)\2"+
		"\2\u0139\u013a\7\'\2\2\u013a\u013b\7h\2\2\u013b\u0141\7)\2\2\u013c\u013d"+
		"\7)\2\2\u013d\u013e\7\'\2\2\u013e\u013f\7j\2\2\u013f\u0141\7)\2\2\u0140"+
		"\u0134\3\2\2\2\u0140\u0138\3\2\2\2\u0140\u013c\3\2\2\2\u0141b\3\2\2\2"+
		"\u0142\u0147\7$\2\2\u0143\u0146\5_\60\2\u0144\u0146\n\b\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7$"+
		"\2\2\u014bd\3\2\2\2\u014c\u014e\t\t\2\2\u014d\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\b\63\2\2\u0152f\3\2\2\2\u0153\u0154\7\61\2\2\u0154\u0155\7\61\2"+
		"\2\u0155\u0159\3\2\2\2\u0156\u0158\n\n\2\2\u0157\u0156\3\2\2\2\u0158\u015b"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0161\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015e\7\17\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\7\f\2\2\u0160\u0162\7\2\2\3\u0161"+
		"\u015d\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b\64"+
		"\2\2\u0164h\3\2\2\2\u0165\u0166\7\61\2\2\u0166\u0167\7,\2\2\u0167\u016b"+
		"\3\2\2\2\u0168\u016a\13\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016e\u016f\7,\2\2\u016f\u0170\7\61\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\b\65\2\2\u0172j\3\2\2\2\32\2\u00a1\u00ad\u00de\u00fd\u00ff\u0104"+
		"\u0106\u0109\u010e\u0115\u0118\u011f\u0126\u012d\u012f\u0140\u0145\u0147"+
		"\u014f\u0159\u015d\u0161\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}