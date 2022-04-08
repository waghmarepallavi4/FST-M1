select a.salesman_id ,a.salesman_name ,a.customer_id , a.customer_name  
from customers a 
inner join salesman b 
on a.salesman_id = b.salesman_id;

select a.customer_name, a.city, a.grade, b.salesman_name , b.city  
from customers a
left outer join salesman b 
on a.salesman_id=b.salesman_id  
where a.grade<300  
order by a.customer_id;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values (3002, 'Nick Rimando', 'New York', 100, 5001);

insert into customers values (3007, 'Brad Davis', 'New York', 200, 5001);

insert into customers values (3005, 'Graham Zusi', 'California', 200, 5002);

insert into customers values (3008, 'Julian Green', 'London', 300, 5002);

insert into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006);

insert into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003);

insert into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007);

insert into customers values (3001, 'Brad Guzan', 'London', 300, 5005);

CREATE TABLE salesman(  
 Salesman_id int,  
 salesman_name varchar2(20),  
 salesman_city varchar2(20),  
 comission int  
);

INSERT INTO salesman Values (5001,'James Hoog','New York',15);

INSERT INTO salesman Values (5002,'Nail Knite','Paris',13);

INSERT INTO salesman Values (5005,'Pit Alex','London',11);

INSERT INTO salesman Values (5006,'McLyon','Paris',14);

INSERT INTO salesman Values (5007,'Paul Adam','Rome',13);

INSERT INTO salesman Values (5003,'Lauson Hen','San Jose',12);


select a.salesman_id , a.customer_id , a.customer_name  
from customers a 
inner join salesman b 
on a.salesman_id = b.salesman_id;

select a.customer_name, a.city, a.grade, b.salesman_name , b.salesman_city  
from customers a 
left outer join salesman b
on a.salesman_id=b.salesman_id  
where a.grade<300  
order by a.customer_id;

select a.customer_name, a.city, b.salesman_name , b.comission  
from customers a  
inner join salesman b on a.salesman_id=b.salesman_id  
where b.comission>12;

select c.order_no, c.order_date, c.purchase_amount, a.customer_name , a.grade,  
b.salesman_name , b.comission from orders c 
inner join customers a on c.customer_id=a.customer_id  
inner join salesman b on a.salesman_id=b.salesman_id;