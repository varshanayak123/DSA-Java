package com.Array;

import java.util.Scanner;

public class FirstOccurance {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 20, 40, 50};
        boolean found = false;
        int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                System.out.println("Found" + search + " at index" + i);
                break;
            }
            }
            if(!found){
                System.out.println("Not found");
            }
        }
    }

