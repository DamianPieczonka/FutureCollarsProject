package com.futurecollars.OOP2Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextFormatterLowerCaseTest {

    @Test
    void shouldFormatTextToLowerCase() {
        TextFormatter text = new TextFormatterLowerCase();
        String text2 = text.formatText("Text Example");
        assertEquals("text example", text2);
    }
    }