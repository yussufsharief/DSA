package com.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStringAnagrams {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        System.out.println(Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining()));
    }
}
