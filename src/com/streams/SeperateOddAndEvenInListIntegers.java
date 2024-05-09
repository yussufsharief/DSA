package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeperateOddAndEvenInListIntegers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
         listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0))
                 .forEach((k,v)-> {
                     if(k){
                         System.out.println("Even --->"+ v);
                     } else {
                         System.out.println("Odd --->"+ v);
                     }
                 });



    }
}
