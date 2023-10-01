package views;

import java.util.Scanner;

import model.Animal;
import model.ListOfAnimals;

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
                        System.out.println("222");
                        break;
                    case "3":
                        System.out.println("333");
                        break;
                    case "4":
                        System.out.println("4");
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

    private String prompt(String message) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.print(message);
        String str = in.nextLine();
        in.close();
        return str;
    }
}
