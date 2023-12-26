/* Write your PL/SQL query statement below */


SELECT 
    EMPLOYEE_ID,
    (CASE
        WHEN MOD(EMPLOYEE_ID,2) = 1 AND NAME NOT LIKE 'M%'  THEN SALARY
        ELSE
            0
        END
     ) BONUS
FROM 
    EMPLOYEES
ORDER BY    
    EMPLOYEE_ID;