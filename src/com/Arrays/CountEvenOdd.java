package com.Arrays;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while(a>0){
            int rem = a % 10;
            if(rem % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
            a = a/10;
        }
        System.out.println("Even numbers are: "+evenCount);
        System.out.println("Odd numbers are: "+oddCount);
    }
}
