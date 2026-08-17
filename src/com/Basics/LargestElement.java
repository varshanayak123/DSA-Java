package com.Basics;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 10, 8};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
            System.out.println("Largest no is: " + largest);

    }
}
