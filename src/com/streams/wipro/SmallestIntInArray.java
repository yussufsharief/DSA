package com.streams.wipro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestIntInArray {

    public int solution() {
        int[] a = new int[]{-1, 3, 6, -4, 5, 2};

        Arrays.sort(a);
        int[] disArray = Arrays.stream(a).distinct().toArray();

        int top = disArray[0];

        int bottom = disArray[disArray.length - 1];

        int nextInt =0;
        if (top < 0 && bottom < 0) {
            return 1;
        }
        for (int i = 1; i <= disArray.length; i++) {

            if (disArray[i - 1] != i) {

                return i;
            } else {
                nextInt=i+1;
            }

        }
        return nextInt;
    }

    public static void main(String[] args) {
        SmallestIntInArray smallestIntInArray = new SmallestIntInArray();
        System.out.println(smallestIntInArray.solution());
    }
}
