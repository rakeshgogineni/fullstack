-- RENAME DATABASE
1. mysqldump -u root -p  livedb > livedb.sql
2. mysql -u root -p  -e "create database livedbnew"
3. mysql -u root -p  livedbnew < livedb.sql
4. mysql -u root -p  -e "drop database livedb" 


CREATE DATABASE OLDDB;
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

SHOW DATABASES;
SELECT DATABASE();

-- back up the database
1. mysqldump -u root -p  olddb > olddb.sql
-- create the new database
2. mysql -u root -p -e "create database newdb";
-- populate the tables and data 
3. mysql -u root -p newdb < olddb.sql
-- delete the old db
4. mysql -u root -p -e "drop database olddb"