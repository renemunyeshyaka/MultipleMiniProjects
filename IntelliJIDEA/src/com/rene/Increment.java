package com.rene;

public class Increment {public static void main (String[] args){
        /*
        int x = 1;
        System.out.println("The value of x is = " + x++); //actual value of x being incremented
        System.out.println("The new value of x is = " + x); // new value of x now printed
        int z = (x+5);
        System.out.println("The value of z is = " + z); //the value of z printed
        System.out.println("The new value of z is = " + --z); // The new value of z now printed
        int y = ++x;
        System.out.println("The new value of y is = " + y); // new value of x now printed

         */

    int num1;
    int num2;
    int num3;
    num1 = 100;
    num2 = ++num1; // num1 being incremented by 1
    num3 = num2++ + ++num1; //num2 incremented again (become 102) add initial num1 incremented (up to 101)
    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
    System.out.println("num3 = " + num3); // 102 + 101 = 203

}
}
