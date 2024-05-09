package com.inteveivew;

public class SumFirstAndLastDigit {
    public static void main(String[] args) {

        int number = 2442;

        int first = 0;
        int lastDigit = (number%10);
        System.out.println(lastDigit);

        while(number>9){
            first = (number % 10);
            System.out.println(first);
            number = (number/10);
            System.out.println(first);
        }
        System.out.println(number);
    }
}
