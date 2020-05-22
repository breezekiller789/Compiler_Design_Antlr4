//  405410100   黃晉威  編譯器Project 2

//  The grammar for Cactus language 
grammar Cactus;

//  Parser Rule
program :
            MAIN LeftParen RightParen LeftBrace declarations statements RightBrace;
declarations :
                INT ID SEMI declarations 
                |
                ;
statements :
                statement statements 
                |
                ;
statement :
            ID ASSIGNMENT arith_expression SEMI
            | IF LeftParen bool_expression RightParen LeftBrace statements RightBrace statement_prime
            | WHILE LeftParen bool_expression RightParen LeftBrace statements RightBrace
            | READ ID SEMI
            | WRITE arith_expression SEMI
            | RETURN SEMI
            ;
statement_prime : 
                    ELSE LeftBrace statements RightBrace FI
                    | FI;
bool_expression :
                    bool_term bool_expression1;
bool_expression1 :
        OR bool_term bool_expression1
        |
        ;
bool_term :
            bool_factor bool_term1;
bool_term1 :
        AND bool_factor bool_term1
        |
        ;
bool_factor :
                NEGATION bool_factor
                | rel_expression
                ;
rel_expression :
                arith_expression relation_op arith_expression;
relation_op :
                EQUAL
                | NEQUAL
                | GREATER
                | GREATEREQUAL
                | LESS
                | LESSEQUAL
                ;
arith_expression :
                    arith_term arith_expression1;
arith_expression1 :
        ADD arith_term arith_expression1
        | MINUS arith_term arith_expression1
        |
        ;
arith_term :
                arith_factor arith_term1;
arith_term1 :
        MULTIPLY arith_factor arith_term1
        | DIVIDE arith_factor arith_term1
        | MODULO arith_factor arith_term1
        |
        ;
arith_factor :
                MINUS arith_factor
                | primary_expression;
primary_expression :
                        DIGIT
                        | ID
                        | LeftParen arith_expression RightParen;
//  Lexer rules
ELSE : 'else';
FI : 'fi';
IF : 'if';
INT : 'int';
MAIN : 'main';
READ : 'read';
RETURN : 'return';
MINUS : '-';
DIGIT : [0-9]+;
WHILE : 'while';
WRITE : 'write';
ASSIGNMENT : '=';
ADD : '+';
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
LeftParen : '(';
RightParen : ')';
LeftBrace : '{';
RightBrace : '}';
COMMA : ',';
SEMI : ';';
ID : [_a-zA-Z][a-zA-Z_0-9]* | '_';

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
