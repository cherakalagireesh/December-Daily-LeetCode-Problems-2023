/* Write your PL/SQL query statement below */

SELECT 
    STOCK_NAME,
    SUM(CASE WHEN OPERATION = 'Buy'
        THEN PRICE * -1
        ELSE PRICE
        END
        ) CAPITAL_GAIN_LOSS
FROM 
    STOCKS
GROUP BY 
    STOCK_NAME;