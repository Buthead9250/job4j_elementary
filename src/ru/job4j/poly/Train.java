package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " осуществляет пассажироперевозки по железнодорожным путям.");
    }

    @Override
    public void capacity() {
        System.out.println(getClass().getSimpleName() + " рассчитан на 96 сидящих пассажиров в вагоне.");
    }

    @Override
    public String toString() {
        return "Train";
    }
}
