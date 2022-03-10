INSERT INTO children (name,birthdate)
VALUES ('Junior Smith','2018.02.02'),
       ('Lola Solo','2018.06.10'),
       ('Lily Solo','2018.06.10');

INSERT INTO parents (name,phone_number,address)
VALUES ('John Smith', '+45 22 21 30 20', 'Nyhavn 15.'),
('Jane Smith', '+45 21 21 30 40', 'Nyhavn 15.'),
('Margaret Solo', '+45 20 55 31 02', 'Ensom gade 1.');

INSERT INTO employees (name, phone_number,address)
VALUES ('Sandra Madsen', '+45 01 00 00 00', 'Chefvej 42.'),
('Bob Kind', '+45 01 00 00 00', 'Rosevej 5.');

INSERT INTO family
VALUES (1,1),(1,2),(2,3),(3,3);

INSERT INTO daycare_groups
VALUES ('Bunny Group', 2,1),
('Bunny Group', 2,2),
('Bunny Group', 2,3);

#Query to check if works -
SELECT children.name, parents.name, employees.name FROM children
INNER JOIN family ON children.id = family.children_id
INNER JOIN parents ON family.parent_id = parents.id
INNER JOIN daycare_groups ON children.id = daycare_groups.children_id
INNER JOIN employees ON daycare_groups.employee_id = employees.id
WHERE daycare_groups.name = 'Bunny group';