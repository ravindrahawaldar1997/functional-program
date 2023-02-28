package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Quadratic {
    static void  findingRoots() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("The Quadratic equation has no real roots");
        } else if (delta == 0) {
            int root = - b / (2 * a);
            System.out.println("The Quadratic Equation has one root" +root);
        }else{
            double root1 = (- b + Math.sqrt(delta)) / (2 *a);
            double root2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The Quadratic Equation has two roots " +root1 +" " +root2);
        }

    }
    public static void main(String[] args) {
        findingRoots();
    }
}
