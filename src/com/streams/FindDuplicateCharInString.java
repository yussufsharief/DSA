package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll(" ", "").toLowerCase();
        System.out.println(inputString);
        Set<String> uniqueChars =  new HashSet<>();



        Arrays.stream(inputString.split("")).filter(ch->!uniqueChars.add(ch))
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
