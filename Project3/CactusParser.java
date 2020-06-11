// Generated from Cactus.g4 by ANTLR 4.8

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
public class CactusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELSE=1, FI=2, IF=3, INT=4, MAIN=5, READ=6, RETURN=7, MINUS=8, DIGIT=9, 
		WHILE=10, WRITE=11, ASSIGNMENT=12, ADD=13, MULTIPLY=14, DIVIDE=15, MODULO=16, 
		EQUAL=17, NEQUAL=18, GREATER=19, GREATEREQUAL=20, LESS=21, LESSEQUAL=22, 
		AND=23, OR=24, NEGATION=25, LeftParen=26, RightParen=27, LeftBrace=28, 
		RightBrace=29, COMMA=30, SEMI=31, ID=32, Whitespace=33, Newline=34, BlockComment=35, 
		LineComment=36;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_bool_expression = 4, RULE_bool_expression1 = 5, RULE_bool_term = 6, 
		RULE_bool_term1 = 7, RULE_bool_factor = 8, RULE_relation_op = 9, RULE_arith_expression = 10, 
		RULE_arith_expression1 = 11, RULE_arith_term = 12, RULE_arith_term1 = 13, 
		RULE_arith_factor = 14, RULE_primary_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "statements", "statement", "bool_expression", 
			"bool_expression1", "bool_term", "bool_term1", "bool_factor", "relation_op", 
			"arith_expression", "arith_expression1", "arith_term", "arith_term1", 
			"arith_factor", "primary_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'fi'", "'if'", "'int'", "'main'", "'read'", "'return'", 
			"'-'", null, "'while'", "'write'", "'='", "'+'", "'*'", "'/'", "'%'", 
			"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'!'", 
			"'('", "')'", "'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ELSE", "FI", "IF", "INT", "MAIN", "READ", "RETURN", "MINUS", "DIGIT", 
			"WHILE", "WRITE", "ASSIGNMENT", "ADD", "MULTIPLY", "DIVIDE", "MODULO", 
			"EQUAL", "NEQUAL", "GREATER", "GREATEREQUAL", "LESS", "LESSEQUAL", "AND", 
			"OR", "NEGATION", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"COMMA", "SEMI", "ID", "Whitespace", "Newline", "BlockComment", "LineComment"
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CactusParser.MAIN, 0); }
		public TerminalNode LeftParen() { return getToken(CactusParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CactusParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CactusParser.LeftBrace, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CactusParser.RightBrace, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(MAIN);
			setState(33);
			match(LeftParen);
			setState(34);
			match(RightParen);
			setState(35);
			match(LeftBrace);
			System.out.println("\t.data");
			setState(37);
			declarations();
			System.out.println("\t"+".text");System.out.println("main:");
			setState(39);
			statements(0, 1);
			setState(40);
			match(RightBrace);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode INT() { return getToken(CactusParser.INT, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CactusParser.SEMI, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(INT);
				setState(43);
				((DeclarationsContext)_localctx).ID = match(ID);
				System.out.println((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null) + ":" + "\t.word 0");
				setState(45);
				match(SEMI);
				setState(46);
				declarations();
				}
				break;
			case READ:
			case RETURN:
			case WHILE:
			case WRITE:
			case RightBrace:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementsContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext x;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case RETURN:
			case WHILE:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((StatementsContext)_localctx).x = statement(_localctx.reg, _localctx.label);
				setState(51);
				statements(((StatementsContext)_localctx).x.nreg, ((StatementsContext)_localctx).x.nlabel);
				}
				break;
			case RightBrace:
				enterOuterAlt(_localctx, 2);
				{
				((StatementsContext)_localctx).nreg =  _localctx.reg; ((StatementsContext)_localctx).nlabel =  _localctx.label;
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

	public static class StatementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Token ID;
		public Arith_expressionContext x;
		public StatementsContext z;
		public Arith_expressionContext k;
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(CactusParser.ASSIGNMENT, 0); }
		public TerminalNode SEMI() { return getToken(CactusParser.SEMI, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CactusParser.WHILE, 0); }
		public TerminalNode LeftParen() { return getToken(CactusParser.LeftParen, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CactusParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CactusParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CactusParser.RightBrace, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode READ() { return getToken(CactusParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(CactusParser.WRITE, 0); }
		public TerminalNode RETURN() { return getToken(CactusParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((StatementContext)_localctx).ID = match(ID);
				setState(57);
				match(ASSIGNMENT);
				setState(58);
				((StatementContext)_localctx).x = arith_expression(_localctx.reg);
				System.out.println("la\t$" + "t" + ((StatementContext)_localctx).x.nreg + ", " + (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));System.out.println("sw\t$" + "t" + ((StatementContext)_localctx).x.place + ", " + "0($" + "t" + ((StatementContext)_localctx).x.nreg + ")" );((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).x.nreg-1; ((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(60);
				match(SEMI);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(WHILE);
				setState(63);
				match(LeftParen);
				setState(64);
				bool_expression();
				setState(65);
				match(RightParen);
				setState(66);
				match(LeftBrace);
				setState(67);
				((StatementContext)_localctx).z = statements(_localctx.reg, _localctx.label);
				((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).z.nreg; ((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).z.nlabel;
				setState(69);
				match(RightBrace);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(READ);
				setState(72);
				match(ID);
				setState(73);
				match(SEMI);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(WRITE);
				setState(75);
				((StatementContext)_localctx).k = arith_expression(_localctx.reg);
				setState(76);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(RETURN);
				setState(79);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression1Context bool_expression1() {
			return getRuleContext(Bool_expression1Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			bool_term();
			setState(83);
			bool_expression1();
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

	public static class Bool_expression1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CactusParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression1Context bool_expression1() {
			return getRuleContext(Bool_expression1Context.class,0);
		}
		public Bool_expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_expression1(this);
		}
	}

	public final Bool_expression1Context bool_expression1() throws RecognitionException {
		Bool_expression1Context _localctx = new Bool_expression1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool_expression1);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(OR);
				setState(86);
				bool_term();
				setState(87);
				bool_expression1();
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			bool_factor();
			setState(93);
			bool_term1();
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

	public static class Bool_term1Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CactusParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_term1(this);
		}
	}

	public final Bool_term1Context bool_term1() throws RecognitionException {
		Bool_term1Context _localctx = new Bool_term1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool_term1);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(AND);
				setState(96);
				bool_factor();
				setState(97);
				bool_term1();
				}
				break;
			case OR:
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode NEGATION() { return getToken(CactusParser.NEGATION, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(NEGATION);
			setState(103);
			bool_factor();
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

	public static class Relation_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(CactusParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(CactusParser.NEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(CactusParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(CactusParser.GREATEREQUAL, 0); }
		public TerminalNode LESS() { return getToken(CactusParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(CactusParser.LESSEQUAL, 0); }
		public Relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRelation_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRelation_op(this);
		}
	}

	public final Relation_opContext relation_op() throws RecognitionException {
		Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relation_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NEQUAL) | (1L << GREATER) | (1L << GREATEREQUAL) | (1L << LESS) | (1L << LESSEQUAL))) != 0)) ) {
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_termContext x;
		public Arith_expression1Context y;
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression1Context arith_expression1() {
			return getRuleContext(Arith_expression1Context.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression(int reg) throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 20, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((Arith_expressionContext)_localctx).x = arith_term(_localctx.reg);
			setState(108);
			((Arith_expressionContext)_localctx).y = arith_expression1(((Arith_expressionContext)_localctx).x.nreg);
			((Arith_expressionContext)_localctx).nreg =  ((Arith_expressionContext)_localctx).x.nreg; ((Arith_expressionContext)_localctx).place =  ((Arith_expressionContext)_localctx).x.place;
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

	public static class Arith_expression1Context extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_termContext x;
		public Arith_expression1Context y;
		public Arith_termContext z;
		public Arith_expression1Context k;
		public TerminalNode ADD() { return getToken(CactusParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expression1Context arith_expression1() {
			return getRuleContext(Arith_expression1Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public Arith_expression1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expression1Context(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_expression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_expression1(this);
		}
	}

	public final Arith_expression1Context arith_expression1(int reg) throws RecognitionException {
		Arith_expression1Context _localctx = new Arith_expression1Context(_ctx, getState(), reg);
		enterRule(_localctx, 22, RULE_arith_expression1);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ADD);
				setState(112);
				((Arith_expression1Context)_localctx).x = arith_term(_localctx.reg);
				setState(113);
				((Arith_expression1Context)_localctx).y = arith_expression1(((Arith_expression1Context)_localctx).x.nreg);
				System.out.printf("add\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_expression1Context)_localctx).x.place);((Arith_expression1Context)_localctx).nreg =  ((Arith_expression1Context)_localctx).x.nreg-1; ((Arith_expression1Context)_localctx).place =  ((Arith_expression1Context)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(MINUS);
				setState(117);
				((Arith_expression1Context)_localctx).z = arith_term(_localctx.reg);
				setState(118);
				((Arith_expression1Context)_localctx).k = arith_expression1(((Arith_expression1Context)_localctx).z.nreg);
				System.out.printf("sub\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_expression1Context)_localctx).z.place);((Arith_expression1Context)_localctx).nreg =  ((Arith_expression1Context)_localctx).z.nreg-1; ((Arith_expression1Context)_localctx).place =  ((Arith_expression1Context)_localctx).z.place;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((Arith_expression1Context)_localctx).nreg =  _localctx.reg;
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

	public static class Arith_termContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext x;
		public Arith_term1Context y;
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term1Context arith_term1() {
			return getRuleContext(Arith_term1Context.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term(int reg) throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState(), reg);
		enterRule(_localctx, 24, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((Arith_termContext)_localctx).x = arith_factor(_localctx.reg);
			setState(125);
			((Arith_termContext)_localctx).y = arith_term1(((Arith_termContext)_localctx).x.nreg);
			((Arith_termContext)_localctx).nreg =  ((Arith_termContext)_localctx).x.nreg;((Arith_termContext)_localctx).place =  ((Arith_termContext)_localctx).x.place;
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

	public static class Arith_term1Context extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext x;
		public Arith_term1Context y;
		public TerminalNode MULTIPLY() { return getToken(CactusParser.MULTIPLY, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_term1Context arith_term1() {
			return getRuleContext(Arith_term1Context.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(CactusParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(CactusParser.MODULO, 0); }
		public Arith_term1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_term1Context(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_term1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_term1(this);
		}
	}

	public final Arith_term1Context arith_term1(int reg) throws RecognitionException {
		Arith_term1Context _localctx = new Arith_term1Context(_ctx, getState(), reg);
		enterRule(_localctx, 26, RULE_arith_term1);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(MULTIPLY);
				setState(129);
				((Arith_term1Context)_localctx).x = arith_factor(_localctx.reg);
				setState(130);
				((Arith_term1Context)_localctx).y = arith_term1(((Arith_term1Context)_localctx).x.nreg);
				System.out.printf("mul\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_term1Context)_localctx).x.place);((Arith_term1Context)_localctx).nreg =  ((Arith_term1Context)_localctx).x.nreg-1; ((Arith_term1Context)_localctx).place =  ((Arith_term1Context)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(DIVIDE);
				setState(134);
				arith_factor(_localctx.reg);
				setState(135);
				arith_term1(_localctx.reg);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(MODULO);
				setState(138);
				arith_factor(_localctx.reg);
				setState(139);
				arith_term1(_localctx.reg);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				((Arith_term1Context)_localctx).nreg =  _localctx.reg;
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

	public static class Arith_factorContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Arith_factorContext x;
		public Primary_expressionContext y;
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_factorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor(int reg) throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState(), reg);
		enterRule(_localctx, 28, RULE_arith_factor);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(MINUS);
				setState(145);
				((Arith_factorContext)_localctx).x = arith_factor(_localctx.reg);
				System.out.println("neg\t$" + "t" + ((Arith_factorContext)_localctx).x.place + ", $" + "t" + ((Arith_factorContext)_localctx).x.place);((Arith_factorContext)_localctx).nreg = ((Arith_factorContext)_localctx).x.nreg;((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				((Arith_factorContext)_localctx).y = primary_expression(_localctx.reg);
				((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).y.nreg; ((Arith_factorContext)_localctx).place =  ((Arith_factorContext)_localctx).y.place;
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int place;
		public Token DIGIT;
		public Token ID;
		public Arith_expressionContext x;
		public Arith_expressionContext y;
		public TerminalNode DIGIT() { return getToken(CactusParser.DIGIT, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode LeftParen() { return getToken(CactusParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CactusParser.RightParen, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression(int reg) throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 30, RULE_primary_expression);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((Primary_expressionContext)_localctx).DIGIT = match(DIGIT);
				System.out.println("li\t$" + "t" + _localctx.reg + ", " + (((Primary_expressionContext)_localctx).DIGIT!=null?((Primary_expressionContext)_localctx).DIGIT.getText():null));((Primary_expressionContext)_localctx).place =  _localctx.reg; ((Primary_expressionContext)_localctx).nreg =  _localctx.reg+1;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((Primary_expressionContext)_localctx).ID = match(ID);
				System.out.println("la\t$" + "t" + _localctx.reg + ", " + (((Primary_expressionContext)_localctx).ID!=null?((Primary_expressionContext)_localctx).ID.getText():null));System.out.println("lw\t$" + "t" + _localctx.reg + ", 0($" + "t" + _localctx.reg + ")" ); ((Primary_expressionContext)_localctx).place = _localctx.reg; ((Primary_expressionContext)_localctx).nreg = _localctx.reg+1;
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(LeftParen);
				setState(158);
				((Primary_expressionContext)_localctx).x = arith_expression(_localctx.reg);
				((Primary_expressionContext)_localctx).nreg = ((Primary_expressionContext)_localctx).x.nreg;((Primary_expressionContext)_localctx).place = ((Primary_expressionContext)_localctx).x.place;
				setState(160);
				match(RightParen);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(MINUS);
				setState(163);
				((Primary_expressionContext)_localctx).y = arith_expression(_localctx.reg);
				System.out.println("neg\t$" + "t" + ((Primary_expressionContext)_localctx).y.place + ", $" + "t" + ((Primary_expressionContext)_localctx).y.place);((Primary_expressionContext)_localctx).nreg =  ((Primary_expressionContext)_localctx).y.nreg;((Primary_expressionContext)_localctx).place = ((Primary_expressionContext)_localctx).y.place;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tg\n\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0091\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u009a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a9\n\21\3\21\2\2\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\3\3\2\23\30\2\u00ab\2\"\3\2\2\2\4\62\3"+
		"\2\2\2\68\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20f\3"+
		"\2\2\2\22h\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30|\3\2\2\2\32~\3\2\2\2\34"+
		"\u0090\3\2\2\2\36\u0099\3\2\2\2 \u00a8\3\2\2\2\"#\7\7\2\2#$\7\34\2\2$"+
		"%\7\35\2\2%&\7\36\2\2&\'\b\2\1\2\'(\5\4\3\2()\b\2\1\2)*\5\6\4\2*+\7\37"+
		"\2\2+\3\3\2\2\2,-\7\6\2\2-.\7\"\2\2./\b\3\1\2/\60\7!\2\2\60\63\5\4\3\2"+
		"\61\63\3\2\2\2\62,\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\5\b\5\2\65"+
		"\66\5\6\4\2\669\3\2\2\2\679\b\4\1\28\64\3\2\2\28\67\3\2\2\29\7\3\2\2\2"+
		":;\7\"\2\2;<\7\16\2\2<=\5\26\f\2=>\b\5\1\2>?\7!\2\2?S\3\2\2\2@A\7\f\2"+
		"\2AB\7\34\2\2BC\5\n\6\2CD\7\35\2\2DE\7\36\2\2EF\5\6\4\2FG\b\5\1\2GH\7"+
		"\37\2\2HS\3\2\2\2IJ\7\b\2\2JK\7\"\2\2KS\7!\2\2LM\7\r\2\2MN\5\26\f\2NO"+
		"\7!\2\2OS\3\2\2\2PQ\7\t\2\2QS\7!\2\2R:\3\2\2\2R@\3\2\2\2RI\3\2\2\2RL\3"+
		"\2\2\2RP\3\2\2\2S\t\3\2\2\2TU\5\16\b\2UV\5\f\7\2V\13\3\2\2\2WX\7\32\2"+
		"\2XY\5\16\b\2YZ\5\f\7\2Z]\3\2\2\2[]\3\2\2\2\\W\3\2\2\2\\[\3\2\2\2]\r\3"+
		"\2\2\2^_\5\22\n\2_`\5\20\t\2`\17\3\2\2\2ab\7\31\2\2bc\5\22\n\2cd\5\20"+
		"\t\2dg\3\2\2\2eg\3\2\2\2fa\3\2\2\2fe\3\2\2\2g\21\3\2\2\2hi\7\33\2\2ij"+
		"\5\22\n\2j\23\3\2\2\2kl\t\2\2\2l\25\3\2\2\2mn\5\32\16\2no\5\30\r\2op\b"+
		"\f\1\2p\27\3\2\2\2qr\7\17\2\2rs\5\32\16\2st\5\30\r\2tu\b\r\1\2u}\3\2\2"+
		"\2vw\7\n\2\2wx\5\32\16\2xy\5\30\r\2yz\b\r\1\2z}\3\2\2\2{}\b\r\1\2|q\3"+
		"\2\2\2|v\3\2\2\2|{\3\2\2\2}\31\3\2\2\2~\177\5\36\20\2\177\u0080\5\34\17"+
		"\2\u0080\u0081\b\16\1\2\u0081\33\3\2\2\2\u0082\u0083\7\20\2\2\u0083\u0084"+
		"\5\36\20\2\u0084\u0085\5\34\17\2\u0085\u0086\b\17\1\2\u0086\u0091\3\2"+
		"\2\2\u0087\u0088\7\21\2\2\u0088\u0089\5\36\20\2\u0089\u008a\5\34\17\2"+
		"\u008a\u0091\3\2\2\2\u008b\u008c\7\22\2\2\u008c\u008d\5\36\20\2\u008d"+
		"\u008e\5\34\17\2\u008e\u0091\3\2\2\2\u008f\u0091\b\17\1\2\u0090\u0082"+
		"\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\35\3\2\2\2\u0092\u0093\7\n\2\2\u0093\u0094\5\36\20\2\u0094\u0095\b\20"+
		"\1\2\u0095\u009a\3\2\2\2\u0096\u0097\5 \21\2\u0097\u0098\b\20\1\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0096\3\2\2\2\u009a\37\3\2\2"+
		"\2\u009b\u009c\7\13\2\2\u009c\u00a9\b\21\1\2\u009d\u009e\7\"\2\2\u009e"+
		"\u00a9\b\21\1\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2"+
		"\b\21\1\2\u00a2\u00a3\7\35\2\2\u00a3\u00a9\3\2\2\2\u00a4\u00a5\7\n\2\2"+
		"\u00a5\u00a6\5\26\f\2\u00a6\u00a7\b\21\1\2\u00a7\u00a9\3\2\2\2\u00a8\u009b"+
		"\3\2\2\2\u00a8\u009d\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9"+
		"!\3\2\2\2\13\628R\\f|\u0090\u0099\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}