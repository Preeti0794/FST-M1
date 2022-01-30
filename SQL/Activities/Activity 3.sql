REM   Script: FST_SQL_Activity3
REM   FST_SQL_Activity3

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
)

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns
SELECT * FROM salesman;;

describe salesman


INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

SELECT * FROM salesman;

select salesman_id,salesman_city from salesman;

Select * from salesman where salesman_city='Paris';

Select salesman_id, commission from salesman where SALESMAN_NAME="Paul Adam";

Select salesman_id, commission from salesman where SALESMAN_NAME='Paul Adam';

