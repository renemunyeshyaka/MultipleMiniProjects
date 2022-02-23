package com.rene;
import java.util.Scanner;
public class AdditionMethod1 {
    public static void main(String []args)
    {
        double x, y, z;
        double avg;
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter three numbers: ");
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();
        avg = average(x, y, z);
        System.out.println(" the average is: " +avg);

    }
    public static double average ( double num1, double num2, double num3)
    {
        double avg =(num1+num2+num3)/3;
        return avg;
    }
}
