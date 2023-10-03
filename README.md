# Итоговая контрольная работа 
## Информация о проекте 
Необходимо организовать систему учета для питомника в котором живут домашние и вьючные животные. 
## Как сдавать проект 
Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github,gitlub,илиBitbucket). Разработку вести в этом репозитории, использовать пулреквесты на изменения.Программа должна запускаться и работать, ошибок при выполнении программы быть не должно. Программа,может использоваться в различных системах,по этому необходимо разработать класс в виде конструктора
### Задание 
1. Используя команду cat в терминале операционной системы Linux, создать два файла: Домашние животные (заполнив файл собаками,кошками, хомяками) и Вьючные животные (заполнив файл Лошадьми,верблюдами, ослами), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека). 
![Задание 1](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/Pictures/task_1.jpg)
2. Создать директорию, переместить файл туда. 
![Задание 2](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/Pictures/task_2.jpg)
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория. 
![Задание 3_1](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/Pictures/task_3_1.jpg)
![Задание 3_2](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/Pictures/task_3_2.jpg)
![Задание 3_3](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/Pictures/task_3_3.jpg)
4. Установить и удалить deb-пакет с помощью dpkg. 
![Задание 4](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/Pictures/task_4.jpg)
5. Выложить историю команд в терминале ubuntu.\
***Они [ТУТ](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/TaskFiles/History.txt)***
6. Нарисовать диаграмму, в которой есть родительский класс, домашние животные и вьючные животные,в составе которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючных животных войдут: лошади,верблюды и ослы.
![Диаграмма](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/Pictures/Diagram.jpg)
7. В подключенном MySQL репозитории создать базу данных “Друзья человека”.
8. Создать таблицы с иерархией из диаграммы в БД.\
***Решение пунктов 7 и 8 [ТУТ](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/TaskFiles/CreateDatabases.sql)***
9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения.\
***ОНО [ТУТ](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/TaskFiles/FillingTables.sql)***
10. Удалить из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади и ослы в одну таблицу.
11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новойтаблице.
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.\
***Решение пунктов 10, 11, 12 [ТУТ](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/TaskFiles/Tasks.sql)***
13. Создать классс Инкапсуляцией методов и наследованием по диаграмме.\
***ОНО [ТУТ](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/model/)***
14. Написать программу, имитирующую работу реестра домашних животных.В программе должен быть реализован следующий функционал:\
    14.1. Завести новое животное\
    14.2. Определять животное в правильный класс\
    14.3. Увидеть список команд, которые выполняет животное\
    14.4. Обучить животное новым командам\
    14.5. Реализовать навигацию по меню
15. Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1 при нажатие “Завести новое животное”. Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try,если при заведении животного заполнены все поля.\
***Решение пунктов 14 и 15 начинаетс [ТУТ](https://github.com/EvgenyVolenko/Final_control_work_on_the_specialization_block/blob/main/Main.java)***