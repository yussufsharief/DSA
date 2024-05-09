package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FreqeuncyOfEachElementInList {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        stationeryList.stream().collect(Collectors.groupingBy(String::toString,Collectors.counting()))
                .forEach((k,v) -> System.out.println(k +" "+ v));
    }
}
