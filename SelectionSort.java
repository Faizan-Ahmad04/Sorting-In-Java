package com.Apnikaksha.Sorting;

import java.util.*;

public class SelectionSort {

    // Selection sort
    public static void sortArray(int arr[]) {
        // Outer: loop
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i; // initial index

            // Inner: loop
            for (int j = i + 1; j < arr.length; j++) {

                // compare elements
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swap elements
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    // Static Method to Print Array
    public static void printSortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // Driver Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();
        // int[] arr = { 7, 8, 3, 1, 2 };

        // Create and initialize array
        int[] arr = new int[size];

        System.out.println("Enter elements in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Size of Array");

        // Call sortArray method to sortArray
        sortArray(arr);

        // call printsortArray method to print Array
        printSortedArray(arr);
        sc.close();
    }

}
