# Write your MySQL query statement below

Select Customers from (
Select c.name Customers, o.customerId customerId from Customers c LEFT JOIN Orders o ON c.id = o.customerId
) as temp where customerId is NULL;