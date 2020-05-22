// The grammar for Cactus language 

grammar Cactus;

// Parser rules
token : (ELSE | FI | IF | INT | MAIN | RETURN | WHILE | READ | WRITE | DIGIT
| ADD | MINUS | MULTIPLY | DIVIDE | MODULO | EQUAL | NEQUAL | GREATER
| GREATEREQUAL | LESS | LESSEQUAL | AND | OR | NEGATION | ASSIGNMENT | LeftParen
| RightParen | LeftBrace | RightBrace | COMMA | SEMI | Whitespace | Newline 
| BlockComment | LineComment | ID)* ;

ID : [_a-zA-Z][a-zA-Z_0-9]* | '_';
ELSE : 'else';
FI : 'fi';
IF : 'if';
INT : 'int';
MAIN : 'main';
RETURN : 'return';
WHILE : 'while';
READ : 'read';
WRITE : 'write';
DIGIT : [0-9]+;
ADD : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MODULO : '%';
EQUAL : '==';
NEQUAL : '!=';
GREATER : '>';
GREATEREQUAL : '>=';
LESS : '<';
LESSEQUAL : '<=';
AND : '&&';
OR : '||';
NEGATION : '!';
ASSIGNMENT : '=';
LeftParen : '(';
RightParen : ')';
LeftBrace : '{';
RightBrace : '}';
COMMA : ',';
SEMI : ';';
/* NUM : [0-9]+; */

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;


