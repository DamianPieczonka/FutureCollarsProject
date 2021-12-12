package com.futurecollars.Collections2Task5;

public class GenericBubbleSorter<T extends Comparable<T>> {
    private final T[] table;

    public GenericBubbleSorter(T[] table) {
        this.table = table;
    }

    public T[] sortWithBubbleMethod() {
        int tableLength = table.length;
        while (tableLength > 0) {
            int last = 0;
            for (int current = 1; current < tableLength; current++) {
                if (table[current - 1].compareTo(table[current]) > 0) {
                    T temp = table[current - 1];
                    table[current - 1] = table[current];
                    table[current] = temp;
                    last = current;
                }
            }
            tableLength = last;
        }
        return table;
    }
}
