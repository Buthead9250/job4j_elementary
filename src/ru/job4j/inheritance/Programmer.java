package ru.job4j.inheritance;

public class Programmer extends Engineer {

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Code createCode() {
        return new Code();
    }

    public void testCode(Code code) {
    }
}
