-- database: ../database/Antbot.sqlite

DROP TABLE If EXISTS Ensamblado;
--Catalogo
CREATE TABLE Ensamblado(
        IdEnsamblado                    INTEGER PRIMARY KEY AUTOINCREMENT
        ,IdAntBot                       INTEGER  REFERENCES AntBot (IdAntBot)
        ,IdHormiga                      INTEGER  REFERENCES Hormiga (IdHormiga)
        ,IdMecatronico                  INTEGER  REFERENCES Mecatronico (IdMecatronico)
        ,Nombre                         TEXT  NOT NULL DEFAULT "GUERRERO RUSO"
        ,Estado                         VARCHAR(1) NOT NULL DEFAULT 'A'
        ,FechaCrea                      DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))
        ,FechaModifica                  DATE
);