package ru.job4j.poly;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle autobus = new Autobus();
        Vehicle[] vehicles = new Vehicle[]{plane, train, autobus};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicles);
            vehicle.move();
            vehicle.capacity();
        }
    }
}
