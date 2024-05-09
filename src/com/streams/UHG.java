package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UHG {
    public static void main(String[] args) {

        List<String> list  = Arrays.asList("apple","banana","choc","mango","banana");
        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(list.stream().count());

        Arrays.asList(2,3,4,5).stream().map(n->n*2).forEach(System.out::println);
    }
}
