package com.Array;

public class SecSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int smallest = arr[0];
        int secSmallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secSmallest && arr[i] != smallest) {
                secSmallest = arr[i];
            }
        }
        System.out.println(secSmallest);
    }
}
