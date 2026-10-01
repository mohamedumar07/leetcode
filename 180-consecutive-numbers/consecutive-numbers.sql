# Write your MySQL query statement below

SELECT distinct ConsecutiveNums FROM
(SELECT num as ConsecutiveNums, LEAD(num, 1) OVER(ORDER BY id) as num_1, LEAD(num, 2) OVER (ORDER BY id) as num_2
FROM logs
) as cons where num_1 = ConsecutiveNums and num_2 = ConsecutiveNums;
