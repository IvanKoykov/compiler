
grammar kid;

program
   : consts? functions?   glavprog
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
functions
    : 'funct' type ident '('parametr')' block
    ;
type
    : 'char'
    | 'int'
    | 'bool'
    | 'float'
    ;

parametr
    : (vars (','vars)*)?
    ;
statement
   : assignstmt | writestmt';' | ifstmt | whilestmt| forstmt | continuestmt';' | expression';' | callFunct';' | consts | vars';' | functions
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
expressionunion
    :   (expression(',' expression)*)?
    ;
ifstmt
   : 'if''(' conditionunion')' block ('else' block)?
   ;

whilestmt
   : 'while' '('conditionunion ')' block
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
   : expression #Exp
   |callFunct #CallFunctionCondition
   | expression op=('==' | '!=' | '<' | '<=' | '>' | '>=') expression #Compar
   ;
conditionunion
    :condition (opp=('and'|'or')condition)* #Or
    ;

expression
   :
    factor #FactorExp
   |expression op=('+' | '-') expression # SummExpression
   |expression op=('*' | '/'|'%') expression # FactorMult
   ;

factor
   : ident #IdentNameExp
   |literal #LiteralExp
   | '(' factor ')' #ParenFactor
   | assignstmt #AssigmntExp
   |callFunct #CallFunctionFactor
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
    :  '\'' (STRING | NUMBER)'\''
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
//LETER
//    :[a-zA-z]
//    ;
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
    //expression
    //    :    ident
    //        |literal
    //        | '(' factor ')'
    //        | assignstmt
    //        |callFunct
    //        |expression op = ('*' | '/' | '%') expression # MultipliesExpression
    //        |expression op = ( '+' | '-' ) expression # SummExpressi
    //        ;
