import model.*;
import views.*;

public class Main {
    public static void main(String[] args) {

        ListOfAnimals listOfAnimals = new ListOfAnimals();

        listOfAnimals.addAnimal(new Dog("Вася", "Стой, беги", "25-06-2023"))
                     .addAnimal(new Kamel("Коля", "Стой, беги, Лежать", "02-10-2023"));
      
        MenuListOfAnimals list = new MenuListOfAnimals();
        list.run(listOfAnimals);
    }
}