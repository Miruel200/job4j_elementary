package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expeted = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expeted, out, 0.01);
    }

    @Test
    public void when52to68then6dot08() {
        double expeted = 6.08;
        int x1 = 5;
        int y1 = 2;
        int x2 = 6;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expeted, out, 0.01);
    }

    @Test
    public void when96to84then8dot23() {
        double expeted = 2.23;
        int x1 = 9;
        int y1 = 6;
        int x2 = 8;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expeted, out, 0.01);
    }

}