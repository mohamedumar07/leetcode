# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id, Employees.name FROM EmployeeUNI RIGHT JOIN Employees ON EmployeeUNI.id = Employees.id














-- SELECT unique_id, name FROM Employees LEFT JOIN EmployeeUNI ON Employees.id = EmployeeUNI.id