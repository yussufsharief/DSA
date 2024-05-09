package com.inteveivew;

public class NumberToWords {
    public static void main(String[] args) {
int number =0;
        if(number<0){
            System.out.println("Invalid Value");
        }

        int lastdigit = 0;
        while(number<9){
            lastdigit = number%10;
            number = number/10;
            if(lastdigit == 0 ){
                System.out.println("Zero");
            } else if(lastdigit == 1 ){
                System.out.println("One");
            }else if(lastdigit == 2 ){
                System.out.println("Two");
            }else if(lastdigit == 3 ){
                System.out.println("Three");
            }else if(lastdigit == 4 ){
                System.out.println("Four");
            }else if(lastdigit == 5 ){
                System.out.println("Five");
            }else if(lastdigit == 6 ){
                System.out.println("Six");
            }else if(lastdigit == 7 ){
                System.out.println("Seven");
            }else if(lastdigit == 8 ){
                System.out.println("Eight");
            }else if(lastdigit == 9 ){
                System.out.println("Nine");
            }
        }

    }
}
