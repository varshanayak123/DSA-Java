package com.Array;

import java.util.Scanner;

public class LastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        int[] arr = {10, 20, 30, 20, 40, 50, 10};
        int a = sc.nextInt();
        int lastIdx = -1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == a){
                found = true;
                lastIdx = i;
            }
        }
        if (found) {
            System.out.println("Last occurrence of " + a + " is at index " + lastIdx);
        } else {
            System.out.println("Not found");
        }
    }
}
