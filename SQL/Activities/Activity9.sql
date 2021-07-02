-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT All
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001)
into customers values (3005, 'Graham Zusi', 'California', 200, 5002) 
into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
into customers values (3007, 'Brad Davis', 'New York', 200, 5001)
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
into customers values (3001, 'Brad Guzan', 'London', 300, 5005)
into customers values (3008, 'Julian Green', 'London', 300, 5002)
into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
SELECT 1 FROM DUAL;

-- Create salesman table
CREATE TABLE salesman (
    salesman_id int,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    commission int
);

-- Insert one row
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5005, 'Priyanka', 'Amba', 11)
    INTO salesman VALUES(5006, 'Parth', 'Paris', 14)
    INTO salesman VALUES(5007, 'Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Loren', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns


-- Write an SQL statement to know which salesman are working for which customer.
SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman
SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city FROM customers a 
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300 
ORDER BY a.customer_id;

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE b.commission>12;

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.
SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;