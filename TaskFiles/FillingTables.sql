INSERT INTO animals (animal_class)
VALUES ('Домашние животные'),
	   ('Вьючные животные')
       ;
	
INSERT INTO pets (pet_class, animals_id)
VALUES ('Собаки', 1),
	   ('Кошки', 1),
       ('Хомяки', 1)
       ;
       
INSERT INTO pack_animals (pack_animal_class, animals_id)
VALUES ('Лошади', 2),
	   ('Верблюды', 2),
       ('Ослы', 2)
       ;
       
INSERT INTO dogs (nickname, commands, date_of_birth, pets_id)
VALUES ('Шарик', 'Сидеть, Лежать', '2020-03-03', 1),
	   ('Тузик', 'Сидеть, Лежать, Апорт', '2018-12-25', 1),
       ('Анри', 'Сидеть, Лежать, Взять, Принеси', '2015-09-30', 1)
       ;
       
INSERT INTO cats (nickname, commands, date_of_birth, pets_id)
VALUES ('Маня', 'Вперед', '2019-05-05', 2),
	   ('Муся', '', '2018-04-15', 2),
       ('Матроскин', 'Шить, Доить, Копать', '1980-08-17', 2)
       ;
       
INSERT INTO hamsters (nickname, commands, date_of_birth, pets_id)
VALUES ('Вася', '', '2019-05-05', 3),
	   ('Белый', '', '2018-04-15', 3),
       ('Пушистик', NULL, '1980-08-17', 3)
       ;
       
INSERT INTO horses (nickname, commands, date_of_birth, pack_animals_id)
VALUES ('Звезда Востока', 'Вперед, Быстрее, Медленнее', '2017-05-05', 1),
	   ('Бурый', 'Ноооо, Трррр', '2020-12-15', 1),
       ('Огонек', 'Алеоп, Вперед', '2020-07-15', 1)
       ;
       
INSERT INTO camels (nickname, commands, date_of_birth, pack_animals_id)
VALUES ('Горб', 'Вперед, Стой', '2021-06-05', 2),
	   ('Слю', 'К-к-к, Трррр', '2020-04-15', 2),
       ('Педант', 'К-к-к, Вперед', '2020-07-15', 2)
       ;
       
INSERT INTO donkeys (nickname, commands, date_of_birth, pack_animals_id)
VALUES ('Клепа', 'Вперед, Стой', '2021-07-05', 3),
	   ('Иа', 'Грусти, Сиди', '1970-04-15', 3),
       ('Серенький', 'Иди, Стой', '2017-07-15', 3)
       ;
       