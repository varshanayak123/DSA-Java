package com.Basics;

public class SecondLargestElement {
    public static void main(String[] args ) {
        int[] arr = {2,4,5,9,10,7};
        int largest = arr[0];
        int SecLargest = arr[0];
        for(int i=1 ; i< arr.length ; i++) {
            if (arr[i] > largest) {
                SecLargest = largest;
                largest = arr[i];
            } else if (SecLargest < arr[i] && arr[i] != largest) {
                arr[i] = SecLargest;
            }
        }
            System.out.println("Secound Largest: "+SecLargest);

        }

    }

