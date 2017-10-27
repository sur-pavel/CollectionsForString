package ru.surpavel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountStringCharsTest {


   private CountStringChars countStringChars = new CountStringChars();


    @Test
    public void string_CountStringChars() {
        String expected =
                "\"h\" - 1\n" +
                "\"e\" - 1\n" +
                "\"l\" - 3\n" +
                "\"o\" - 2\n" +
                "\"w\" - 1\n" +
                "\"r\" - 1\n" +
                "\"d\" - 1\n" +
                "\"!\" - 1\n" +
                "\" \" - 1";
        String actual = countStringChars.count("hello world!");
        assertEquals(expected, actual);
    }

    @Test
    public void word_CountWordChars() {
        String expected =
                "\"h\" - 1\n" +
                "\"e\" - 1\n" +
                "\"l\" - 2\n" +
                "\"o\" - 1\n";
        String actual = countStringChars.count("hello");
        assertEquals(expected, actual);
    }

    @Test
    public void emptyString_ReturnEmptyString() {
        String expected = "";
        String actual = countStringChars.count("");
        assertEquals(expected, actual);
    }

    @Test
    public void checkInputsMap() {
        String input = "hello";
        String expected =
                "\"h\" - 1\n" +
                "\"e\" - 1\n" +
                "\"l\" - 2\n" +
                "\"o\" - 1\n";
        countStringChars.count(input);
        String actual = countStringChars.getInputsMap().get(input);
        assertEquals(expected, actual);
    }
}