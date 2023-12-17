/* Write your PL/SQL query statement below */

SELECT QUERY_NAME, ROUND(SUM(RATING/POSITION)/COUNT(*),2) QUALITY, ROUND(SUM(CASE
                                                                        WHEN RATING<3 THEN 1
                                                                   ELSE
                                                                        0
                                                                   END
                                                                    )/COUNT(*)*100,2) POOR_QUERY_PERCENTAGE
FROM QUERIES
WHERE QUERY_NAME IS NOT NULL
GROUP BY QUERY_NAME;