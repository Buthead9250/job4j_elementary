package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = (Math.abs(x2 - x1) > 0 || Math.abs(y2 - y1) > 0)
                && (Math.abs(x2 - x1) == Math.abs(y2 - y1))
                ? Math.abs(y2 - y1) : 0;
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(0, 3, 1, 7));
    }

}
