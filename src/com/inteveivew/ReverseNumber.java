package com.inteveivew;

public class ReverseNumber {
    public static void main(String[] args) {
        int revNum = 0;
        int lastdigit= 0;
        int number = 100;
        while(number != 0){

            lastdigit = number%10;
            revNum = (revNum*10)+lastdigit;
            number = number/10;


        }
        System.out.println(revNum);
    }
}
