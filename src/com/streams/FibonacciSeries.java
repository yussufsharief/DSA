package com.streams;

import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        Stream.iterate(new Long[]{0L,1L},f-> new Long[] {f[1],f[0]+f[1]})
                .limit(10)
                .map(f->f[0])
                .forEach(System.out::println);
    }
}
