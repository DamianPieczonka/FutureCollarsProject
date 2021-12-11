package com.futurecollars.OOP2Task9;

public class Triangle {
    private final double width;
    private final double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Triangle{" +
                "width=<" + width +
                ">, height=<" + height +
                ">}";
    }
}
