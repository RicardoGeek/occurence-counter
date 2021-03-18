package com.ricardogeek.grammar;

// Generated from digitsParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link digitsParser}.
 */
public interface digitsParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link digitsParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(digitsParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link digitsParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(digitsParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link digitsParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(digitsParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link digitsParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(digitsParser.InputContext ctx);
}