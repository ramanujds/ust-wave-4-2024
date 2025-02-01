create database ust_wave_4;
use ust_wave_4;


-- create a table employee
-- id name salary joined_date

create table employee(id int auto_increment primary key,
						name varchar(50),
                        salary numeric(8,2),
                        joined_date date);
                        
desc employee;  

-- add a new coloumn location
alter table employee add location varchar(100);

-- delete the table
drop table employee;

-- insert some data

insert into employee(name,salary,joined_date,location) 
		values ('Ramanuj Das',50000.00,'2016-10-10','Bengaluru');

insert into employee(name , salary, joined_date, location) values('Vivek', 55000.00,'2025-03-10','Hyderabad');

insert into employee(name , salary, joined_date, location) 
values('Sachin John Thomas', 45000,'2025-5-5','Thiruvananthapuram');

insert into employee(name,salary,joined_date,location) values('g jagadeesh',25000.00,'2024-01-02','hydrebad');
insert into employee(name , salary, joined_date, location) values('Tejaswi Boddu', 50000, '2024-09-07', 'Bangalore');

insert into employee(name,salary,joined_date,location) values('Rogan',45000.00,'2025-02-02','chennai');

insert into employee(name, salary, joined_date, location) 
values('Sharon','25000','2025-03-01','Pondichery');


        
-- find all the records

select * from employee;

-- update records

update employee set location = 'Hyderabad' where id=4;

-- filter records

select * from employee where location = 'Hyderabad';  


-- Update all the occurences of Bangalore with Bengaluru

update employee set location='Bangalore' where location='Bengaluru';

update employee set location = 'Bengaluru' where location ='Bangalore';

-- find all the employees staying either bengaluru or hyderabad or chennai 

select * from employee where location='bengaluru' or location='hyderabad' or location='chennai';

select * from employee where location in('Bengaluru','Hyderabad','Chennai');   

-- find out the names of the employees who are getting salray between 45000 to 55000

select name,salary from employee where salary between 45000 and 55000;

-- Find out the total employees in each location

select location, count(*) as 'Total Employees' from employee group by location;

-- sum max min avg

-- find the highest paid employee

select * from employee where salary = (select max(salary) from employee);

-- find the highest paid salary in each location


select e.location, e.name, e.salary as 'Highest Salary'
from employee e
where e.salary = (
    select max(salary) 
    from employee e2 
    where e2.location = e.location
);


