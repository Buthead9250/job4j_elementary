package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " осуществляет перевозки пассажиров по воздуху.");
    }

    @Override
    public void capacity() {
        System.out.println(getClass().getSimpleName() + " рассчитан на 188 сидящих пассажира.");
    }

    @Override
    public String toString() {
        return "Plane";
    }
}
