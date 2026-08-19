package com.Array;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int[] arr = {23,56,78,90,54,32};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}