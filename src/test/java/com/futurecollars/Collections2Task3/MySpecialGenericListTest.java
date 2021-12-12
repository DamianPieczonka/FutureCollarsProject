package com.futurecollars.Collections2Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MySpecialGenericListTest {

    @Test
    public void shouldAddDifferentTypesToList() {
        MySpecialGenericList<String> stringList = new MySpecialGenericList<>();
        stringList.add("1");

        MySpecialGenericList<Integer> integerList = new MySpecialGenericList<>();
        integerList.add(1);

        assertEquals("1", stringList.get(0));
        assertEquals(1, integerList.get(0));
    }

    @Test
    public void shouldRemoveObjectFromList() {
        MySpecialGenericList<String> stringList = new MySpecialGenericList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        stringList.remove("2");

        assertEquals("3", stringList.get(1));
    }

    @Test
    public void shouldReturnListSize() {
        MySpecialGenericList<String> stringList = new MySpecialGenericList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        assertEquals(3, stringList.size());
    }

}
