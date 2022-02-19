package ru.isaev;

import java.util.stream.IntStream;

public class Calculator {

    public int add(int... numbers) {
        return IntStream.of(numbers)
                .sum();
    }

    public int min(int... numbers) {
        return IntStream.of(numbers)
                .min().getAsInt();
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int... numbers) {
        return IntStream.of(numbers)
                .reduce(1, (a, b) -> a * b);
    }
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
