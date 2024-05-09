package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumbersMultiplesOf5 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream().filter(i->i%5==0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
