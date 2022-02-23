package com.rene;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Enter your 1st Value: ");
        x = scan.nextInt();
        System.out.println("Enter your 2nd Value: ");
        y = scan.nextInt();
        System.out.println("Enter the operation: ");
        String operation = scan.next();
        if (operation.equals("+")){
            System.out.println("This is the addition, Sum: " +(x+y));
        }
        else if (operation.equals("-")){
            System.out.println("This is the subtraction, Sum: " +(x-y));
        }
        else if (operation.equals("*")){
            System.out.println("This is the multiplication, Product: " +(x*y));
        }
        else if (operation.equals("/")){
            System.out.println("This is the division, Product: " +(x/y));
        }
        else if (operation.equals("%")){
            System.out.println("This is the modulo Product: " +(x%y));
        }
        else {
            System.out.println("The value is wrong! Please enter the correct operator: ");
        }

    }
}
