grammar Operaciones;

inicio:
        expr NUEVALINEA             #impresionExpresion
        |
        ID IGUAL expr NUEVALINEA    #asignacion
        |
        NUEVALINEA                  #espacio
        ;
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


ID: [a-z][a-zA-Z0-9]*;
IGUAL: '=';
MAS:    '+';
MENOS:  '-';
POR: '*';
DIV: '/';
INT:    [0-9]+;
PAR_A:  '(';
PAR_C:  ')';
NUEVALINEA: [\r\n]+;
ESPACIOS: [ \t]+ -> skip;