package com.Array;

import java.util.Scanner;

public class PositiveNegative {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, -5, 20, -8, 15, -2, 0};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > 0 ){
                positive++;
            }
            if( arr[i] < 0){
                negative++;
            }
            if (arr[i] == 0){
                zero++;
            }
        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
