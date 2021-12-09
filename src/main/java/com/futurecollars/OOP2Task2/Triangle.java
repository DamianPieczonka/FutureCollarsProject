package com.futurecollars.OOP2Task2;

public class Triangle extends Shape {
    private final double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}
