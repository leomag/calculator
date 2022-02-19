package ru.isaev;

import java.util.stream.IntStream;
import java.util.stream.Stream;

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
//        return IntStream.of(a, b)
//                .reduce(1, (a, b) -> {
//                    try {
//                        return a / b;
//                    } catch (ArithmeticException e) {
//                        System.out.println("Arithmetic Exception: Division by Zero");
//                    }
//                    return 0;
//                });
//    }

    public int multiply(int... numbers) {
        return IntStream.of(numbers)
                .reduce(1, (a, b) -> a * b);
    }
}
