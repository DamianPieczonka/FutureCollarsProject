package com.futurecollars.CollectionsTask4;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Kowalska", LocalDate.of(2000, 2, 12), 180, 65);
        Person person2 = new Person("Damian", "Alberski", LocalDate.of(1980, 3, 17), 170, 78);
        Person person3 = new Person("Zuzanna", "Duda", LocalDate.of(1997, 10, 15), 150, 55);
        Person person4 = new Person("Robert", "Maczek", LocalDate.of(2001, 1, 10), 200, 100);
        Set<Person> persons = new TreeSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        //od najmlodszej do najstarszej
        System.out.println(persons);

        //od najcięższej od najlżejszej
        Set<Person> persons2 = new TreeSet<>(Comparator.comparing(Person::getWeight).reversed());
        persons2.addAll(persons);
        System.out.println(persons2);

        // od najniższej do najwyższej
        Set<Person> persons3 = new TreeSet<>(Comparator.comparing(Person::getHeight));
        persons3.addAll(persons);
        System.out.println(persons3);
    }
}
