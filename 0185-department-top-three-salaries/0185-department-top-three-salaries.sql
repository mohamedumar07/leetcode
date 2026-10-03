# Write your MySQL query statement below

select Department, Employee, Salary FROM (select d.name Department, e.name Employee, e.salary Salary, DENSE_RANK() OVER(PARTITION BY d.name ORDER BY e.salary DESC) as salary_rank FROM Employee e INNER JOIN Department d ON e.departmentId = d.id) as temp where salary_rank <= 3;