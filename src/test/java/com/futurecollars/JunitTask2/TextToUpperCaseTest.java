package com.futurecollars.JunitTask2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextToUpperCaseTest {
    TextToUpperCase textToUpperCase = new TextToUpperCase();

    @ParameterizedTest
    @ValueSource(strings = {"Example String"})
    void shouldConvertToUpperCase(String value) {
        assertEquals("EXAMPLE STRING", textToUpperCase.toUpper(value));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnEmptyStringIfValueIsNull(String value) {
        assertEquals("", textToUpperCase.toUpper(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void shouldReturnEmptyStringIfValueEmpty(String input) {
        assertEquals("", textToUpperCase.toUpper(input));
    }
}
