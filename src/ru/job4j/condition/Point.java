package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        first = Math.pow(first, 2);
        second = Math.pow(second, 2);
        double third = first + second;
        double rsl = Math.sqrt(third);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 10, 10, 20);
        System.out.println("result (5, 10) to (10, 20) " + result);
    }
}