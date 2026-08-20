package com.Array;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 10, 30, 10, 40};
        int count = 0;
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
                count++;
            }
        }
        System.out.println("Total frequency: "+count);
    }
}
