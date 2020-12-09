package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education, String birthday, String area, String hospital) {
        super(name, surname, education, birthday, area, hospital);
    }

    public void operateBodyPart(BodyPart organ) {
    }

    public void changeBodyPart(BodyPart organ) {
    }
}
