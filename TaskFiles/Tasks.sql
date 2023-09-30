DELETE FROM camels;

CREATE TABLE horses_and_donkeys AS
(
	SELECT * FROM horses
	UNION
	SELECT * FROM donkeys
);

DROP TABLE all_animals;

CREATE TEMPORARY TABLE all_animals AS
(
	SELECT * FROM dogs
	UNION SELECT * FROM cats
    UNION SELECT * FROM hamsters
    UNION SELECT * FROM horses
    UNION SELECT * FROM camels
    UNION SELECT * FROM donkeys
);

CREATE TABLE young_animals AS
(
	SELECT nickname, commands, date_of_birth, TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) AS age FROM all_animals
    WHERE date_of_birth >= DATE_SUB(CURDATE(), INTERVAL 36 MONTH) AND date_of_birth <= DATE_SUB(CURDATE(), INTERVAL 12 MONTH)
);

DROP TABLE all_animals;

CREATE TABLE all_in_one AS
(
	SELECT 'dogs' AS prev_table, pets_id, nickname, commands, date_of_birth FROM dogs
    UNION SELECT 'cats' AS prev_table, pets_id, nickname, commands, date_of_birth FROM cats
    UNION SELECT 'hamsters' AS prev_table, pets_id, nickname, commands, date_of_birth FROM hamsters
    UNION SELECT 'horses' AS prev_table, pack_animals_id, nickname, commands, date_of_birth FROM horses
    UNION SELECT 'camels' AS prev_table, pack_animals_id, nickname, commands, date_of_birth FROM camels
    UNION SELECT 'donkeys' AS prev_table, pack_animals_id, nickname, commands, date_of_birth FROM donkeys
);

SELECT * FROM young_animals;
SELECT * FROM all_in_one;

-- DROP DATABASE human_friends;