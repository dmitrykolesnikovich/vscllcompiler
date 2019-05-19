// Generated from /Users/mateusz/Projects/vscllcompiler/src/main/resources/grammar/VSCLL.g4 by ANTLR 4.7.2
package pl.mateuszkalinowski.vscllcompiler.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VSCLLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, TOINT=14, TODOUBLE=15, STRING=16, 
		ID=17, INT=18, DOUBLE=19, NEWLINE=20, WS=21, SC=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "TOINT", "TODOUBLE", "STRING", "ID", 
			"INT", "DOUBLE", "NEWLINE", "WS", "SC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'print'", "'('", "')'", "'scani'", 
			"'scand'", "'='", "'int'", "'double'", "'char*'", "'(int)'", "'(double)'", 
			null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TOINT", "TODOUBLE", "STRING", "ID", "INT", "DOUBLE", "NEWLINE", 
			"WS", "SC"
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


	public VSCLLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VSCLL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21"+
		"r\n\21\f\21\16\21u\13\21\3\21\3\21\3\22\3\22\7\22{\n\22\f\22\16\22~\13"+
		"\22\3\23\6\23\u0081\n\23\r\23\16\23\u0082\3\23\3\23\3\23\6\23\u0088\n"+
		"\23\r\23\16\23\u0089\3\23\5\23\u008d\n\23\3\24\6\24\u0090\n\24\r\24\16"+
		"\24\u0091\3\24\3\24\7\24\u0096\n\24\f\24\16\24\u0099\13\24\3\24\3\24\3"+
		"\24\6\24\u009e\n\24\r\24\16\24\u009f\3\24\3\24\7\24\u00a4\n\24\f\24\16"+
		"\24\u00a7\13\24\3\24\5\24\u00aa\n\24\3\25\5\25\u00ad\n\25\3\25\3\25\3"+
		"\26\6\26\u00b2\n\26\r\26\16\26\u00b3\3\26\3\26\3\27\3\27\2\2\30\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30\3\2\6\4\2$$^^\4\2C\\c|\5\2\62;C\\c|\4\2"+
		"\13\13\"\"\2\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2"+
		"\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23G\3\2\2\2\25M\3\2\2\2\27O\3\2\2"+
		"\2\31S\3\2\2\2\33Z\3\2\2\2\35`\3\2\2\2\37f\3\2\2\2!o\3\2\2\2#x\3\2\2\2"+
		"%\u008c\3\2\2\2\'\u00a9\3\2\2\2)\u00ac\3\2\2\2+\u00b1\3\2\2\2-\u00b7\3"+
		"\2\2\2/\60\7,\2\2\60\4\3\2\2\2\61\62\7\61\2\2\62\6\3\2\2\2\63\64\7-\2"+
		"\2\64\b\3\2\2\2\65\66\7/\2\2\66\n\3\2\2\2\678\7r\2\289\7t\2\29:\7k\2\2"+
		":;\7p\2\2;<\7v\2\2<\f\3\2\2\2=>\7*\2\2>\16\3\2\2\2?@\7+\2\2@\20\3\2\2"+
		"\2AB\7u\2\2BC\7e\2\2CD\7c\2\2DE\7p\2\2EF\7k\2\2F\22\3\2\2\2GH\7u\2\2H"+
		"I\7e\2\2IJ\7c\2\2JK\7p\2\2KL\7f\2\2L\24\3\2\2\2MN\7?\2\2N\26\3\2\2\2O"+
		"P\7k\2\2PQ\7p\2\2QR\7v\2\2R\30\3\2\2\2ST\7f\2\2TU\7q\2\2UV\7w\2\2VW\7"+
		"d\2\2WX\7n\2\2XY\7g\2\2Y\32\3\2\2\2Z[\7e\2\2[\\\7j\2\2\\]\7c\2\2]^\7t"+
		"\2\2^_\7,\2\2_\34\3\2\2\2`a\7*\2\2ab\7k\2\2bc\7p\2\2cd\7v\2\2de\7+\2\2"+
		"e\36\3\2\2\2fg\7*\2\2gh\7f\2\2hi\7q\2\2ij\7w\2\2jk\7d\2\2kl\7n\2\2lm\7"+
		"g\2\2mn\7+\2\2n \3\2\2\2os\7$\2\2pr\n\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7$\2\2w\"\3\2\2\2x|\t\3\2\2y{\t\4"+
		"\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}$\3\2\2\2~|\3\2\2\2\177\u0081"+
		"\4\62;\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u008d\3\2\2\2\u0084\u0085\7*\2\2\u0085\u0087\7/\2"+
		"\2\u0086\u0088\4\62;\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7+\2\2\u008c"+
		"\u0080\3\2\2\2\u008c\u0084\3\2\2\2\u008d&\3\2\2\2\u008e\u0090\4\62;\2"+
		"\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\7\60\2\2\u0094\u0096\4\62;\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u00aa\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7*\2\2\u009b"+
		"\u009d\7/\2\2\u009c\u009e\4\62;\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a5\7\60\2\2\u00a2\u00a4\4\62;\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00aa\7+\2\2\u00a9\u008f\3\2\2\2\u00a9\u009a\3\2"+
		"\2\2\u00aa(\3\2\2\2\u00ab\u00ad\7\17\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\f\2\2\u00af*\3\2\2\2\u00b0"+
		"\u00b2\t\5\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\26\2\2\u00b6"+
		",\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8.\3\2\2\2\17\2s|\u0082\u0089\u008c\u0091"+
		"\u0097\u009f\u00a5\u00a9\u00ac\u00b3\3\3\26\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}