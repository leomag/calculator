package ru.isaev;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // given:
        this.calculator = new Calculator();
    }

    @Test
    @DisplayName("Add two numbers")
    void add() {
        // when:
        int actual = calculator.add(5, 4);
        // result:
        assertEquals(9, actual);
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, calculator.multiply(2, 2)),
                () -> assertEquals(-4, calculator.multiply(2, -2)),
                () -> assertEquals(4, calculator.multiply(-2, -2)),
                () -> assertEquals(0, calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("Min from numbers")
    void min() {
        int actual = calculator.min(3, 43, 1, -2);
        assertEquals(-2, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15})
    void isOdd(int number) {
        assertTrue(calculator.isOdd(number));
    }

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        assertAll(() -> assertEquals(1, calculator.divide(2, 2)),
                () -> assertEquals(2, calculator.divide(4, 2)));
    }

    @Test
    @DisplayName("Should ArithmeticException two numbers")
    void divideShouldArithmeticException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
    }

}