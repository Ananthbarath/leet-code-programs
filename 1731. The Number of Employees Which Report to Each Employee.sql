# Write your MySQL query statement below
select emp1.employee_id, emp1.name ,emp2.reports_count, round(emp2.average_age) as average_age
from  employees emp1 
join( select reports_to, count(*) as reports_count,avg(age)as average_age from employees where reports_to is not null group by reports_to )emp2 
on emp1.employee_id=emp2.reports_to 
group by emp1.employee_id;
