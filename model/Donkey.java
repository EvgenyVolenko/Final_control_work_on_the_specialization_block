package model;

public class Donkey extends PackAnimal {

    public Donkey(String name, String commands, String date_of_birth) {
        super(name, commands, date_of_birth);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Осел")
                .append(super.toString());
        return res.toString();
    }
}
