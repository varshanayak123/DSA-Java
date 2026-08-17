package com.Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {23,56,65,43,47,98,12};
        int a = sc.nextInt();
        boolean found = false;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == a){
                found = true;
                System.out.println("Element Found: "+a);
            }
        }
        if(!found){
            System.out.println("Not Found Element: "+a);
        }
    }
}