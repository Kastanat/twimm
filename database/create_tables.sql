CREATE TABLE kayttaja (
	id INT NOT NULL AUTO_INCREMENT,
	etunimi VARCHAR(20) NOT NULL,
	sukunimi VARCHAR(30) NOT NULL,
	sahkoposti VARCHAR(25) NOT NULL,
	kuvaus VARCHAR(100),
	PRIMARY KEY (id)
)ENGINE=InnoDB CHARACTER SET=UTF8;
 
CREATE TABLE kiinnostus (
	kiinnostus_id INT NOT NULL AUTO_INCREMENT,
	nimi VARCHAR(30) NOT NULL, 
	PRIMARY KEY(kiinnostus_id)
)ENGINE=InnoDB CHARACTER SET=UTF8;

CREATE TABLE kayttajanKiinnostus (
	kayttaja_id INT NOT NULL,
	kiinnostus_id INT NOT NULL,
	PRIMARY KEY(kayttaja_id, kiinnostus_id),
	FOREIGN KEY(kayttaja_id) REFERENCES kayttaja (id),
	FOREIGN KEY(kiinnostus_id) REFERENCES kiinnostus (kiinnostus_id)
)ENGINE=InnoDB CHARACTER SET=UTF8;