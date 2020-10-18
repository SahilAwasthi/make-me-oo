package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double directionBetweenNextPoint(Point nextPoint) {
        double xDistance = nextPoint.x - x;
        double yDistance = nextPoint.y - y;
        return Math.atan2(yDistance, xDistance);
    }

    public double distanceBetweenNextPoint(Point nextPoint) {
        double xDistance = nextPoint.x - x;
        double yDistance = nextPoint.y - y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

}
