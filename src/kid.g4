
grammar kid;

program
   :consts? functions? glavprog
   ;
glavprog
    :'main()' block
    ;
block
   : '{' consts? (vars';')? functions* statement '}'
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
   : (assignstmt | writestmt';'  | ifstmt | whilestmt| forstmt | expression';' | callFunct';')?
   ;
callFunct
    : ident '(' expressionunion ')'
    ;
assignstmt
   : ident '=' expression
   ;

writestmt
   : 'write' '(' expression ')'
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
    :(expression|vars)
    ;

condition
   : expression
   |callFunct
   | expression ('==' | '!=' | '<' | '<=' | '>' | '>=') expression
   ;
 conditionunion
    :condition (('and'|'or')condition)*
    ;
expression
   : ('+' | '-')? term (('+' | '-') term)*
   ;
expressionunion
    : (expression(',' expression)*)?
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
    :   number
    ;
floatingPointLiteral
    :   number.number*
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