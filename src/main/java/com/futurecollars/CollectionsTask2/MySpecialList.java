package com.futurecollars.CollectionsTask2;

public class MySpecialList implements OwnList {
    private Integer[] values;
    private int size;

    private final static int DEFAULT_SIZE = 10;

    private int arraySize = DEFAULT_SIZE;

    public MySpecialList() {
        values = new Integer[DEFAULT_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Integer element) {
        resize();
        values[size] = element;
        size++;
    }

    @Override
    public Integer get(int i) {
        if (i < size && i >= 0) {
            return values[i];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void add(int index, Integer element) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        resize();
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = element;
        ++size;
    }

    @Override
    public Integer remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(values, index + 1, values, index, size - index - 1);
        Integer removed = values[--size];
        values[--size] = null;
        resize();
        return removed;
    }

    private void resize() {
        if (size >= arraySize) {
            Integer[] newValues = new Integer[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
        if (size >= DEFAULT_SIZE && size < arraySize / 4) {
            Integer[] newValues = new Integer[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
    }

}
