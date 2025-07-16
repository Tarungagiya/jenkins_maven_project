package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testGetMessage() {
        String expected = "Hello from Maven project!";
        String actual = HelloWorld.getMessage();
        assertEquals(expected, actual, "The message should match the expected value.");
    }
}
