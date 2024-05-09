package com.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfStream {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" ")));
    }
}
