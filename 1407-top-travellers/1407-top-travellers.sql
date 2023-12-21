/* Write your PL/SQL query statement below */

SELECT NAME, NVL(TRAVELLED_DISTANCE,0) TRAVELLED_DISTANCE
FROM USERS U LEFT OUTER JOIN (SELECT USER_ID,SUM(DISTANCE) TRAVELLED_DISTANCE
                   FROM RIDES
                   GROUP BY USER_ID) TABLE1
ON(U.ID = TABLE1.USER_ID)
ORDER BY TRAVELLED_DISTANCE DESC, U.NAME ASC;