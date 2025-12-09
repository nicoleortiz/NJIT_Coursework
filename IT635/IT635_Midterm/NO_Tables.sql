CREATE TABLE Titles (
	t_id			int NOT NULL PRIMARY KEY,
	title			VARCHAR(75)
);

CREATE TABLE Department (
	d_id			INT NOT NULL PRIMARY KEY,
	department		VARCHAR(150) NOT NULL,
	location		VARCHAR(150) NOT NULL
);

CREATE TABLE Employees (
	employee_id		INT NOT NULL PRIMARY KEY,
	first_name		VARCHAR(75) NULL,
	last_name		VARCHAR(75) NULL,
	title_id		INT,
	department_id 	INT,
	FOREIGN KEY (title_id) REFERENCES Titles(t_id),
	FOREIGN KEY (department_id) REFERENCES Department(d_id)
);

INSERT INTO Titles VALUES(1, 'Executive');
INSERT INTO Titles VALUES(2, 'Manager');
INSERT INTO Titles VALUES(3, 'Supervisor');
INSERT INTO Titles VALUES(4, 'Intern');
INSERT INTO Titles VALUES(5, 'Employee');

INSERT INTO Department VALUES(1, 'Accounting', 'Building 123');
INSERT INTO Department VALUES(2, 'Human Resources', 'Building 234');
INSERT INTO Department VALUES(3, 'Marketing', 'Building 345');
INSERT INTO Department VALUES(4, 'Information Technology', 'Building 456');
INSERT INTO Department VALUES(5, 'Development', 'Building 567');

INSERT INTO Employees VALUES(1, 'Nicole', 'Ortiz', 1, 4);
INSERT INTO Employees VALUES(2, 'Kevin', 'Perez', 2, 5);
INSERT INTO Employees VALUES(3, 'Margaret', 'Hickey', 3, 2);
INSERT INTO Employees VALUES(4, 'Adel', 'Soliman', 4, 3);
INSERT INTO Employees VALUES(5, 'Alex', 'Pais', 5, 1);