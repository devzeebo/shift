grammar Shift;

@header {
package com.bearleft.shift.gen;
}

fragment DecimalLiteral: '0' | [1-9] [0-9]*;
fragment Exponent: [eE] [+\-]? DecimalLiteral;
fragment EscapeSequence:
   '\\' ([btnfr"'\\]
			| ('0'..'3') ('0'..'7') ('0'..'7')
			| ('0'..'7') ('0'..'7')
			| ('0'..'7')
		);
INTEGER_LITERAL: DecimalLiteral | '0' [0-7]* | '0x' [0-9a-zA-Z]*;
FLOAT_LITERAL: DecimalLiteral '.' [0-9]* Exponent?
	| DecimalLiteral Exponent;
STRING_LITERAL: ('\'' ( EscapeSequence | ~['\r\n\\] )* '\'')
	| ('"' ( EscapeSequence | ~["\r\n\\] )* '"')
;
WS: (' ' | '\t' | '\u000C' ) -> skip ;
NEWLINE: [\r\n] | '\r\n';
COMMENT: '/*' .*? '*/' -> skip ;
LINE_COMMENT: '//' ~[\n\r]* ('\r\n' | [\n\r])? -> skip ;

// Keywords
CLASS: 'class';
FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
DEF: 'def';
NEW: 'new';
RETURN: 'return';
STATIC: 'static';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';

LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
SEMI: ';';
COMMA: ',';
DOT: '.';

EQ: '=';
AMP: '&';
BAR: '|';
CARET: '^';
PERCENT: '%';
PLUS: '+';
SUB: '-';
STAR: '*';
SLASH: '/';

BANG: '!';
TILDE: '~';
QUESTION: '?';
COLON: ':';

EQEQ: '==';
SPACESHIP: '<=>';
AMPAMP: '&&';
BARBAR: '||';
PLUSPLUS: '++';
SUBSUB: '--';
STARSTAR: '**';
PLUSEQ: '+=';
SUBEQ: '-=';
STAREQ: '*=';
SLASHEQ: '/=';
AMPEQ: '&=';
BAREQ: '|=';
CARETEQ: '^=';
PERCENTEQ: '%=';
BANGEQ: '!=';
GT: '>';
LT: '<';

LTLT: '<<';
GTGT: '>>';
GTGTGT: '>>>';
LTE: '<=';
GTE: '>=';

IDENTIFIER:
	[$a-zA-Z_] [$0-9a-zA-Z_]*
;

compilationUnit: (classDef | NEWLINE)* EOF;

lineTerminator: NEWLINE | SEMI;

classDef: CLASS IDENTIFIER '{' (classMember | lineTerminator)* '}' ;

classMember: constructor | method | field;

method:
	DEF IDENTIFIER EQ '{' parameterList? blockStatement? '}';

constructor:
	DEF NEW EQ '{' parameterList? blockStatement? '}';

field:
	DEF IDENTIFIER (EQ expression)?;

parameterList: argumentList '->';
argumentList: IDENTIFIER (COMMA IDENTIFIER)*;
blockStatement:
	(statement? lineTerminator)+;

statement:
	expression
|   forLoop
|   whileLoop
|   ifStatement
;

expression:
	expression (DOT | QUESTION DOT | STAR DOT) IDENTIFIER '(' argumentList? ')' #methodCallExpression
|   expression (DOT | QUESTION DOT | STAR DOT) IDENTIFIER #fieldAccess
|   expression '(' argumentList? ')' #callExpression
|   (BANG | TILDE | PLUS | SUB) expression #unaryExpression
|   (SUBSUB | PLUSPLUS) expression #prefixExpression
|   expression (SUBSUB | PLUSPLUS) #postfixExpression
|   expression STARSTAR expression #powerExpression
|   expression (STAR | SLASH | PERCENT) expression #binaryExpression
|   expression (PLUS | SUB) expression #binaryExpression
|   expression (LTLT | GTGT | GTGTGT) expression #binaryExpression
|   expression (LT | LTE | GT | GTE | EQEQ | BANGEQ | SPACESHIP) expression #comparisonExpression
|   expression (AMP | BAR | CARET | AMPEQ | BAREQ | CARETEQ) expression #bitwiseExpression
|   expression (AMPAMP | BARBAR) expression #booleanExpression
|   expression EQ expression #assignmentExpression
|   DEF IDENTIFIER EQ expression #declarationExpression
|   STRING_LITERAL #stringExpression
|   INTEGER_LITERAL #intExpression
|   FLOAT_LITERAL #floatExpression
|   NULL #nullExpression
|   IDENTIFIER #variableExpression;

forLoop:
	FOR '(' expression? SEMI expression? SEMI expression? ')' NEWLINE* '{'
		blockStatement?
	'}'
;

whileLoop:
	WHILE '(' expression ')' NEWLINE* '{'
		blockStatement?
	'}'
;

ifStatement:
	IF '(' expression ')' NEWLINE* (('{'
		blockStatement?
	'}') | statement)
	elseStatement?
;

elseStatement:
	ELSE NEWLINE* (('{'
		blockStatement?
	'}') | statement '}')
;