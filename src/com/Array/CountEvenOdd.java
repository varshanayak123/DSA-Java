package com.Array;

import java.util.Scanner;

public class CountEvenOdd {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] arr = {1,2,3,4,5,6,7,8,9,10};
         int CountEven = 0;
         int CountOdd = 0;
         for(int i=0; i< arr.length; i++){
             if(arr[i] % 2 == 0){
                 System.out.println("Even numbers: "+arr[i]);
               CountEven++;
             }else {
                 System.out.println("Odd numbers: "+arr[i]);
                 CountOdd++;
             }
         }
         System.out.println("Even numbers are: "+CountEven);
         System.out.println("Odd numbers are: "+CountOdd);
    }
}
