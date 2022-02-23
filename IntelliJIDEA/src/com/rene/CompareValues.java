package com.rene;

import java.util.Arrays;
import java.util.Scanner;

public class CompareValues {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the X value: ");
        x = scan.nextInt();
        System.out.println("Enter the y value: ");
        y = scan.nextInt();

        if (x>y){
            System.out.println("x is greater than Y");
            System.out.println("  JAVA IS AWESOME   ");
        }
        else if (x == y) {
            System.out.println("x is equal to y and vice versa");
            System.out.println("  JAVA IS AWESOME   ");
        }
        else {
            System.out.println(" y is greater than x");
            System.out.println("  JAVA IS AWESOME   ");
        }
    }
}
