package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to63then2_23() {
        double expected = 2.23;
        Point a = new Point(4, 2);
        Point b = new Point(6, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then1_41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        int expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00to00then0() {
        int expected = 0;
        Point a = new Point(0, 0,0);
        Point b = new Point(0, 0,0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when022to044then0() {
        double expected = 1.73;
        Point a = new Point(2, 2,2);
        Point b = new Point(3, 3,3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}