package controllers;

import model.*;

public class TypeHandler {

    public static String GetAnimalType(Animal animal) {

        if (animal instanceof Dog) {
            return "Собака";
        } else if (animal instanceof Cat) {
            return "Кошка";
        } else if (animal instanceof Hamster) {
            return "Хомяк";
        } else if (animal instanceof Horse) {
            return "Лошадь";
        } else if (animal instanceof Kamel){
            return "Верблюд";
        } else if (animal instanceof Donkey){
            return "Осел";
        } else {
            return null;
        }
    }
}
