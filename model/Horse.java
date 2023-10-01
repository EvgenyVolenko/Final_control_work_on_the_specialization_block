package model;

public class Horse extends PackAnimal {

    public Horse(String name, String commands, String date_of_birth) {
        super(name, commands, date_of_birth);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Лошадь")
                .append(super.toString());
        return res.toString();
    }
}
