package ru.job4j.inheritance;

public class Main {
    public static void main(String[] args) {
        Pacient makarov = new Pacient();
        Pacient batista = new Pacient();
        Dentists zubov = new Dentists("Виктор", "Зубов",
                "Врач-стоматолог, специалист",
                "31.12.1976",
                "Новосибирская область", "ООО Здравица");
        Diagnosis diagnosis = zubov.heal(makarov);
        zubov.healTooth(diagnosis.getOrgan());
        Surgeon chris = new Surgeon("Кристофер", "Тёрк",
                "Врач-хирург, специалист",
                "22.07.1974",
                "Гарлем, Нью-Йорк", "Клиника");
        Diagnosis diagnosis1 = chris.heal(batista);
        chris.operateBodyPart(diagnosis.getOrgan());
        Builder mahatma = new Builder("Раджа", "Махатма",
                "Мостостроитель, архитектор",
                "08.03.1992");
        Structure bridge = mahatma.createStructure();
        mahatma.mountingStructure(bridge);
        Programmer koderov = new Programmer("Иван", "Кодеров",
                "Программист-разработчик, специалист", "29.02.2000");
        Code kopatelionline = koderov.createCode();
        koderov.testCode(kopatelionline);
    }
}
