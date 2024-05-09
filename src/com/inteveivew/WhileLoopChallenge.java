package com.inteveivew;

public class WhileLoopChallenge {
    public static void main(String[] args) {

        int i = 5;
        int totalEven=0;
        int totalOdd=0;
        while (i<=20){
            if(isEvenNumber(i)){
                totalEven++;
                System.out.println(i);
                if(totalEven ==5)
                    break;
            } else {
                totalOdd ++;
            }
            i++;
        }
        System.out.println("Total Even "+totalEven +" "+ "Total Odd "+ totalOdd);
    }
    public static boolean isEvenNumber(int number){

        return (number > 0 && number % 2 == 0);

    }

}
