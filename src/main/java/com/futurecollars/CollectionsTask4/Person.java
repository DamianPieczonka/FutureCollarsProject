package com.futurecollars.CollectionsTask4;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private double height;
    private double weight;

    public Person(String name, String surname, LocalDate dateOfBirth, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }


    @Override
    public int compareTo(Person person) {
        return person.getDateOfBirth().compareTo(getDateOfBirth());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(dateOfBirth, person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth, height, weight);
    }
}
