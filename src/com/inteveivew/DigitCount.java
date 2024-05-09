package com.inteveivew;

public class DigitCount {
    public static void main(String[] args) {
        int number =52587;
        if(number>9 && number<=0) {
            //return 1;
        } else {
           // return -1;
        }

        int counter=0;

        while((number%10) != 0 || number >9){

            number = number/10;

            counter++;
        }
        System.out.println(counter);
    }
}
