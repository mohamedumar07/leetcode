# Write your MySQL query statement below


SELECT Department, Employee, Salary FROM (select d.name as Department, e.name as Employee , e.salary as Salary, RANK() OVER(PARTITION BY e.departmentId ORDER BY e.salary DESC) as salary_rank from Employee e
INNER JOIN Department d ON e.departmentId = d.id) as temp where salary_rank = 1;