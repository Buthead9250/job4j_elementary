package ru.job4j.condition;

import org.junit.Assert;
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
}
