package ru.job4j.inheritance;

public class Dentists extends Doctor {

    public Dentists(String name, String surname, String education, String birthday, String area, String hospital) {
        super(name, surname, education, birthday, area, hospital);
    }

    public void healTooth(BodyPart tooth) {
    }

    public void pullOutTooth(BodyPart tooth) {
    }
}
