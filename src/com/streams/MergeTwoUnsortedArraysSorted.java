package com.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysSorted {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        Arrays.stream(IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted().toArray()).forEach(System.out::println);

        //without dulplicates
        Arrays.stream(IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted().toArray()).distinct().forEach(System.out::println);
    }
}
