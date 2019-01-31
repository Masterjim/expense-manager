lexer grammar LexerRules;

ADD: 'add';

NAME: LETTER (LETTER | DIGIT)* ;

fragment LETTER: 'A'..'Z' | 'a'..'z' | '_' ;
fragment DIGIT: '0'..'9' ;