package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateElements {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> integerSet = new HashSet<>();
        Set<Integer> duplicates= listOfIntegers.stream().filter(i->!integerSet.add(i)).collect(Collectors.toSet());
        System.out.println(duplicates);
        System.out.println(integerSet);
    }


}
