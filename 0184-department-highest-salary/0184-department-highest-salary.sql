# Write your MySQL query statement below

#approach is to partition the table based on departmentId
#and rank each department by their salary

SELECT Department, Employee, Salary FROM (select d.name as Department, e.name as Employee , e.salary as Salary, RANK() OVER(PARTITION BY e.departmentId ORDER BY e.salary DESC) as salary_rank from Employee e
INNER JOIN Department d ON e.departmentId = d.id) as temp where salary_rank = 1;