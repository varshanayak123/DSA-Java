package com.Array;

import java.util.Scanner;

public class SearchElem {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {17, 42, 8, 31, 56, 23, 9};
        int a = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == a) {
                found = true;
                System.out.println("Found: " + a);
            }
        }
            if (! found) {
                System.out.println("Not Found: "+a);


        }
    }
}
