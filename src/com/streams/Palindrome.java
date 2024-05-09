package com.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ROTATOR";
       boolean isItPalindrome =  IntStream.range(0,str.length()/2).noneMatch(i->str.charAt(i) != str.charAt(str.length()-i-1));
        System.out.println(isItPalindrome);
    }
}
