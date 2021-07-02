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
SELECT * FROM salesman;

-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';