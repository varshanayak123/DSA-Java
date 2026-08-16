package com.Arrays;

import java.util.Scanner;
public class FindLargest {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int Largest = 0;
        while(a>0){
            int rem = a % 10;
            if(rem > Largest){
                Largest = rem;
            }
            a = a / 10;
        }
        System.out.println(Largest);
    }
}

