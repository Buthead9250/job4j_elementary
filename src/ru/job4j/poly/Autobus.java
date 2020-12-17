package ru.job4j.poly;

import java.sql.SQLOutput;

public class Autobus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " осуществляет пассажироперевозки по автодороге.");
    }

    @Override
    public void capacity() {
        System.out.println(getClass().getSimpleName() + " рассчитан на 22 сидящих пассажира.");
    }

    @Override
    public String toString() {
        return "Autobus";
    }
}
