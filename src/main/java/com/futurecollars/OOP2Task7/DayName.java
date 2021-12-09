package com.futurecollars.OOP2Task7;

public class DayName {
    private String day;

    public String getName(Day day) {
        switch (day) {
            case MONDAY:
                this.day = "Monday";
                break;
            case TUESDAY:
                this.day = "Tuesday";
                break;
            case WEDNESDAY:
                this.day = "Wednesday";
                break;
            case THURSDAY:
                this.day = "Thursday";
                break;
            case FRIDAY:
                this.day = "friday";
                break;
            case SATURDAY:
                this.day = "Saturday";
                break;
            default:
                this.day = "Sunday";
                break;
        }
        return this.day;
    }
}
