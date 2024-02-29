-- database: ../database/AntBot.sqlite

DROP TABLE If EXISTS Mecatronico;
--Catalogo
CREATE TABLE Mecatronico(
        IdMecatronico          INTEGER PRIMARY KEY AUTOINCREMENT
        ,Nombre                         TEXT  NOT NULL UNIQUE
        ,Estado                         VARCHAR(1) NOT NULL DEFAULT 'A'
        ,FechaCrea                      DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))
        ,FechaModifica                  DATE
);