package model;

public class Dog extends Pet {

    public Dog(String name, String commands, String date_of_birth) {
        super(name, commands, date_of_birth);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Собака")
                .append(super.toString());
        return res.toString();
    }
}