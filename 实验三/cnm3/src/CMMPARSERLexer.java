// Generated from D:/Program Files/JetBrains/Project/JSQ/cnm3\CMMPARSER.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMPARSERLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "WHILE", "READ", "WRITE", "INT", "DOUBLE", "TRUE", "FALSE", 
		"BREAK", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "MOD", "ASSIGNMENT", 
		"LESSTHAN", "LESS_EQUAL", "MORETHAN", "MORE_EQUAL", "EQUAL", "UNEQUAL", 
		"LEFT_LITTLE_BRACE", "RIGHT_LITTLE_BRACE", "SEMICOLONE", "COMMA", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_ARRAY_BRACE", "RIGHT_ARRAY_BRACE", "ID", "WS", "LINE_COMMENT", 
		"COMMENT", "LETTER", "INTCONSTANT", "HEXCONSTANT", "DecDigit", "HexDigit", 
		"DOUBLECONSTANT", "HEXFLOATCONSTANT"
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


	public CMMPARSERLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMMPARSER.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u012c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00b3"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3 \3 \7 \u00ca\n \f \16 \u00cd\13 \3 \3 \5 \u00d1"+
		"\n \5 \u00d3\n \3!\6!\u00d6\n!\r!\16!\u00d7\3!\3!\3\"\3\"\3\"\3\"\7\""+
		"\u00e0\n\"\f\"\16\"\u00e3\13\"\3\"\5\"\u00e6\n\"\3\"\3\"\5\"\u00ea\n\""+
		"\3\"\3\"\3#\3#\3#\3#\7#\u00f2\n#\f#\16#\u00f5\13#\3#\3#\3#\3#\3#\3$\5"+
		"$\u00fd\n$\3%\3%\3%\7%\u0102\n%\f%\16%\u0105\13%\5%\u0107\n%\3&\3&\3&"+
		"\6&\u010c\n&\r&\16&\u010d\3\'\3\'\3(\5(\u0113\n(\3)\3)\3)\7)\u0118\n)"+
		"\f)\16)\u011b\13)\3)\6)\u011e\n)\r)\16)\u011f\3)\5)\u0123\n)\3*\3*\3*"+
		"\7*\u0128\n*\f*\16*\u012b\13*\3\u00f3\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I%K&M\2O\2Q\'S("+
		"\3\2\t\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2C\\c|\3\2\63;\4\2ZZzz\3\2\62"+
		";\5\2\62;CHch\u013c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5X"+
		"\3\2\2\2\7]\3\2\2\2\tc\3\2\2\2\13h\3\2\2\2\rn\3\2\2\2\17r\3\2\2\2\21\u0081"+
		"\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3"+
		"\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2"+
		"\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a6\3\2\2\2)\u00a8\3\2\2\2+\u00ab"+
		"\3\2\2\2-\u00b2\3\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2"+
		"\2\65\u00ba\3\2\2\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c2"+
		"\3\2\2\2?\u00d2\3\2\2\2A\u00d5\3\2\2\2C\u00db\3\2\2\2E\u00ed\3\2\2\2G"+
		"\u00fc\3\2\2\2I\u0106\3\2\2\2K\u0108\3\2\2\2M\u010f\3\2\2\2O\u0112\3\2"+
		"\2\2Q\u0122\3\2\2\2S\u0124\3\2\2\2UV\7k\2\2VW\7h\2\2W\4\3\2\2\2XY\7g\2"+
		"\2YZ\7n\2\2Z[\7u\2\2[\\\7g\2\2\\\6\3\2\2\2]^\7y\2\2^_\7j\2\2_`\7k\2\2"+
		"`a\7n\2\2ab\7g\2\2b\b\3\2\2\2cd\7t\2\2de\7g\2\2ef\7c\2\2fg\7f\2\2g\n\3"+
		"\2\2\2hi\7y\2\2ij\7t\2\2jk\7k\2\2kl\7v\2\2lm\7g\2\2m\f\3\2\2\2no\7k\2"+
		"\2op\7p\2\2pq\7v\2\2q\16\3\2\2\2rs\7f\2\2st\7q\2\2tu\7w\2\2uv\7d\2\2v"+
		"w\7n\2\2wx\7g\2\2x\20\3\2\2\2yz\7v\2\2z{\7t\2\2{|\7w\2\2|\u0082\7g\2\2"+
		"}~\7V\2\2~\177\7T\2\2\177\u0080\7W\2\2\u0080\u0082\7G\2\2\u0081y\3\2\2"+
		"\2\u0081}\3\2\2\2\u0082\22\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7c\2"+
		"\2\u0085\u0086\7n\2\2\u0086\u0087\7u\2\2\u0087\u008e\7g\2\2\u0088\u0089"+
		"\7H\2\2\u0089\u008a\7C\2\2\u008a\u008b\7N\2\2\u008b\u008c\7U\2\2\u008c"+
		"\u008e\7G\2\2\u008d\u0083\3\2\2\2\u008d\u0088\3\2\2\2\u008e\24\3\2\2\2"+
		"\u008f\u0090\7d\2\2\u0090\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7c\2\2\u0093\u0094\7m\2\2\u0094\26\3\2\2\2\u0095\u0096\7-\2\2\u0096\30"+
		"\3\2\2\2\u0097\u0098\7/\2\2\u0098\32\3\2\2\2\u0099\u009a\7,\2\2\u009a"+
		"\34\3\2\2\2\u009b\u009c\7\61\2\2\u009c\36\3\2\2\2\u009d\u009e\7\'\2\2"+
		"\u009e \3\2\2\2\u009f\u00a0\7?\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7>\2\2"+
		"\u00a2$\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7?\2\2\u00a5&\3\2\2\2\u00a6"+
		"\u00a7\7@\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa\7?\2\2\u00aa"+
		"*\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad\7?\2\2\u00ad,\3\2\2\2\u00ae\u00af"+
		"\7#\2\2\u00af\u00b3\7?\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b3\7@\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5"+
		"\60\3\2\2\2\u00b6\u00b7\7+\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7=\2\2\u00b9"+
		"\64\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\7}\2\2\u00bd"+
		"8\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7]\2\2\u00c1"+
		"<\3\2\2\2\u00c2\u00c3\7_\2\2\u00c3>\3\2\2\2\u00c4\u00d3\5G$\2\u00c5\u00cb"+
		"\5G$\2\u00c6\u00ca\5G$\2\u00c7\u00ca\5M\'\2\u00c8\u00ca\7a\2\2\u00c9\u00c6"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00d1\5G$\2\u00cf\u00d1\5M\'\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c4\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d3"+
		"@\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\b!\2\2\u00daB\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd\7\61\2\2\u00dd"+
		"\u00e1\3\2\2\2\u00de\u00e0\n\3\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e9\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e6\7\17\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\7\f\2\2\u00e8\u00ea\7\2\2\3\u00e9"+
		"\u00e5\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\""+
		"\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f3"+
		"\3\2\2\2\u00f0\u00f2\13\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\b#\2\2\u00faF\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"H\3\2\2\2\u00fe\u0107\7\62\2\2\u00ff\u0103\t\5\2\2\u0100\u0102\5M\'\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u00fe\3\2\2\2\u0106"+
		"\u00ff\3\2\2\2\u0107J\3\2\2\2\u0108\u0109\7\62\2\2\u0109\u010b\t\6\2\2"+
		"\u010a\u010c\5O(\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010eL\3\2\2\2\u010f\u0110\t\7\2\2\u0110"+
		"N\3\2\2\2\u0111\u0113\t\b\2\2\u0112\u0111\3\2\2\2\u0113P\3\2\2\2\u0114"+
		"\u0115\5I%\2\u0115\u0119\7\60\2\2\u0116\u0118\5M\'\2\u0117\u0116\3\2\2"+
		"\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0123"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\4\62;\2\u011d\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\7\60\2\2\u0122\u0114\3\2\2\2\u0122\u011d\3\2\2\2\u0123"+
		"R\3\2\2\2\u0124\u0125\5K&\2\u0125\u0129\7\60\2\2\u0126\u0128\5O(\2\u0127"+
		"\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012aT\3\2\2\2\u012b\u0129\3\2\2\2\30\2\u0081\u008d\u00b2\u00c9\u00cb"+
		"\u00d0\u00d2\u00d7\u00e1\u00e5\u00e9\u00f3\u00fc\u0103\u0106\u010d\u0112"+
		"\u0119\u011f\u0122\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}