package org.example;

public class Point {

    private double x;
    private double y;

    // Constructors
    public Point() {
        this(0.0, 0.0);


    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter methods for x
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Getter and Setter methods for y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
