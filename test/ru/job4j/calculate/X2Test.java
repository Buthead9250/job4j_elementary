package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then40() {
        int a1 = 10;
        int b1 = 0;
        int c1 = 0;
        int x1 = 2;
        int expected1 = 40;
        int out1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, out1);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected1 = 3;
        int out1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, out1);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected1 = 2;
        int out1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, out1);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 0;
        int x1 = 1;
        int expected1 = 2;
        int out1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, out1);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 0;
        int expected1 = 1;
        int out1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, out1);
    }

}