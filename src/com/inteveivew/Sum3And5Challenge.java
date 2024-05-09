package com.inteveivew;

public class Sum3And5Challenge {

    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 1 ; i<=1000;i++){
            if(i%3 == 0  && i%5 == 0){
               sum += i;
               counter ++;
                System.out.println(i + "is divided by Both 3 and 5");
                if(counter==5)
                    break;
            }

        }
        System.out.println(sum);
    }
}
