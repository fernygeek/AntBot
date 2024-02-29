-- database: ../database/AntBot.sqlite
/*
|--------------------------------------|
| (©)2k24 EPN-FIS, All right reserved. |       
|                                      |
|erick.caicedo@epn.edu.ec ErickCaiced2 |
|______________________________________|
Autor: ErickCaiced2
Fecha: 24/02/1014
Script: Ingreso de datos AntBot
*/
INSERT INTO AntBot 
    (IdHormiga,IdIaBot,IdTipoHormiga,IdExpertoIdiomas,Serie)
VALUES 
    (1,1,1,3,"Serie 1")
    ,(2,1,2,1,"Serie 2")
    ,(3,1,3,2,"Serie 3")
    ,(4,1,4,1,"Serie 4");     
SELECT Ant.IdAntBot AS IdAntBot, Ho.Nombre AS Hormiga, IA.Nombre AS Ia, TH.Nombre AS Tipo, EI.Nombre AS Experto
FROM AntBot Ant 
JOIN Hormiga Ho ON Ant.IdHormiga = Ho.IdHormiga 
JOIN IaBot IA ON Ant.IdIaBot = IA.IdIaBot 
JOIN TipoHormiga TH ON Ant.IdTipoHormiga = TH.IdTipoHormiga 
JOIN ExpertoIdiomas EI ON Ant.IdExpertoIdiomas = EI.IdExpertoIdiomas 
WHERE Ant.Estado = 'A' 
AND Ho.Estado = 'A'
AND IA.Estado = 'A' 
AND TH.Estado = 'A' 
AND EI.Estado = 'A' 