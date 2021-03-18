package com.ricardogeek.grammar;
// Generated from digitsParser.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link digitsParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class digitsParserBaseListener implements digitsParserListener {
	private int previous = -1;

	private List<List<Integer>> repsList = new LinkedList<List<Integer>>();
	private List<Integer> reps = new LinkedList<Integer>();

	public String getOutput() {
		String output = "";

		for (List<Integer> items : repsList) {
			if (items.size() == 1) {
				output += items.get(0) + " ";
			} else {
				output += items.get(0) + " FOR " + items.size() + " ";
			}
		}

		output = output.trim();

		return output;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void enterDigit(digitsParser.DigitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void exitDigit(digitsParser.DigitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void enterInput(digitsParser.InputContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void exitInput(digitsParser.InputContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void visitTerminal(TerminalNode node) {
		int current = (node.getText().equals("<EOF>")) ? -1: Integer.valueOf(node.getText());

		if (current == previous || previous == -1) {
			reps.add(current);
		} else {
			if (repsList.size() != 0) {
				reps.add(previous);
			}
			repsList.add(reps);
			reps = new LinkedList<Integer>();
		}

		previous = current;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public void visitErrorNode(ErrorNode node) { }
}