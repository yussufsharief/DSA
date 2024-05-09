package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MoveAllZerosToLast {

    public static void main(String[] args) {
        int [] a = {0,1,2,0,3,4,0,6,7,0,8,9,0};

        //Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);

        int lastPostion = a.length-1;
        int temp;
        for(int i = 0;i<a.length;i++){
            for(int j = lastPostion;j<a.length;j--){
                if(a[i]==0 && a[j]!=0){
                    temp=a[j];
                    a[j] = a[i]; //1
                    a[i] = temp;
                    lastPostion =1;
                } else {

                }
            }

        }

    }
}
