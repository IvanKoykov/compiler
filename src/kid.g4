
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
   : assignstmt | writestmt';' | ifstmt | whilestmt| forstmt | expression';' | callFunct';' | consts | vars';' | functions
   ;
callFunct
    : ident '(' expressionunion ')'
    ;
assignstmt
   : ident '=' expression
   ;

writestmt
   : 'write' '(' expressionunion ')'
   ;


ifstmt
   : 'if''(' conditionunion')' block ('else' block)?
   ;

whilestmt
   : 'while' '('conditionunion ')' block
   ;
forstmt
    : 'for' '('beginFor';'conditionunion';'expression')'block
    ;
breakstmt
	: 'break'
	;

continuestmt
	: 'continue'
	;
beginFor
    :(vars|expression)(',' ( vars|expression))*
    ;

condition
   : expression
   |callFunct
   | expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression
   ;
 conditionunion
    :condition (('and'|'or')condition)*
    ;
 expressionunion
    : (expression(',' expression)*)?
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