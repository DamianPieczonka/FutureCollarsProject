package com.futurecollars.Collections2Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySpecialHashMapTest {

    @Test
    public void shouldPutIntoMap() {
        MySpecialHashMap hashMap = new MySpecialHashMap();

        hashMap.put("key1", "value1");

        assertEquals("value1", hashMap.get("key1"));
    }

    @Test
    public void shouldNotPutIntoMapTwiceSameKey() {
        MySpecialHashMap hashMap = new MySpecialHashMap();

        hashMap.put("key1", "value1");
        hashMap.put("key1", "value123");

        assertEquals(1, hashMap.getSize());
        assertEquals("value123", hashMap.get("key1"));
    }

    @Test
    public void shouldFindKeyIfExists() {
        MySpecialHashMap hashMap = new MySpecialHashMap();

        hashMap.put("key1", "value1");

        assertTrue(hashMap.containsKey("key1"));
    }

    @Test
    public void shouldFindValueIfExists() {
        MySpecialHashMap hashMap = new MySpecialHashMap();

        hashMap.put("key1", "value1");

        assertTrue(hashMap.containsValue("value1"));
    }

    @Test
    public void shouldNotFindKeyIfNotExists() {
        MySpecialHashMap hashMap = new MySpecialHashMap();

        hashMap.put("key111111", "value1");

        assertFalse(hashMap.containsKey("key1"));
    }

    @Test
    public void shouldNotFindValueIfNotExists() {
        MySpecialHashMap hashMap = new MySpecialHashMap();

        hashMap.put("key1", "value111111");

        assertFalse(hashMap.containsValue("value1"));
    }

    @Test
    public void shouldRemoveKey() {
        MySpecialHashMap hashMap = new MySpecialHashMap();

        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put("key4", "value4");

        hashMap.remove("key2");

        assertFalse(hashMap.containsKey("key2"));
    }

}
