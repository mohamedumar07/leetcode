# Write your MySQL query statement below
select email Email from Person GROUP BY email having count(*) > 1;