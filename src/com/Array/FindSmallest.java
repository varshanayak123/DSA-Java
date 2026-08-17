package com.Array;

import java.util.Scanner;

public class FindSmallest {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,7,8,3};
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]< smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
