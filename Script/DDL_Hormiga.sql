-- database: ../database/AntBot.sqlite

DROP TABLE If EXISTS Hormiga;
--Catalogo
CREATE TABLE Hormiga(
        IdHormiga                       INTEGER PRIMARY KEY AUTOINCREMENT
        ,IdHormigaClasificacion         INTEGER  REFERENCES HormigaClasificacion (IdHormigaClasificacion)
        ,Codigo                         TEXT  NOT NULL UNIQUE
        ,Estado                         VARCHAR(1) NOT NULL DEFAULT 'A'
        ,FechaCrea                      DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))
        ,FechaModifica                  DATE
);