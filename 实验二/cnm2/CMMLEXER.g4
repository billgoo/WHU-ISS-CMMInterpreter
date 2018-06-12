grammar CMMLEXER;

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
UNEQUAL	        :	'!=';

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
LINE_COMMENT  :	'//' ~[\r\n]* ('\r'? '\n'|EOF) ;
COMMENT : '/*' .*? '*/' ;

//CONSTANT
fragment
LETTER
      :   [A-Z]
      |   [a-z]
      ;
DECIMAL : ('0' | [1-9](DecDigit)*)  ;
HEX : '0' ('x'|'X') HexDigit+  ;
fragment
DecDigit : [0-9];
fragment
HexDigit : ([0-9]|[a-f]|[A-F]) ;

FLOATING
    :   DECIMAL '.' (DecDigit)*
    |   ('0'..'9')+ '.'
    |   HEX '.' HexDigit*
	;

