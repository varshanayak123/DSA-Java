package com.Basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int original = a;
        while(a>0){
            int rem = a % 10;
            sum = sum+rem*rem*rem;
            a = a/10;
        }
        if(sum == original){
            System.out.println("Its an Armstrong number");
        }else {
            System.out.println("Its not an Armstrong number");
        }
    }
}