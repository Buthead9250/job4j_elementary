package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(420);
        int dollar = Converter.rubleToDollar(420);
        System.out.println("420 rubles are " + euro + " euro.");
        System.out.println("420 rubles are " + dollar + " dollars.");
    }
}