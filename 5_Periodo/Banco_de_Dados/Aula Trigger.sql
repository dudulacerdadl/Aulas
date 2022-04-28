CREATE TABLE Curso (
    id_curso number(4) NOT NULL,
    nom_curso varchar2(50),
    carga_horaria number(4),
    carga_horaria_ant number(4),
    CONSTRAINT pk_curso PRIMARY KEY(id_curso)
);

INSERT INTO Curso (id_curso, nom_curso, carga_horaria, carga_horaria_ant)
VALUES (1, 'HTML', 40, 10);

INSERT INTO Curso (id_curso, nom_curso, carga_horaria, carga_horaria_ant)
VALUES (2, 'Flutter', 90, 30);

SELECT * FROM Curso;

UPDATE Curso
SET carga_horaria = 600, carga_horaria_ant = 1
WHERE id_curso = 2;