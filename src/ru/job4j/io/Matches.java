package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 11;
        String playerOne = "Player 1";
        String playerTwo = "Player 2";
        String winner = "";
        while (number > 0) {
            System.out.println("На столе лежат " + number + " спичек. " + playerOne + " возьмите от 1 до 3 спичек со стола.");
            int choice = Integer.valueOf(input.nextLine());
            if (choice > 0 && choice < 4) {
                number = number - choice;
                winner = playerOne;
            }
            System.out.println("На столе осталось " + number + " спичек, " + playerTwo + " возьмите от 1 до 3 спичек со стола.");
            int choice1 = Integer.valueOf(input.nextLine());
            if (choice1 > 0 && choice1 < 4) {
                number = number - choice1;
                winner = playerTwo;
            } else {
                System.out.println("Нарушены правила. Просьба вытянуть строго от 1 до 3 спичек.");
            }
        }
        System.out.println("Поздравляю " + winner + " с победой! Теперь вы мастер над спичками!");
    }
}
