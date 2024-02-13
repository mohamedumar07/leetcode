# Write your MySQL query statement below

select name from Customer where COALESCE(referee_id, 0) <> 2

# <> means not equal to

#select name from Customer where referee_id != 2 or referee_id is NULL
