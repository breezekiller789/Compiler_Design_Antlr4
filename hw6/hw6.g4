grammar hw6;
@header {
import java.util.*;
}

s :
        x = l '.' y = r WS? EOF {System.out.println($x.lsr+$y.rsr);}
        ;

l returns [int lsr] :
        x = b y = ls[$x.bval] { $lsr = $y.lss; }
        ;

ls [int lsi] returns [int lss] :
        x = b y = ls[$lsi * 2 + $x.bval] { $lss = $y.lss; }
        | { $lss = $lsi; }
        ;

r returns [float rsr] :
        x = b y = rs[$x.bval, $x.bc] { $rsr = $y.rss; }
        ;

rs [int rsi, int rsc] returns [float rss] :
        x = b y = rs[$rsi * 2 + $x.bval, $rsc * $x.bc] { $rss = $y.rss; }
        | { $rss = (float)$rsi / $rsc; }
        ;

b returns [int bval, int bc] :
        '0' { $bval = 0; $bc = 2; }
        | '1' { $bval = 1; $bc = 2; }
        ;

WS : [\t\n\r]+;
