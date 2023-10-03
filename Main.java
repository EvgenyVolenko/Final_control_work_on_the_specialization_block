import java.util.ArrayList;
import java.util.Arrays;

import model.*;
import views.*;

public class Main {
    public static void main(String[] args) {

        ListOfAnimals listOfAnimals = new ListOfAnimals();

        listOfAnimals.addAnimal(new Dog("Тузик", new ArrayList<>(Arrays.asList("Стоять", "Бежать")), "03-12-2018"))
                .addAnimal(new Cat("Муся", new ArrayList<>(Arrays.asList("Вперед")), "03-12-2018"))
                .addAnimal(new Donkey("Иа", new ArrayList<>(Arrays.asList("Страдать", "Бухтеть")), "03-12-2018"));

        MenuListOfAnimals list = new MenuListOfAnimals();
        list.run(listOfAnimals);
    }
}