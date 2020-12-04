package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax17To22Then22() {
        int result = Max.max(17, 22);
        assertThat(result, is(22));
    }

    @Test
    public void whenMax9To2To14Then14() {
        int result = Max.max(9, 2, 14);
        assertThat(result, is(14));
    }

    @Test
    public void whenMax13To13Then13() {
        int result = Max.max(13, 13);
        assertThat(result, is(13));
    }

    @Test
    public void whenMax13To8To29To1Then29() {
        int result = Max.max(13, 9, 29, 1);
        assertThat(result, is(29));
    }
}