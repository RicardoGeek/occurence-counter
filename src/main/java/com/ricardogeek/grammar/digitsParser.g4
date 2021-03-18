parser grammar digitsParser;

options {
    tokenVocab = digitsLexer;
}

digit
     : input EOF;

input
     : NUMBER+;
