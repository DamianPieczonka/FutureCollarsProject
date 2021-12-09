package com.futurecollars.OOP2Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCreateRectangle() {
        Shape rectangle = new Rectangle(3, 5);
        assertNotNull(rectangle);
        assertEquals(15, rectangle.getArea());
        assertEquals(16, rectangle.getPerimeter());
    }

    @Test
    void shouldCreateRectangleForFloatNumber() {
        Shape rectangle = new Rectangle(3.3, 5.4);
        assertNotNull(rectangle);
        assertEquals(17.82 ,rectangle.getArea());
        assertEquals(17.4, rectangle.getPerimeter());
    }

}