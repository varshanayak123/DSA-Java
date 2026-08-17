package com.Array;

import java.util.Scanner;

public class FIndLArgest {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,81,3};
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
