package views;

import java.util.Scanner;

import controllers.TypeHandler;
import model.*;

public class MenuListOfAnimals {

    public void run(ListOfAnimals listOfAnimals) {

        String com = null;

        while (true) {
            try {
                System.out.println();
                MenuText.printMenu();
                com = prompt("Введите команду: ").toUpperCase();
                System.out.println();

                if (com.equals("EXIT")) {
                    return;
                }

                switch (com) {
                    case "1":
                        list(listOfAnimals);
                        break;
                    case "2":
                        add(listOfAnimals);
                        break;
                    case "3":
                        commandsList(listOfAnimals);
                        break;
                    case "4":
                        addCommands(listOfAnimals);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void list(ListOfAnimals listOfAnimals) {
        for (Animal animal : listOfAnimals) {
            Printer.PrintAnimal(animal);
        }
    }

    private void add(ListOfAnimals listOfAnimals) throws Exception {

        Animal newAnimal = null;

        String typeAnimal = prompt("Введите тип животного (Собака, Кошка, Хомяк, Лошадь, Верблюд или Осел): ")
                .toUpperCase();

        switch (typeAnimal) {
            case "СОБАКА":
                newAnimal = new Dog(null, null, null);
                break;
            case "КОШКА":
                newAnimal = new Cat(null, null, null);
                break;
            case "ХОМЯК":
                newAnimal = new Hamster(null, null, null);
                break;
            case "ЛОШАДЬ":
                newAnimal = new Horse(null, null, null);
                break;
            case "ВЕРБЛЮД":
                newAnimal = new Kamel(null, null, null);
                break;
            case "ОСЕЛ":
                newAnimal = new Donkey(null, null, null);
                break;
            default:
                throw new IllegalStateException("Вы ввели недопустимый тип животого: " + typeAnimal);
        }

        String name = prompt("Введите имя животного: ");
        newAnimal.setName(name);
        String commands = prompt("Введите комманды, выполняемые животным, через запятую: ");
        newAnimal.setCommands(commands);
        String date_of_birth = prompt("Введите дату рождения животного в формате ДД-ММ-ГГГГ: ");
        newAnimal.setDate_of_birth(date_of_birth);
        listOfAnimals.addAnimal(newAnimal);
    }

    private void commandsList(ListOfAnimals listOfAnimals) {
        String name = prompt("Введите кличку животного, чьи команды желаете узнать: ");
        Animal animal = findAnimal(listOfAnimals, name);

        if (animal == null) {
            System.out.println("Такого животного нет в списке!");
        } else {
            System.out.printf("\nЖивотное %s, кличка %s, выполняет команды '%s'.\n", 
                TypeHandler.GetAnimalType(animal), animal.getName(), animal.getCommands());
        }
    }

    private void addCommands(ListOfAnimals listOfAnimals){
        String name = prompt("Введите кличку животного, которое хотите обучить: ");
        Animal animal = findAnimal(listOfAnimals, name);
        
        if (animal == null) {
            System.out.println("Такого животного нет в списке!");
        } else {
            String commands = animal.getCommands();
            String newCommand = prompt("Введите новую команду: ");
            commands = commands + ", " + newCommand;
            animal.setCommands(commands);
        }
    }

    private Animal findAnimal(ListOfAnimals listOfAnimals, String name) {
        for (Animal animal : listOfAnimals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.print(message);
        String str = in.nextLine();
        // in.close();
        return str;
    }
}
