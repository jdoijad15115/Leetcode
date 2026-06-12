# Write your MySQL query statement below
select d.name as Department, 
        e.name as Employee,
        e.salary as Salary 
        from (select * , dense_rank() over (partition by departmentID order by Salary desc)as rnk from Employee)e JOIN Department d
        on e.departmentID = d.id
        where e.rnk<=3;