package com.futurecollars.OOP2Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextFormatterUpperCaseTest {

    @Test
    void shouldFormatTextToUpperCase() {
        TextFormatter text = new TextFormatterUpperCase();
        String text2 = text.formatText("Text Example");
        assertEquals("TEXT EXAMPLE", text2);
    }
}