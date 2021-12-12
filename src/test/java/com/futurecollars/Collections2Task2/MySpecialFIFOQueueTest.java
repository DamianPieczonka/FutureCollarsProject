package com.futurecollars.Collections2Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySpecialFIFOQueueTest {

    @Test
    public void shouldInsertIntoQueue() {
        MySpecialFIFOQueue queue = new MySpecialFIFOQueue();

        queue.add(1);

        assertEquals(1, queue.element());
    }

    @Test
    public void shouldRemoveFromQueue() {
        MySpecialFIFOQueue queue = new MySpecialFIFOQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();

        assertEquals(2, queue.element());
    }

    @Test
    public void shouldReturnQueueSizeWhenAdded() {
        MySpecialFIFOQueue queue = new MySpecialFIFOQueue();

        queue.add(1);

        assertEquals(1, queue.getSize());
    }

    @Test
    public void shouldReturnFalseWhenEmptyQueue() {
        MySpecialFIFOQueue queue = new MySpecialFIFOQueue();

        assertTrue(queue.isEmpty());
    }

}
