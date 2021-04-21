// Generated from Operaciones.g4 by ANTLR 4.8
package oivan.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OperacionesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, FUNC=2, PRINT=3, LLAVE_A=4, LLAVE_C=5, ID=6, IGUAL=7, MAS=8, MENOS=9, 
		POR=10, DIV=11, INT=12, PAR_A=13, PAR_C=14, SEMI=15, STRING=16, ESPACIOS=17;
	public static final int
		RULE_cuerpo = 0, RULE_inicio = 1, RULE_strings = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"cuerpo", "inicio", "strings", "expr"
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

	@Override
	public String getGrammarFileName() { return "Operaciones.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OperacionesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CuerpoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(OperacionesParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode LLAVE_A() { return getToken(OperacionesParser.LLAVE_A, 0); }
		public TerminalNode LLAVE_C() { return getToken(OperacionesParser.LLAVE_C, 0); }
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(FUNC);
			setState(9);
			match(ID);
			setState(10);
			match(LLAVE_A);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << PRINT) | (1L << ID) | (1L << SEMI))) != 0)) {
				{
				{
				setState(11);
				inicio();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(LLAVE_C);
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

	public static class InicioContext extends ParserRuleContext {
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EspacioContext extends InicioContext {
		public TerminalNode SEMI() { return getToken(OperacionesParser.SEMI, 0); }
		public EspacioContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitEspacio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignacionContext extends InicioContext {
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(OperacionesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OperacionesParser.SEMI, 0); }
		public AsignacionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends InicioContext {
		public TerminalNode LET() { return getToken(OperacionesParser.LET, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(OperacionesParser.SEMI, 0); }
		public TerminalNode IGUAL() { return getToken(OperacionesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionExpresionContext extends InicioContext {
		public TerminalNode PRINT() { return getToken(OperacionesParser.PRINT, 0); }
		public TerminalNode SEMI() { return getToken(OperacionesParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public ImpresionExpresionContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitImpresionExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicio);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new ImpresionExpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(PRINT);
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case INT:
				case PAR_A:
					{
					setState(20);
					expr(0);
					}
					break;
				case STRING:
					{
					setState(21);
					strings();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(24);
				match(SEMI);
				}
				break;
			case LET:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(LET);
				setState(27);
				match(ID);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(28);
					match(IGUAL);
					setState(29);
					expr(0);
					}
				}

				setState(32);
				match(SEMI);
				}
				break;
			case ID:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(ID);
				setState(34);
				match(IGUAL);
				setState(35);
				expr(0);
				setState(36);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new EspacioContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(SEMI);
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

	public static class StringsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(OperacionesParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(OperacionesParser.STRING, i);
		}
		public List<TerminalNode> MAS() { return getTokens(OperacionesParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(OperacionesParser.MAS, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_strings);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					match(STRING);
					setState(43);
					match(MAS);
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
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
	public static class ParentesisContext extends ExprContext {
		public TerminalNode PAR_A() { return getToken(OperacionesParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(OperacionesParser.PAR_C, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(OperacionesParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(OperacionesParser.MENOS, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POR() { return getToken(OperacionesParser.POR, 0); }
		public TerminalNode DIV() { return getToken(OperacionesParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(OperacionesParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitInt(this);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(ID);
				}
				break;
			case PAR_A:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(PAR_A);
				setState(54);
				expr(0);
				setState(55);
				match(PAR_C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(60);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POR || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(64);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\6\4/\n\4\r\4\16\4\60\5\4\63\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5D\n\5\f"+
		"\5\16\5G\13\5\3\5\2\3\b\6\2\4\6\b\2\4\3\2\f\r\3\2\n\13\2P\2\n\3\2\2\2"+
		"\4)\3\2\2\2\6\62\3\2\2\2\b;\3\2\2\2\n\13\7\4\2\2\13\f\7\b\2\2\f\20\7\6"+
		"\2\2\r\17\5\4\3\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2"+
		"\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7\7\2\2\24\3\3\2\2\2\25\30\7\5\2"+
		"\2\26\31\5\b\5\2\27\31\5\6\4\2\30\26\3\2\2\2\30\27\3\2\2\2\31\32\3\2\2"+
		"\2\32\33\7\21\2\2\33*\3\2\2\2\34\35\7\3\2\2\35 \7\b\2\2\36\37\7\t\2\2"+
		"\37!\5\b\5\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"*\7\21\2\2#$\7\b\2\2$%"+
		"\7\t\2\2%&\5\b\5\2&\'\7\21\2\2\'*\3\2\2\2(*\7\21\2\2)\25\3\2\2\2)\34\3"+
		"\2\2\2)#\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+\63\7\22\2\2,-\7\22\2\2-/\7\n\2"+
		"\2.,\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62+\3"+
		"\2\2\2\62.\3\2\2\2\63\7\3\2\2\2\64\65\b\5\1\2\65<\7\16\2\2\66<\7\b\2\2"+
		"\678\7\17\2\289\5\b\5\29:\7\20\2\2:<\3\2\2\2;\64\3\2\2\2;\66\3\2\2\2;"+
		"\67\3\2\2\2<E\3\2\2\2=>\f\7\2\2>?\t\2\2\2?D\5\b\5\b@A\f\6\2\2AB\t\3\2"+
		"\2BD\5\b\5\7C=\3\2\2\2C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\t\3\2"+
		"\2\2GE\3\2\2\2\13\20\30 )\60\62;CE";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}