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

-- Add the grade column
ALTER TABLE salesman ADD grade int;

-- Update the values in the grade column
UPDATE salesman SET grade=100;

-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

-- Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Display modified data
SELECT * FROM salesman;