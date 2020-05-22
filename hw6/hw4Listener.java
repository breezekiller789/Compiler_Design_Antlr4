// Generated from hw4.g4 by ANTLR 4.8

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hw4Parser}.
 */
public interface hw4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hw4Parser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(hw4Parser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link hw4Parser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(hw4Parser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link hw4Parser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(hw4Parser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link hw4Parser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(hw4Parser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link hw4Parser#ls}.
	 * @param ctx the parse tree
	 */
	void enterLs(hw4Parser.LsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hw4Parser#ls}.
	 * @param ctx the parse tree
	 */
	void exitLs(hw4Parser.LsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hw4Parser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(hw4Parser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link hw4Parser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(hw4Parser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link hw4Parser#rs}.
	 * @param ctx the parse tree
	 */
	void enterRs(hw4Parser.RsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hw4Parser#rs}.
	 * @param ctx the parse tree
	 */
	void exitRs(hw4Parser.RsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hw4Parser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(hw4Parser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link hw4Parser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(hw4Parser.BContext ctx);
}