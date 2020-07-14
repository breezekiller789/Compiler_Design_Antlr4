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
		TRUE=1, FALSE=2, ELSE=3, FI=4, IF=5, INT=6, MAIN=7, READ=8, RETURN=9, 
		MINUS=10, DIGIT=11, WHILE=12, WRITE=13, ASSIGNMENT=14, ADD=15, MULTIPLY=16, 
		DIVIDE=17, MODULO=18, EQUAL=19, NEQUAL=20, GREATER=21, GREATEREQUAL=22, 
		LESS=23, LESSEQUAL=24, AND=25, OR=26, NEGATION=27, LeftParen=28, RightParen=29, 
		LeftBrace=30, RightBrace=31, COMMA=32, SEMI=33, ID=34, Whitespace=35, 
		Newline=36, BlockComment=37, LineComment=38;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_else_statement = 4, RULE_bool_expression = 5, RULE_bool_expression1 = 6, 
		RULE_bool_term = 7, RULE_bool_term1 = 8, RULE_bool_factor = 9, RULE_rel_expression = 10, 
		RULE_relation_op = 11, RULE_arith_expression = 12, RULE_arith_expression1 = 13, 
		RULE_arith_term = 14, RULE_arith_term1 = 15, RULE_arith_factor = 16, RULE_primary_expression = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "statements", "statement", "else_statement", 
			"bool_expression", "bool_expression1", "bool_term", "bool_term1", "bool_factor", 
			"rel_expression", "relation_op", "arith_expression", "arith_expression1", 
			"arith_term", "arith_term1", "arith_factor", "primary_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'else'", "'fi'", "'if'", "'int'", "'main'", 
			"'read'", "'return'", "'-'", null, "'while'", "'write'", "'='", "'+'", 
			"'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", 
			"'||'", "'!'", "'('", "')'", "'{'", "'}'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "ELSE", "FI", "IF", "INT", "MAIN", "READ", "RETURN", 
			"MINUS", "DIGIT", "WHILE", "WRITE", "ASSIGNMENT", "ADD", "MULTIPLY", 
			"DIVIDE", "MODULO", "EQUAL", "NEQUAL", "GREATER", "GREATEREQUAL", "LESS", 
			"LESSEQUAL", "AND", "OR", "NEGATION", "LeftParen", "RightParen", "LeftBrace", 
			"RightBrace", "COMMA", "SEMI", "ID", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
			setState(36);
			match(MAIN);
			setState(37);
			match(LeftParen);
			setState(38);
			match(RightParen);
			setState(39);
			match(LeftBrace);
			System.out.println("\t.data");
			setState(41);
			declarations();
			System.out.println("\t"+".text");System.out.println("main:");
			setState(43);
			statements(0, 1);
			setState(44);
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(INT);
				setState(47);
				((DeclarationsContext)_localctx).ID = match(ID);
				System.out.println((((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null) + ":" + "\t.word 0");
				setState(49);
				match(SEMI);
				setState(50);
				declarations();
				}
				break;
			case IF:
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
		public StatementsContext y;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case READ:
			case RETURN:
			case WHILE:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((StatementsContext)_localctx).x = statement(_localctx.reg, _localctx.label);
				setState(55);
				((StatementsContext)_localctx).y = statements(((StatementsContext)_localctx).x.nreg, ((StatementsContext)_localctx).x.nlabel);
				((StatementsContext)_localctx).nreg =  ((StatementsContext)_localctx).y.nreg;((StatementsContext)_localctx).nlabel = ((StatementsContext)_localctx).y.nlabel;
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
		public Bool_expressionContext m;
		public StatementsContext y;
		public Else_statementContext n;
		public Bool_expressionContext i;
		public StatementsContext z;
		public Arith_expressionContext k;
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(CactusParser.ASSIGNMENT, 0); }
		public TerminalNode SEMI() { return getToken(CactusParser.SEMI, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(CactusParser.IF, 0); }
		public TerminalNode LeftParen() { return getToken(CactusParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CactusParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CactusParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CactusParser.RightBrace, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CactusParser.WHILE, 0); }
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((StatementContext)_localctx).ID = match(ID);
				setState(62);
				match(ASSIGNMENT);
				setState(63);
				((StatementContext)_localctx).x = arith_expression(_localctx.reg);
				System.out.println("\tla\t$" + "t" + ((StatementContext)_localctx).x.nreg + ", " + (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));System.out.println("\tsw\t$" + "t" + ((StatementContext)_localctx).x.place + ", " + "0($" + "t" + ((StatementContext)_localctx).x.nreg + ")" );((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).x.nreg-1; ((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(65);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("\t#if");
				setState(68);
				match(IF);
				setState(69);
				match(LeftParen);
				setState(70);
				((StatementContext)_localctx).m = bool_expression(_localctx.reg, _localctx.label+4, _localctx.label, _localctx.label+1);
				System.out.println("L" + _localctx.label + ":\t#then");
				setState(72);
				match(RightParen);
				setState(73);
				match(LeftBrace);
				setState(74);
				((StatementContext)_localctx).y = statements(((StatementContext)_localctx).m.nreg, ((StatementContext)_localctx).m.nlabel);
				System.out.printf("\tb\tL%d\n", _localctx.label+2);System.out.printf("L%d:\t#else\n", _localctx.label+1);
				setState(76);
				match(RightBrace);
				setState(77);
				((StatementContext)_localctx).n = else_statement(((StatementContext)_localctx).y.nreg, ((StatementContext)_localctx).y.nlabel);
				System.out.printf("L%d:\t#end if\n", _localctx.label+2);((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).m.nreg;((StatementContext)_localctx).nlabel =  _localctx.label+4;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				System.out.printf("L%d:\t#while\n", _localctx.label+1);
				setState(81);
				match(WHILE);
				setState(82);
				match(LeftParen);
				setState(83);
				((StatementContext)_localctx).i = bool_expression(_localctx.reg, _localctx.label+5, _localctx.label+2, _localctx.label+3);
				System.out.printf("L%d:\t#while body\n", _localctx.label+2);
				setState(85);
				match(RightParen);
				setState(86);
				match(LeftBrace);
				setState(87);
				((StatementContext)_localctx).z = statements(((StatementContext)_localctx).i.nreg, ((StatementContext)_localctx).i.nlabel);
				System.out.printf("\tb\tL%d\n", _localctx.label+1);System.out.printf("L%d:\t#end while\n", _localctx.label+3);((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).z.nreg; ((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(89);
				match(RightBrace);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(READ);
				setState(92);
				((StatementContext)_localctx).ID = match(ID);
				System.out.println("\tli\t$" + "v0" + ", " + "5");System.out.println("\tsyscall");System.out.println("\tla\t$" + "t" + _localctx.reg + ", " + (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));System.out.println("\tsw\t$" + "v0" + ", " + "0($" + "t" + _localctx.reg + ")" );((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(94);
				match(SEMI);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(WRITE);
				setState(96);
				((StatementContext)_localctx).k = arith_expression(_localctx.reg);
				System.out.println("\tmove\t$" + "a0" + ", " + "$" + "t" + ((StatementContext)_localctx).k.place);System.out.println("\tli\t$" + "v0" + ", " + "1");System.out.println("\tsyscall");((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(98);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(RETURN);
				System.out.println("\tli\t$" + "v0" + ", " + "10");System.out.println("\tsyscall");((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(102);
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

	public static class Else_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementsContext x;
		public TerminalNode ELSE() { return getToken(CactusParser.ELSE, 0); }
		public TerminalNode LeftBrace() { return getToken(CactusParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CactusParser.RightBrace, 0); }
		public TerminalNode FI() { return getToken(CactusParser.FI, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Else_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement(int reg,int label) throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 8, RULE_else_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ELSE);
				setState(106);
				match(LeftBrace);
				setState(107);
				((Else_statementContext)_localctx).x = statements(_localctx.reg, _localctx.label);
				((Else_statementContext)_localctx).nreg =  ((Else_statementContext)_localctx).x.nreg; ((Else_statementContext)_localctx).nlabel =  ((Else_statementContext)_localctx).x.nlabel;
				setState(109);
				match(RightBrace);
				setState(110);
				match(FI);
				}
				break;
			case FI:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(FI);
				((Else_statementContext)_localctx).nreg = _localctx.reg;((Else_statementContext)_localctx).nlabel = _localctx.label;
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
		public int reg;
		public int label;
		public int True;
		public int False;
		public int nreg;
		public int nlabel;
		public Bool_termContext x;
		public Bool_expression1Context y;
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression1Context bool_expression1() {
			return getRuleContext(Bool_expression1Context.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState, int reg, int label, int True, int False) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.True = True;
			this.False = False;
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

	public final Bool_expressionContext bool_expression(int reg,int label,int True,int False) throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState(), reg, label, True, False);
		enterRule(_localctx, 10, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((Bool_expressionContext)_localctx).x = bool_term(_localctx.reg, _localctx.label, _localctx.True, _localctx.False);
			setState(117);
			((Bool_expressionContext)_localctx).y = bool_expression1(((Bool_expressionContext)_localctx).x.nreg, ((Bool_expressionContext)_localctx).x.nlabel, _localctx.True, _localctx.False);
			((Bool_expressionContext)_localctx).nreg =  ((Bool_expressionContext)_localctx).x.nreg;((Bool_expressionContext)_localctx).nlabel =  ((Bool_expressionContext)_localctx).x.nlabel;
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
		public int reg;
		public int label;
		public int True;
		public int False;
		public int nreg;
		public int nlabel;
		public Bool_termContext x;
		public Bool_expression1Context y;
		public TerminalNode OR() { return getToken(CactusParser.OR, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expression1Context bool_expression1() {
			return getRuleContext(Bool_expression1Context.class,0);
		}
		public Bool_expression1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expression1Context(ParserRuleContext parent, int invokingState, int reg, int label, int True, int False) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.True = True;
			this.False = False;
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

	public final Bool_expression1Context bool_expression1(int reg,int label,int True,int False) throws RecognitionException {
		Bool_expression1Context _localctx = new Bool_expression1Context(_ctx, getState(), reg, label, True, False);
		enterRule(_localctx, 12, RULE_bool_expression1);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(OR);
				System.out.printf("L%d:\n", _localctx.label);System.out.printf("\tb\t%c%d\n", 'L', _localctx.True);System.out.printf("%c%d:\n", 'L', _localctx.label-1);
				setState(122);
				((Bool_expression1Context)_localctx).x = bool_term(_localctx.reg, _localctx.label+1, _localctx.True, _localctx.False);
				setState(123);
				((Bool_expression1Context)_localctx).y = bool_expression1(((Bool_expression1Context)_localctx).x.nreg, ((Bool_expression1Context)_localctx).x.nlabel, _localctx.True, _localctx.False);
				((Bool_expression1Context)_localctx).nreg = ((Bool_expression1Context)_localctx).x.nreg;((Bool_expression1Context)_localctx).nlabel = ((Bool_expression1Context)_localctx).x.nlabel;
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				System.out.printf("%c%d:\n\t%c\t%c%d\n", 'L', _localctx.label, 'b', 'L', _localctx.True);System.out.printf("%c%d:\n\t%c\t%c%d\n", 'L', _localctx.label-1, 'b', 'L', _localctx.False);((Bool_expression1Context)_localctx).nreg =  _localctx.reg; ((Bool_expression1Context)_localctx).nlabel =  _localctx.label;
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
		public int reg;
		public int label;
		public int True;
		public int False;
		public int nreg;
		public int nlabel;
		public Bool_factorContext x;
		public Bool_term1Context y;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termContext(ParserRuleContext parent, int invokingState, int reg, int label, int True, int False) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.True = True;
			this.False = False;
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

	public final Bool_termContext bool_term(int reg,int label,int True,int False) throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState(), reg, label, True, False);
		enterRule(_localctx, 14, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((Bool_termContext)_localctx).x = bool_factor(_localctx.reg, _localctx.label, _localctx.True, _localctx.False);
			setState(130);
			((Bool_termContext)_localctx).y = bool_term1(((Bool_termContext)_localctx).x.nreg, ((Bool_termContext)_localctx).x.nlabel, _localctx.True, _localctx.False);
			((Bool_termContext)_localctx).nreg =  ((Bool_termContext)_localctx).x.nreg;((Bool_termContext)_localctx).nlabel =  ((Bool_termContext)_localctx).x.nlabel;
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
		public int reg;
		public int label;
		public int True;
		public int False;
		public int nreg;
		public int nlabel;
		public Bool_factorContext x;
		public Bool_term1Context y;
		public TerminalNode AND() { return getToken(CactusParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_term1Context bool_term1() {
			return getRuleContext(Bool_term1Context.class,0);
		}
		public Bool_term1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_term1Context(ParserRuleContext parent, int invokingState, int reg, int label, int True, int False) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.True = True;
			this.False = False;
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

	public final Bool_term1Context bool_term1(int reg,int label,int True,int False) throws RecognitionException {
		Bool_term1Context _localctx = new Bool_term1Context(_ctx, getState(), reg, label, True, False);
		enterRule(_localctx, 16, RULE_bool_term1);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(AND);
				System.out.printf("L%d:\n", _localctx.label);System.out.printf("\tb\tL%d\n", _localctx.label-1);System.out.printf("L%d:\n", _localctx.label-1);
				setState(135);
				((Bool_term1Context)_localctx).x = bool_factor(_localctx.reg, _localctx.label+1, _localctx.label, _localctx.False);
				setState(136);
				((Bool_term1Context)_localctx).y = bool_term1(((Bool_term1Context)_localctx).x.nreg, ((Bool_term1Context)_localctx).x.nlabel, _localctx.True, _localctx.False);
				((Bool_term1Context)_localctx).nreg =  ((Bool_term1Context)_localctx).x.nreg;((Bool_term1Context)_localctx).nlabel =  ((Bool_term1Context)_localctx).x.nlabel;
				}
				break;
			case OR:
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				((Bool_term1Context)_localctx).nreg =  _localctx.reg; ((Bool_term1Context)_localctx).nlabel =  _localctx.label;
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
		public int reg;
		public int label;
		public int True;
		public int False;
		public int nreg;
		public int nlabel;
		public Bool_factorContext x;
		public Rel_expressionContext y;
		public TerminalNode NEGATION() { return getToken(CactusParser.NEGATION, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Rel_expressionContext rel_expression() {
			return getRuleContext(Rel_expressionContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(CactusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CactusParser.FALSE, 0); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState, int reg, int label, int True, int False) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.True = True;
			this.False = False;
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

	public final Bool_factorContext bool_factor(int reg,int label,int True,int False) throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState(), reg, label, True, False);
		enterRule(_localctx, 18, RULE_bool_factor);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(NEGATION);
				setState(143);
				((Bool_factorContext)_localctx).x = bool_factor(_localctx.reg, _localctx.label, _localctx.False, _localctx.True);
				((Bool_factorContext)_localctx).nreg =  ((Bool_factorContext)_localctx).x.nreg;((Bool_factorContext)_localctx).nlabel =  ((Bool_factorContext)_localctx).x.nlabel;
				}
				break;
			case MINUS:
			case DIGIT:
			case LeftParen:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				((Bool_factorContext)_localctx).y = rel_expression(_localctx.reg, _localctx.label, _localctx.True, _localctx.False);
				((Bool_factorContext)_localctx).nreg =  ((Bool_factorContext)_localctx).y.nreg;((Bool_factorContext)_localctx).nlabel =  ((Bool_factorContext)_localctx).y.nlabel;
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(TRUE);
				System.out.printf("\tb\t%c%d\n", 'L', _localctx.True);((Bool_factorContext)_localctx).nreg = _localctx.reg;((Bool_factorContext)_localctx).nlabel = _localctx.label;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(FALSE);
				System.out.printf("\tb\t%c%d\n", 'L', _localctx.False);((Bool_factorContext)_localctx).nreg = _localctx.reg;((Bool_factorContext)_localctx).nlabel = _localctx.label;
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

	public static class Rel_expressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int True;
		public int False;
		public int nreg;
		public int nlabel;
		public Arith_expressionContext x;
		public Relation_opContext z;
		public Arith_expressionContext y;
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public Rel_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Rel_expressionContext(ParserRuleContext parent, int invokingState, int reg, int label, int True, int False) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.True = True;
			this.False = False;
		}
		@Override public int getRuleIndex() { return RULE_rel_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRel_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRel_expression(this);
		}
	}

	public final Rel_expressionContext rel_expression(int reg,int label,int True,int False) throws RecognitionException {
		Rel_expressionContext _localctx = new Rel_expressionContext(_ctx, getState(), reg, label, True, False);
		enterRule(_localctx, 20, RULE_rel_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((Rel_expressionContext)_localctx).x = arith_expression(_localctx.reg);
			setState(156);
			((Rel_expressionContext)_localctx).z = relation_op();
			setState(157);
			((Rel_expressionContext)_localctx).y = arith_expression(((Rel_expressionContext)_localctx).x.nreg);
			System.out.printf("\t%s\t%c%c%d, %c%c%d, %c%d\n", ((Rel_expressionContext)_localctx).z.s, '$', 't', ((Rel_expressionContext)_localctx).x.place, '$', 't', ((Rel_expressionContext)_localctx).y.place, 'L', _localctx.label);System.out.printf("\tb\t%c%d\n", 'L', _localctx.label-1);((Rel_expressionContext)_localctx).nreg =  ((Rel_expressionContext)_localctx).y.nreg-2;((Rel_expressionContext)_localctx).nlabel =  _localctx.label;
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
		public String s;
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
		enterRule(_localctx, 22, RULE_relation_op);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(EQUAL);
				((Relation_opContext)_localctx).s =  "beq";
				}
				break;
			case NEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(NEQUAL);
				((Relation_opContext)_localctx).s =  "bne";
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(GREATER);
				((Relation_opContext)_localctx).s =  "bgt";
				}
				break;
			case GREATEREQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(GREATEREQUAL);
				((Relation_opContext)_localctx).s =  "bge";
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(LESS);
				((Relation_opContext)_localctx).s =  "blt";
				}
				break;
			case LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(LESSEQUAL);
				((Relation_opContext)_localctx).s =  "ble";
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
		enterRule(_localctx, 24, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((Arith_expressionContext)_localctx).x = arith_term(_localctx.reg);
			setState(175);
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
		enterRule(_localctx, 26, RULE_arith_expression1);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ADD);
				setState(179);
				((Arith_expression1Context)_localctx).x = arith_term(_localctx.reg);
				setState(180);
				((Arith_expression1Context)_localctx).y = arith_expression1(((Arith_expression1Context)_localctx).x.nreg);
				System.out.printf("\tadd\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_expression1Context)_localctx).x.place);((Arith_expression1Context)_localctx).nreg =  ((Arith_expression1Context)_localctx).x.nreg-1; ((Arith_expression1Context)_localctx).place =  ((Arith_expression1Context)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(MINUS);
				setState(184);
				((Arith_expression1Context)_localctx).z = arith_term(_localctx.reg);
				setState(185);
				((Arith_expression1Context)_localctx).k = arith_expression1(((Arith_expression1Context)_localctx).z.nreg);
				System.out.printf("\tsub\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_expression1Context)_localctx).z.place);((Arith_expression1Context)_localctx).nreg =  ((Arith_expression1Context)_localctx).z.nreg-1; ((Arith_expression1Context)_localctx).place =  ((Arith_expression1Context)_localctx).z.place;
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
		enterRule(_localctx, 28, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((Arith_termContext)_localctx).x = arith_factor(_localctx.reg);
			setState(192);
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
		public Arith_factorContext m;
		public Arith_term1Context n;
		public Arith_factorContext i;
		public Arith_term1Context j;
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
		enterRule(_localctx, 30, RULE_arith_term1);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(MULTIPLY);
				setState(196);
				((Arith_term1Context)_localctx).x = arith_factor(_localctx.reg);
				setState(197);
				((Arith_term1Context)_localctx).y = arith_term1(((Arith_term1Context)_localctx).x.nreg);
				System.out.printf("\tmul\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_term1Context)_localctx).x.place);((Arith_term1Context)_localctx).nreg =  ((Arith_term1Context)_localctx).x.nreg-1; ((Arith_term1Context)_localctx).place =  ((Arith_term1Context)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(DIVIDE);
				setState(201);
				((Arith_term1Context)_localctx).m = arith_factor(_localctx.reg);
				setState(202);
				((Arith_term1Context)_localctx).n = arith_term1(((Arith_term1Context)_localctx).m.nreg);
				System.out.printf("\tdiv\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_term1Context)_localctx).m.place);((Arith_term1Context)_localctx).nreg =  ((Arith_term1Context)_localctx).m.nreg-1; ((Arith_term1Context)_localctx).place =  ((Arith_term1Context)_localctx).m.place;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(MODULO);
				setState(206);
				((Arith_term1Context)_localctx).i = arith_factor(_localctx.reg);
				setState(207);
				((Arith_term1Context)_localctx).j = arith_term1(((Arith_term1Context)_localctx).i.nreg);
				System.out.printf("\trem\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_term1Context)_localctx).i.place);((Arith_term1Context)_localctx).nreg =  ((Arith_term1Context)_localctx).i.nreg-1; ((Arith_term1Context)_localctx).place =  ((Arith_term1Context)_localctx).i.place;
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
		enterRule(_localctx, 32, RULE_arith_factor);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(MINUS);
				setState(214);
				((Arith_factorContext)_localctx).x = arith_factor(_localctx.reg);
				System.out.println("\tneg\t$" + "t" + ((Arith_factorContext)_localctx).x.place + ", $" + "t" + ((Arith_factorContext)_localctx).x.place);((Arith_factorContext)_localctx).nreg = ((Arith_factorContext)_localctx).x.nreg;((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
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
		enterRule(_localctx, 34, RULE_primary_expression);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((Primary_expressionContext)_localctx).DIGIT = match(DIGIT);
				System.out.println("\tli\t$" + "t" + _localctx.reg + ", " + (((Primary_expressionContext)_localctx).DIGIT!=null?((Primary_expressionContext)_localctx).DIGIT.getText():null));((Primary_expressionContext)_localctx).place =  _localctx.reg; ((Primary_expressionContext)_localctx).nreg =  _localctx.reg+1;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((Primary_expressionContext)_localctx).ID = match(ID);
				System.out.println("\tla\t$" + "t" + _localctx.reg + ", " + (((Primary_expressionContext)_localctx).ID!=null?((Primary_expressionContext)_localctx).ID.getText():null));System.out.println("\tlw\t$" + "t" + _localctx.reg + ", 0($" + "t" + _localctx.reg + ")" ); ((Primary_expressionContext)_localctx).place = _localctx.reg; ((Primary_expressionContext)_localctx).nreg = _localctx.reg+1;
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(LeftParen);
				setState(227);
				((Primary_expressionContext)_localctx).x = arith_expression(_localctx.reg);
				((Primary_expressionContext)_localctx).nreg = ((Primary_expressionContext)_localctx).x.nreg;((Primary_expressionContext)_localctx).place = ((Primary_expressionContext)_localctx).x.place;
				setState(229);
				match(RightParen);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(MINUS);
				setState(232);
				((Primary_expressionContext)_localctx).y = arith_expression(_localctx.reg);
				System.out.println("\tneg\t$" + "t" + ((Primary_expressionContext)_localctx).y.place + ", $" + "t" + ((Primary_expressionContext)_localctx).y.place);((Primary_expressionContext)_localctx).nreg =  ((Primary_expressionContext)_localctx).y.nreg;((Primary_expressionContext)_localctx).place = ((Primary_expressionContext)_localctx).y.place;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6u\n\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c0\n\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00d6\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00df\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00ee\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\2\2\u00f8\2&\3\2\2\2\4\66\3\2\2\2\6=\3\2\2\2\bi\3\2"+
		"\2\2\nt\3\2\2\2\fv\3\2\2\2\16\u0081\3\2\2\2\20\u0083\3\2\2\2\22\u008e"+
		"\3\2\2\2\24\u009b\3\2\2\2\26\u009d\3\2\2\2\30\u00ae\3\2\2\2\32\u00b0\3"+
		"\2\2\2\34\u00bf\3\2\2\2\36\u00c1\3\2\2\2 \u00d5\3\2\2\2\"\u00de\3\2\2"+
		"\2$\u00ed\3\2\2\2&\'\7\t\2\2\'(\7\36\2\2()\7\37\2\2)*\7 \2\2*+\b\2\1\2"+
		"+,\5\4\3\2,-\b\2\1\2-.\5\6\4\2./\7!\2\2/\3\3\2\2\2\60\61\7\b\2\2\61\62"+
		"\7$\2\2\62\63\b\3\1\2\63\64\7#\2\2\64\67\5\4\3\2\65\67\3\2\2\2\66\60\3"+
		"\2\2\2\66\65\3\2\2\2\67\5\3\2\2\289\5\b\5\29:\5\6\4\2:;\b\4\1\2;>\3\2"+
		"\2\2<>\b\4\1\2=8\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?@\7$\2\2@A\7\20\2\2AB\5"+
		"\32\16\2BC\b\5\1\2CD\7#\2\2Dj\3\2\2\2EF\b\5\1\2FG\7\7\2\2GH\7\36\2\2H"+
		"I\5\f\7\2IJ\b\5\1\2JK\7\37\2\2KL\7 \2\2LM\5\6\4\2MN\b\5\1\2NO\7!\2\2O"+
		"P\5\n\6\2PQ\b\5\1\2Qj\3\2\2\2RS\b\5\1\2ST\7\16\2\2TU\7\36\2\2UV\5\f\7"+
		"\2VW\b\5\1\2WX\7\37\2\2XY\7 \2\2YZ\5\6\4\2Z[\b\5\1\2[\\\7!\2\2\\j\3\2"+
		"\2\2]^\7\n\2\2^_\7$\2\2_`\b\5\1\2`j\7#\2\2ab\7\17\2\2bc\5\32\16\2cd\b"+
		"\5\1\2de\7#\2\2ej\3\2\2\2fg\7\13\2\2gh\b\5\1\2hj\7#\2\2i?\3\2\2\2iE\3"+
		"\2\2\2iR\3\2\2\2i]\3\2\2\2ia\3\2\2\2if\3\2\2\2j\t\3\2\2\2kl\7\5\2\2lm"+
		"\7 \2\2mn\5\6\4\2no\b\6\1\2op\7!\2\2pq\7\6\2\2qu\3\2\2\2rs\7\6\2\2su\b"+
		"\6\1\2tk\3\2\2\2tr\3\2\2\2u\13\3\2\2\2vw\5\20\t\2wx\5\16\b\2xy\b\7\1\2"+
		"y\r\3\2\2\2z{\7\34\2\2{|\b\b\1\2|}\5\20\t\2}~\5\16\b\2~\177\b\b\1\2\177"+
		"\u0082\3\2\2\2\u0080\u0082\b\b\1\2\u0081z\3\2\2\2\u0081\u0080\3\2\2\2"+
		"\u0082\17\3\2\2\2\u0083\u0084\5\24\13\2\u0084\u0085\5\22\n\2\u0085\u0086"+
		"\b\t\1\2\u0086\21\3\2\2\2\u0087\u0088\7\33\2\2\u0088\u0089\b\n\1\2\u0089"+
		"\u008a\5\24\13\2\u008a\u008b\5\22\n\2\u008b\u008c\b\n\1\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008f\b\n\1\2\u008e\u0087\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\23\3\2\2\2\u0090\u0091\7\35\2\2\u0091\u0092\5\24\13\2\u0092\u0093\b\13"+
		"\1\2\u0093\u009c\3\2\2\2\u0094\u0095\5\26\f\2\u0095\u0096\b\13\1\2\u0096"+
		"\u009c\3\2\2\2\u0097\u0098\7\3\2\2\u0098\u009c\b\13\1\2\u0099\u009a\7"+
		"\4\2\2\u009a\u009c\b\13\1\2\u009b\u0090\3\2\2\2\u009b\u0094\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c\25\3\2\2\2\u009d\u009e\5\32\16"+
		"\2\u009e\u009f\5\30\r\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\b\f\1\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00af\b\r\1\2\u00a4\u00a5\7\26"+
		"\2\2\u00a5\u00af\b\r\1\2\u00a6\u00a7\7\27\2\2\u00a7\u00af\b\r\1\2\u00a8"+
		"\u00a9\7\30\2\2\u00a9\u00af\b\r\1\2\u00aa\u00ab\7\31\2\2\u00ab\u00af\b"+
		"\r\1\2\u00ac\u00ad\7\32\2\2\u00ad\u00af\b\r\1\2\u00ae\u00a2\3\2\2\2\u00ae"+
		"\u00a4\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00aa\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1\5\36\20\2\u00b1"+
		"\u00b2\5\34\17\2\u00b2\u00b3\b\16\1\2\u00b3\33\3\2\2\2\u00b4\u00b5\7\21"+
		"\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\b\17\1\2"+
		"\u00b8\u00c0\3\2\2\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc"+
		"\5\34\17\2\u00bc\u00bd\b\17\1\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\b\17\1"+
		"\2\u00bf\u00b4\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\35"+
		"\3\2\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\b\20\1\2"+
		"\u00c4\37\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8"+
		"\5 \21\2\u00c8\u00c9\b\21\1\2\u00c9\u00d6\3\2\2\2\u00ca\u00cb\7\23\2\2"+
		"\u00cb\u00cc\5\"\22\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\b\21\1\2\u00ce\u00d6"+
		"\3\2\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\5 \21\2"+
		"\u00d2\u00d3\b\21\1\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\b\21\1\2\u00d5\u00c5"+
		"\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"!\3\2\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da\b\22\1"+
		"\2\u00da\u00df\3\2\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\b\22\1\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00d7\3\2\2\2\u00de\u00db\3\2\2\2\u00df#\3\2\2\2"+
		"\u00e0\u00e1\7\r\2\2\u00e1\u00ee\b\23\1\2\u00e2\u00e3\7$\2\2\u00e3\u00ee"+
		"\b\23\1\2\u00e4\u00e5\7\36\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e7\b\23"+
		"\1\2\u00e7\u00e8\7\37\2\2\u00e8\u00ee\3\2\2\2\u00e9\u00ea\7\f\2\2\u00ea"+
		"\u00eb\5\32\16\2\u00eb\u00ec\b\23\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e0"+
		"\3\2\2\2\u00ed\u00e2\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee"+
		"%\3\2\2\2\16\66=it\u0081\u008e\u009b\u00ae\u00bf\u00d5\u00de\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}