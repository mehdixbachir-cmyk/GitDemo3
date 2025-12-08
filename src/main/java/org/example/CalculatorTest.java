package org.example;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
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
    @Test
    void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(10, 0));
    }
    @Test

    public void testModulo() {
        Assertions.assertEquals(1, Calculator.modulo(10, 3));




    }
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.subtract(5, 2));
    }




}

