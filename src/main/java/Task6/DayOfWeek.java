package Task6;

public class DayOfWeek {


    public static String DaysOfWeek (int arg) {
        String Day;
        switch (arg) {
            case 1:  Day= "Monday"; break;
            case 2:  Day= "Tuesday"; break;
            case 3:  Day= "Wednesday"; break;
            case 4:  Day= "Thursday"; break;
            case 5:  Day= "Friday"; break;
            case 6: case 7: Day = "Weekend"; break;
            default: Day = "There is no such a day!"; break;
        }
        return Day;
    }
}
