package com.dsa.problems;

public class FindIthBitOfNumber {

    public static int findIthBit(int num){
        int number = 123456;
        return (number & (1 << num-1));

    }
    public static void main(String[] args) {

        int num = 4;
        int i = findIthBit(num);
        System.out.println(i);

    }
}
