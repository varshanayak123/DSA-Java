package com.Arrays;

public class SmallestElement {
    public static void main(String[] args){
        int[] arr = {4,5,9,7,2};
        int smallest = arr[0];
        for(int i=1 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest: "+smallest);
    }
}
