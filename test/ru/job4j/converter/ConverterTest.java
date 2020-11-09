package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest  {

    @Test
    public void whenConvert420RblThen6Euro() {
        int euroin = 420;
        int euroexpected = 6;
        int euroout = Converter.rubleToEuro(euroin);
        Assert.assertEquals(euroexpected, euroout);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        int dollarin = 180;
        int dollarexpected = 3;
        int dollarout = Converter.rubleToDollar(dollarin);
        Assert.assertEquals(dollarexpected, dollarout);
    }
}