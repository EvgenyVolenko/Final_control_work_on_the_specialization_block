import model.*;
import views.*;

public class Main {
    public static void main(String[] args) {

        ListOfAnimals listOfAnimals = new ListOfAnimals();

        listOfAnimals.addAnimal(new Dog("Вася", "Стой, беги", "25-06-2023"))
                     .addAnimal(new Kamel("Вася", "Стой, беги", "02-10-2023"));
      
        MenuText.printMenu();
        for (Animal animal : listOfAnimals) {
            Printer.PrintAnimal(animal);
        }
    }
}