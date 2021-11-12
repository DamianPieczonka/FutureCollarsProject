package com.futurecollars.OOPTask2;

public class Movie {

    private String title;
    private String name;
    private String lastName;
    private short lenght;
    private int yearOfProduction;

    public Movie (String title, String name, String lastName, short lenght, int yearOfProduction) {
        this.title = title;
        this.name = name;
        this.lastName = lastName;
        this.lenght = lenght;
        this.yearOfProduction = yearOfProduction;
    }
    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public short getLenght() {
        return lenght;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }



}
