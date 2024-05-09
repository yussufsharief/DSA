package com.dsa.problems;

public class FindUniqueIntheArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,3,6,4};
        System.out.println(ans(arr));

    }
    public static  int ans(int [] arr){
        int uique = 0;
        for(int a : arr){
            uique ^= a;
        }
        return uique;
    }
}

