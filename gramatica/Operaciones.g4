grammar Operaciones;


cuerpo: FUNC ID LLAVE_A inicio* LLAVE_C;



inicio:
        PRINT (expr | strings)  SEMI      #impresionExpresion
        |
        LET ID (IGUAL expr)? SEMI   #declaracion
        |
        ID IGUAL expr SEMI          #asignacion
        |
        SEMI                        #espacio
        ;

strings : STRING | (STRING MAS)+;

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