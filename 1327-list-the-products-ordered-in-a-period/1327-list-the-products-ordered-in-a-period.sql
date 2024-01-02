/* Write your PL/SQL query statement below */

SELECT p.product_name, SUM(o.unit) unit
FROM Products p JOIN  Orders o
ON (p.product_id = o. product_id)
WHERE TO_CHAR(o.order_date,'MON-YYYY') = 'FEB-2020'
GROUP BY p.product_id, product_name
HAVING SUM(o.unit) >= 100;

