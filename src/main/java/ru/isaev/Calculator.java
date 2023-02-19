package ru.isaev;

import java.util.stream.IntStream;

public class Calculator {

    public int add(final int... numbers) {
        return IntStream.of(numbers)
                .sum();
    }

    public int min(final int... numbers) {
        return IntStream.of(numbers)
                .min().getAsInt();
    }

    public int divide(final int a, final int b) {
        return a / b;
    }

    public int multiply(final int... numbers) {
        return IntStream.of(numbers)
                .reduce(1, (a, b) -> a * b);
    }
    public boolean isOdd(final int number) {
        return number % 2 != 0;
    }
}
