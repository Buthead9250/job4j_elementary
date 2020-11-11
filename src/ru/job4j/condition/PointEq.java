package ru.job4j.condition;

public class PointEq {

    public static boolean eq(int x1, int y1, int x2, int y2) {
        return (x1 == x2) && (y1 == y2);
    }

    public static void main(String[] args) {
        System.out.println("Проверка равенства точек в системе координат, если х(1:1) а у(2:2):" + eq(1, 1, 2, 2));
        System.out.println("Проверка равенства точек в системе координат, если х(10:10) а у(10:10):" + eq(10, 10, 10, 10));
    }
}
