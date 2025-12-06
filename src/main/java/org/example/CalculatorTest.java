package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }
    // CalculatorTest.java
    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

}

