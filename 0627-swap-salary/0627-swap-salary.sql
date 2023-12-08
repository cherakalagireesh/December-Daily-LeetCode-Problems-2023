/* Write your PL/SQL query statement below */

UPDATE SALARY 
SET SEX = 
DECODE(SEX,'m','f','f','m');