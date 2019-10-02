grammar rules;

//BATCH 1
literal: STRINGLITERAL | INTEGER;
relation_name: IDENTIFIER;
attribute_name: IDENTIFIER;
operand: attribute_name | literal;
type: 'VARCHAR' '(' INTEGER ')' | 'INTEGER';
attribute_list: attribute_name (',' attribute_name)*;
typed_attribute_list: attribute_name type  (',' attribute_name type)*;
open_cmd: 'OPEN' relation_name;
close_cmd: 'CLOSE' relation_name;
write_cmd: 'WRITE' relation_name;
exit_cmd: 'EXIT';

//BATCH 2
condition: conjunction ('||' conjunction)*;
conjunction: comparison ('&&' comparison)*;
comparison: operand OP operand | '(' condition ')';

//BATCH 3
expr: atomic_expr | selection | projection | renaming | union | difference | product | natural_join;
atomic_expr: relation_name | '(' expr ')';
selection: 'select' '(' condition ')' atomic_expr;
projection: 'project' '(' attribute_list ')' atomic_expr;
renaming: 'rename' '(' attribute_list ')' atomic_expr;
union: atomic_expr '+' atomic_expr;
difference: atomic_expr '-' atomic_expr;
product: atomic_expr '*' atomic_expr;
natural_join: atomic_expr '&' atomic_expr;

//BATCH 4
show_cmd : 'SHOW' atomic_expr;
create_cmd: 'CREATE TABLE' relation_name '('typed_attribute_list')' 'PRIMARY KEY' '('attribute_list')';
update_cmd: 'UPDATE' relation_name 'SET' attribute_name '=' literal (',' attribute_name '=' literal)* 'WHERE' condition; //tells me comma is extraneous when testing inputs from slides?? works with no comma
insert_cmd: 'INSERT INTO' relation_name 'VALUES FROM' '('literal (',' literal)*')' | 'INSERT INTO' relation_name 'VALUES FROM RELATION' expr;
delete_cmd: 'DELETE FROM' relation_name 'WHERE' condition;

//BATCH 5
command: (show_cmd | create_cmd | update_cmd | insert_cmd | delete_cmd | open_cmd | close_cmd | write_cmd | exit_cmd)';';
query: relation_name '<-' expr;
program: (query | command);



//BATCH 0
OP: '==' | '!=' | '<' | '>' | '<=' | '>=';
INTEGER: (DIGIT)+;
DIGIT: [0-9];
IDENTIFIER: ALPHA (ALPHA | DIGIT)*;
STRINGLITERAL: '"' ALPHA (ALPHA | DIGIT)* '"';
ALPHA: [a-zA-z_];
WHITESPACE: [ \t\r\n] -> skip;
/*
*/