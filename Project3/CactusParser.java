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
			setState(58);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((StatementContext)_localctx).ID = match(ID);
				setState(61);
				match(ASSIGNMENT);
				setState(62);
				((StatementContext)_localctx).x = arith_expression(_localctx.reg);
				System.out.println("\tla\t$" + "t" + ((StatementContext)_localctx).x.nreg + ", " + (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));System.out.println("\tsw\t$" + "t" + ((StatementContext)_localctx).x.place + ", " + "0($" + "t" + ((StatementContext)_localctx).x.nreg + ")" );((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).x.nreg-1; ((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(64);
				match(SEMI);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("\t#if");
				setState(67);
				match(IF);
				setState(68);
				match(LeftParen);
				setState(69);
				((StatementContext)_localctx).m = bool_expression(_localctx.reg, _localctx.label+3, _localctx.label, _localctx.label+1);
				System.out.println("L" + _localctx.label + ":\t#then");
				setState(71);
				match(RightParen);
				setState(72);
				match(LeftBrace);
				setState(73);
				((StatementContext)_localctx).y = statements(((StatementContext)_localctx).m.nreg, ((StatementContext)_localctx).m.nlabel);
				System.out.printf("\tb\tL%d\n", _localctx.label+2);System.out.printf("L%d:\t#else\n", _localctx.label+1);
				setState(75);
				match(RightBrace);
				setState(76);
				((StatementContext)_localctx).n = else_statement(((StatementContext)_localctx).y.nreg, ((StatementContext)_localctx).y.nlabel);
				System.out.printf("L%d:\t#end if\n", _localctx.label+2);((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).m.nreg;((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).m.nlabel;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				System.out.printf("L%d:\t#while\n", _localctx.label);
				setState(80);
				match(WHILE);
				setState(81);
				match(LeftParen);
				setState(82);
				((StatementContext)_localctx).i = bool_expression(_localctx.reg, _localctx.label+3, _localctx.label+1, _localctx.label+2);
				System.out.printf("L%d:\t#while body\n", _localctx.label+1);
				setState(84);
				match(RightParen);
				setState(85);
				match(LeftBrace);
				setState(86);
				((StatementContext)_localctx).z = statements(((StatementContext)_localctx).i.nreg, ((StatementContext)_localctx).i.nlabel);
				System.out.printf("\tb\tL%d\n", _localctx.label);System.out.printf("L%d:\t#end while\n", _localctx.label+2);((StatementContext)_localctx).nreg =  ((StatementContext)_localctx).z.nreg; ((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).z.nlabel;
				setState(88);
				match(RightBrace);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(READ);
				setState(91);
				((StatementContext)_localctx).ID = match(ID);
				System.out.println("\tli\t$" + "v0" + ", " + "5");System.out.println("\tsyscall");System.out.println("\tla\t$" + "t" + _localctx.reg + ", " + (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));System.out.println("\tsw\t$" + "v0" + ", " + "0($" + "t" + _localctx.reg + ")" );((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(93);
				match(SEMI);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(WRITE);
				setState(95);
				((StatementContext)_localctx).k = arith_expression(_localctx.reg);
				System.out.println("\tmove $" + "a0" + ", " + "$" + "t" + ((StatementContext)_localctx).k.place);System.out.println("\tli\t$" + "v0" + ", " + "1");System.out.println("\tsyscall");((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(97);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(RETURN);
				System.out.println("\tli\t$" + "v0" + ", " + "10");System.out.println("\tsyscall");((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel =  _localctx.label;
				setState(101);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ELSE);
				setState(105);
				match(LeftBrace);
				setState(106);
				((Else_statementContext)_localctx).x = statements(_localctx.reg, _localctx.label);
				((Else_statementContext)_localctx).nreg =  ((Else_statementContext)_localctx).x.nreg; ((Else_statementContext)_localctx).nlabel =  ((Else_statementContext)_localctx).x.nlabel;
				setState(108);
				match(RightBrace);
				setState(109);
				match(FI);
				}
				break;
			case FI:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(FI);
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
			setState(114);
			((Bool_expressionContext)_localctx).x = bool_term(_localctx.reg, _localctx.label, _localctx.True, _localctx.False);
			setState(115);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(OR);
				System.out.printf("%d\n\tb\tL%d\n", _localctx.True, _localctx.label);System.out.printf("L%d:\n", _localctx.label);
				setState(120);
				((Bool_expression1Context)_localctx).x = bool_term(_localctx.reg, _localctx.label+1, _localctx.True, _localctx.False);
				setState(121);
				((Bool_expression1Context)_localctx).y = bool_expression1(((Bool_expression1Context)_localctx).x.nreg, ((Bool_expression1Context)_localctx).x.nlabel, _localctx.True, _localctx.False);
				((Bool_expression1Context)_localctx).nreg = ((Bool_expression1Context)_localctx).x.nreg;((Bool_expression1Context)_localctx).nlabel = ((Bool_expression1Context)_localctx).x.nlabel;
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				System.out.printf("%d\n\tb\tL%d\n", _localctx.True, _localctx.False);((Bool_expression1Context)_localctx).nreg =  _localctx.reg; ((Bool_expression1Context)_localctx).nlabel =  _localctx.label;
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
			setState(127);
			((Bool_termContext)_localctx).x = bool_factor(_localctx.reg, _localctx.label, _localctx.True, _localctx.False);
			setState(128);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(AND);
				System.out.printf("%d\n\tb\tL%d\n", _localctx.label, _localctx.False);System.out.printf("L%d:\n", _localctx.label);
				setState(133);
				((Bool_term1Context)_localctx).x = bool_factor(_localctx.reg, _localctx.label+1, _localctx.label, _localctx.False);
				setState(134);
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(NEGATION);
				setState(141);
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
				setState(144);
				((Bool_factorContext)_localctx).y = rel_expression(_localctx.reg, _localctx.label, _localctx.True, _localctx.False);
				((Bool_factorContext)_localctx).nreg =  ((Bool_factorContext)_localctx).y.nreg;((Bool_factorContext)_localctx).nlabel =  ((Bool_factorContext)_localctx).y.nlabel;
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(TRUE);
				System.out.printf("\tb\t%c%d\n", 'L', _localctx.True);((Bool_factorContext)_localctx).nreg = _localctx.reg;((Bool_factorContext)_localctx).nlabel = _localctx.label;
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
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
			setState(153);
			((Rel_expressionContext)_localctx).x = arith_expression(_localctx.reg);
			setState(154);
			((Rel_expressionContext)_localctx).z = relation_op();
			setState(155);
			((Rel_expressionContext)_localctx).y = arith_expression(((Rel_expressionContext)_localctx).x.nreg);
			System.out.printf("\t%s\t%c%c%d, %c%c%d, %c", ((Rel_expressionContext)_localctx).z.s, '$', 't', ((Rel_expressionContext)_localctx).x.place, '$', 't', ((Rel_expressionContext)_localctx).y.place, 'L');((Rel_expressionContext)_localctx).nreg =  ((Rel_expressionContext)_localctx).y.nreg-2;((Rel_expressionContext)_localctx).nlabel =  _localctx.label;
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(EQUAL);
				((Relation_opContext)_localctx).s =  "beq";
				}
				break;
			case NEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(NEQUAL);
				((Relation_opContext)_localctx).s =  "bne";
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(GREATER);
				((Relation_opContext)_localctx).s =  "bgt";
				}
				break;
			case GREATEREQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(GREATEREQUAL);
				((Relation_opContext)_localctx).s =  "bge";
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(LESS);
				((Relation_opContext)_localctx).s =  "blt";
				}
				break;
			case LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
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
			setState(172);
			((Arith_expressionContext)_localctx).x = arith_term(_localctx.reg);
			setState(173);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(ADD);
				setState(177);
				((Arith_expression1Context)_localctx).x = arith_term(_localctx.reg);
				setState(178);
				((Arith_expression1Context)_localctx).y = arith_expression1(((Arith_expression1Context)_localctx).x.nreg);
				System.out.printf("\tadd\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_expression1Context)_localctx).x.place);((Arith_expression1Context)_localctx).nreg =  ((Arith_expression1Context)_localctx).x.nreg-1; ((Arith_expression1Context)_localctx).place =  ((Arith_expression1Context)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(MINUS);
				setState(182);
				((Arith_expression1Context)_localctx).z = arith_term(_localctx.reg);
				setState(183);
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
			setState(189);
			((Arith_termContext)_localctx).x = arith_factor(_localctx.reg);
			setState(190);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(MULTIPLY);
				setState(194);
				((Arith_term1Context)_localctx).x = arith_factor(_localctx.reg);
				setState(195);
				((Arith_term1Context)_localctx).y = arith_term1(((Arith_term1Context)_localctx).x.nreg);
				System.out.printf("\tmul\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_term1Context)_localctx).x.place);((Arith_term1Context)_localctx).nreg =  ((Arith_term1Context)_localctx).x.nreg-1; ((Arith_term1Context)_localctx).place =  ((Arith_term1Context)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(DIVIDE);
				setState(199);
				((Arith_term1Context)_localctx).m = arith_factor(_localctx.reg);
				setState(200);
				((Arith_term1Context)_localctx).n = arith_term1(((Arith_term1Context)_localctx).m.nreg);
				System.out.printf("\tdiv\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', _localctx.reg-1, '$', 't', _localctx.reg-1, '$', 't', ((Arith_term1Context)_localctx).m.place);((Arith_term1Context)_localctx).nreg =  ((Arith_term1Context)_localctx).m.nreg-1; ((Arith_term1Context)_localctx).place =  ((Arith_term1Context)_localctx).m.place;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(MODULO);
				setState(204);
				((Arith_term1Context)_localctx).i = arith_factor(_localctx.reg);
				setState(205);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(MINUS);
				setState(212);
				((Arith_factorContext)_localctx).x = arith_factor(_localctx.reg);
				System.out.println("\tneg\t$" + "t" + ((Arith_factorContext)_localctx).x.place + ", $" + "t" + ((Arith_factorContext)_localctx).x.place);((Arith_factorContext)_localctx).nreg = ((Arith_factorContext)_localctx).x.nreg;((Arith_factorContext)_localctx).place = ((Arith_factorContext)_localctx).x.place;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				((Primary_expressionContext)_localctx).DIGIT = match(DIGIT);
				System.out.println("\tli\t$" + "t" + _localctx.reg + ", " + (((Primary_expressionContext)_localctx).DIGIT!=null?((Primary_expressionContext)_localctx).DIGIT.getText():null));((Primary_expressionContext)_localctx).place =  _localctx.reg; ((Primary_expressionContext)_localctx).nreg =  _localctx.reg+1;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				((Primary_expressionContext)_localctx).ID = match(ID);
				System.out.println("\tla\t$" + "t" + _localctx.reg + ", " + (((Primary_expressionContext)_localctx).ID!=null?((Primary_expressionContext)_localctx).ID.getText():null));System.out.println("\tlw\t$" + "t" + _localctx.reg + ", 0($" + "t" + _localctx.reg + ")" ); ((Primary_expressionContext)_localctx).place = _localctx.reg; ((Primary_expressionContext)_localctx).nreg = _localctx.reg+1;
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(LeftParen);
				setState(225);
				((Primary_expressionContext)_localctx).x = arith_expression(_localctx.reg);
				((Primary_expressionContext)_localctx).nreg = ((Primary_expressionContext)_localctx).x.nreg;((Primary_expressionContext)_localctx).place = ((Primary_expressionContext)_localctx).x.place;
				setState(227);
				match(RightParen);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(MINUS);
				setState(230);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u009a\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00be\n\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00dd\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00ec\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\2\2\u00f6\2&\3\2\2\2\4\66\3\2\2\2\6<\3\2\2\2\bh\3\2\2\2\n"+
		"r\3\2\2\2\ft\3\2\2\2\16\177\3\2\2\2\20\u0081\3\2\2\2\22\u008c\3\2\2\2"+
		"\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30\u00ac\3\2\2\2\32\u00ae\3\2\2\2\34"+
		"\u00bd\3\2\2\2\36\u00bf\3\2\2\2 \u00d3\3\2\2\2\"\u00dc\3\2\2\2$\u00eb"+
		"\3\2\2\2&\'\7\t\2\2\'(\7\36\2\2()\7\37\2\2)*\7 \2\2*+\b\2\1\2+,\5\4\3"+
		"\2,-\b\2\1\2-.\5\6\4\2./\7!\2\2/\3\3\2\2\2\60\61\7\b\2\2\61\62\7$\2\2"+
		"\62\63\b\3\1\2\63\64\7#\2\2\64\67\5\4\3\2\65\67\3\2\2\2\66\60\3\2\2\2"+
		"\66\65\3\2\2\2\67\5\3\2\2\289\5\b\5\29:\5\6\4\2:=\3\2\2\2;=\b\4\1\2<8"+
		"\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\7$\2\2?@\7\20\2\2@A\5\32\16\2AB\b\5\1"+
		"\2BC\7#\2\2Ci\3\2\2\2DE\b\5\1\2EF\7\7\2\2FG\7\36\2\2GH\5\f\7\2HI\b\5\1"+
		"\2IJ\7\37\2\2JK\7 \2\2KL\5\6\4\2LM\b\5\1\2MN\7!\2\2NO\5\n\6\2OP\b\5\1"+
		"\2Pi\3\2\2\2QR\b\5\1\2RS\7\16\2\2ST\7\36\2\2TU\5\f\7\2UV\b\5\1\2VW\7\37"+
		"\2\2WX\7 \2\2XY\5\6\4\2YZ\b\5\1\2Z[\7!\2\2[i\3\2\2\2\\]\7\n\2\2]^\7$\2"+
		"\2^_\b\5\1\2_i\7#\2\2`a\7\17\2\2ab\5\32\16\2bc\b\5\1\2cd\7#\2\2di\3\2"+
		"\2\2ef\7\13\2\2fg\b\5\1\2gi\7#\2\2h>\3\2\2\2hD\3\2\2\2hQ\3\2\2\2h\\\3"+
		"\2\2\2h`\3\2\2\2he\3\2\2\2i\t\3\2\2\2jk\7\5\2\2kl\7 \2\2lm\5\6\4\2mn\b"+
		"\6\1\2no\7!\2\2op\7\6\2\2ps\3\2\2\2qs\7\6\2\2rj\3\2\2\2rq\3\2\2\2s\13"+
		"\3\2\2\2tu\5\20\t\2uv\5\16\b\2vw\b\7\1\2w\r\3\2\2\2xy\7\34\2\2yz\b\b\1"+
		"\2z{\5\20\t\2{|\5\16\b\2|}\b\b\1\2}\u0080\3\2\2\2~\u0080\b\b\1\2\177x"+
		"\3\2\2\2\177~\3\2\2\2\u0080\17\3\2\2\2\u0081\u0082\5\24\13\2\u0082\u0083"+
		"\5\22\n\2\u0083\u0084\b\t\1\2\u0084\21\3\2\2\2\u0085\u0086\7\33\2\2\u0086"+
		"\u0087\b\n\1\2\u0087\u0088\5\24\13\2\u0088\u0089\5\22\n\2\u0089\u008a"+
		"\b\n\1\2\u008a\u008d\3\2\2\2\u008b\u008d\b\n\1\2\u008c\u0085\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\7\35\2\2\u008f\u0090\5\24"+
		"\13\2\u0090\u0091\b\13\1\2\u0091\u009a\3\2\2\2\u0092\u0093\5\26\f\2\u0093"+
		"\u0094\b\13\1\2\u0094\u009a\3\2\2\2\u0095\u0096\7\3\2\2\u0096\u009a\b"+
		"\13\1\2\u0097\u0098\7\4\2\2\u0098\u009a\b\13\1\2\u0099\u008e\3\2\2\2\u0099"+
		"\u0092\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a\25\3\2\2"+
		"\2\u009b\u009c\5\32\16\2\u009c\u009d\5\30\r\2\u009d\u009e\5\32\16\2\u009e"+
		"\u009f\b\f\1\2\u009f\27\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00ad\b\r\1"+
		"\2\u00a2\u00a3\7\26\2\2\u00a3\u00ad\b\r\1\2\u00a4\u00a5\7\27\2\2\u00a5"+
		"\u00ad\b\r\1\2\u00a6\u00a7\7\30\2\2\u00a7\u00ad\b\r\1\2\u00a8\u00a9\7"+
		"\31\2\2\u00a9\u00ad\b\r\1\2\u00aa\u00ab\7\32\2\2\u00ab\u00ad\b\r\1\2\u00ac"+
		"\u00a0\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a6\3\2"+
		"\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\31\3\2\2\2\u00ae\u00af"+
		"\5\36\20\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\b\16\1\2\u00b1\33\3\2\2\2"+
		"\u00b2\u00b3\7\21\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\5\34\17\2\u00b5"+
		"\u00b6\b\17\1\2\u00b6\u00be\3\2\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\5"+
		"\36\20\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\b\17\1\2\u00bb\u00be\3\2\2"+
		"\2\u00bc\u00be\b\17\1\2\u00bd\u00b2\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\5 \21"+
		"\2\u00c1\u00c2\b\20\1\2\u00c2\37\3\2\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00c5"+
		"\5\"\22\2\u00c5\u00c6\5 \21\2\u00c6\u00c7\b\21\1\2\u00c7\u00d4\3\2\2\2"+
		"\u00c8\u00c9\7\23\2\2\u00c9\u00ca\5\"\22\2\u00ca\u00cb\5 \21\2\u00cb\u00cc"+
		"\b\21\1\2\u00cc\u00d4\3\2\2\2\u00cd\u00ce\7\24\2\2\u00ce\u00cf\5\"\22"+
		"\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\b\21\1\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d4\b\21\1\2\u00d3\u00c3\3\2\2\2\u00d3\u00c8\3\2\2\2\u00d3\u00cd\3"+
		"\2\2\2\u00d3\u00d2\3\2\2\2\u00d4!\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7"+
		"\5\"\22\2\u00d7\u00d8\b\22\1\2\u00d8\u00dd\3\2\2\2\u00d9\u00da\5$\23\2"+
		"\u00da\u00db\b\22\1\2\u00db\u00dd\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00d9"+
		"\3\2\2\2\u00dd#\3\2\2\2\u00de\u00df\7\r\2\2\u00df\u00ec\b\23\1\2\u00e0"+
		"\u00e1\7$\2\2\u00e1\u00ec\b\23\1\2\u00e2\u00e3\7\36\2\2\u00e3\u00e4\5"+
		"\32\16\2\u00e4\u00e5\b\23\1\2\u00e5\u00e6\7\37\2\2\u00e6\u00ec\3\2\2\2"+
		"\u00e7\u00e8\7\f\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00ea\b\23\1\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb\u00e0\3\2\2\2\u00eb\u00e2\3\2"+
		"\2\2\u00eb\u00e7\3\2\2\2\u00ec%\3\2\2\2\16\66<hr\177\u008c\u0099\u00ac"+
		"\u00bd\u00d3\u00dc\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}