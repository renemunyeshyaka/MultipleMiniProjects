package com.rene;
import java.util.Random;
public class OverLoadingFunction { // OverloadedMethod in JAVA.
    public static void main(String[] args)
    {
        System.out.println("The average of the three numbers = " + average(3,5,9));
        System.out.println("The average of the three double = " + average(4.6,5.9,6.5));
        System.out.printf("The average of the three double :%5.2f" , average(4.6,5.9,6.5)); // here use "printf" instead of "println".
    }
    public static double average(int x, int y, int z)
    {
        return (x+y+z)/3.0;
    }
    public static double average(double x, double y, double z)
    {
        return (x+y+z)/3;
    }

}
