package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery charge = new Battery(66);
        Battery another = new Battery(3);
        System.out.println("charge : " + charge.load + ". another battery : " + another.load);
        another.exchange(charge);
        System.out.println("charge : " + charge.load + ". another battery : " + another.load
        );
    }
}
