package model;

public class Cat extends Pet {

    public Cat(String name, String commands, String date_of_birth) {
        super(name, commands, date_of_birth);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Кошка")
                .append(super.toString());
        return res.toString();
    }
}