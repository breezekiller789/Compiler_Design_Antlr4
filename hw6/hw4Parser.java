// Generated from hw4.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hw4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4;
	public static final int
		RULE_s = 0, RULE_l = 1, RULE_ls = 2, RULE_r = 3, RULE_rs = 4, RULE_b = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "l", "ls", "r", "rs", "b"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'0'", "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS"
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
	public String getGrammarFileName() { return "hw4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hw4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public LContext x;
		public RContext y;
		public TerminalNode EOF() { return getToken(hw4Parser.EOF, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public TerminalNode WS() { return getToken(hw4Parser.WS, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((SContext)_localctx).x = l();
			setState(13);
			match(T__0);
			setState(14);
			((SContext)_localctx).y = r();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(15);
				match(WS);
				}
			}

			setState(18);
			match(EOF);
			System.out.println(((SContext)_localctx).x.lsr+((SContext)_localctx).y.rsr);
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

	public static class LContext extends ParserRuleContext {
		public int lsr;
		public BContext x;
		public LsContext y;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LsContext ls() {
			return getRuleContext(LsContext.class,0);
		}
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			((LContext)_localctx).x = b();
			setState(22);
			((LContext)_localctx).y = ls(((LContext)_localctx).x.bval);
			 ((LContext)_localctx).lsr =  ((LContext)_localctx).y.lss; 
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

	public static class LsContext extends ParserRuleContext {
		public int lsi;
		public int lss;
		public BContext x;
		public LsContext y;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public LsContext ls() {
			return getRuleContext(LsContext.class,0);
		}
		public LsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LsContext(ParserRuleContext parent, int invokingState, int lsi) {
			super(parent, invokingState);
			this.lsi = lsi;
		}
		@Override public int getRuleIndex() { return RULE_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).enterLs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).exitLs(this);
		}
	}

	public final LsContext ls(int lsi) throws RecognitionException {
		LsContext _localctx = new LsContext(_ctx, getState(), lsi);
		enterRule(_localctx, 4, RULE_ls);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((LsContext)_localctx).x = b();
				setState(26);
				((LsContext)_localctx).y = ls(_localctx.lsi * 2 + ((LsContext)_localctx).x.bval);
				 ((LsContext)_localctx).lss =  ((LsContext)_localctx).y.lss; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				 ((LsContext)_localctx).lss =  _localctx.lsi; 
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

	public static class RContext extends ParserRuleContext {
		public float rsr;
		public BContext x;
		public RsContext y;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public RsContext rs() {
			return getRuleContext(RsContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((RContext)_localctx).x = b();
			setState(33);
			((RContext)_localctx).y = rs(((RContext)_localctx).x.bval, ((RContext)_localctx).x.bc);
			 ((RContext)_localctx).rsr =  ((RContext)_localctx).y.rss; 
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

	public static class RsContext extends ParserRuleContext {
		public int rsi;
		public int rsc;
		public float rss;
		public BContext x;
		public RsContext y;
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public RsContext rs() {
			return getRuleContext(RsContext.class,0);
		}
		public RsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RsContext(ParserRuleContext parent, int invokingState, int rsi, int rsc) {
			super(parent, invokingState);
			this.rsi = rsi;
			this.rsc = rsc;
		}
		@Override public int getRuleIndex() { return RULE_rs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).enterRs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).exitRs(this);
		}
	}

	public final RsContext rs(int rsi,int rsc) throws RecognitionException {
		RsContext _localctx = new RsContext(_ctx, getState(), rsi, rsc);
		enterRule(_localctx, 8, RULE_rs);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((RsContext)_localctx).x = b();
				setState(37);
				((RsContext)_localctx).y = rs(_localctx.rsi * 2 + ((RsContext)_localctx).x.bval, _localctx.rsc * ((RsContext)_localctx).x.bc);
				 ((RsContext)_localctx).rss =  ((RsContext)_localctx).y.rss; 
				}
				break;
			case EOF:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				 ((RsContext)_localctx).rss =  (float)_localctx.rsi / _localctx.rsc; 
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

	public static class BContext extends ParserRuleContext {
		public int bval;
		public int bc;
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hw4Listener ) ((hw4Listener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_b);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(T__1);
				 ((BContext)_localctx).bval =  0; ((BContext)_localctx).bc =  2; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__2);
				 ((BContext)_localctx).bval =  1; ((BContext)_localctx).bc =  2; 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\3\7\5\7\62\n\7\3\7\2\2\b\2\4\6"+
		"\b\n\f\2\2\2\61\2\16\3\2\2\2\4\27\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n+\3"+
		"\2\2\2\f\61\3\2\2\2\16\17\5\4\3\2\17\20\7\3\2\2\20\22\5\b\5\2\21\23\7"+
		"\6\2\2\22\21\3\2\2\2\22\23\3\2\2\2\23\24\3\2\2\2\24\25\7\2\2\3\25\26\b"+
		"\2\1\2\26\3\3\2\2\2\27\30\5\f\7\2\30\31\5\6\4\2\31\32\b\3\1\2\32\5\3\2"+
		"\2\2\33\34\5\f\7\2\34\35\5\6\4\2\35\36\b\4\1\2\36!\3\2\2\2\37!\b\4\1\2"+
		" \33\3\2\2\2 \37\3\2\2\2!\7\3\2\2\2\"#\5\f\7\2#$\5\n\6\2$%\b\5\1\2%\t"+
		"\3\2\2\2&\'\5\f\7\2\'(\5\n\6\2()\b\6\1\2),\3\2\2\2*,\b\6\1\2+&\3\2\2\2"+
		"+*\3\2\2\2,\13\3\2\2\2-.\7\4\2\2.\62\b\7\1\2/\60\7\5\2\2\60\62\b\7\1\2"+
		"\61-\3\2\2\2\61/\3\2\2\2\62\r\3\2\2\2\6\22 +\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}