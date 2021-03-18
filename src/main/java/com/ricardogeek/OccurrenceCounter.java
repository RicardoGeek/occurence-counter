package com.ricardogeek;

import com.ricardogeek.grammar.digitsLexer;
import com.ricardogeek.grammar.digitsParser;
import com.ricardogeek.grammar.digitsParserBaseListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class OccurrenceCounter {

    public String countOcurrences(final String input) {
        digitsLexer dl = new digitsLexer(CharStreams.fromString(input));
        CommonTokenStream cts = new CommonTokenStream(dl);

        digitsParser dp = new digitsParser(cts);
        digitsParserBaseListener listener = new digitsParserBaseListener();
        dp.addParseListener(listener);
        dp.digit();

        return listener.getOutput();
    }
}
