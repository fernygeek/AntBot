-- database: ../database/AntBot.sqlite

DROP TABLE If EXISTS HormigaClasificacion;
--Catalogo
CREATE TABLE HormigaClasificacion(
        IdHormigaClasificacion          INTEGER PRIMARY KEY AUTOINCREMENT
        ,Nombre                         TEXT  NOT NULL UNIQUE
        ,Estado                         VARCHAR(1) NOT NULL DEFAULT 'A'
        ,FechaCrea                      DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))
        ,FechaModifica                  DATE
);