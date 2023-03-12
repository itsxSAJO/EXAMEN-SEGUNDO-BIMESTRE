/*
(C) 2K23, itsxSAJO
------------------------------
Creacion de la tabla Armamento con datos
12.mar.2k23
Version 1.0
*/
/*
Nombre: Said Luna
C.C: 1004807838
*/
DROP TABLE IF EXISTS SL_COORDENADAS;
CREATE TABLE IF NOT EXISTS SL_COORDENADAS
(   
    SL_CAPACIDAD_BELICA INTEGER NULL,
    SL_GEOLOCALIZACION VARCHAR(25) NOT NULL,
    SL_ARSENAL         VARCHAR(25) NOT NULL,
    SL_FECHA_HACKEO    VARCHAR(25) DEFAULT(datetime('now'))
);
------------------------------------------------------------------------
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (8, 'GPS8', 'abbccdt'); 
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (3, 'GPS3', 'bcd');
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (8, 'GPS8', 'abbccdt'); 
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (7, 'GPS7', 'aaabbct');
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (0, 'GPS0', 'ab');
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (8, 'GPS8', 'abbccdt');
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (4, 'GPS4', 'acd');
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (0, 'GPS0', 'ab');
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (0, 'GPS0', 'ab');
INSERT INTO SL_COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (1, 'GPS1', 'bc');           
------------------------------------------------------------------------
SELECT * FROM SL_COORDENADAS;


------------------------------------------------------------------------
DROP TABLE IF EXISTS SL_USUSARIOS;
CREATE TABLE IF NOT EXISTS SL_USUSARIOS
(   
    SL_NR_USUARIOS        INTEGER NULL ,
    SL_USUARIOS           VARCHAR(25) NOT NULL,
    SL_CONTRASENA         VARCHAR(25) NOT NULL
);
------------------------------------------------------------------------
INSERT INTO SL_USUSARIOS   (SL_NR_USUARIOS ,SL_USUARIOS, SL_CONTRASENA)
            VALUES        (1, 'profe', '81dc9bdb52d04dc20036dbd8313ed055'); //1234
INSERT INTO SL_USUSARIOS   (SL_NR_USUARIOS , SL_USUARIOS, SL_CONTRASENA)
            VALUES        (1, 'said.luna@epn.edu.ec', '641310643db05f60276a047ccaef5f23'); //1004807838
INSERT INTO SL_USUSARIOS   (SL_NR_USUARIOS, SL_USUARIOS, SL_CONTRASENA)
            VALUES        (1,'usuarioinvitado', 'ac55e04cc9a727d32a5029567eec53d0'); //quieropasarprogra                   
------------------------------------------------------------------------
SELECT * FROM SL_USUSARIOS;