package com.Array;

public class totalSum {
    public static void main(String[] args){
        int[] arr = {10, 5, 20, 8, 15};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
