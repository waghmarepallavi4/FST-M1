SELECT customer_id, max(purchase_amount) FROM orders GROUP BY customer_id;

SELECT salesman_id, order_date, max(purchase_amount) fROM orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

SELECT customer_id, order_date, MAX(purchase_amount) FROM orders GROUP BY customer_id, order_date having max(purchase_amount) IN(2030, 3450, 5760, 6000);