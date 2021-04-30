// Generated from Operaciones.g4 by ANTLR 4.8
package oivan.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OperacionesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, GREATER=2, LESS=3, EQ_G=4, EQ_L=5, NEQ=6, IF=7, ELSE=8, LET=9, FUNC=10, 
		PRINT=11, LLAVE_A=12, LLAVE_C=13, ID=14, IGUAL=15, MAS=16, MENOS=17, POR=18, 
		DIV=19, INT=20, PAR_A=21, PAR_C=22, SEMI=23, STRING=24, ESPACIOS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQ", "GREATER", "LESS", "EQ_G", "EQ_L", "NEQ", "IF", "ELSE", "LET", 
			"FUNC", "PRINT", "LLAVE_A", "LLAVE_C", "ID", "IGUAL", "MAS", "MENOS", 
			"POR", "DIV", "INT", "PAR_A", "PAR_C", "SEMI", "STRING", "ESC", "ESPACIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'if'", "'else'", 
			"'let'", "'function'", "'print'", "'{'", "'}'", null, "'='", "'+'", "'-'", 
			"'*'", "'/'", null, "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "GREATER", "LESS", "EQ_G", "EQ_L", "NEQ", "IF", "ELSE", "LET", 
			"FUNC", "PRINT", "LLAVE_A", "LLAVE_C", "ID", "IGUAL", "MAS", "MENOS", 
			"POR", "DIV", "INT", "PAR_A", "PAR_C", "SEMI", "STRING", "ESPACIOS"
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


	public OperacionesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Operaciones.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\7\17i\n\17\f\17\16\17l\13\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25y\n\25\r\25\16\25z\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\7\31\u0086\n\31\f\31\16\31\u0089"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\33\6\33\u0091\n\33\r\33\16\33\u0092"+
		"\3\33\3\33\3\u0087\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\2\65\33\3\2\7\3\2c|\5\2\62;C\\c|\3\2\62;\b\2$$^^ddppttvv\4\2\13\f\"\""+
		"\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2\2\7<\3\2\2"+
		"\2\t>\3\2\2\2\13A\3\2\2\2\rD\3\2\2\2\17G\3\2\2\2\21J\3\2\2\2\23O\3\2\2"+
		"\2\25S\3\2\2\2\27\\\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37m\3"+
		"\2\2\2!o\3\2\2\2#q\3\2\2\2%s\3\2\2\2\'u\3\2\2\2)x\3\2\2\2+|\3\2\2\2-~"+
		"\3\2\2\2/\u0080\3\2\2\2\61\u0082\3\2\2\2\63\u008c\3\2\2\2\65\u0090\3\2"+
		"\2\2\678\7?\2\289\7?\2\29\4\3\2\2\2:;\7@\2\2;\6\3\2\2\2<=\7>\2\2=\b\3"+
		"\2\2\2>?\7@\2\2?@\7?\2\2@\n\3\2\2\2AB\7>\2\2BC\7?\2\2C\f\3\2\2\2DE\7#"+
		"\2\2EF\7?\2\2F\16\3\2\2\2GH\7k\2\2HI\7h\2\2I\20\3\2\2\2JK\7g\2\2KL\7n"+
		"\2\2LM\7u\2\2MN\7g\2\2N\22\3\2\2\2OP\7n\2\2PQ\7g\2\2QR\7v\2\2R\24\3\2"+
		"\2\2ST\7h\2\2TU\7w\2\2UV\7p\2\2VW\7e\2\2WX\7v\2\2XY\7k\2\2YZ\7q\2\2Z["+
		"\7p\2\2[\26\3\2\2\2\\]\7r\2\2]^\7t\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2a\30"+
		"\3\2\2\2bc\7}\2\2c\32\3\2\2\2de\7\177\2\2e\34\3\2\2\2fj\t\2\2\2gi\t\3"+
		"\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\36\3\2\2\2lj\3\2\2\2mn\7"+
		"?\2\2n \3\2\2\2op\7-\2\2p\"\3\2\2\2qr\7/\2\2r$\3\2\2\2st\7,\2\2t&\3\2"+
		"\2\2uv\7\61\2\2v(\3\2\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{*\3\2\2\2|}\7*\2\2},\3\2\2\2~\177\7+\2\2\177.\3\2\2\2\u0080\u0081"+
		"\7=\2\2\u0081\60\3\2\2\2\u0082\u0087\7$\2\2\u0083\u0086\5\63\32\2\u0084"+
		"\u0086\13\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7$\2\2\u008b\62\3\2\2\2\u008c\u008d\7^\2\2"+
		"\u008d\u008e\t\5\2\2\u008e\64\3\2\2\2\u008f\u0091\t\6\2\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\b\33\2\2\u0095\66\3\2\2\2\b\2jz\u0085\u0087"+
		"\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}