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
		EQ=1, GREATER=2, LESS=3, EQ_G=4, EQ_L=5, NEQ=6, IF=7, ELSE=8, LET=9, FUNC=10, 
		PRINT=11, LLAVE_A=12, LLAVE_C=13, ID=14, IGUAL=15, MAS=16, MENOS=17, POR=18, 
		DIV=19, INT=20, PAR_A=21, PAR_C=22, SEMI=23, STRING=24, ESPACIOS=25;
	public static final int
		RULE_inicio = 0, RULE_printConent = 1, RULE_functElse = 2, RULE_functIF = 3, 
		RULE_cuerpo = 4, RULE_condition = 5, RULE_linea = 6, RULE_comparation = 7, 
		RULE_strings = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "printConent", "functElse", "functIF", "cuerpo", "condition", 
			"linea", "comparation", "strings", "expr"
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

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(OperacionesParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode LLAVE_A() { return getToken(OperacionesParser.LLAVE_A, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode LLAVE_C() { return getToken(OperacionesParser.LLAVE_C, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(FUNC);
			setState(21);
			match(ID);
			setState(22);
			match(LLAVE_A);
			setState(23);
			cuerpo();
			setState(24);
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

	public static class PrintConentContext extends ParserRuleContext {
		public PrintConentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printConent; }
	 
		public PrintConentContext() { }
		public void copyFrom(PrintConentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStringContext extends PrintConentContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public PrintStringContext(PrintConentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends PrintConentContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(PrintConentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintConentContext printConent() throws RecognitionException {
		PrintConentContext _localctx = new PrintConentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_printConent);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INT:
			case PAR_A:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				expr(0);
				}
				break;
			case STRING:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				strings();
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

	public static class FunctElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OperacionesParser.ELSE, 0); }
		public TerminalNode LLAVE_A() { return getToken(OperacionesParser.LLAVE_A, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode LLAVE_C() { return getToken(OperacionesParser.LLAVE_C, 0); }
		public FunctIFContext functIF() {
			return getRuleContext(FunctIFContext.class,0);
		}
		public FunctElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitFunctElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctElseContext functElse() throws RecognitionException {
		FunctElseContext _localctx = new FunctElseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functElse);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(ELSE);
				setState(31);
				match(LLAVE_A);
				setState(32);
				cuerpo();
				setState(33);
				match(LLAVE_C);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(ELSE);
				setState(36);
				functIF();
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

	public static class FunctIFContext extends ParserRuleContext {
		public FunctIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functIF; }
	 
		public FunctIFContext() { }
		public void copyFrom(FunctIFContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfHeaderContext extends FunctIFContext {
		public TerminalNode IF() { return getToken(OperacionesParser.IF, 0); }
		public TerminalNode PAR_A() { return getToken(OperacionesParser.PAR_A, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(OperacionesParser.PAR_C, 0); }
		public TerminalNode LLAVE_A() { return getToken(OperacionesParser.LLAVE_A, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode LLAVE_C() { return getToken(OperacionesParser.LLAVE_C, 0); }
		public FunctElseContext functElse() {
			return getRuleContext(FunctElseContext.class,0);
		}
		public IfHeaderContext(FunctIFContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitIfHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctIFContext functIF() throws RecognitionException {
		FunctIFContext _localctx = new FunctIFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functIF);
		int _la;
		try {
			_localctx = new IfHeaderContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(IF);
			setState(40);
			match(PAR_A);
			setState(41);
			condition();
			setState(42);
			match(PAR_C);
			setState(43);
			match(LLAVE_A);
			setState(44);
			cuerpo();
			setState(45);
			match(LLAVE_C);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(46);
				functElse();
				}
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

	public static class CuerpoContext extends ParserRuleContext {
		public List<LineaContext> linea() {
			return getRuleContexts(LineaContext.class);
		}
		public LineaContext linea(int i) {
			return getRuleContext(LineaContext.class,i);
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
		enterRule(_localctx, 8, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				linea();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << LET) | (1L << PRINT) | (1L << ID) | (1L << SEMI))) != 0) );
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparationContext comparation() {
			return getRuleContext(ComparationContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			expr(0);
			setState(55);
			comparation();
			setState(56);
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

	public static class LineaContext extends ParserRuleContext {
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
	 
		public LineaContext() { }
		public void copyFrom(LineaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EspacioContext extends LineaContext {
		public TerminalNode SEMI() { return getToken(OperacionesParser.SEMI, 0); }
		public EspacioContext(LineaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitEspacio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignacionContext extends LineaContext {
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(OperacionesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OperacionesParser.SEMI, 0); }
		public AsignacionContext(LineaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionIFContext extends LineaContext {
		public FunctIFContext functIF() {
			return getRuleContext(FunctIFContext.class,0);
		}
		public FunctionIFContext(LineaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitFunctionIF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends LineaContext {
		public TerminalNode LET() { return getToken(OperacionesParser.LET, 0); }
		public TerminalNode ID() { return getToken(OperacionesParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(OperacionesParser.SEMI, 0); }
		public TerminalNode IGUAL() { return getToken(OperacionesParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionContext(LineaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionContext extends LineaContext {
		public TerminalNode PRINT() { return getToken(OperacionesParser.PRINT, 0); }
		public PrintConentContext printConent() {
			return getRuleContext(PrintConentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OperacionesParser.SEMI, 0); }
		public ImpresionContext(LineaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_linea);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new FunctionIFContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				functIF();
				}
				break;
			case PRINT:
				_localctx = new ImpresionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(PRINT);
				setState(60);
				printConent();
				setState(61);
				match(SEMI);
				}
				break;
			case LET:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(LET);
				setState(64);
				match(ID);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(65);
					match(IGUAL);
					setState(66);
					expr(0);
					}
				}

				setState(69);
				match(SEMI);
				}
				break;
			case ID:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(ID);
				setState(71);
				match(IGUAL);
				setState(72);
				expr(0);
				setState(73);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new EspacioContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
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

	public static class ComparationContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(OperacionesParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(OperacionesParser.NEQ, 0); }
		public TerminalNode EQ_G() { return getToken(OperacionesParser.EQ_G, 0); }
		public TerminalNode EQ_L() { return getToken(OperacionesParser.EQ_L, 0); }
		public TerminalNode GREATER() { return getToken(OperacionesParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(OperacionesParser.LESS, 0); }
		public ComparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OperacionesVisitor ) return ((OperacionesVisitor<? extends T>)visitor).visitComparation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparationContext comparation() throws RecognitionException {
		ComparationContext _localctx = new ComparationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GREATER) | (1L << LESS) | (1L << EQ_G) | (1L << EQ_L) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 16, RULE_strings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(80);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(81);
					match(STRING);
					setState(82);
					match(MAS);
					}
					break;
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(ID);
				}
				break;
			case PAR_A:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(PAR_A);
				setState(91);
				expr(0);
				setState(92);
				match(PAR_C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
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
						setState(98);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
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
						setState(101);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4(\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\6\6\65\n\6\r"+
		"\6\16\6\66\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bF\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\n\3\n\3\n\6\nV\n\n\r"+
		"\n\16\nW\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13a\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13i\n\13\f\13\16\13l\13\13\3\13\2\3\24\f\2\4\6\b\n\f"+
		"\16\20\22\24\2\5\3\2\3\b\3\2\24\25\3\2\22\23\2r\2\26\3\2\2\2\4\36\3\2"+
		"\2\2\6\'\3\2\2\2\b)\3\2\2\2\n\64\3\2\2\2\f8\3\2\2\2\16N\3\2\2\2\20P\3"+
		"\2\2\2\22U\3\2\2\2\24`\3\2\2\2\26\27\7\f\2\2\27\30\7\20\2\2\30\31\7\16"+
		"\2\2\31\32\5\n\6\2\32\33\7\17\2\2\33\3\3\2\2\2\34\37\5\24\13\2\35\37\5"+
		"\22\n\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\n\2\2!\"\7\16\2\2"+
		"\"#\5\n\6\2#$\7\17\2\2$(\3\2\2\2%&\7\n\2\2&(\5\b\5\2\' \3\2\2\2\'%\3\2"+
		"\2\2(\7\3\2\2\2)*\7\t\2\2*+\7\27\2\2+,\5\f\7\2,-\7\30\2\2-.\7\16\2\2."+
		"/\5\n\6\2/\61\7\17\2\2\60\62\5\6\4\2\61\60\3\2\2\2\61\62\3\2\2\2\62\t"+
		"\3\2\2\2\63\65\5\16\b\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\13\3\2\2\289\5\24\13\29:\5\20\t\2:;\5\24\13\2;\r\3\2\2\2<"+
		"O\5\b\5\2=>\7\r\2\2>?\5\4\3\2?@\7\31\2\2@O\3\2\2\2AB\7\13\2\2BE\7\20\2"+
		"\2CD\7\21\2\2DF\5\24\13\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GO\7\31\2\2HI\7"+
		"\20\2\2IJ\7\21\2\2JK\5\24\13\2KL\7\31\2\2LO\3\2\2\2MO\7\31\2\2N<\3\2\2"+
		"\2N=\3\2\2\2NA\3\2\2\2NH\3\2\2\2NM\3\2\2\2O\17\3\2\2\2PQ\t\2\2\2Q\21\3"+
		"\2\2\2RV\7\32\2\2ST\7\32\2\2TV\7\22\2\2UR\3\2\2\2US\3\2\2\2VW\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2YZ\b\13\1\2Za\7\26\2\2[a\7\20\2\2\\]\7"+
		"\27\2\2]^\5\24\13\2^_\7\30\2\2_a\3\2\2\2`Y\3\2\2\2`[\3\2\2\2`\\\3\2\2"+
		"\2aj\3\2\2\2bc\f\7\2\2cd\t\3\2\2di\5\24\13\bef\f\6\2\2fg\t\4\2\2gi\5\24"+
		"\13\7hb\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\25\3\2\2\2lj"+
		"\3\2\2\2\r\36\'\61\66ENUW`hj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}