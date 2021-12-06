package Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenOrOddTest {
        @Test
        void shouldVerifyIfNumberIsEven() {

            int value1 = 8;

            boolean number = EvenOrOdd.isNumberEven(value1);

            Assertions.assertTrue(number);

        }
    @Test
    void shouldVerifyIfNumberIsOdd() {

        int value1 = 7;

        boolean number = EvenOrOdd.isNumberOdd(value1);

        Assertions.assertTrue(number);

    }

}