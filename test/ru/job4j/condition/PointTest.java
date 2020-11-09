package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to30then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when510to1020then11() {
        double expected = 11.180339887498949;
        int x1 = 5;
        int y1 = 10;
        int x2 = 10;
        int y2 = 20;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when025to250then25() {
        double expected = 25.079872407968907;
        int x1 = 0;
        int y1 = 25;
        int x2 = 2;
        int y2 = 50;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when37to14then3() {
        double expected = 3.605551275463989;
        int x1 = 3;
        int y1 = 7;
        int x2 = 1;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}