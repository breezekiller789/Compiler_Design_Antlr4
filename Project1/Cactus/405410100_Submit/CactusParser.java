// Generated from Cactus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CactusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, ELSE=2, FI=3, IF=4, INT=5, MAIN=6, RETURN=7, WHILE=8, READ=9, WRITE=10, 
		DIGIT=11, ADD=12, MINUS=13, MULTIPLY=14, DIVIDE=15, MODULO=16, EQUAL=17, 
		NEQUAL=18, GREATER=19, GREATEREQUAL=20, LESS=21, LESSEQUAL=22, AND=23, 
		OR=24, NEGATION=25, ASSIGNMENT=26, LeftParen=27, RightParen=28, LeftBrace=29, 
		RightBrace=30, COMMA=31, SEMI=32, Whitespace=33, Newline=34, BlockComment=35, 
		LineComment=36;
	public static final int
		RULE_token = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"token"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'else'", "'fi'", "'if'", "'int'", "'main'", "'return'", 
			"'while'", "'read'", "'write'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", 
			"'='", "'('", "')'", "'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "ELSE", "FI", "IF", "INT", "MAIN", "RETURN", "WHILE", "READ", 
			"WRITE", "DIGIT", "ADD", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "EQUAL", 
			"NEQUAL", "GREATER", "GREATEREQUAL", "LESS", "LESSEQUAL", "AND", "OR", 
			"NEGATION", "ASSIGNMENT", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"COMMA", "SEMI", "Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "Cactus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CactusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TokenContext extends ParserRuleContext {
		public List<TerminalNode> ELSE() { return getTokens(CactusParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CactusParser.ELSE, i);
		}
		public List<TerminalNode> FI() { return getTokens(CactusParser.FI); }
		public TerminalNode FI(int i) {
			return getToken(CactusParser.FI, i);
		}
		public List<TerminalNode> IF() { return getTokens(CactusParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CactusParser.IF, i);
		}
		public List<TerminalNode> INT() { return getTokens(CactusParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CactusParser.INT, i);
		}
		public List<TerminalNode> MAIN() { return getTokens(CactusParser.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(CactusParser.MAIN, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(CactusParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(CactusParser.RETURN, i);
		}
		public List<TerminalNode> WHILE() { return getTokens(CactusParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(CactusParser.WHILE, i);
		}
		public List<TerminalNode> READ() { return getTokens(CactusParser.READ); }
		public TerminalNode READ(int i) {
			return getToken(CactusParser.READ, i);
		}
		public List<TerminalNode> WRITE() { return getTokens(CactusParser.WRITE); }
		public TerminalNode WRITE(int i) {
			return getToken(CactusParser.WRITE, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(CactusParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(CactusParser.DIGIT, i);
		}
		public List<TerminalNode> ADD() { return getTokens(CactusParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(CactusParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CactusParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CactusParser.MINUS, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(CactusParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(CactusParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CactusParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CactusParser.DIVIDE, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(CactusParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(CactusParser.MODULO, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CactusParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CactusParser.EQUAL, i);
		}
		public List<TerminalNode> NEQUAL() { return getTokens(CactusParser.NEQUAL); }
		public TerminalNode NEQUAL(int i) {
			return getToken(CactusParser.NEQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(CactusParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(CactusParser.GREATER, i);
		}
		public List<TerminalNode> GREATEREQUAL() { return getTokens(CactusParser.GREATEREQUAL); }
		public TerminalNode GREATEREQUAL(int i) {
			return getToken(CactusParser.GREATEREQUAL, i);
		}
		public List<TerminalNode> LESS() { return getTokens(CactusParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(CactusParser.LESS, i);
		}
		public List<TerminalNode> LESSEQUAL() { return getTokens(CactusParser.LESSEQUAL); }
		public TerminalNode LESSEQUAL(int i) {
			return getToken(CactusParser.LESSEQUAL, i);
		}
		public List<TerminalNode> AND() { return getTokens(CactusParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CactusParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(CactusParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CactusParser.OR, i);
		}
		public List<TerminalNode> NEGATION() { return getTokens(CactusParser.NEGATION); }
		public TerminalNode NEGATION(int i) {
			return getToken(CactusParser.NEGATION, i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(CactusParser.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(CactusParser.ASSIGNMENT, i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(CactusParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CactusParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CactusParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CactusParser.RightParen, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(CactusParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(CactusParser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(CactusParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(CactusParser.RightBrace, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CactusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CactusParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CactusParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CactusParser.SEMI, i);
		}
		public List<TerminalNode> Whitespace() { return getTokens(CactusParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(CactusParser.Whitespace, i);
		}
		public List<TerminalNode> Newline() { return getTokens(CactusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(CactusParser.Newline, i);
		}
		public List<TerminalNode> BlockComment() { return getTokens(CactusParser.BlockComment); }
		public TerminalNode BlockComment(int i) {
			return getToken(CactusParser.BlockComment, i);
		}
		public List<TerminalNode> LineComment() { return getTokens(CactusParser.LineComment); }
		public TerminalNode LineComment(int i) {
			return getToken(CactusParser.LineComment, i);
		}
		public List<TerminalNode> ID() { return getTokens(CactusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CactusParser.ID, i);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << ELSE) | (1L << FI) | (1L << IF) | (1L << INT) | (1L << MAIN) | (1L << RETURN) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DIGIT) | (1L << ADD) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO) | (1L << EQUAL) | (1L << NEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << LESS) | (1L << LESSEQUAL) | (1L << AND) | (1L << OR) | (1L << NEGATION) | (1L << ASSIGNMENT) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBrace) | (1L << RightBrace) | (1L << COMMA) | (1L << SEMI) | (1L << Whitespace) | (1L << Newline) | (1L << BlockComment) | (1L << LineComment))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << ELSE) | (1L << FI) | (1L << IF) | (1L << INT) | (1L << MAIN) | (1L << RETURN) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DIGIT) | (1L << ADD) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO) | (1L << EQUAL) | (1L << NEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << LESS) | (1L << LESSEQUAL) | (1L << AND) | (1L << OR) | (1L << NEGATION) | (1L << ASSIGNMENT) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBrace) | (1L << RightBrace) | (1L << COMMA) | (1L << SEMI) | (1L << Whitespace) | (1L << Newline) | (1L << BlockComment) | (1L << LineComment))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\13\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\3\2\3&\2\n\2\7\3\2\2\2\4\6\t"+
		"\2\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\t\7"+
		"\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}