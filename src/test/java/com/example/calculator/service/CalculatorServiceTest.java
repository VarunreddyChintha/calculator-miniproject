package com.example.calculator.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    CalculatorService calculator = new CalculatorService();

    @Test
    void testSqrt() {
        assertEquals(4.0, calculator.sqrt(16));
    }

    @Test
    void testSqrtNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-1));
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testLn() {
        assertEquals(1.0, calculator.ln(Math.E), 0.0001);
    }

    @Test
    void testLnNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.ln(-5));
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2,3));
    }

}
