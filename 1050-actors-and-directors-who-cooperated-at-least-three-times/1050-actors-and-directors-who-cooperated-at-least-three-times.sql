/* Write your PL/SQL query statement below */

SELECT ACTOR_ID, DIRECTOR_ID
FROM (SELECT ACTOR_ID, DIRECTOR_ID,COUNT(*) CNT
      FROM ACTORDIRECTOR 
      GROUP BY (ACTOR_ID,DIRECTOR_ID)
)
WHERE CNT >= 3;