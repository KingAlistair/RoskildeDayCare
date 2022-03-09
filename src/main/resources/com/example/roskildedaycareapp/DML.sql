SELECT * FROM children
INNER JOIN family f on children.id = f.childrenId
INNER JOIN parents p on f.parentId = p.id
WHERE p.name = 'Margaret Solo';


SELECT * FROM children
INNER JOIN `groups` g on children.id = g.childrenId
WHERE g.name = 'Bunny group';