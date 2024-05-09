package com.streams;

import java.util.Objects;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        inputString.chars().mapToObj(c->(char)c)
                        //.filter(ch -> !Character.isSpaceChar(ch))
        .collect(Collectors.groupingBy(Character::charValue,Collectors.counting()))
                .forEach((k,v)-> System.out.println(k +" "+v));
    }
}
