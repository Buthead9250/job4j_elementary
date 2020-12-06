package ru.job4j.condition;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenZeroAndTenThenTen() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 10);
        // Point point = new Point();
        double result = a.distance(b);
        Assert.assertThat(result, is(10D));
    }

    @Test
    public void whenZeroAndTwoThenTwo() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        // Point point = new Point();
        double result = a.distance(b);
        Assert.assertThat(result, is(2D));
    }

    @Test
    public void when37And14Then3() {
        Point a = new Point(3, 7);
        Point b = new Point(1, 4);
        // Point point = new Point();
        double result = a.distance(b);
        Assert.assertThat(result, is(3.605551275463989));
    }

    @Test
    public void thenPoint3DWhen() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 3, 4);
        double result = a.distance3d(b);
        assertEquals(result, 3.74D, 0.01);
    }
}
