package model;

public class Hamster extends Pet {

    public Hamster(String name, String commands, String date_of_birth) {
        super(name, commands, date_of_birth);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Хомяк")
                .append(super.toString());
        return res.toString();
    }
}