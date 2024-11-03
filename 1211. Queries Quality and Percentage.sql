# Write your MySQL query statement below
#Here calculating the average of rating and position, then calculating the average percentage of poor query which is less than 3.
select q.query_name , round((sum(q.rating/q.position)/count(q.query_name)),2)as quality, round(avg(case when q.rating<3 then 1 else 0 end)*100,2) as poor_query_percentage
from queries q
where q.query_name is not null  # here the query name is null it won't consider for the calculation 
group by q.query_name;
