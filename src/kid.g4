
grammar kid;

program
   :consts? functions? glavprog
   ;
glavprog
    :'main()' block
    ;
block
   : '{' (statement)* '}'
   ;

consts
   : 'const' vars   (';' 'const' vars) * ';'
   ;

vars
   :   type ident ('=' expression)?
   ;
type
    : 'char'
    | 'int'
    | 'bool'
    | 'float'
    ;
functions
   : 'funct' ident '('parametr')' block
   ;
parametr
    : (vars (','vars)*)?
    ;
statement
   : assignstmt | writestmt';' | ifstmt | whilestmt| forstmt | continuestmt';' | expression';' | callFunct';' | consts | vars';' | functions
   ;
callFunct
    : ident '(' (expression(',' expression)*)? ')'
    ;
assignstmt
   : ident '=' expression
   ;

writestmt
   : 'write' '(' (expression(',' expression)*)? ')'
   ;


ifstmt
   : 'if''(' condition (('and'|'or')condition)*')' block ('else' block)?
   ;

whilestmt
   : 'while' '('condition (('and'|'or')condition)* ')' block
   ;
forstmt
    : 'for' '('(vars|expression)(',' ( vars|expression))*';'condition (('and'|'or')condition)*';'expression')'block
    ;
breakstmt
	: 'break'
	;

continuestmt
	: 'continue'
	;
condition
   : expression
   |callFunct
   | expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression
   ;

expression
   : ('+' | '-')? term (('+' | '-') term)*
   ;
term
   : factor (('*' | '/'|'%') factor)*
   ;

factor
   : ident
   |literal
   | '(' factor ')'
   | assignstmt
   |callFunct
   ;
literal
	:	integerLiteral
	|	floatingPointLiteral
	|	booleanLiteral
	|	charLiteral
	|	nullLiteral
	;
integerLiteral
    :   NUMBER
    ;
floatingPointLiteral
    :  NUMBER '.' NUMBER*
    ;
booleanLiteral
	:	'true'
	|	'false'
	;
charLiteral
    :  '\'' STRING '\''
    ;
nullLiteral
    :   'null'
    ;
ident
   : STRING (STRING| NUMBER)*
   ;
number
   : NUMBER
   ;


STRING
   : [a-zA-Z] [a-zA-Z]*
   ;


NUMBER
   : [0-9] +
   ;


WS
   : [ \t\r\n] -> skip
   ;


BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;