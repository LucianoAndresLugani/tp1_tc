grammar TP1;

@header {
  package ANTLRules;
}

//Declaraciones de datos
//Funciones, sus prototipos y return
//Asignaciones (solo operaciones aritméticas)

INT: ('+' | '-')? [0-9]+;

FLOAT: INT | INT '.' [0-9]+ | INT ('.' [0-9]+)? 'e' INT;

CURLY_BRACKET_OPEN: '{';
CURLY_BRACKET_CLOSE: '}';

SQUARE_BRACKET_OPEN: '[';
SQUARE_BRACKET_CLOSE: ']';

PARENS_OPEN: '(';
PARENS_CLOSE: ')';

SEMICOLON: ';';
COMMA: ',';

EQUALS: '=';
COMPARISON: '==';
MINOR_THAN: '<';
MINOR_OR_EQUAL_THAN: '<=';
GREATER_OR_EQUAL_THAN: '>=';
GREATER_THAN: '>';

ADDITION: '+';
SUBSTRACTION: '-';
PRODUCT: '*';
DIVISION: '/';
MODULE: '%';

AND: '&&';
OR: '||';
NOT: '!';

DATA_TYPE_CHAR: 'char';
DATA_TYPE_SHORT: 'short';
DATA_TYPE_INT: 'int';
DATA_TYPE_LONG: 'long';
DATA_TYPE_FLOAT: 'float';
DATA_TYPE_DOUBLE: 'double';
DATA_TYPE_VOID: 'void';

CS_IF: 'if';
CS_FOR: 'for';
CS_WHILE: 'while';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

s: instructions ;

instructions: declarations instructions
  | code_block instructions
  | function instructions
  | assignation SEMICOLON
  | if_structure instructions
  | while_structure instructions
  | for_structure instructions
  |
  ;

assignation: IDENTIFIER EQUALS expression;

code_block: CURLY_BRACKET_OPEN instructions CURLY_BRACKET_CLOSE ;

data_type: DATA_TYPE_CHAR | DATA_TYPE_DOUBLE | DATA_TYPE_FLOAT | DATA_TYPE_INT | DATA_TYPE_LONG | DATA_TYPE_SHORT | DATA_TYPE_VOID;

arithmetic_operator: ADDITION | SUBSTRACTION | DIVISION | PRODUCT | MODULE;

logical_operator: COMPARISON | MINOR_THAN | MINOR_OR_EQUAL_THAN | GREATER_OR_EQUAL_THAN | GREATER_THAN | AND | OR ;

expression: arithmetical_operation
  | token_expression
  ;

token_expression: IDENTIFIER | INT | FLOAT;

logical_expression: token_expression
  | NOT token_expression
  ;

arithmetical_operation: token_expression arithmetic_operator arithmetical_operation
  | token_expression
  ;

logical_operation: logical_expression logical_operator logical_operation
  | logical_expression
  ;

variable_declaration: assignation //indentifier equals expression
  | IDENTIFIER
  ;


variable_list: variable_declaration COMMA variable_list
  | variable_declaration
  ;

declarations: data_type variable_list SEMICOLON;


parameter_list: data_type IDENTIFIER COMMA parameter_list
  | data_type IDENTIFIER
  |
  ;

parameter_list_for_function_declaration: data_type COMMA parameter_list_for_function_declaration
  | data_type IDENTIFIER COMMA parameter_list_for_function_declaration
  | data_type IDENTIFIER
  | data_type
  |
  ;

function_declaration: function_definition
  | data_type IDENTIFIER PARENS_OPEN parameter_list_for_function_declaration PARENS_CLOSE
  ;

function_definition: data_type IDENTIFIER PARENS_OPEN parameter_list PARENS_CLOSE;

function: function_declaration SEMICOLON
  | function_definition code_block
  ;

if_structure: CS_IF PARENS_OPEN logical_operation PARENS_CLOSE code_block ;

while_structure: CS_WHILE PARENS_OPEN logical_operation PARENS_CLOSE code_block ;

for_initialization: data_type assignation
  | assignation
  | token_expression
  | 
  ;

for_expression: IDENTIFIER ADDITION ADDITION 
  | 
  ;  


for_structure: CS_FOR PARENS_OPEN for_initialization SEMICOLON logical_operation SEMICOLON for_expression PARENS_CLOSE code_block;




COMMENT : '//'.*?'\n' -> skip;
WS : [ \n\t] -> skip;

