package com.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class First10OddNumber {
    public static void main(String[] args) {
        IntStream.range(0,11).filter(i->i%2!=0).forEach(System.out::println);

        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));
    }
}
