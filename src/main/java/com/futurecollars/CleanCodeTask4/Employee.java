package com.futurecollars.CleanCodeTask4;

public class Employee {

    private float baseSalary;
    private float bonus;
    private final String name;
    private final String surname;
    private int age;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, float baseSalary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;

    }

    public Employee(String name, String surname, int age, float baseSalary, float bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }


    public String getEmployeeName() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeNameAndAge() {
        return "Employee name and age : " + name + " " + surname + ", " + age;
    }

    public float getTotalSalary() {
        return baseSalary + bonus;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public float getBonus() {
        return bonus;
    }

}
