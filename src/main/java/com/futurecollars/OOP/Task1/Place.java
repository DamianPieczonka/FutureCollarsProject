package com.futurecollars.OOP.Task1;


public class Place {


    private final int placeNumber;
    private final int rowNumber;
    private boolean isPlaceEmpty;

    public Place(int placeNumber, int rowNumber, boolean isPlaceEmpty) {
        this.placeNumber = placeNumber;
        this.rowNumber = rowNumber;
        this.isPlaceEmpty = isPlaceEmpty;

    }
    public int getPlaceNumber() {
        return placeNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isPlaceEmpty() {
        return isPlaceEmpty;
    }
}

