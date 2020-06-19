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
        x = statement[$reg, $label] y = statements [$x.nreg, $x.nlabel] {$nreg = $y.nreg;$nlabel=$y.nlabel;}
        | {$nreg = $reg; $nlabel = $label;}
        ;
statement [int reg, int label] returns [int nreg, int nlabel] :
        ID ASSIGNMENT x = arith_expression[$reg] {System.out.println("\tla\t$" + "t" + $x.nreg + ", " + $ID.text);System.out.println("\tsw\t$" + "t" + $x.place + ", " + "0($" + "t" + $x.nreg + ")" );$nreg = $x.nreg-1; $nlabel = $label;} SEMI
        | {System.out.println("\t#if");} IF LeftParen m = bool_expression[$reg, $label+4, $label, $label+1] {System.out.println("L" + $label + ":\t#then");} RightParen LeftBrace y = statements[$m.nreg, $m.nlabel] {System.out.printf("\tb\tL%d\n", $label+2);System.out.printf("L%d:\t#else\n", $label+1);} RightBrace n = else_statement[$y.nreg, $y.nlabel] {System.out.printf("L%d:\t#end if\n", $label+2);$nreg = $m.nreg;$nlabel = $label+4;}
        | {System.out.printf("L%d:\t#while\n", $label+1);} WHILE LeftParen i = bool_expression[$reg, $label+5, $label+2, $label+3] {System.out.printf("L%d:\t#while body\n", $label+2);} RightParen LeftBrace z = statements[$i.nreg, $i.nlabel] {System.out.printf("\tb\tL%d\n", $label+1);System.out.printf("L%d:\t#end while\n", $label+3);$nreg = $z.nreg; $nlabel = $z.nlabel;} RightBrace
        | READ ID {System.out.println("\tli\t$" + "v0" + ", " + "5");System.out.println("\tsyscall");System.out.println("\tla\t$" + "t" + $reg + ", " + $ID.text);System.out.println("\tsw\t$" + "v0" + ", " + "0($" + "t" + $reg + ")" );$nreg = $reg;$nlabel = $label;} SEMI
        | WRITE k = arith_expression[$reg] {System.out.println("\tmove $" + "a0" + ", " + "$" + "t" + $k.place);System.out.println("\tli\t$" + "v0" + ", " + "1");System.out.println("\tsyscall");$nreg = $reg;$nlabel = $label;} SEMI
        | RETURN {System.out.println("\tli\t$" + "v0" + ", " + "10");System.out.println("\tsyscall");$nreg = $reg;$nlabel = $label;} SEMI
        ;
else_statement [int reg, int label] returns [int nreg, int nlabel] : 
        ELSE LeftBrace x = statements[$reg, $label] {$nreg = $x.nreg; $nlabel = $x.nlabel;} RightBrace FI
        | FI {$nreg=$reg;$nlabel=$label;}
        ;
bool_expression [int reg, int label, int True, int False] returns [int nreg, int nlabel] :
        /* x = bool_term[$reg, $label, $True, $False] {System.out.printf("\tb\tL%d\n", $x.nlabel);} y = bool_expression1[$x.nreg, $x.nlabel, $True, $False] {$nreg = $x.nreg;$nlabel = $x.nlabel;} */
        x = bool_term[$reg, $label, $True, $False] y = bool_expression1[$x.nreg, $x.nlabel, $True, $False] {$nreg = $x.nreg;$nlabel = $x.nlabel;}
        ;
bool_expression1 [int reg, int label, int True, int False] returns [int nreg, int nlabel] :
        OR {System.out.printf("L%d:\n", $label);System.out.printf("\tb\t%c%d\n", 'L', $True);System.out.printf("%c%d:\n", 'L', $label-1);} x = bool_term[$reg, $label+1, $True, $False] y = bool_expression1[$x.nreg, $x.nlabel, $True, $False] {$nreg=$x.nreg;$nlabel=$x.nlabel;}
        /* OR {System.out.printf("\tb\tL%d\n", $label);System.out.printf("L%d:\n", $label);} x = bool_term[$reg, $label+1, $True, $label] {System.out.printf("\tb\tL%d\n", $False);} y = bool_expression1[$x.nreg, $x.nlabel, $True, $False] {$nreg=$x.nreg;$nlabel=$x.nlabel;} */
        /* OR {System.out.printf("L%d:\n", $label);} x = bool_term[$reg, $label+1, $True, $label] y = bool_expression1[$x.nreg, $x.nlabel, $True, $False] {$nreg=$x.nreg;$nlabel=$x.nlabel;} */
        /* | {System.out.printf("%d\n\tb\tL%d\n", $True, $False);$nreg = $reg; $nlabel = $label;} */
        | {System.out.printf("%c%d:\n\t%c\t%c%d\n", 'L', $label, 'b', 'L', $True);System.out.printf("%c%d:\n\t%c\t%c%d\n", 'L', $label-1, 'b', 'L', $False);$nreg = $reg; $nlabel = $label;}
        ;
bool_term [int reg, int label, int True, int False] returns [int nreg, int nlabel] :
        x = bool_factor[$reg, $label, $True, $False] y = bool_term1[$x.nreg, $x.nlabel, $True, $False] {$nreg = $x.nreg;$nlabel = $x.nlabel;}
        ;
bool_term1 [int reg, int label, int True, int False] returns [int nreg, int nlabel] :
        AND {System.out.printf("L%d:\n", $label);System.out.printf("\tb\tL%d\n", $label-1);System.out.printf("L%d:\n", $label-1);} x = bool_factor[$reg, $label+1, $label, $False] y = bool_term1[$x.nreg, $x.nlabel, $True, $False] {$nreg = $x.nreg;$nlabel = $x.nlabel;}
        /* AND {System.out.printf("L%d:\n", $label);} x = bool_factor[$reg, $label+1, $label, $False] y = bool_term1[$x.nreg, $x.nlabel, $True, $False] {$nreg = $x.nreg;$nlabel = $x.nlabel;} */
        /* | {System.out.printf("haha\n");$nreg = $reg; $nlabel = $label;} */
        | {$nreg = $reg; $nlabel = $label;}
        ;
bool_factor [int reg, int label, int True, int False] returns [int nreg, int nlabel] :
        NEGATION x = bool_factor[$reg, $label, $False, $True] {$nreg = $x.nreg;$nlabel = $x.nlabel;}
        | y = rel_expression[$reg, $label, $True, $False] {$nreg = $y.nreg;$nlabel = $y.nlabel;}
        | TRUE {System.out.printf("\tb\t%c%d\n", 'L', $True);$nreg=$reg;$nlabel=$label;}
        | FALSE {System.out.printf("\tb\t%c%d\n", 'L', $False);$nreg=$reg;$nlabel=$label;}
        ;
rel_expression [int reg, int label, int True, int False] returns [int nreg, int nlabel] :
        /* x = arith_expression[$reg] z = relation_op y = arith_expression[$x.nreg] {System.out.printf("\t%s\t%c%c%d, %c%c%d, %c%d\n", $z.s, '$', 't', $x.place, '$', 't', $y.place, 'L', $True);System.out.printf("\tb\tL%d\n", $False);$nreg = $y.nreg-2;$nlabel = $label;} */
        x = arith_expression[$reg] z = relation_op y = arith_expression[$x.nreg] {System.out.printf("\t%s\t%c%c%d, %c%c%d, %c%d\n", $z.s, '$', 't', $x.place, '$', 't', $y.place, 'L', $label);System.out.printf("\tb\t%c%d\n", 'L', $label-1);$nreg = $y.nreg-2;$nlabel = $label;}
        ;
relation_op returns [String s] :
        EQUAL {$s = "beq";}
        | NEQUAL {$s = "bne";}
        | GREATER {$s = "bgt";}
        | GREATEREQUAL {$s = "bge";}
        | LESS {$s = "blt";}
        | LESSEQUAL {$s = "ble";}
        ;
arith_expression [int reg] returns [int nreg, int place] :
        x = arith_term[$reg] y = arith_expression1[$x.nreg] {$nreg = $x.nreg; $place = $x.place;};
arith_expression1 [int reg] returns [int nreg, int place] :
        ADD x = arith_term[$reg] y = arith_expression1[$x.nreg] {System.out.printf("\tadd\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', $reg-1, '$', 't', $reg-1, '$', 't', $x.place);$nreg = $x.nreg-1; $place = $x.place;}
        | MINUS z = arith_term[$reg] k = arith_expression1[$z.nreg] {System.out.printf("\tsub\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', $reg-1, '$', 't', $reg-1, '$', 't', $z.place);$nreg = $z.nreg-1; $place = $z.place;}
        | {$nreg = $reg;}
        ;
arith_term [int reg] returns [int nreg, int place] :
        x = arith_factor[$reg] y = arith_term1[$x.nreg] {$nreg = $x.nreg;$place = $x.place;};
arith_term1 [int reg] returns [int nreg, int place] :
        MULTIPLY x = arith_factor[$reg] y = arith_term1[$x.nreg] {System.out.printf("\tmul\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', $reg-1, '$', 't', $reg-1, '$', 't', $x.place);$nreg = $x.nreg-1; $place = $x.place;}
        | DIVIDE m = arith_factor[$reg] n = arith_term1[$m.nreg] {System.out.printf("\tdiv\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', $reg-1, '$', 't', $reg-1, '$', 't', $m.place);$nreg = $m.nreg-1; $place = $m.place;}
        | MODULO i = arith_factor[$reg] j = arith_term1[$i.nreg]{System.out.printf("\trem\t%c%c%d, %c%c%d, %c%c%d\n", '$', 't', $reg-1, '$', 't', $reg-1, '$', 't', $i.place);$nreg = $i.nreg-1; $place = $i.place;}
        | {$nreg = $reg;}
        ;
arith_factor [int reg] returns [int nreg, int place] :
        MINUS x = arith_factor[$reg] {System.out.println("\tneg\t$" + "t" + $x.place + ", $" + "t" + $x.place);$nreg=$x.nreg;$place=$x.place;}
        | y = primary_expression[$reg] {$nreg = $y.nreg; $place = $y.place;};
primary_expression [int reg] returns [int nreg, int place] :
        DIGIT {System.out.println("\tli\t$" + "t" + $reg + ", " + $DIGIT.text);$place = $reg; $nreg = $reg+1;}
        | ID {System.out.println("\tla\t$" + "t" + $reg + ", " + $ID.text);System.out.println("\tlw\t$" + "t" + $reg + ", 0($" + "t" + $reg + ")" ); $place=$reg; $nreg=$reg+1;}
        | LeftParen x = arith_expression[$reg] {$nreg=$x.nreg;$place=$x.place;} RightParen
        | MINUS y = arith_expression[$reg] {System.out.println("\tneg\t$" + "t" + $y.place + ", $" + "t" + $y.place);$nreg = $y.nreg;$place=$y.place;}
        ;
//  Lexer rules
TRUE : 'true';
FALSE : 'false';
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
