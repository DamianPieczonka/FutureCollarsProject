package com.futurecollars.OOP2Task3;

public class RectangleImpl implements Shape{
    private final double width;
    private final double height;

    public RectangleImpl(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
