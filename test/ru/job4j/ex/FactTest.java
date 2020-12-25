package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNBelow0() {
        Fact.calc(-1);
    }

    @Test
    public void whenNEqual2() {
        int rsl = Fact.calc(2);
        assertThat(rsl, is(2));
    }
}