package com.Apnikaksha.Sorting;

import java.util.Scanner;

public class BubbleSort {

    // method: sortArray
    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    // mathod: print Array
    public static void printSortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entere size ofn array: ");
        int size = sc.nextInt();
        // declear Array
        int[] arr = new int[size];

        System.out.println("Enter elemts in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // call sortArr method
        sortArr(arr);

        // call method to print Array
        printSortedArray(arr);

        sc.close();
    }

}
