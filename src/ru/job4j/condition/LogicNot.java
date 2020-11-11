package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("Характеристика числа 3:");
        boolean isevenresult = isEven(3);
        System.out.println("Четное: " + isevenresult);
        boolean ispositiveresult = isPositive(3);
        System.out.println("Положительное: " + ispositiveresult);
        boolean notevenresult = notEven(3);
        System.out.println("Нечетное: " + notevenresult);
        boolean notpositiveresult = notPositive(3);
        System.out.println("Отрицательное: " + notpositiveresult);
        boolean notevenandpositiveresult = notEvenAndPositive(3);
        System.out.println("Число нечетное и положительное: " + notevenandpositiveresult);
        boolean evenornotpositiveresult = evenOrNotPositive(3);
        System.out.println("Число четное или отрицательное: " + evenornotpositiveresult);
    }

}
