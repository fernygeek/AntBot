-- database: ../database/AntBot.sqlite
/*
|--------------------------------------|
| (©)2k24 EPN-FIS, All right reserved. |       
|                                      |
|erick.caicedo@epn.edu.ec ErickCaiced2 |
|______________________________________|
Autor: ErickCaiced2
Fecha: 28/02/1014
Script: Ingreso de datos TipoHormiga
*/
INSERT INTO TipoHormiga 
    (IdTipoHormiga_Padre, Nombre, Observacion)
VALUES 
    (NULL, "Reina", "Reina")
    ,(1, "Zangano", "Zangano") 
    ,(2, "Soldado", "Soldado")
    ,(3, "Rastreadora","Rastreadora")
    ,(4, "Larva","Larva");
