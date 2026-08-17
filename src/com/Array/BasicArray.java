package com.Array;

import java.util.Scanner;

public class BasicArray {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ i);

        }
    }
}
