/* Write your PL/SQL query statement below */

SELECT P.PRODUCT_ID, ROUND(NVL((SUM(PRICE*UNITS)/SUM(UNITS)),0),2) AVERAGE_PRICE
FROM PRICES P LEFT OUTER JOIN UNITSSOLD U
ON (P.PRODUCT_ID = U.PRODUCT_ID)
WHERE (PURCHASE_DATE BETWEEN START_DATE AND END_DATE) OR PURCHASE_DATE IS NULL;
GROUP BY P.PRODUCT_ID;
