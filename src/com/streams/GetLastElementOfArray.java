package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetLastElementOfArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        System.out.println(listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get());
    }
}
