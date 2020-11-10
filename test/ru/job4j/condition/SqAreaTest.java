package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void testSquare() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double outs = SqArea.square(6, 2);
        Assert.assertEquals(expected, outs, 0.01);
    }

    @Test
    public void testSquare1() {
        int expected = 3;
        int p = 12;
        int k = 3;
        double outs = SqArea.square(12, 3);
        Assert.assertEquals(expected, outs, 0.01);
    }

    @Test
    public void testSquare2() {
        int expected = 2200;
        int p = 904;
        int k = 88;
        double outs = SqArea.square(904, 88);
        Assert.assertEquals(expected, outs, 0.01);
    }
}