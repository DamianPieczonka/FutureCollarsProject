package com.futurecollars.OOP2Task3;

public class CircleImpl implements Shape{
    private final double radius;

    public CircleImpl(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
