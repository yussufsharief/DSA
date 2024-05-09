package com.inteveivew;

public class MissingNumber {
    private static int getMissingNumber(int[] nums, int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
        }
        return ((n * (n+1))/2 - sum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int N = arr.length;
        int missNum = MissingNumber.getMissingNumber(arr, N);
        System.out.println(missNum);
    }
}
