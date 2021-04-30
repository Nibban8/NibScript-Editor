grammar Operaciones;


inicio: FUNC ID LLAVE_A cuerpo LLAVE_C;

printConent : expr #printExpr | strings #printString;
functElse: ELSE LLAVE_A cuerpo LLAVE_C;
functIF: IF PAR_A condition PAR_C LLAVE_A cuerpo LLAVE_C (functElse)? #ifHeader ;

cuerpo: linea+;

condition: expr comparation expr;

linea:
        functIF                           #functionIF
        |
        PRINT printConent SEMI      #impresion
        |
        LET ID (IGUAL expr)? SEMI   #declaracion
        |
        ID IGUAL expr SEMI          #asignacion
        |
        SEMI                        #espacio
        ;


comparation: EQ | NEQ | EQ_G | EQ_L | GREATER | LESS ;

strings : (STRING | STRING MAS)+;

expr :
        expr op = (POR | DIV) expr       #MulDiv
        |
        expr op = (MAS | MENOS) expr     #SumRes
        |
        INT                         #int
        |
        ID                          #id
        |
        PAR_A expr PAR_C            #parentesis
        ;



EQ : '==';
GREATER : '>';
LESS : '<';
EQ_G : '>=';
EQ_L : '<=';
NEQ : '!=';



IF : 'if';
ELSE : 'else';
LET : 'let';
FUNC : 'function';
PRINT: 'print';
LLAVE_A : '{';
LLAVE_C : '}';
ID: [a-z][a-zA-Z0-9]*;
IGUAL: '=';
MAS:    '+';
MENOS:  '-';
POR: '*';
DIV: '/';
INT:    [0-9]+;
PAR_A:  '(';
PAR_C:  ')';
SEMI: ';';
STRING: '"' (ESC | .)*? '"';
fragment ESC: '\\' [btnr"\\];
ESPACIOS: [ \n\t]+ -> skip;