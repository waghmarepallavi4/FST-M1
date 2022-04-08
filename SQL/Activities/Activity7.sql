select sum(purchase_amount) as "Total sum" from orders;
select avg(purchase_amount) as "Avg" from orders;
select min(purchase_amount) AS "min" from orders;
select max(purchase_amount) AS "max" from orders;
select count(distinct salesman_id) from orders