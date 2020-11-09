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
        int euroin = 420;
        int euroexpected = 6;
        int euro = Converter.rubleToEuro(420);
        boolean passedeuro = euroexpected == euro;
        int dollarin = 420;
        int dollarexpected = 7;
        int dollar = Converter.rubleToDollar(420);
        boolean passeddollar = dollarexpected == dollar;
        System.out.println("420 rubles are " + euro + " euro. Test result : " + passedeuro);
        System.out.println("420 rubles are " + dollar + " dollars. Test result : " + passeddollar);
    }
}