package com.Basics;

import java.util.Scanner;

public class CountDigit {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int digit = sc.nextInt();
       int count = 0;
       while(a>0){
           int rem = a % 10;
           if(rem == digit){
               count++;
           }
           a = a / 10;
       }
        System.out.println(count);
    }
}