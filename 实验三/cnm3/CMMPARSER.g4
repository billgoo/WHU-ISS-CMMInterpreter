grammar CMMPARSER;

//PROGRAM
prog        :   stmt* ;

stmt        :   varDecl | ifStmt | whileStmt | breakStmt | assignStmt |
                readStmt | writeStmt | stmtBlock ;
stmtBlock   :   LEFT_BRACE stmt* RIGHT_BRACE ;

//DECLARE STMT
varDecl     :   type varList SEMICOLONE ;
type        :   INT | DOUBLE | type LEFT_ARRAY_BRACE expr RIGHT_ARRAY_BRACE;
varList     :   ( ID | varAssign | varArray)  (COMMA (ID | varAssign | varArray))* ;
varArray    :   ID LEFT_ARRAY_BRACE expr RIGHT_ARRAY_BRACE ;
varAssign   :   ( ID | ( ID LEFT_ARRAY_BRACE expr RIGHT_ARRAY_BRACE ) )
                ASSIGNMENT
                expr
            ;

//FLOW CONTROL STMT
ifStmt      :   IF expr stmt ( ELSE stmt )? ;
whileStmt   :   WHILE expr stmt ;
breakStmt   :   BREAK SEMICOLONE ;
readStmt    :   READ LEFT_LITTLE_BRACE
                ( ID | ( ID LEFT_ARRAY_BRACE expr RIGHT_ARRAY_BRACE ) )
                RIGHT_LITTLE_BRACE SEMICOLONE ;
writeStmt   :   WRITE LEFT_LITTLE_BRACE expr RIGHT_LITTLE_BRACE SEMICOLONE ;

//ASSIGN STMT
assignStmt  :   value ASSIGNMENT expr SEMICOLONE ;
value       :   ( ID LEFT_ARRAY_BRACE expr RIGHT_ARRAY_BRACE ) | ID ;
constant    :   INTCONSTANT | DOUBLECONSTANT | TRUE | FALSE | HEXCONSTANT | HEXFLOATCONSTANT ;

//BOTTOM EXPR
expr        :   MINUS expr
            |   expr ( MULTIPLICATION | DIVISION ) expr
            |   expr MOD expr
            |   expr ( PLUS | MINUS ) expr
            |   expr ( MORETHAN | MORE_EQUAL | LESSTHAN | LESS_EQUAL ) expr
            |   expr ( EQUAL | UNEQUAL ) expr
            |   ID
            |   ID LEFT_ARRAY_BRACE expr RIGHT_ARRAY_BRACE
            |   constant
            |   LEFT_LITTLE_BRACE expr RIGHT_LITTLE_BRACE
            ;

//RESERVE WORD
IF	    :	'if';
ELSE	:	'else';
WHILE	:	'while';
READ	:	'read';
WRITE	:	'write';
INT	    :	'int';
DOUBLE	:	'double';
TRUE	:	'true'|'TRUE';
FALSE	:	'false'|'FALSE';
BREAK   :   'break';

//OPERATOR
PLUS	        :	'+';
MINUS	        :	'-';
MULTIPLICATION  :   '*';
DIVISION        :   '/';
MOD             :   '%' ;
ASSIGNMENT  	:	'=';
LESSTHAN	    :	'<';
LESS_EQUAL  	:	'<=';
MORETHAN	    :	'>';
MORE_EQUAL  	:	'>=';
EQUAL	        :	'==';
UNEQUAL	        :	'!=' | '<>';

//DELIMITER
LEFT_LITTLE_BRACE   :	'(';
RIGHT_LITTLE_BRACE	:	')';
SEMICOLONE  	:	';';
COMMA	        :	',';
LEFT_BRACE  	:	'{';
RIGHT_BRACE 	:	'}';

LEFT_ARRAY_BRACE    :	'[';
RIGHT_ARRAY_BRACE	:	']';

//IDENTIFIER
ID	:	LETTER|(LETTER(LETTER|DecDigit|'_')*(LETTER|DecDigit)) ;

WS  :  [ \t\n\r]+ -> skip ;
LINE_COMMENT  :	'//' ~[\r\n]* ('\r'? '\n'|EOF) -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;

//CONSTANT
fragment
LETTER
      :   [A-Z]
      |   [a-z]
      ;
INTCONSTANT : ('0' | [1-9](DecDigit)*)  ;
HEXCONSTANT : '0' ('x'|'X') HexDigit+  ;
fragment
DecDigit : [0-9];
fragment
HexDigit : ([0-9]|[a-f]|[A-F]) ;

DOUBLECONSTANT
    :   INTCONSTANT '.' (DecDigit)*
    |   ('0'..'9')+ '.'
	;

HEXFLOATCONSTANT
    :   HEXCONSTANT '.' HexDigit*
    ;