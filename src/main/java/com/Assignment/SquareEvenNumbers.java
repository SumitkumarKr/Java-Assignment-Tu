package com.Assignment;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12, 13, 14, 15, 16, 17, 18, 19);

        List<Integer> squaredEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .collect(Collectors.toList());

        System.out.println("Squared Even Numbers: " + squaredEvenNumbers);
    }
}

