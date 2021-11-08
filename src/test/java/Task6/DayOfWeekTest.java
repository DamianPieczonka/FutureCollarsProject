package Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfWeekTest {
    @Test
    void shouldCheckIfWednesday() {
        int value1 = 3;

        String Day=DayOfWeek.DaysOfWeek(value1);
        Assertions.assertEquals("Wednesday",Day);


    }
    @Test
    void shouldCheckIfWeekend() {
        int value1 = 6;

        String Day=DayOfWeek.DaysOfWeek(value1);
        Assertions.assertEquals("Weekend",Day);


    }
    @Test
    void shouldCheckIfThereIsNoDay() {
        int value1 = 8;

        String Day=DayOfWeek.DaysOfWeek(value1);
        Assertions.assertEquals("There is no such a day!",Day);


    }



}