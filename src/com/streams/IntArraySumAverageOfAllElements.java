package com.streams;

import java.util.Arrays;

public class IntArraySumAverageOfAllElements {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println(Arrays.stream(a).sum());
        System.out.println(Arrays.stream(a).average().getAsDouble());
    }
}
