package com.Array;

import java.util.Scanner;

public class FindSmallest {
   public static void main(String[] args){
       int[] arr = {10, 5, 20, 8, 15};
       int smallest = arr[0];
       for(int i=0; i<arr.length; i++){
           if(arr[i] < smallest){
               smallest = arr[i];
           }
       }
       System.out.println("Smallest: "+ smallest);
    }
}
