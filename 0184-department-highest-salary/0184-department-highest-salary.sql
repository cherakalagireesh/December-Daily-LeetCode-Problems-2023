/* Write your PL/SQL query statement below */

SELECT D.NAME DEPARTMENT,E.NAME EMPLOYEE,E.SALARY SALARY
FROM EMPLOYEE E JOIN DEPARTMENT D
ON(E.DEPARTMENTID = D.ID)
WHERE E.SALARY=(SELECT MAX(SALARY) 
                FROM EMPLOYEE EE JOIN DEPARTMENT DD
                ON(EE.DEPARTMENTID = DD.ID)
                WHERE DD.ID = D.ID
                );