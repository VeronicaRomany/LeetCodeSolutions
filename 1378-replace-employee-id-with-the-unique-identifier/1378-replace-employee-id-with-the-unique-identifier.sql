# Write your MySQL query statement below
select unique_id , name 
from EmployeeUNI 
Right join Employees 
on EmployeeUNI.id = Employees.id