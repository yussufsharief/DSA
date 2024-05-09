package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargetNumberInArray {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().sorted().max(Comparator.naturalOrder()).stream().limit(1).forEach(System.out::println);
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
        System.out.println(listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
