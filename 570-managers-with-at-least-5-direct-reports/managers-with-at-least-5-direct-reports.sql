# Write your MySQL query statement below

select a1.name
from Employee as a1
join Employee as a2
where a1.id = a2.managerId 
GROUP BY a1.id, a2.managerId
HAVING COUNT(*) >= 5;
