package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalcFacForFiveThenOneHunTwenty() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }
}