package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedElementInTheArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        listOfStrings.stream().collect(Collectors.groupingBy(s -> s,Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+" "+v));

        Map<String,Long> mostFreq =  listOfStrings.stream().collect(Collectors.groupingBy(s -> s,Collectors.counting()));
        System.out.println(mostFreq.entrySet().stream().max(Map.Entry.comparingByValue()).get());
    }




}
