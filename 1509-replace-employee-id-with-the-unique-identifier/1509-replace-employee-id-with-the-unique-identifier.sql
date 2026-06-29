# Write your MySQL query statement below
select unique_id ,name from employees e left join employeeUNI i on e.id=i.id ;