package com.inteveivew;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){

        int sum=0;

        if(number<0){
            return -1;
        }
        while(number!=0 ||  number > 0){


            int leastDigit = (number % 10);
            if( leastDigit % 2 == 0){
                sum += leastDigit;
            }
            number = (number/10);
        }

        return sum;
    }

    public static void main(String[] args) {
        EvenDigitSum.getEvenDigitSum(123456789);
    }
}