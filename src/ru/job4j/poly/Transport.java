package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int count);

    double load(double oil);
}
