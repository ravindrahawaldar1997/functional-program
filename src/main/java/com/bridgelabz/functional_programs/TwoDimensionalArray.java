package com.bridgelabz.functional_programs;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        TwoDimensionalArray.printIntArray(readIntArray());
        TwoDimensionalArray.printDoubleArray(readDoubleArray());
        TwoDimensionalArray.printBooleanArray(readBooleanArray());
    }

    static Scanner sc = new Scanner(System.in);

    static int[][] readIntArray() {
        System.out.println("Enter the number of rows and columns of integer array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Enter the elements of  integer array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    static double[][] readDoubleArray() {
        System.out.println("Enter the number of rows and columns of double array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] array = new double[m][n];
        System.out.println("Enter the elements of double array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextDouble();
            }
        }
        return array;
    }

    static boolean[][] readBooleanArray() {
        System.out.println("Enter the number of rows and columns of boolean array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[][] array = new boolean[m][n];
        System.out.println("Enter the elements of boolean array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextBoolean();
            }
        }
        return array;
    }

    public static void printIntArray(int[][] array) {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                writer.print(array[i][j] + " ");
            }
            writer.println();
        }
        writer.flush();
    }

    public static void printDoubleArray(double[][] array) {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                writer.print(array[i][j] + " ");
            }
            writer.println();
        }
        writer.flush();
    }

    public static void printBooleanArray(boolean[][] array) {
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                writer.print(array[i][j] + " ");
            }
            writer.println();
        }
        writer.flush();
    }

}
