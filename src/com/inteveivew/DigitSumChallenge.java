package com.inteveivew;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number){
        int sum =0;

        int nextNumber = number;
         while(nextNumber != (nextNumber/10) ){

               sum +=  (nextNumber%10);
               nextNumber =  (nextNumber/10);
          }
        return sum;
    }

}
