------------DATABASE COMMANDS-------------
CREATE DATABASE OLDDB;
SHOW DATABASES;
SELECT DATABASE();

USE sakila;

-- Fetch static value
SELECT 'AISHWARYA';

SELECT 'AISHWARYA' AS 'CR';

SELECT 100 + 200 AS TOTAL;

SELECT 100 + 200 AS 'TOTAL VALUE';

SELECT 100 + 200 AS "TOTAL VALUE";

SELECT Pi();

SELECT MOD(45, 7);

SELECT Sqrt(25);

-- FETCH RECORDS FROM TABLE
SELECT *
FROM   actor;

SELECT *
FROM   sakila.actor;

-- SORT ORDER
SELECT *
FROM   actor
ORDER  BY first_name;

SELECT *
FROM   actor
ORDER  BY first_name ASC;

SELECT *
FROM   actor
ORDER  BY first_name DESC;

SELECT *
FROM   actor
ORDER  BY 1;

SELECT *
FROM   actor
ORDER  BY 2;

SELECT *
FROM   actor
ORDER  BY 2 DESC;

-- FILTERING
SELECT *
FROM   actor
WHERE  first_name = 'WoODY';

SELECT *
FROM   actor
WHERE  first_name = 'WoODY'
ORDER  BY 3 DESC;

SELECT *
FROM   actor
WHERE  actor_id > 195
ORDER  BY actor_id;

SELECT first_name,
       last_name
FROM   actor
ORDER  BY first_name,
          last_name;

SELECT first_name,
       last_name
FROM   actor
ORDER  BY first_name ASC,
          last_name ASC;

SELECT first_name,
       last_name
FROM   actor
ORDER  BY first_name ASC,
          last_name DESC;

-- EMPTY RESULT SET
SELECT *
FROM   actor
WHERE  false;

SELECT *
FROM   actor
WHERE  1 = 2;

SELECT *
FROM   actor
WHERE  true;

-- COLUMN ALIAS
SELECT rental_date,
       inventory_id,
       return_date
FROM   sakila.rental;

SELECT rental_date  AS DATE_RENTED,
       inventory_id AS 'ID OF INVENTORY',
       return_date
FROM   rental;

-- ARITHMETIC EXPRESSIONS
SELECT *
FROM   film;

SELECT replacement_cost,
       rental_rate,
       replacement_cost - rental_rate AS CostDiff
FROM   film;

SELECT title,
       length      AS 'MINUTES',
       length / 60 AS 'HOURS'
FROM   film;

-- FUNCTIONS - INTEGER OPERATIONS
SELECT *
FROM   payment;

-- AGGREGATE FUNCTION
SELECT amount
FROM   payment;

SELECT amount,
       Round(amount)
FROM   payment;

SELECT amount,
       Round(amount),
       Round(amount, 1),
       Round(amount, 2)
FROM   payment;

SELECT amount,
       Round(amount),
       Floor(amount)
FROM   payment;

SELECT Round(1234.1234);

SELECT Round(1234.5234);

SELECT Round(1234.5234, 0);

SELECT Round(1234.5234, 1);

SELECT Floor(1.2);

SELECT Floor(1.7);

SELECT Ceiling(1.2);

SELECT Ceiling(1.7) AS 'CEILING VALUE';

SELECT Round(1234.5734, 1);

SELECT Round(1234.5734, 2);

SELECT Round(1234.5754, 2);

SELECT Round(1234.5734, -1);

SELECT Round(1235.5734, -1);
SELECT Round(1265.5734, -2);

SELECT Round(1235.5734, -3);

SELECT Round(1735.5734, -3);

SELECT Round(1735.5734, -30);

-- STRING OPERATIONS
SELECT 1 + 1 AS 'ADD';

SELECT '1' + '1' AS 'NO CONCATENATE';

SELECT 'A1' + '10' AS 'NO CONCATENATE';

SELECT Concat ('1', '1') AS 'CONCATENATE';

SELECT Concat (1, 1) AS 'CONCATENATE';

SELECT Concat ('A1', 10) AS 'CONCATENATE';

SELECT first_name,
       last_name
FROM   actor;

SELECT Concat(first_name, last_name) AS FullName
FROM   actor;

SELECT Concat(first_name, ' ', last_name) AS FullName
FROM   actor;

SELECT first_name,
       Length(first_name) AS FullName
FROM   actor;

SELECT first_name,
       last_name,
       LEFT(first_name, 1) AS Initial
FROM   actor;

SELECT Concat(LEFT(first_name, 1), ".", LEFT(last_name, 1)) AS INITIALS
FROM   actor;

SELECT first_name,
       last_name,
       LEFT(first_name, 1)                                  AS Initial,
       Concat(LEFT(first_name, 1), ".", LEFT(last_name, 1)) AS INITIALS
FROM   actor;

SELECT Concat(first_name, "", last_name)          AS Fullname,
       Reverse(Concat(first_name, "", last_name)) AS REVERSENAME
FROM   actor;

SELECT Concat(first_name, "", last_name)          AS Fullname,
       Reverse(Concat(first_name, "", last_name)) AS REVERSENAME
FROM   actor;

SELECT Concat(first_name, "", last_name)                              AS
       Fullname,
       REPLACE (Reverse(Concat(first_name, "", last_name)), 'S', '$') AS
       "REPLACED REVERSED FULL NAME"
FROM   actor;

-- SELECT @CONCATVAR;
SELECT @concatvar := Concat(first_name, " ", last_name)
FROM   actor;

select @concatvar;

SELECT @concatvar := Concat(first_name, "", last_name)
FROM   actor
WHERE  actor_id = 100;

SELECT @concatvar := Concat(first_name, "", last_name)
FROM   actor
WHERE  actor_id = 100;

select @concatvar;

SELECT @reversevar := Reverse(@concatvar)
FROM   actor;

-- DATE OPERATIONS
SELECT LAST_UPDATE FROM ACTOR;
SELECT DATE_FORMAT(LAST_UPDATE,'%m/%d/%y') as LAST_UPDATED, LAST_UPDATE FROM ACTOR;

SELECT DATE_FORMAT(LAST_UPDATE, '%m-%d-%Y') AS LAST_UPDATED, LAST_UPDATE fROM ACTOR;

/* time with microseconds */
SELECT DATE_FORMAT(last_update, '%d %b %Y %T:%f') AS LastUpdated, LAST_UPDATE fROM ACTOR;

SELECT 	rental_date,
		DAYOFWEEK(rental_date) AS DayOfWeek,
		QUARTER(rental_date) AS Quarter,
		WEEK(rental_date) AS Week,
		MONTHNAME(rental_date) AS MonthName	
FROM sakila.rental;

-- USE DISTINCT OPERATORS
SELECT first_name
FROM sakila.actor
ORDER BY first_name;

SELECT DISTINCT first_name
FROM sakila.actor
ORDER BY first_name;

--TOTAL NUMBER OF ROWS
SELECT COUNT(*) FROM ACTOR;
SELECT COUNT(first_name)
FROM sakila.actor;
SELECT COUNT(DISTINCT first_name)
FROM sakila.actor;

SELECT * FROM ACTOR
WHERE FIRST_NAME LIKE 'PEN%';


--USING THE WHERE CLAUSE
-- WHERE clause Comparison Operators

-- Equal (=)
SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE actor_id = 100;

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE first_name = 'Nick';

-- Less than (<)
SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE actor_id < 100;

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE first_name < 'Nick';

-- Greater than (>)
SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE actor_id > 100;

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE first_name > 'Nick';

-- Less than or Equal to (<=)
SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE actor_id <= 100;

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE first_name <= 'Nick';

-- Greater than or Equal to (>=)
SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE actor_id >= 100;

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE first_name >= 'Nick';

-- Not equal (<> or !=)
SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE actor_id <> 100;

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE first_name != 'Nick';

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE first_name <> 'Nick';

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE NOT first_name = 'Nick';

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE NOT first_name IN ('Nick');


--EXPLORE
--DISPLAY ONLY DUPLICATES
SELECT FIRST_NAME, COUNT(FIRST_NAME) FROM ACTOR
GROUP BY FIRST_NAME
HAVING COUNT(FIRST_NAME) > 2
order by count(first_name)

SELECT FIRST_NAME, COUNT(FIRST_NAME) FROM ACTOR
GROUP BY FIRST_NAME
HAVING first_name like 'C%'
order by count(first_name)

-- SELECT FIRST_NAME FROM ACTOR
-- HAVING first_name like 'C%';

SELECT FIRST_NAME FROM ACTOR
where first_name like 'C%';


SELECT FIRST_NAME FROM ACTOR
GROUP BY FIRST_NAME
HAVING COUNT(FIRST_NAME) > 1;

SELECT FIRST_NAME FROM ACTOR
WHERE FIRST_NAME IN 
(
SELECT FIRST_NAME FROM ACTOR
GROUP BY FIRST_NAME
HAVING COUNT(FIRST_NAME) > 1
)
ORDER BY FIRST_NAME DESC;

--LOGICAL OPERATORS
-- AND
SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH';

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' AND actor_id < 100;

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' AND actor_id < 100 AND last_name = 'TORN';


-- OR
SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH';

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' OR actor_id < 100; 

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' OR actor_id < 100 OR last_name = 'TEMPLE';


-- NOT
SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE NOT actor_id = 5;

SELECT actor_id, first_name, last_name
FROM sakila.actor
WHERE actor_id <> 5;

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' AND actor_id < 100 OR last_name = 'TEMPLE';

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' OR last_name = 'TEMPLE' AND actor_id < 100;

SELECT *
FROM sakila.actor
WHERE (first_name = 'KENNETH' AND actor_id < 100) OR last_name = 'TEMPLE';

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' AND (actor_id < 100 OR last_name = 'TEMPLE');

SELECT *
FROM sakila.actor
WHERE (first_name = 'KENNETH' OR last_name = 'TEMPLE') AND actor_id < 100;

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' OR (last_name = 'TEMPLE' AND actor_id < 100);

SELECT *
FROM sakila.actor
WHERE NOT (first_name = 'KENNETH' OR (last_name = 'TEMPLE' AND actor_id < 100));

SELECT *
FROM sakila.actor
WHERE first_name = 'KENNETH' OR NOT(last_name = 'TEMPLE' AND actor_id < 100);

-- WHERE clause Comparison Operators
-- Comparison OPERATORS (= != >= <=)  
-- MODIFIED Comparison OPERATORS IN
SELECT *
FROM sakila.actor
WHERE first_name = 'NICK' OR  first_name =  'JOHNNY';

SELECT *
FROM sakila.actor
WHERE actor_id = (select actor_id from actor where first_name = 'ed' and last_name = 'chase');

SELECT *
FROM sakila.actor
WHERE first_name IN (SELECT first_name
FROM sakila.actor
WHERE first_name = 'NICK' );

SELECT *
FROM sakila.actor
WHERE first_name = 'NICK' OR  first_name =  'JOHNNY';

SELECT *
FROM sakila.actor
WHERE first_name  != 'NICK' AND first_name != 'JOHNNY';

SELECT *
FROM sakila.actor
WHERE actor_id IN (1,2,3,4,5,6,7,8);

SELECT *
FROM sakila.actor
WHERE (actor_id = 1 OR 
		actor_id = 2 OR 
		actor_id = 3 OR 
		actor_id = 4 OR 
		actor_id = 5 OR 
		actor_id = 6 OR 
		actor_id = 7 OR 
		actor_id = 8);

-- NOT IN
SELECT *
FROM sakila.actor
WHERE actor_id NOT IN (1,2,3,4,5,6,7);

-- In Subquery

SELECT actor_id, FIRST_NAME, last_name 
					FROM sakila.actor
					WHERE last_name = 'DEGENERES';

/* (41,107,166) */

SELECT *
FROM sakila.actor
WHERE first_name IN ('NICK','JOHNNY','JOE','VIVIEN');

SELECT *
FROM sakila.actor
WHERE first_name IN ('NICK','JOHNNY','JOE','VIVIEN')
AND actor_id IN (41,107,166);

-- OUTER QUERY
SELECT *
FROM sakila.actor
WHERE first_name IN ('NICK','JOHNNY','JOE','VIVIEN')
-- 		OR actor_id IN (41, 107, 166)
		AND actor_id IN 
-- INNER QUERY (SUB QUERY)
					(SELECT actor_id 
					FROM sakila.actor
					WHERE last_name = 'DEGENERES');

-- BETWEEN
SELECT *
FROM sakila.actor
WHERE actor_id >= 10 AND actor_id <= 20;

SELECT *
FROM sakila.actor
WHERE actor_id BETWEEN 10 AND 20;

SELECT *
FROM sakila.actor
WHERE actor_id BETWEEN 11 AND 19;

SELECT *
FROM sakila.actor
WHERE actor_id NOT BETWEEN 11 AND 19;


-- LIKE WITH WILD CARDS
SELECT *
FROM sakila.actor
WHERE first_name LIKE 'A%';

SELECT *
FROM sakila.actor
WHERE first_name LIKE 'Alec%';

SELECT *
FROM sakila.actor
WHERE first_name LIKE '%RA%';

SELECT *
FROM sakila.actor
WHERE first_name LIKE '%R%A%';

SELECT *
FROM sakila.actor
WHERE first_name LIKE '%RA';

SELECT *
FROM sakila.actor
WHERE first_name NOT LIKE '%RA';

SELECT *
FROM sakila.actor
WHERE first_name LIKE 'AL%';

SELECT *
FROM sakila.actor
WHERE first_name LIKE 'A__E';

SELECT *
FROM sakila.actor
WHERE first_name LIKE 'A__E%';

SELECT *
FROM sakila.actor
WHERE first_name LIKE 'A%E%';

SELECT FIRST_NAME
FROM sakila.actor
WHERE NOT (first_name LIKE 'A%E%' AND first_name LIKE 'A%')
ORDER BY FIRST_NAME;

SELECT FIRST_NAME
FROM sakila.actor
WHERE NOT (first_name LIKE 'A%E%' OR first_name LIKE 'A%')
ORDER BY FIRST_NAME;

-- -----------------------------------------------------
-- NULL 
-- -----------------------------------------------------
SELECT ADDRESS,ADDRESS2 
FROM sakila.address;

-- ALL ACTORS WITHOUT A SECOND ADDRESS
SELECT ADDRESS_id, ADDRESS,ADDRESS2 
FROM address
WHERE address2 IS NULL;

UPDATE ADDRESS SET ADDRESS2 = 'ADD2'
WHERE ADDRESS_ID = 5;

UPDATE ADDRESS SET ADDRESS2 = ''
WHERE ADDRESS_ID = 6;

UPDATE ADDRESS SET ADDRESS2 = NULL
WHERE ADDRESS_ID = 6;

SELECT * FROM ADDRESS WHERE ADDRESS2 = '';


UPDATE ADDRESS SET ADDRESS2 = 'NULL'
WHERE ADDRESS_ID = 6;

SELECT ADDRESS,ADDRESS2 
FROM sakila.address
WHERE address2 = 'NULL';

SELECT ADDRESS,ADDRESS2 
FROM address
WHERE address2 IS NOT NULL;

SELECT ADDRESS.ADDRESS2 FROM SAKILA.ADDRESS;


-- NO ADDRESS2      [IS NULL]
-- HAS AN ADDRESS2   [IS NOT NULL]
-- NULL AND '' ARE EQUAL
-- NULL REPRESENTS MISSING INFORMATION
-- '' EMPTY VALUE

--ORDER BY clause

SELECT *
FROM sakila.address
ORDER BY district;

SELECT district
FROM sakila.address
ORDER BY district DESC;

-- all districts starting with A and are null.
select district from sakila.address where district is null or district like 'A%';

-- select the number of missing values for district.


-- CREATE A TABLE
CREATE TABLE ACTORSAMPLE
(
actor_id SMALLINT(5) NOT NULL AUTO_INCREMENT,
FIRST_NAME VARCHAR(50) NOT NULL,
last_name VARCHAR(50),
LAST_UPDATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (ACTOR_ID)
);

SELECT * FROM ACTORSAMPLE;

-- INSERT ALL FIELDS
INSERT INTO ACTORSAMPLE VALUES  (100, 'GAUTHAM', 'BUDDHA', '2021-01-04');
-- INSERT SPECIFIC FIELDS
INSERT INTO ACTORSAMPLE (FIRST_NAME,last_name,LAST_UPDATE) VALUES  ( 'KRISHNA', 'LORD', '2020-01-04');
INSERT INTO ACTORSAMPLE (FIRST_NAME,last_name,LAST_UPDATE) VALUES  ( 'RAMA', 'KRISHNA', '2020-01-03');
INSERT INTO ACTORSAMPLE (FIRST_NAME,last_name,LAST_UPDATE) VALUES  ( 'SITA', 'KRISHNA', '2020-01-05');
INSERT INTO ACTORSAMPLE VALUES  (100, 'GAUTHAM', 'BUDDHA', '2019-01-04');
INSERT INTO ACTORSAMPLE VALUES  (DEFAULT, 'GAUTHAM', 'BUDDHA', '2020-01-04');
INSERT INTO ACTORSAMPLE VALUES  (NULL, 'GAUTHAM', 'BUDDHA', '2020-01-04');
INSERT INTO ACTORSAMPLE VALUES  (DEFAULT, NULL, 'BUDDHAS', '2020-01-04');
-- INSERT A RECORD AND LET SQL AUTOMATICALLY ADD THE LAST_UPDATE
INSERT INTO ACTORSAMPLE (first_name,last_name) VALUES ('GOUTHAM','BUDHA');

-- INSERT MULTIPLE VALUES
SELECT * FROM ACTORSAMPLE;
INSERT INTO ACTORSAMPLE (first_name,last_name) VALUES 
('GOUTHAM1','BUDHA'),
('GOUTHAM2','BUDHA'),
('GOUTHAM3','BUDHA');

-- INSERT USING Subquery
SELECT first_name,last_name,last_update
FROM actor
WHERE first_name = 'Nick';

INSERT INTO ACTORSAMPLE (first_name,last_name)
SELECT first_name,last_name
FROM actor
WHERE first_name = 'Nick';

-- DELETES THE DATA ALONE
-- DELETE ALL ROWS
DELETE FROM ACTORSAMPLE;
DELETE FROM ACTORSAMPLE WHERE ACTOR_ID = 114;
-- REMOVE A TABLE (STRUCTURE AND THE DATA)
DROP TABLE ACTORSAMPLE;

--UPDATE
INSERT INTO ACTORSAMPLE (ACTOR_ID, first_name,last_name)
SELECT ACTOR_ID, first_name,last_name
FROM actor
WHERE ACTOR_ID <= 5 ;

SELECT * FROM ACTORSAMPLE; 

UPDATE ACTORSAMPLE
SET FIRST_NAME = 'TAYLOR'
WHERE ACTOR_ID = 1;

UPDATE ACTORSAMPLE
SET last_name = 'SWIFT';

UPDATE ACTORSAMPLE
SET FIRST_NAME = 'TONY', last_name = 'ROBBINS'
WHERE ACTOR_ID = 3;

UPDATE ACTORSAMPLE
SET FIRST_NAME = 'TONY', last_name = 'ROBBINS'
WHERE ACTOR_ID IN (2,4);

SELECT * FROM FILm_ACTOR;

UPDATE ACTORSAMPLE SET FIRST_NAME = 'WILL' WHERE ACTOR_ID IN
(SELECT ACTOR_ID FROM FILm_ACTOR WHERE FILM_ID = 25);


-- DELETE RECORDS
SELECT * FROM ACTORSAMPLE; 
DELETE FROM ACTORSAMPLE WHERE ACTOR_ID = 4;
DELETE FROM ACTORSAMPLE WHERE FIRST_NAME = 'WILL' AND last_name='ROBBINS';
-- DELETE ACTORS WHO ACTED IN THE FILM_ID 25.

DELETE FROM ACTORSAMPLE WHERE ACTOR_ID IN (SELECT ACTOR_ID FROM fILM_ACTOR WHERE FILM_ID=25);

-- IF YOU DELETE YOU CAN ROLLBACK
DELETE FROM ACTORSAMPLE;
TRUNCATE TABLE ACTORSAMPLE;


-- JIONS
DROP TABLE TABLE1;
DROP TABLE TABLE2;
-- Create table 1
CREATE TABLE table1
(ID INT, Value VARCHAR(10));

INSERT INTO Table1 (ID, Value)
SELECT 1,'RED'
UNION ALL
SELECT 2,'GREEN'
UNION ALL
SELECT 3,'BLUE'

/* INSERT INTO Table1 (ID, Value)
SELECT 1,'First'
UNION ALL
SELECT 2,'Second'
UNION ALL
SELECT 3,'Third' */


-- Create table 2
CREATE TABLE table2
(ID INT, Value VARCHAR(10));
INSERT INTO Table2 (ID, Value)
SELECT 2,'BASKET'
UNION ALL
SELECT 3,'BASE'
UNION ALL
SELECT 6,'CRICKET'
UNION ALL
SELECT 7,'FOOT';

/* INSERT INTO Table2 (ID, Value)
SELECT 2,'Second'
UNION ALL
SELECT 3,'Third'
UNION ALL
SELECT 6,'Sixth'
UNION ALL
SELECT 7,'Seventh' */

SELECT * FROM Table1;
SELECT * FROM Table2;


-------------JOINS ----------------------
-- CROSS JION
SELECT * FROM Table1
CROSS JOIN TABLE2;

-- CROSS JION variations
SELECT * FROM Table1
CROSS JOIN TABLE2
where table1.id = 1;

SELECT sum(table1.id), table2.value FROM Table1
CROSS JOIN TABLE2
where table1.id = 1
group by table2.value;

-- INNER JOIN

SELECT * FROM Table1 
JOIN TABLE2
ON Table1.ID = Table2.ID;

SELECT * FROM Table1 
INNER JOIN TABLE2
ON Table1.ID = Table2.ID;

SELECT table1.value, table2.value FROM Table1 
INNER JOIN TABLE2
ON Table1.ID = Table2.ID;

SELECT value FROM Table1 
INNER JOIN TABLE2
ON Table1.ID = Table2.ID;

SELECT table1.value as "Ball color", table2.value as "ball type" 
FROM Table1 
INNER JOIN TABLE2
ON Table1.ID = Table2.ID;

SELECT table1.id as "color id", table1.value as "Ball color",
table2.id as "Ball id", table2.value as "ball type" 
FROM Table1 
INNER JOIN TABLE2
ON Table1.ID = Table2.ID;


SELECT * FROM Table1 LT
INNER JOIN TABLE2 RT
ON LT.ID = RT.ID;

SELECT LT.ID, LT.VALUE, RT.VALUE FROM Table1 LT
INNER JOIN TABLE2 RT
ON LT.ID = RT.ID;

SELECT LT.ID, LT.VALUE, RT.VALUE FROM Table1 LT
INNER JOIN TABLE2 RT
ON LT.ID = RT.ID;

SELECT LT.ID AS LEFT_ID,LT.VALUE AS LEFT_VALUE ,RT.ID AS RIGHT_ID,RT.VALUE AS RIGHT_VALUE 
FROM Table1 LT
INNER JOIN TABLE2 RT
ON LT.ID = RT.ID;


-- LEFT JOIN

SELECT * FROM Table1 
LEFT JOIN TABLE2
ON Table1.ID = Table2.ID;


SELECT * FROM Table1 
LEFT OUTER JOIN TABLE2
ON Table1.ID = Table2.ID;

SELECT LT.ID AS LEFT_ID,LT.VALUE AS LEFT_VALUE ,RT.ID AS RIGHT_ID,RT.VALUE AS RIGHT_VALUE 
FROM Table1 LT
LEFT JOIN TABLE2 RT
ON LT.ID = RT.ID;

-- RIGHT JOIN
SELECT * FROM Table1 
RIGHT JOIN TABLE2
ON Table1.ID = Table2.ID;

SELECT * FROM Table1 
RIGHT OUTER JOIN TABLE2
ON Table1.ID = Table2.ID;

SELECT LT.ID AS LEFT_ID,LT.VALUE AS LEFT_VALUE ,RT.ID AS RIGHT_ID,RT.VALUE AS RIGHT_VALUE 
FROM Table1 LT
RIGHT JOIN TABLE2 RT
ON LT.ID = RT.ID;


-- SELF JOIN
-- Create a Table
CREATE TABLE Employee1(
EmployeeID INT PRIMARY KEY,
Name VARCHAR(50),
ManagerID INT
);

-- Insert Sample Data
INSERT INTO Employee1
SELECT 1, 'Mike', 3
UNION ALL
SELECT 2, 'David', 3
UNION ALL
SELECT 3, 'Roger', NULL
UNION ALL
SELECT 4, 'Marry',2
UNION ALL
SELECT 5, 'Joseph',2
UNION ALL
SELECT 7, 'Ben',2;

-- Check the data
SELECT * FROM Employee1;

SELECT E1.NAME, E2.NAME
FROM EMPLOYEE1 E1
INNER JOIN EMPLOYEE1 E2
ON E1.MANAGERID = E2.EMPLOYEEID;

SELECT E1.NAME AS EMPNAME, E2.NAME AS MANAGER 
FROM EMPLOYEE1 E1
INNER JOIN EMPLOYEE1 E2
ON E1.MANAGERID = E2.EMPLOYEEID;

SELECT CONCAT(E1.NAME , " WORKS FOR  ", E2.NAME) AS "EMPLOYEE WORKS FOR MANAGER" 
FROM EMPLOYEE1 E1
INNER JOIN EMPLOYEE1 E2
ON E1.MANAGERID = E2.EMPLOYEEID;

------------CONSTRAINTS-----------------
-- COMPOSITE PRIMARY KEY
CREATE TABLE EMPLOYEETEMP(
FNAME CHAR(10),
LNAME CHAR(10),
CITY CHAR(10),
-- COMPOSITE PRIMARY KEY
PRIMARY KEY (FNAME,LNAME)
);



DELETE FROM EMPLOYEETEMP;
SELECT * FROM EMPLOYEETEMP;
INSERT INTO EMPLOYEETEMP VALUES ('SAM', 'PETER', 'MUMBAI');
INSERT INTO EMPLOYEETEMP VALUES ('SAM', 'JOHN', 'MUMBAI');
INSERT INTO EMPLOYEETEMP VALUES ('ELTON', 'JOHN', 'MUMBAI');
INSERT INTO EMPLOYEETEMP VALUES ('SAM', 'JOHN', 'CHENNAI');

CREATE TABLE EMPLOYEEHOBBY(
FNAME CHAR(10),
LNAME CHAR(10),
HOBBY CHAR(10),
-- COMPOSITE FOREIGN KEY
FOREIGN KEY (FNAME,LNAME) REFERENCES EMPLOYEETEMP(FNAME,LNAME)
);
SET SQL_SAFE_UPDATES = 0;
DELETE FROM EMPLOYEEHOBBY;
SELECT * FROM EMPLOYEEHOBBY;
INSERT INTO EMPLOYEEHOBBY VALUES ('SAM', 'PETER', 'CRICKET');
INSERT INTO EMPLOYEEHOBBY VALUES ('SAM', 'BILL', 'GOLF');
INSERT INTO EMPLOYEEHOBBY VALUES ('ELTON', 'JOHN', 'MUSIC');
INSERT INTO EMPLOYEEHOBBY VALUES ('BILLY', 'JOHN', 'SKYDIVE');