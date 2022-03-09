CREATE DATABASE dayCare;

CREATE TABLE employees(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
phoneNumber VARCHAr (30),
address VARCHAR (300));

CREATE TABLE children(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
parentId INT,
birthdate DATE);

CREATE TABLE parents(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
childrenId int,
FOREIGN KEY (childrenId) REFERENCES children(id),
phoneNumber VARCHAr (30),
address VARCHAR (300));

CREATE TABLE parents_waiting_list(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
childrenId int,
phoneNumber VARCHAr (30),
address VARCHAR (300));

CREATE TABLE children_waiting_list(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(300),
parentId INT,
FOREIGN KEY (parentId) REFERENCES parents_waiting_list(id),
birthdate DATE);

CREATE TABLE groups(
name VARCHAR(300),
employeeId INT,
childrenId INT,
FOREIGN KEY (employeeId) REFERENCES employees(id),
FOREIGN KEY (childrenId) REFERENCES children(id));

CREATE TABLE schedule(
shiftName VARCHAR(300),
employeeId INT,
time VARCHAR(300),
FOREIGN KEY (employeeId) REFERENCES employees(id));

CREATE TABLE family(
childrenId INT,
parentId INT,
FOREIGN KEY (childrenId) REFERENCES children(id),
FOREIGN KEY (parentId) REFERENCES parents(id));
