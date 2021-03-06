package com.futurecollars.Collections2Task2;

public class MySpecialFIFOQueue implements OwnQueue {
    private int size;
    private Node front, back;

    public MySpecialFIFOQueue() {
        size = 0;
        front = null;
        back = null;
    }

    public boolean add(Integer value) {
        Node node = new Node(value);
        if (isEmpty()) {
            front = node;
        } else {
            back.setNext(node);
        }
        back = node;
        size++;
        return true;
    }

    public Integer remove() {
        if (isEmpty()) {
            throw new RuntimeException("No elements");
        }
        int value = front.getValue();
        front = front.getNext();
        size--;
        if (isEmpty()) {
            back = null;
        }
        return value;
    }

    public Integer element() {
        if (isEmpty()) {
            throw new RuntimeException("No elements");
        }
        return front.getValue();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

class Node {

    private Integer value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
