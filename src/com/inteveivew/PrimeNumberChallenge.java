package com.inteveivew;

public class PrimeNumberChallenge {
    public static void main(String[] args) {

        int primeNumCounter = 0;
        for (int num = 10; num <= 1000; num++) {
            if(isPrime(num)){
                System.out.println(num + "is Prime Number");
                primeNumCounter++;
                if(primeNumCounter == 3) {
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber == 2);
        }
        for(int divisor =2 ;divisor<wholeNumber/2;divisor++){
            if(wholeNumber%divisor==0){
                return false;
            }
        }

        return true;
    }
}
