package com.dsa.problems;

public class SumOFNNumbers {

   /* Sum of n Numbers
    IP :1+2+3
    OP :6
*/

    public static void method1() {
        //1 method


        //int[] num = new int[]{1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }

    public static void method2() {
        //another method (n*(n+1))/2
        int[] num = new int[]{1, 2, 3, 4, 5, 6};

        int sum = num.length*(num.length+1)/2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
          SumOFNNumbers.method1();
          SumOFNNumbers.method2();

    }
}
