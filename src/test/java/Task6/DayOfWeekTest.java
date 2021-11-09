package Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfWeekTest {
    @Test
    void shouldCheckIfWednesday() {
        int value1 = 3;

        String day = DayOfWeek.DaysOfWeek(value1);
        Assertions.assertEquals("Wednesday", day);


    }

    @Test
    void shouldCheckIfWeekend() {
        int value1 = 6;

        String day = DayOfWeek.DaysOfWeek(value1);
        Assertions.assertEquals("Weekend", day);


    }

    @Test
    void shouldCheckIfThereIsNoDay() {
        int value1 = 8;

        String day = DayOfWeek.DaysOfWeek(value1);
        Assertions.assertEquals("There is no such a day!", day);


    }


}