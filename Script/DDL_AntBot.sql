-- database: ../database/Antbot.sqlite

DROP TABLE If EXISTS AntBot;
--Catalogo
CREATE TABLE AntBot(
        IdAntBot                        INTEGER PRIMARY KEY AUTOINCREMENT
        ,IdIABot                        INTEGER  REFERENCES IABot (IdIABot)
        ,Serie                          TEXT  NOT NULL UNIQUE
        ,Estado                         VARCHAR(1) NOT NULL DEFAULT 'A'
        ,FechaCrea                      DATETIME NOT NULL DEFAULT (DATETIME('NOW', 'LOCALTIME'))
        ,FechaModifica                  DATE
);