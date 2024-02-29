-- database: ../database/AntBot.sqlite
/*
|--------------------------------------|
| (©)2k24 EPN-FIS, All right reserved. |       
|                                      |
|erick.caicedo@epn.edu.ec ErickCaiced2 |
|______________________________________|
Autor: ErickCaiced2
Fecha: 28/02/1014
Script: Creación de la tabla TipoHormiga
*/
DROP TABLE If EXISTS TipoHormiga;
--Catalogo
CREATE TABLE TipoHormiga(
        IdTipoHormiga                   INTEGER PRIMARY KEY AUTOINCREMENT
        ,IdTipoHormiga_Padre            INTEGER  REFERENCES TipoHormiga (IdTipoHormiga)
        ,Nombre                         TEXT  NOT NULL UNIQUE
        ,Estado                         VARCHAR(1) NOT NULL DEFAULT 'A'
        ,Observacion                    TEXT
        ,FechaCrea                      DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))
        ,FechaModifica                  DATE
);