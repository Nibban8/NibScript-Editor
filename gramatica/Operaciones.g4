grammar Operaciones;


inicio: DEF MAIN LLAVE_A block LLAVE_C;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : declaracion
 | asignacion
 | if_stat
 | else_stat
 | while_stat
 | log
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

declaracion : LET ID (IGUAL expr)? SEMI;
asignacion  : ID IGUAL expr SEMI;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

else_stat : ELSE if_stat;

condition_block
 : expr stat_block
 ;


stat_block
 : LLAVE_A block LLAVE_C
 | stat
 ;

while_stat
 : WHILE expr stat_block
 ;

log
 : PRINT expr SEMI
 ;

expr
 : expr POW expr           #powExpr
 | MENOS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(MAS | MENOS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;

DEF : 'def';
MAIN : 'miau';
LET : 'let';

OR : '||';
AND : '&&';

EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';

MAS : '+';
MENOS : '-';
MULT : '*';
DIV : '/';

MOD : '%';

POW : '^';
NOT : '!';

SEMI : ';';
IGUAL : '=';
OPAR : '(';
CPAR : ')';
LLAVE_A : '{';
LLAVE_C : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
PRINT : 'print';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
COMMENT
 : '/**' .*? '**/' ~[ ]* -> skip
 ;
SPACE
 : [ \t\r\n] -> skip
 ;
OTHER
 : .
 ;