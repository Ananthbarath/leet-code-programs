# Write your MySQL query statement below
select max(num) as num
from(select num from myNumbers group by num having count(*)=1) as singlenumbers;