:newspaper: **constraints** ..  

:label: ***types of constraints***  

MySQL CONSTRAINTs are :
1. NOT NULL
   1. MySQL NOT NULL constraint allows to specify that a column can not contain any NULL value. 
2. UNIQUE
   1. The UNIQUE constraint in MySQL does not allow to insert a duplicate value in a column. The UNIQUE constraint maintains the uniqueness of a column in a table. More than one UNIQUE column can be used in a table. unique allows one or null value.
3. PRIMARY KEY
   1. A PRIMARY KEY constraint for a table enforces the table to accept unique data for a specific column. It does not have null value.
4. FOREIGN KEY
   1. A FOREIGN KEY in MySQL creates a link between two tables by one specific column of both tables. The specified column in one table must be a PRIMARY KEY and referred by the column of another table known as FOREIGN KEY.
5. CHECK
   1. A CHECK constraint controls the values in the associated column. The CHECK constraint determines whether the value is valid or not from a logical expression.
6. DEFAULT
   1. MySQL table, each column must contain a value ( including a NULL). While inserting data into a table, if no value is supplied to a column, then the column gets the value set as DEFAULT.