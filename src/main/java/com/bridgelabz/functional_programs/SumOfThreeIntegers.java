package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class SumOfThreeIntegers {
    static void findTriplets(int[] array, int n) {
        boolean found = false;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        found = true;
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of triplets " + count);
        if (found == false) {
            System.out.println("No triplets found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Elements of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("distinct triplets are");
        int n = array.length;
        findTriplets(array, n);
    }
}
