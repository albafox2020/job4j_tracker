package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Point c = new Point(4, 2);
        Point d = new Point(6, 3);
        double distV2 = c.distance(d);
        System.out.println(dist);
        System.out.println(distV2);
    }
}
