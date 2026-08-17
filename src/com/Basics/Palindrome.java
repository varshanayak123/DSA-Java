package com.Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int rev = 0;
       int original = n;
       while (n>0){
          int rem = n % 10;
          rev = rev * 10 + rem;
          n = n/10;
       }
        System.out.println(rev);
       if(original == rev){
           System.out.println("Its a Palindrome");
       }else{
           System.out.println("Its not a Palindrome");
       }
    }
}
