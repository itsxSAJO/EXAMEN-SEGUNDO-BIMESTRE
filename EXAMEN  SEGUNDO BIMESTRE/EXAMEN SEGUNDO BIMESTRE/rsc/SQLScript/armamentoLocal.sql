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
DROP TABLE IF EXISTS COORDENADAS;
CREATE TABLE IF NOT EXISTS COORDENADAS
(   
    SL_CAPACIDAD_BELICA INTEGER NULL,
    SL_GEOLOCALIZACION VARCHAR(25) NOT NULL,
    SL_ARSENAL         VARCHAR(25) NOT NULL,
    SL_FECHA_HACKEO    VARCHAR(25) DEFAULT(datetime('now'))
);
------------------------------------------------------------------------
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (8, 'GPS8', 'abbccdt'); 
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (3, 'GPS3', 'bcd');
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (8, 'GPS8', 'abbccdt'); 
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (7, 'GPS7', 'aaabbct');
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (0, 'GPS0', 'ab');
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (8, 'GPS8', 'abbccdt');
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (4, 'GPS4', 'acd');
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (0, 'GPS0', 'ab');
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (0, 'GPS0', 'ab');
INSERT INTO COORDENADAS   (SL_CAPACIDAD_BELICA, SL_GEOLOCALIZACION, SL_ARSENAL)
            VALUES        (1, 'GPS1', 'bc');           
------------------------------------------------------------------------
SELECT * FROM COORDENADAS;


------------------------------------------------------------------------
DROP TABLE IF EXISTS USUSARIOS;
CREATE TABLE IF NOT EXISTS USUSARIOS
(   
    SL_NR_USUARIOS        INTEGER NULL ,
    SL_USUARIOS           VARCHAR(25) NOT NULL,
    SL_CONTRASENA         VARCHAR(25) NOT NULL
);
------------------------------------------------------------------------
INSERT INTO USUSARIOS   (SL_NR_USUARIOS ,SL_USUARIOS, SL_CONTRASENA)
            VALUES        (1, 'profe', '81dc9bdb52d04dc20036dbd8313ed055');   
INSERT INTO USUSARIOS   (SL_NR_USUARIOS , SL_USUARIOS, SL_CONTRASENA)
            VALUES        (1, 'said.luna@epn.edu.ec', 'ac55e04cc9a727d32a5029567eec53d0');
INSERT INTO USUSARIOS   (SL_NR_USUARIOS, SL_USUARIOS, SL_CONTRASENA)
            VALUES        (1,'usuarioinvitado', 'bb1cc7bd184852e096acb63dbeda5056');                    
------------------------------------------------------------------------
SELECT * FROM USUSARIOS;