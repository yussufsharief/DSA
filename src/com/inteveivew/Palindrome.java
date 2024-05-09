package com.inteveivew;

public class Palindrome {

    public static void main(String[] args) {

        int number = -2442;
        int reverse =0 ;
        int lastDigit=0;

        int initNum = number;
        while(number!=0 || number > 0) {
            lastDigit = (number % 10);
            System.out.println(lastDigit);
            reverse = (reverse * 10) + lastDigit;
            System.out.println(reverse);
            number = (number / 10);

            System.out.println(number);

        }
    }
}
