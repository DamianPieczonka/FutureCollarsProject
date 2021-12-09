package com.futurecollars.OOP2Task5;

public class Dog extends Animal{
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
