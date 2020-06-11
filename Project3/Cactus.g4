//  405410100   黃晉威  編譯器Project 3

//  The grammar for Cactus language 
grammar Cactus;
@header{
    import java.util.*;
}

//  Parser Rule
program :
            MAIN LeftParen RightParen LeftBrace {System.out.println("\t.data");} declarations {System.out.println("\t"+".text");System.out.println("main:");} statements[0, 1] RightBrace;
declarations :
                INT ID {System.out.println($ID.text + ":" + "\t.word 0");} SEMI declarations 
                |
                ;
statements[int reg, int label] returns [int nreg, int nlabel] :
                /* x = statement[$reg, $label] {$nreg = $x.nreg; $nlabel = $x.nlabel;} */
                x = statement[$reg, $label] statements [$x.nreg, $x.nlabel]
                | {$nreg = $reg; $nlabel = $label;}
                ;
statement [int reg, int label] returns [int nreg, int nlabel] :
            ID ASSIGNMENT x = arith_expression[$reg] {System.out.println("la\t$" + "t" + $x.nreg + ", " + $ID.text);System.out.println("sw\t$" + "t" + $x.place + ", " + "0($" + "t" + $x.nreg + ")" );$nreg = $x.nreg-1; $nlabel = $label;} SEMI
            /* | IF LeftParen bool_expression RightParen LeftBrace y = statements[$reg, $label] {$nreg = $y.nreg;$nlabel = $y.nlabel;} RightBrace else_statement */
            | WHILE LeftParen bool_expression RightParen LeftBrace z = statements[$reg, $label] {$nreg = $z.nreg; $nlabel = $z.nlabel;} RightBrace
            | READ ID SEMI
            | WRITE k = arith_expression[$reg] SEMI
            | RETURN SEMI
            ;
/* else_statement : */ 
                    /* ELSE LeftBrace x = statements[$reg, $label] {$nreg = $x.nreg; $nlabel = $x.nlabel;} RightBrace FI */
                    /* ELSE statements RightBrace FI */
                    /* | FI; */
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
                /* | rel_expression */
                ;
/* rel_expression : */
/*                 arith_expression relation_op arith_expression; */
relation_op :
                EQUAL
                | NEQUAL
                | GREATER
                | GREATEREQUAL
                | LESS
                | LESSEQUAL
                ;
arith_expression [int reg] returns [int nreg, int place] :
                    x = arith_term[$reg] y = arith_expression1[$x.nreg] {$nreg = $x.nreg; $place = $x.place;};
arith_expression1 [int reg] returns [int nreg, int place] :
        ADD x = arith_term[$reg] y = arith_expression1[$x.nreg] {System.out.printf("add\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', $reg-1, '$', 't', $reg-1, '$', 't', $x.place);$nreg = $x.nreg-1; $place = $x.place;}
        | MINUS z = arith_term[$reg] k = arith_expression1[$z.nreg] {System.out.printf("sub\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', $reg-1, '$', 't', $reg-1, '$', 't', $z.place);$nreg = $z.nreg-1; $place = $z.place;}
        | {$nreg = $reg;}
        ;
arith_term [int reg] returns [int nreg, int place] :
                x = arith_factor[$reg] y = arith_term1[$x.nreg] {$nreg = $x.nreg;$place = $x.place;};
arith_term1 [int reg] returns [int nreg, int place] :
        MULTIPLY x = arith_factor[$reg] y = arith_term1[$x.nreg] {System.out.printf("mul\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', $reg-1, '$', 't', $reg-1, '$', 't', $x.place);$nreg = $x.nreg-1; $place = $x.place;}
        | DIVIDE arith_factor[$reg] arith_term1[$reg]
        | MODULO arith_factor[$reg] arith_term1[$reg]
        | {$nreg = $reg;}
        ;
arith_factor [int reg] returns [int nreg, int place] :
                MINUS x = arith_factor[$reg] {System.out.println("neg\t$" + "t" + $x.place + ", $" + "t" + $x.place);$nreg=$x.nreg;$place=$x.place;}
                | y = primary_expression[$reg] {$nreg = $y.nreg; $place = $y.place;};
primary_expression [int reg] returns [int nreg, int place] :
                        DIGIT {System.out.println("li\t$" + "t" + $reg + ", " + $DIGIT.text);$place = $reg; $nreg = $reg+1;}
                        | ID {System.out.println("la\t$" + "t" + $reg + ", " + $ID.text);System.out.println("lw\t$" + "t" + $reg + ", 0($" + "t" + $reg + ")" ); $place=$reg; $nreg=$reg+1;}
                        | LeftParen x = arith_expression[$reg] {$nreg=$x.nreg;$place=$x.place;} RightParen
                        | MINUS y = arith_expression[$reg] {System.out.println("neg\t$" + "t" + $y.place + ", $" + "t" + $y.place);$nreg = $y.nreg;$place=$y.place;}
                        ;
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
