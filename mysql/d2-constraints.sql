USE SAKILA;
DESCRIBE ACTOR;
SELECT * FROM ADDRESS;
SELECT ADDRESS2, SUM(CITY_ID) FROM ADDRESS
GROUP BY ADDRESS2;
create database testdb;
use testdb;

-- unique
create table newbook_mast
(
	book_id varchar(15) unique
)
-- allows one on more null values
-- does not allow duplicates
select * from newbook_mast;
insert into newbook_mast values (null);
insert into newbook_mast values ('test');
insert into newbook_mast values (null);
insert into newbook_mast values ('null');

create table newbook_mast01
(
	book_id varchar(15) unique,
    bookname varchar(15) unique
)
-- allows one on more null values
-- does not allow duplicates
select * from newbook_mast01;
SET SQL_SAFE_UPDATES = 0;
delete from newbook_mast01;
insert into newbook_mast01 values ('test','test1');
insert into newbook_mast01 values ('test','test2');
insert into newbook_mast01 values ('test1','test');
insert into newbook_mast01 values ('test2','test2');

-- primary key
-- does not allow null value
-- does not allow duplicates
create table newbook_mast1
(
	book_id varchar(15) primary key
);
insert into newbook_mast1 values (null);
insert into newbook_mast1 values ('test');
insert into newbook_mast1 values ('null');

-- a table can have only one primary key
-- Multiple primary key defined	0.000 sec
create table newbook_mast10
(
	book_id varchar(15) primary key,
    bookname varchar(15) primary key
);

insert into newbook_mast1 values (null);
insert into newbook_mast1 values ('test');
insert into newbook_mast1 values ('null');
select * from newbook_mast1;

-- not null constraint
create table newbook_mast_nn
(
	book_id varchar(15) not null,
    book_name varchar(15) 
)
-- allows one on more null values
-- does not allow duplicates
select * from newbook_mast_nn;
insert into newbook_mast_nn values (null,'monk');
insert into newbook_mast_nn values (null,null);
insert into newbook_mast_nn values ('null',null);
insert into newbook_mast_nn values (null,'null');

--A CHECK constraint controls the values in the associated column. The CHECK constraint determines whether the value is valid or not from a logical expression.
-- IT ALLOWS NULL VALUES.

create table countries
(
	c_id varchar(15) not null,
   c_name varchar(15) check (c_name  in ('US','IN','UK')),
   c_pin int
);
SELECT * FROM countries;
insert into countries values ('c1','US',1);
insert into countries values ('c2','IN',2);
insert into countries values ('c1',NULL,1);
-- Check constraint 'countries_chk_1' is violated
insert into countries values ('c1','JA',1);

create table countries1
(
	c_id varchar(15) not null,
   c_name varchar(15) NOT NULL check (c_name  in ('US','IN','UK')),
   c_pin int
);
--  Column 'c_name' cannot be null
insert into countries1 values ('c1',NULL,1);

-- ALTER TABLE FOR INCLUDING PRIMARY KEY constraint
create table newbook_mast11
(
	book_id varchar(15) ,
   bookname varchar(15) 
);

ALTER TABLE newbook_mast11
MODIFY BOOK_ID INT PRIMARY KEY;

-- DOES NOT REMOVE CONSTRAINT
ALTER TABLE newbook_mast11
MODIFY BOOK_ID INT ;

ALTER TABLE newbook_mast11
DROP PRIMARY KEY;

insert into newbook_mast11 values (null,'monk');
insert into newbook_mast11 values (1,null);
-- Duplicate entry '1' for key 'newbook_mast11.PRIMARY'
insert into newbook_mast11 values (1,null);
SELECT * FROM newbook_mast11;
DELETE FROM newbook_mast11;
DESCRIBE newbook_mast11;

ALTER TABLE newbook_mast11
DROP COLUMN BOOKNAME;

ALTER TABLE newbook_mast11
ADD COLUMN BOOKNAME VARCHAR(15);

ALTER TABLE newbook_mast11
ADD COLUMN BOOKNAME VARCHAR(15) PRIMARY KEY;
-- Duplicate entry '' for key 'newbook_mast11.PRIMARY'


insert into newbook_mast11 values (1,'MONK');
insert into newbook_mast11 values (1,'MONKS');
insert into newbook_mast11 values (2,'MONK');
-- Duplicate entry 'MONK' for key 'newbook_mast11.PRIMARY'

-- DISPLAY THE CONSTRAINT DETAILS
SHOW CREATE TABLE newbook_mast11;
SHOW CREATE TABLE Newbook_mast1;

--DISPLAY DETAILED INFORMATION OF CONSTRAINTS
SELECT * FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_NAME = 'Newbook_mast1';

SELECT TABLE_NAME, COLUMN_NAME, CONSTRAINT_NAME, CONSTRAINT_SCHEMA FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_NAME = 'Newbook_mast1';

-- FOREIGN KEY
--  A FOREIGN KEY in MySQL creates a link between two tables by one specific column of both tables. The specified column in one table must be a PRIMARY KEY and referred by the column of another table known as FOREIGN KEY.
-- ALLOWS ONE OR MORE NULL VALUES

CREATE TABLE newauthor1
(aut_id varchar(8) NOT NULL  PRIMARY KEY ,
aut_name varchar(50) NOT NULL
);
DESCRIBE NEWAUTHOR1;

CREATE TABLE NEWBOOK2
(BOOK_id varchar(8) NOT NULL  PRIMARY KEY ,
BOOK_name varchar(50) NOT NULL,
AUTHOR_ID varchar(8),
FOREIGN KEY (AUTHOR_ID) REFERENCES newauthor1(aut_id)
);

insert into newauthor1 values (2,'MONK');
insert into newauthor1 values (1,'MONKS');
SELECT * FROM NEWAUTHOR1;
SELECT * FROM NEWBOOK2;
DELETE FROM NEWBOOK2;
DROP TABLE NEWBOOK2;
insert into NEWBOOK2 values (2,'BNAME', 2);
-- Cannot add or update a child row: a foreign key constraint fails (`testdb`.`NEWBOOK2`, CONSTRAINT `NEWBOOK2_ibfk_1` FOREIGN KEY (`AUTHOR_ID`) REFERENCES `newauthor1` (`aut_id`))
insert into NEWBOOK2 values (1,'MONKS',3);
insert into NEWBOOK2 values (2,'MONKS',NULL);
insert into NEWBOOK2 values (3,'SKY',NULL);
insert into NEWBOOK2 values (1,'SKY',1);
insert into NEWBOOK2 values (10,'SKY',1);
-- Duplicate entry '10' for key 'newbook2.PRIMARY'
insert into NEWBOOK2 values (10,'SKY',2);

-- multiple foreign keys
drop table Table1;
create table Table1
(
  id varchar(2),
  name varchar(2),
  PRIMARY KEY (id)
);

Create table Table1_Addr
(
  addid varchar(2),
  Address varchar(2),
  PRIMARY KEY (addid)
);

drop table Table1_sal;
Create table Table1_sal
(
  FOREIGN KEY (addid) REFERENCES Table1_Addr(addid),
  salid varchar(2),
  addid varchar(2),
  id varchar(2),
  PRIMARY KEY (salid),
  FOREIGN KEY (id) REFERENCES Table1(id)
)

select * from Table1_sal;

-- ON DELETE CASCADE
-- CASCADE: Delete or update the row from the parent table and automatically delete or update the matching rows in the child table. Both ON DELETE CASCADE and ON UPDATE CASCADE are supported. 
use livedb;
DROP TABLE ROOMS;
DROP TABLE BUILDINGS;


CREATE TABLE buildings (
    building_no INT PRIMARY KEY AUTO_INCREMENT,
    building_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);
CREATE TABLE rooms (
    room_no INT PRIMARY KEY AUTO_INCREMENT,
    room_name VARCHAR(255) NOT NULL,
    building_no INT  NULL,
    FOREIGN KEY (building_no)
        REFERENCES buildings (building_no)
       -- ON DELETE CASCADE
       ON DELETE SET NULL
);


INSERT INTO buildings(building_name,address)
VALUES('ACME Headquaters','3950 North 1st Street CA 95134'),
      ('ACME Sales','5000 North 1st Street CA 95134');

INSERT INTO rooms(room_name,building_no)
VALUES('Amazon',1),
      ('War Room',1),
      ('Office of CEO',1),
      ('Marketing',2),
      ('Showroom',2);

SELECT * FROM BUILDINGS;
SELECT * FROM rooms;
DELETE FROM buildings WHERE building_no = 2;
SELECT * FROM rooms;

