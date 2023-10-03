package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.Counter;
import controllers.TypeHandler;
import model.*;

public class MenuListOfAnimals {

    public void run(ListOfAnimals listOfAnimals) {

        Counter counter = new Counter(0);

        Scanner in = new Scanner(System.in, "Cp866");

        String com = null;

        while (true) {
            try {
                System.out.println();
                MenuText.printMenu();
                com = prompt("Введите команду: ", in).toUpperCase();
                System.out.println();

                if (com.equals("EXIT")) {
                    return;
                }

                switch (com) {
                    case "1":
                        list(listOfAnimals);
                        break;
                    case "2":
                        if (add(listOfAnimals, in)) counter.add();
                        break;
                    case "3":
                        commandsList(listOfAnimals, in);
                        break;
                    case "4":
                        addCommands(listOfAnimals, in);
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

    private boolean add(ListOfAnimals listOfAnimals, Scanner in) throws Exception {

        Animal newAnimal = null;

        String typeAnimal = prompt("Введите тип животного (Собака, Кошка, Хомяк, Лошадь, Верблюд или Осел): ", in)
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

        String name = prompt("Введите имя животного: ", in);
        newAnimal.setName(name);
        String com = prompt("Введите комманду для обучения: ", in);
        ArrayList<String> temp = new ArrayList<>();
        temp.add(com);
        newAnimal.setCommands(temp);
        String date_of_birth = prompt("Введите дату рождения животного в формате ДД-ММ-ГГГГ: ", in);
        newAnimal.setDate_of_birth(date_of_birth);
        listOfAnimals.addAnimal(newAnimal);

        if (name.isEmpty() || com.isEmpty() || date_of_birth.isEmpty()) {
            return false;
        }

        return true;
    }

    private void commandsList(ListOfAnimals listOfAnimals, Scanner in) {
        String name = prompt("Введите кличку животного, чьи команды желаете узнать: ", in);
        Animal animal = findAnimal(listOfAnimals, name);

        if (animal == null) {
            System.out.println("Такого животного нет в списке!");
        } else {
            System.out.printf("\nЖивотное %s, кличка %s, выполняет команды %s.\n", 
                TypeHandler.GetAnimalType(animal), animal.getName(), animal.getCommands());
        }
    }

    private void addCommands(ListOfAnimals listOfAnimals, Scanner in){
        String name = prompt("Введите кличку животного, которое хотите обучить: ", in);
        Animal animal = findAnimal(listOfAnimals, name);
        
        if (animal == null) {
            System.out.println("Такого животного нет в списке!");
        } else {
            ArrayList<String> commands = animal.getCommands();
            String newCommand = prompt("Введите новую команду: ", in);
            commands.add(newCommand);
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

    private String prompt(String message, Scanner in) {

        System.out.print(message);
        return in.nextLine();
    }
}
