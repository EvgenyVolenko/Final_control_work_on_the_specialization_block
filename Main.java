import model.*;
import views.Menu;

public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Вася", "Стой, беги", "25-06-2023");
        Kamel camel = new Kamel("Вася", "Стой, беги", "02-10-2023");

        // System.out.println(dog.toString() + "\n" + camel.toString());

        Menu.printMenu();
    }
}