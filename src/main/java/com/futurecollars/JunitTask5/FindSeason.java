package com.futurecollars.JunitTask5;

import java.time.Month;

public class FindSeason {
    public Season getSeason(Month month) {
        switch (month) {
            case MARCH:
            case APRIL:
                return Season.SPRING;
            case MAY:
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
                return Season.FALL;
            case NOVEMBER:
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            default:
                throw new IllegalArgumentException("How did you get here?");
        }
    }
}
