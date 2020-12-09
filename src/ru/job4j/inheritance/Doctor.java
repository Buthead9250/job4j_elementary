package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String area;
    private String hospital;

    public Doctor(String name, String surname, String education, String birthday, String area, String hospital) {
        super(name, surname, education, birthday);
        this.area = area;
        this.hospital = hospital;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}
