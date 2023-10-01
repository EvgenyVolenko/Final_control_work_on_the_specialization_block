package model;

public class Kamel extends PackAnimal {

    public Kamel(String name, String commands, String date_of_birth) {
        super(name, commands, date_of_birth);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Верблюд")
                .append(super.toString());
        return res.toString();
    }
}
