package com.Array;

public class FindEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 7};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

