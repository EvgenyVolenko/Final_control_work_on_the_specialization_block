CREATE SCHEMA `human_friends`;

USE human_friends;

CREATE TABLE animals
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	animal_class VARCHAR(30) NOT NULL
);

CREATE TABLE pets
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	pet_class VARCHAR(30) NOT NULL,
    animals_id INT NOT NULL,
    FOREIGN KEY (animals_id) REFERENCES animals(id)
);

CREATE TABLE pack_animals
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	pack_animal_class VARCHAR(30) NOT NULL,
    animals_id INT NOT NULL,
    FOREIGN KEY (animals_id) REFERENCES animals(id)
);

CREATE TABLE dogs 
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  nickname VARCHAR(30) NOT NULL,
  commands VARCHAR(50),
  date_of_birth DATE NOT NULL,
  pets_id INT NOT NULL,
  FOREIGN KEY (pets_id) REFERENCES pets(id)
);

CREATE TABLE cats 
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  nickname VARCHAR(30) NOT NULL,
  commands VARCHAR(50),
  date_of_birth DATE NOT NULL,
  pets_id INT NOT NULL,
  FOREIGN KEY (pets_id) REFERENCES pets(id)
);

CREATE TABLE hamsters
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  nickname VARCHAR(30) NOT NULL,
  commands VARCHAR(50),
  date_of_birth DATE NOT NULL,
  pets_id INT NOT NULL,
  FOREIGN KEY (pets_id) REFERENCES pets(id)
);

CREATE TABLE horses
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  nickname VARCHAR(30) NOT NULL,
  commands VARCHAR(50),
  date_of_birth DATE NOT NULL,
  pack_animals_id INT NOT NULL,
  FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id)
);

CREATE TABLE camels
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  nickname VARCHAR(30) NOT NULL,
  commands VARCHAR(50),
  date_of_birth DATE NOT NULL,
  pack_animals_id INT NOT NULL,
  FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id)
);

CREATE TABLE donkeys
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  nickname VARCHAR(30) NOT NULL,
  commands VARCHAR(50),
  date_of_birth DATE NOT NULL,
  pack_animals_id INT NOT NULL,
  FOREIGN KEY (pack_animals_id) REFERENCES pack_animals(id)
);

