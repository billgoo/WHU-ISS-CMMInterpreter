// Generated from D:/Program Files/JetBrains/Project/cnm2\CMMLEXER.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMLEXERLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, READ=4, WRITE=5, INT=6, DOUBLE=7, TRUE=8, FALSE=9, 
		PLUS=10, MINUS=11, MULTIPLICATION=12, DIVISION=13, MOD=14, ASSIGNMENT=15, 
		LESSTHAN=16, LESS_EQUAL=17, MORETHAN=18, MORE_EQUAL=19, EQUAL=20, UNEQUAL=21, 
		LEFT_LITTLE_BRACE=22, RIGHT_LITTLE_BRACE=23, SEMICOLONE=24, COMMA=25, 
		LEFT_BRACE=26, RIGHT_BRACE=27, LEFT_ARRAY_BRACE=28, RIGHT_ARRAY_BRACE=29, 
		ID=30, WS=31, LINE_COMMENT=32, COMMENT=33, DECIMAL=34, HEX=35, FLOATING=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "WHILE", "READ", "WRITE", "INT", "DOUBLE", "TRUE", "FALSE", 
		"PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "MOD", "ASSIGNMENT", "LESSTHAN", 
		"LESS_EQUAL", "MORETHAN", "MORE_EQUAL", "EQUAL", "UNEQUAL", "LEFT_LITTLE_BRACE", 
		"RIGHT_LITTLE_BRACE", "SEMICOLONE", "COMMA", "LEFT_BRACE", "RIGHT_BRACE", 
		"LEFT_ARRAY_BRACE", "RIGHT_ARRAY_BRACE", "ID", "WS", "LINE_COMMENT", "COMMENT", 
		"LETTER", "DECIMAL", "HEX", "DecDigit", "HexDigit", "FLOATING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'read'", "'write'", "'int'", "'double'", 
		null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'('", "')'", "';'", "','", "'{'", "'}'", "'['", 
		"']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "WHILE", "READ", "WRITE", "INT", "DOUBLE", "TRUE", 
		"FALSE", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "MOD", "ASSIGNMENT", 
		"LESSTHAN", "LESS_EQUAL", "MORETHAN", "MORE_EQUAL", "EQUAL", "UNEQUAL", 
		"LEFT_LITTLE_BRACE", "RIGHT_LITTLE_BRACE", "SEMICOLONE", "COMMA", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_ARRAY_BRACE", "RIGHT_ARRAY_BRACE", "ID", "WS", "LINE_COMMENT", 
		"COMMENT", "DECIMAL", "HEX", "FLOATING"
	};
	//新声明TAG来标识token，为在main中使用，将以下数组设为公有
	public static final String[] _TOKEN_TAGS = {
			null, "reserved word:", "reserved word:", "reserved word:", "reserved word:",
			"reserved word:", "reserved word:", "reserved word:", "reserved word:",
			"reserved word:", "operator:", "operator:", "operator:", "operator:", "operator:",
			"operator:", "operator:", "operator:", "operator:", "operator:", "operator:",
			"operator:", "delimiter:", "delimiter:", "delimiter:", "delimiter:", "delimiter:",
			"delimiter:", "delimiter:", "delimiter:", "ID, name=", "WS", "LINE_COMMENT",
			"COMMENT", "NUM, val=", "NUM, val=", "NUM, val="
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


	public CMMLEXERLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMMLEXER.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u008a\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u00bd\n\37\f\37\16\37\u00c0"+
		"\13\37\3\37\3\37\5\37\u00c4\n\37\5\37\u00c6\n\37\3 \6 \u00c9\n \r \16"+
		" \u00ca\3 \3 \3!\3!\3!\3!\7!\u00d3\n!\f!\16!\u00d6\13!\3!\5!\u00d9\n!"+
		"\3!\3!\5!\u00dd\n!\3\"\3\"\3\"\3\"\7\"\u00e3\n\"\f\"\16\"\u00e6\13\"\3"+
		"\"\3\"\3\"\3#\5#\u00ec\n#\3$\3$\3$\7$\u00f1\n$\f$\16$\u00f4\13$\5$\u00f6"+
		"\n$\3%\3%\3%\6%\u00fb\n%\r%\16%\u00fc\3&\3&\3\'\5\'\u0102\n\'\3(\3(\3"+
		"(\7(\u0107\n(\f(\16(\u010a\13(\3(\6(\u010d\n(\r(\16(\u010e\3(\3(\3(\3"+
		"(\7(\u0115\n(\f(\16(\u0118\13(\5(\u011a\n(\3\u00e4\2)\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G$I%"+
		"K\2M\2O&\3\2\t\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2C\\c|\3\2\63;\4\2Z"+
		"Zzz\3\2\62;\5\2\62;CHch\u012b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5T\3\2\2\2\7Y\3"+
		"\2\2\2\t_\3\2\2\2\13d\3\2\2\2\rj\3\2\2\2\17n\3\2\2\2\21}\3\2\2\2\23\u0089"+
		"\3\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u0091\3"+
		"\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2"+
		"%\u009c\3\2\2\2\'\u009e\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3\2\2\2-\u00a7\3"+
		"\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2"+
		"\2\67\u00b1\3\2\2\29\u00b3\3\2\2\2;\u00b5\3\2\2\2=\u00c5\3\2\2\2?\u00c8"+
		"\3\2\2\2A\u00ce\3\2\2\2C\u00de\3\2\2\2E\u00eb\3\2\2\2G\u00f5\3\2\2\2I"+
		"\u00f7\3\2\2\2K\u00fe\3\2\2\2M\u0101\3\2\2\2O\u0119\3\2\2\2QR\7k\2\2R"+
		"S\7h\2\2S\4\3\2\2\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\6\3\2\2\2YZ\7"+
		"y\2\2Z[\7j\2\2[\\\7k\2\2\\]\7n\2\2]^\7g\2\2^\b\3\2\2\2_`\7t\2\2`a\7g\2"+
		"\2ab\7c\2\2bc\7f\2\2c\n\3\2\2\2de\7y\2\2ef\7t\2\2fg\7k\2\2gh\7v\2\2hi"+
		"\7g\2\2i\f\3\2\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2m\16\3\2\2\2no\7f\2\2op\7"+
		"q\2\2pq\7w\2\2qr\7d\2\2rs\7n\2\2st\7g\2\2t\20\3\2\2\2uv\7v\2\2vw\7t\2"+
		"\2wx\7w\2\2x~\7g\2\2yz\7V\2\2z{\7T\2\2{|\7W\2\2|~\7G\2\2}u\3\2\2\2}y\3"+
		"\2\2\2~\22\3\2\2\2\177\u0080\7h\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n"+
		"\2\2\u0082\u0083\7u\2\2\u0083\u008a\7g\2\2\u0084\u0085\7H\2\2\u0085\u0086"+
		"\7C\2\2\u0086\u0087\7N\2\2\u0087\u0088\7U\2\2\u0088\u008a\7G\2\2\u0089"+
		"\177\3\2\2\2\u0089\u0084\3\2\2\2\u008a\24\3\2\2\2\u008b\u008c\7-\2\2\u008c"+
		"\26\3\2\2\2\u008d\u008e\7/\2\2\u008e\30\3\2\2\2\u008f\u0090\7,\2\2\u0090"+
		"\32\3\2\2\2\u0091\u0092\7\61\2\2\u0092\34\3\2\2\2\u0093\u0094\7\'\2\2"+
		"\u0094\36\3\2\2\2\u0095\u0096\7?\2\2\u0096 \3\2\2\2\u0097\u0098\7>\2\2"+
		"\u0098\"\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b$\3\2\2\2"+
		"\u009c\u009d\7@\2\2\u009d&\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2"+
		"\2\u00a0(\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\u00a3\7?\2\2\u00a3*\3\2\2\2"+
		"\u00a4\u00a5\7#\2\2\u00a5\u00a6\7?\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7*\2"+
		"\2\u00a8.\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7=\2"+
		"\2\u00ac\62\3\2\2\2\u00ad\u00ae\7.\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7"+
		"}\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7\177\2\2\u00b28\3\2\2\2\u00b3\u00b4"+
		"\7]\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7_\2\2\u00b6<\3\2\2\2\u00b7\u00c6\5"+
		"E#\2\u00b8\u00be\5E#\2\u00b9\u00bd\5E#\2\u00ba\u00bd\5K&\2\u00bb\u00bd"+
		"\7a\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\5E#\2\u00c2\u00c4\5K&\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5"+
		"\u00b8\3\2\2\2\u00c6>\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\b \2\2\u00cd@\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf"+
		"\u00d0\7\61\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\n\3\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00dc\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7\17\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\7\f\2\2\u00db"+
		"\u00dd\7\2\2\3\u00dc\u00d8\3\2\2\2\u00dc\u00db\3\2\2\2\u00ddB\3\2\2\2"+
		"\u00de\u00df\7\61\2\2\u00df\u00e0\7,\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3"+
		"\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8"+
		"\7,\2\2\u00e8\u00e9\7\61\2\2\u00e9D\3\2\2\2\u00ea\u00ec\t\4\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ecF\3\2\2\2\u00ed\u00f6\7\62\2\2\u00ee\u00f2\t\5\2\2"+
		"\u00ef\u00f1\5K&\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00ed\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7\62\2\2"+
		"\u00f8\u00fa\t\6\2\2\u00f9\u00fb\5M\'\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdJ\3\2\2\2\u00fe"+
		"\u00ff\t\7\2\2\u00ffL\3\2\2\2\u0100\u0102\t\b\2\2\u0101\u0100\3\2\2\2"+
		"\u0102N\3\2\2\2\u0103\u0104\5G$\2\u0104\u0108\7\60\2\2\u0105\u0107\5K"+
		"&\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u011a\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\4\62"+
		";\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u011a\7\60\2\2\u0111\u0112\5"+
		"I%\2\u0112\u0116\7\60\2\2\u0113\u0115\5M\'\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u0103\3\2\2\2\u0119\u010c\3\2\2\2\u0119"+
		"\u0111\3\2\2\2\u011aP\3\2\2\2\27\2}\u0089\u00bc\u00be\u00c3\u00c5\u00ca"+
		"\u00d4\u00d8\u00dc\u00e4\u00eb\u00f2\u00f5\u00fc\u0101\u0108\u010e\u0116"+
		"\u0119\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}