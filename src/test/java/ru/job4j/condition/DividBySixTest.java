package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class DividBySixTest {
    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DividBySix.checkNumber(in);
        String expected = "The number divides by 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DividBySix.checkNumber(in);
        String expected = "The number divides by 3, but it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DividBySix.checkNumber(in);
        String expected = "The number doesn't divide by 3, but it is the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DividBySix.checkNumber(in);
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }
}