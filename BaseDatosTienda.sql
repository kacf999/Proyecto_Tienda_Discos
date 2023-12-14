Create TABLE artistas(
  clave varchar(5) NOT NULL,
  nombre varchar(25) NOT NULL,
  genero varchar(15) NOT NULL,
  PRIMARY KEY(clave)
  );
  
  CREATE TABLE discos(
    clave varchar(5) not NULL,
    nombre varchar(25),
    anio varchar(4),
    precio double precision,
    stock int,
    descripcion varchar(35),
    claveArtista varchar(5),
    PRIMARY KEY(clave),
    FOREIGN KEY(claveartista) REFERENCES artistas(clave)
    );
    
    insert INTO artistas VALUES('linpa','Linkin Park','nu-metal');
    INSERT INTO discos VALUES('hythe','Hybrid Theory', '2000', 25.0, 10, 'primer disco', 'linpa');
    INSERT INTO discos VALUES('me004','Meteora', '2004', 25.0, 15, 'Segundo disco', 'linpa');
    
    insert INTO artistas VALUES('drest','Dream State','post-hardcore');
    INSERT INTO discos VALUES('con15','Concequences', '2015', 30.0, 5, 'disco independiente', 'drest');
    INSERT INTO discos VALUES('pri19','Primrose Path', '2019', 25.0, 15, 'discografica UNFD', 'drest');
    
    
    SELECT * from artistas, discos where artistas.clave = discos.claveArtista;