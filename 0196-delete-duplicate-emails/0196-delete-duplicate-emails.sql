# Write your MySQL query statement below

#SELF joining based on the email, keeping the minimum(p1) and deleting the p2(max)

delete p2 from Person p1 JOIN Person p2 ON p1.email = p2.email where p1.id < p2.id