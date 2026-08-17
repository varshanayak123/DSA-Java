package com.Basics;

import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int smallest = 9;
        while(a>0){
             int rem = a % 10;
            if(rem < smallest){
                smallest = rem ;

            }
            a = a/10;
        }
        System.out.println(smallest);
    }
}
