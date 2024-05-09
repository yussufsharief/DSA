package com.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int i = 12345;
        Integer intsum1 = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(intsum1);

        Integer intsum2 = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(intsum2);
    }
}
