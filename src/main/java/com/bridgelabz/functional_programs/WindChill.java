package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class WindChill {
    static void windChill(int t, int v){
        if(t > 50 || v >120 || v < 3){
            System.out.println("Formula is not valid");
        }else{
            double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
            System.out.println("The wind chills is " +w);
        }
    }
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int v = Integer.parseInt(args[1]);
        windChill(t, v);
    }
}
