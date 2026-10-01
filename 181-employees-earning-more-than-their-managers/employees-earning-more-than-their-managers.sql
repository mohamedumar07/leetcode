# Write your MySQL query statement below

select e1.name as Employee from Employee e1 INNER JOIN Employee e2 ON e1.managerId = e2.id and 
e1.salary > e2.salary;
