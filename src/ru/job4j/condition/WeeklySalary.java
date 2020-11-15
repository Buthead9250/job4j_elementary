package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int pay = 0;
        int powerpay = 0;
        int holliday = 0;
        int powerholliday = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    pay = pay + (hours[i] * 10);
                } else if (hours[i] > 8) {
                    powerpay = 80 + ((hours[i] - 8) * 15) + powerpay;
                }
            }
            if (i >= 5) {
                if (hours[i] <= 8) {
                    holliday = holliday + (hours[i] * 20);
                } else if (hours[i] > 8) {
                    powerholliday = 160 + ((hours[i] - 8) * 30) + powerholliday;
                }
            }
        }
        return pay + powerpay + holliday + powerholliday;
    }

    public static void main(String[] args) {
        int[] hours = {8, 8, 8, 8, 0, 12, 0};
        int result = WeeklySalary.calculate(hours);
        System.out.println(result);
    }
}
