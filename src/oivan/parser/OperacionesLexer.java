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
		LET=1, FUNC=2, PRINT=3, LLAVE_A=4, LLAVE_C=5, ID=6, IGUAL=7, MAS=8, MENOS=9, 
		POR=10, DIV=11, INT=12, PAR_A=13, PAR_C=14, SEMI=15, STRING=16, ESPACIOS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "FUNC", "PRINT", "LLAVE_A", "LLAVE_C", "ID", "IGUAL", "MAS", "MENOS", 
			"POR", "DIV", "INT", "PAR_A", "PAR_C", "SEMI", "STRING", "ESC", "ESPACIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'function'", "'print'", "'{'", "'}'", null, "'='", "'+'", 
			"'-'", "'*'", "'/'", null, "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "FUNC", "PRINT", "LLAVE_A", "LLAVE_C", "ID", "IGUAL", "MAS", 
			"MENOS", "POR", "DIV", "INT", "PAR_A", "PAR_C", "SEMI", "STRING", "ESPACIOS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\rQ\n\r\r\r\16\rR\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21^\n\21\f\21\16\21a\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\6\23i\n\23\r\23\16\23j\3\23\3\23\3_\2\24\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\2%\23\3\2\7\3\2c|\5\2\62;C\\c|\3\2\62;\b\2$$^^ddppttvv\4\2\13\f"+
		"\"\"\2q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2%\3\2\2\2\3\'\3\2\2\2\5+\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2"+
		"\r>\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2"+
		"\2\31P\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2!Z\3\2\2\2#d\3\2\2\2"+
		"%h\3\2\2\2\'(\7n\2\2()\7g\2\2)*\7v\2\2*\4\3\2\2\2+,\7h\2\2,-\7w\2\2-."+
		"\7p\2\2./\7e\2\2/\60\7v\2\2\60\61\7k\2\2\61\62\7q\2\2\62\63\7p\2\2\63"+
		"\6\3\2\2\2\64\65\7r\2\2\65\66\7t\2\2\66\67\7k\2\2\678\7p\2\289\7v\2\2"+
		"9\b\3\2\2\2:;\7}\2\2;\n\3\2\2\2<=\7\177\2\2=\f\3\2\2\2>B\t\2\2\2?A\t\3"+
		"\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\16\3\2\2\2DB\3\2\2\2EF\7"+
		"?\2\2F\20\3\2\2\2GH\7-\2\2H\22\3\2\2\2IJ\7/\2\2J\24\3\2\2\2KL\7,\2\2L"+
		"\26\3\2\2\2MN\7\61\2\2N\30\3\2\2\2OQ\t\4\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2S\32\3\2\2\2TU\7*\2\2U\34\3\2\2\2VW\7+\2\2W\36\3\2\2\2X"+
		"Y\7=\2\2Y \3\2\2\2Z_\7$\2\2[^\5#\22\2\\^\13\2\2\2][\3\2\2\2]\\\3\2\2\2"+
		"^a\3\2\2\2_`\3\2\2\2_]\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7$\2\2c\"\3\2\2\2"+
		"de\7^\2\2ef\t\5\2\2f$\3\2\2\2gi\t\6\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2kl\3\2\2\2lm\b\23\2\2m&\3\2\2\2\b\2BR]_j\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}