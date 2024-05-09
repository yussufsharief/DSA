package com.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeateChars {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Map<String,Long> countMap = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new,Collectors.counting()));
        System.out.println(countMap.entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get());
    }
}
