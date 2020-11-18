package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Jaja Binks";
        names[1] = "Alexander Pronin";
        names[2] = "Iliya Lagutenko";
        names[3] = "Vasilisa Mikulichna";
        System.out.println(names[0] + "\n" + names[1] + "\n" + names[2] + "\n" + names[3]);
    }
}
