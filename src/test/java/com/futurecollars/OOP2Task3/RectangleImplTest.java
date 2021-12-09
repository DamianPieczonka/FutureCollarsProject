package com.futurecollars.OOP2Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RectangleImplTest {

    @Test
    void shouldCreateRectangle() {
        Shape rectangle = new RectangleImpl(3, 5);
        assertNotNull(rectangle);
        assertEquals(15, rectangle.getArea());
        assertEquals(16, rectangle.getPerimeter());
    }

    @Test
    void shouldCreateRectangleForFloatNumber() {
        Shape rectangle = new RectangleImpl(3.3, 5.4);
        assertNotNull(rectangle);
        assertEquals(17.82, rectangle.getArea());
        assertEquals(17.4, rectangle.getPerimeter());
    }

}