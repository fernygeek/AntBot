-- database: ../database/AntBot.sqlite
/*
|--------------------------------------|
| (©)2k24 EPN-FIS, All right reserved. |       
|                                      |
|erick.caicedo@epn.edu.ec ErickCaiced2 |
|______________________________________|
Autor: ErickCaiced2
Fecha: 28/02/1014
Script: Creación de la tabla Hormiga
*/
DROP TABLE If EXISTS Hormiga;
--Catalogo
CREATE TABLE Hormiga(
         IdHormiga                       INTEGER PRIMARY KEY AUTOINCREMENT
        ,IdTipoHormiga                  INTEGER REFERENCES TipoHormiga (IdTipoHormiga)
        ,Codigo                         INTEGER NOT NULL DEFAULT 100 
        ,Nombre                         TEXT  NOT NULL UNIQUE
        ,Estado                         VARCHAR(1) NOT NULL DEFAULT 'A'
        ,Observacion                    TEXT
        ,FechaCrea                      DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))
        ,FechaModifica                  DATE
);
CREATE TRIGGER set_default_codigo AFTER INSERT ON AntBot
BEGIN
    UPDATE AntBot SET Codigo = IdHormiga + 100 WHERE rowid = NEW.rowid;
END;