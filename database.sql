CREATE DATABASE student_management;

USE student_management;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100),
    email VARCHAR(100)
);

INSERT INTO students VALUES
(1,'Rahul Sharma',20,'Computer Science','rahul@email.com'),
(2,'Ananya Gupta',19,'Information Technology','ananya@email.com'),
(3,'Rohit Kumar',21,'Data Science','rohit@email.com'),
(4,'Priya Singh',22,'Software Engineering','priya@email.com');
