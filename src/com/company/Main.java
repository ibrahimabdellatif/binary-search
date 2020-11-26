package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // user input
        System.out.println("please int number of element ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element of " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Please Enter The Number That You Searched For ");
        int key = sc.nextInt();
        //first index in array is always 0
        binarySearch(arr, 0, n - 1, key);
//    for manual input
//        int [] arr = new int[] {10,20,30,40,50};
//        int key = 40;
//        binarySearch(arr , 0 , arr.length-1 , key);
    }

    public static void binarySearch(int[] arr, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first < last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("the element is found");
                break;
            } else {
                last = mid - 1;
            }
        }
        if (first > last) {
            System.out.println("Element is not Found !!");
        }
    }

    // binary Search With Recursion the method call it self instead of looping
    public static int binarySearchWithRecursion(int arr[], int first, int last, int key) {
        if (first > last) {
            return -1;
        } else {
            int mid = (first + last) / 2;
            if (key == arr[mid]) {
                System.out.println("element is found " + mid);
            } else if (key > arr[mid]) {
                //first = mid+1;
                binarySearchWithRecursion(arr, mid + 1, last, key);
            } else {
                binarySearchWithRecursion(arr, first, mid - 1, key);
            }
        }
        return -1;
    }
}
