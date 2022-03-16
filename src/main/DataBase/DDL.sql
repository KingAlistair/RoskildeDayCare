DROP DATABASE daycare;

CREATE DATABASE IF NOT EXISTS daycare;

CREATE TABLE employees(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
phone_number VARCHAr (30),
address VARCHAR (300));

CREATE TABLE children(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
birthdate DATE);

CREATE TABLE parents(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
phone_number VARCHAR (30),
address VARCHAR (300));

CREATE TABLE parents_waiting_list(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
phone_number VARCHAR (30),
address VARCHAR (300));

CREATE TABLE children_waiting_list(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
birthdate DATE);

CREATE TABLE daycare_groups(
name VARCHAR(300),
employee_id INT,
children_id INT,
FOREIGN KEY (employee_id) REFERENCES employees(id),
FOREIGN KEY (children_id) REFERENCES children(id));

CREATE TABLE schedule(
shift_name VARCHAR(300),
employee_id INT,
time VARCHAR(300),
FOREIGN KEY (employee_id) REFERENCES employees(id));

CREATE TABLE family(
children_id INT,
parent_id INT,
FOREIGN KEY (children_id) REFERENCES children(id),
FOREIGN KEY (parent_id) REFERENCES parents(id));

CREATE TABLE users(
    id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT,
    username VARCHAR(255),
    password VARCHAR(255),
    FOREIGN KEY (employee_id) REFERENCES employees(id)
);
