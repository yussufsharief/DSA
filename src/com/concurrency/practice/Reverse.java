package com.concurrency.practice;

public class Reverse {

    public static void main(String[] args) {
        int i = 123;
        String s = Integer.toString(i);
        char[] a = s.toCharArray();
        for(int j=0; j <a.length ; j++){
            System.out.print(a[a.length-(j+1)]);
        }
    }
}
