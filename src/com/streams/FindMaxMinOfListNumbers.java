package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinOfListNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println(listOfIntegers.stream().max(Comparator.naturalOrder()).get());
    }
}
