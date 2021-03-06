DROP DATABASE daycare;

CREATE DATABASE daycare;

create table children (id integer not null auto_increment, address varchar(45) not null, name varchar(45) not null, phone_number varchar(45) not null, primary key (id)) engine=InnoDB;
create table employees (employee_id integer not null auto_increment, first_name varchar(45) not null, name varchar(45) not null, last_name varchar(45) not null, schedule_id integer, primary key (employee_id)) engine=InnoDB;
create table schedule (schedule_id integer not null auto_increment, shift_name varchar(255), time datetime, primary key (schedule_id)) engine=InnoDB;
create table users (id integer not null auto_increment, first_name varchar(45) not null, last_name varchar(45) not null, password varchar(15), username varchar(45) not null, primary key (id)) engine=InnoDB;
alter table employees add constraint FKne5xe4ciwbnkip5bkiogweuu7 foreign key (schedule_id) references schedule (schedule_id);
