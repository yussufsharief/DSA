package com.concurrency.practice;

public class ConversionOverload {

    public static double convertToCentimeters(int heightInInches){

        return heightInInches*2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches){


        return ((heightInFeet*12)+heightInInches)*2.54;
    }

    
    public static void main(String[] args) {
        System.out.println(ConversionOverload.convertToCentimeters(68));
        System.out.println(ConversionOverload.convertToCentimeters(5,8));
    }
}
