package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 187;
        double expeted = 100.05d;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expeted, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 160;
        double expeted = 57.49;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expeted, out, 0.01);
    }
}