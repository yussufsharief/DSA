package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStringsWithExtraStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        System.out.println(listOfStrings.stream().collect(Collectors.joining(", ", "[", "]")));
    }
}
