-- database: ../database/AntBot.sqlite
/*
|--------------------------------------|
| (©)2k24 EPN-FIS, All right reserved. |       
|                                      |
|erick.caicedo@epn.edu.ec ErickCaiced2 |
|______________________________________|
Autor: ErickCaiced2
Fecha: 28/02/1014
Script: Creación de la tabla IaBot
*/
DROP TABLE If EXISTS IaBot;
--Catalogo
CREATE TABLE IaBot(
        IdIaBot                         INTEGER PRIMARY KEY AUTOINCREMENT
        ,Nombre                         TEXT  NOT NULL UNIQUE
        ,Estado                         VARCHAR(1) NOT NULL DEFAULT 'A'
        ,Observacion                    TEXT
        ,FechaCrea                      DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))
        ,FechaModifica                  DATE
);