package com.streams;

import java.util.stream.IntStream;

public class SumOfFirst10NatNumbers {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 11).sum());
    }
}
