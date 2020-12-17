package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("go");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Count of passengers:" + count);
    }

    @Override
    public double load(double liter) {
        double price = 44.85;
        return liter * price;
    }
}
