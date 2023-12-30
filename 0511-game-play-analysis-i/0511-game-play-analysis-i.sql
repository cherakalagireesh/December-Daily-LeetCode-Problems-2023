
SELECT player_id,TO_CHAR(MIN(event_date),'YYYY-MM-DD') first_login
FROM Activity a
GROUP BY player_id;