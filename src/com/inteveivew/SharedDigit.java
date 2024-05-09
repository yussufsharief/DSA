package com.inteveivew;

public class SharedDigit {


    public static boolean hasSharedDigit(int a,int b){

        int adigit =0;
        int bdigit =0;
        int initB = b;
        if(a > 10 && a <= 999 && b >10 && b <= 999){

            while(a!=0 || a>0) {
                adigit = (a % 10);

                while(b!=0 || b>0){
                    bdigit = (b % 10);
                    b = (b/10);
                    if (adigit == bdigit){
                        return true;
                    }
                }
                a=(a/10);
                b=initB;

            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(SharedDigit.hasSharedDigit(12,123));
    }
}
