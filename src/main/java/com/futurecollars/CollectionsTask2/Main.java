package com.futurecollars.CollectionsTask2;

public class Main {
    public static void main(String[] args) {
        MySpecialList integers = new MySpecialList();

        System.out.println("Adding");
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i));
        }

        System.out.println();
        System.out.println("Size");
        System.out.println(integers.size());

        System.out.println("IsEmpty");
        System.out.println(integers.isEmpty());

        System.out.println("Remove index of 3");
        integers.remove(3);
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i));
        }

        System.out.println();
        System.out.println("adding on index 1");
        integers.add(1, 9);
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i));
        }

        System.out.println();
        try {
            integers.add(99, 99);
        } catch (Exception e) {
            System.out.println("Adding to non existing index");
        }

        try {
            integers.remove(99);
        } catch (Exception e) {
            System.out.println("Removing from non existing index");
        }

    }
}
