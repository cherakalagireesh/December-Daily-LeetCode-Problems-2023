/* Write your PL/SQL query statement below */

SELECT EMAIL
FROM PERSON
GROUP BY EMAIL HAVING COUNT(1)>1;