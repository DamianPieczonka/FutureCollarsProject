package com.futurecollars.CollectionsTask3;

public class MyOwnSpecialLinkedList {

    private Node front, end;
    private int listSize;

    public MyOwnSpecialLinkedList() {
        front = null;
        end = null;
        listSize = 0;
    }

    int getSize() {
        return listSize;
    }

    private void addAtTheBeginning(String name) {
        Node newNode = new Node(name, null, null);

        if (front == null) {
            front = newNode;
            end = front;
        } else {
            front.setPrev(newNode);
            newNode.setNext(front);
            front = newNode;
        }

        listSize++;
    }


    void addToTheEnd(String name) {
        Node newNode = new Node(name, null, null);

        if (front == null) {
            front = newNode;
            end = front;
        } else {
            end.setNext(newNode);
            newNode.setPrev(end);
            end = newNode;
        }

        listSize++;
    }

    void addAtPosition(String name, int position) {
        if (position > listSize) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(name, null, null);

        if (position == 1) {
            addAtTheBeginning(name);
        }

        Node current = front;

        for (int i = 2; i <= listSize; i++) {
            if (i == position) {
                newNode.setNext(current.getNext());
                current.getNext().setPrev(newNode);
                current.setNext(newNode);
                newNode.setPrev(current);
            } else {
                current = current.getNext();
            }
        }
        listSize++;
    }

    void removeFromIndex(int index) {
        if (index > listSize || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 1) {
            if (listSize == 1) {
                front = null;
                end = null;
                listSize = 0;
            } else {
                front = front.getNext();
                front.setPrev(null);
                listSize--;
            }
        } else if (index == listSize) {
            end = end.getPrev();
            end.setNext(null);
            listSize--;
        } else {
            Node current = front.getNext();
            for (int i = 2; i <= listSize; i++) {
                if (i == index) {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                    listSize--;
                } else {
                    current = current.getNext();
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        Node current = front;
        for (int i = 0; i < listSize; i++) {
            output.append(current.getName()).append(" ");
            current = current.getNext();
        }
        return output.toString().trim();
    }

}


class Node {

    protected String name;
    protected Node prev, next;

    public Node(String newName, Node p, Node n) {
        name = newName;
        prev = p;
        next = n;
    }

    String getName() {
        return name;
    }

    void setPrev(Node p) {
        prev = p;
    }

    Node getPrev() {
        return prev;
    }

    void setNext(Node n) {
        next = n;
    }

    Node getNext() {
        return next;
    }

}
