package com.futurecollars.JunitTask4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextLengthTest {
    TextLength textLength = new TextLength();

    @ParameterizedTest
    @MethodSource("data")
    void shouldReturnStringLength(String input, int expected) {
        assertEquals(expected, textLength.returnTextLength(input));
    }

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(null, 0),
                Arguments.of("", 0),
                Arguments.of("  ", 2),
                Arguments.of("not blank", 9)
        );
    }
}
