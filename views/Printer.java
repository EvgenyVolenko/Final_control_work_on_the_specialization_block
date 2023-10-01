package views;

import controllers.TypeHandler;
import model.Animal;

public class Printer {

    public static void PrintAnimal(Animal animal) {

        System.out.println(TypeHandler.GetAnimalType(animal) + animal.toString());
    }
}
