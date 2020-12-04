package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int point = Max.max(17, 22, 35, 9);
        System.out.println(point);
    }
}
