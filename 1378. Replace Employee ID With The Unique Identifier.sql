# Write your MySQL query statement below
select unique_id, name 
from Employees 
left join employeeuni on employees.id=employeeuni.id;
