package com.rene;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double[] prices = new double[5];
        System.out.println("Enter 5 values: ");
        prices[0] = in.nextDouble();
        prices[1] = in.nextDouble();
        prices[2] = in.nextDouble();
        prices[3] = in.nextDouble();
        prices[4] = in.nextDouble();
        double total = (prices[0] + prices[1] + prices[2] + prices[3] + prices[4]);
        System.out.println("The total value of all the 5 items is: $" + total);
        /*
          * With printf, use "," instead of "+" to indicate the number of decimal number after the point.
          * remember to add % sign followed by number of arrays, a dot and the number of decimal number after the point.
        */
        System.out.printf("The total value of all the 5 items is: $%5.2f ", total); // with 5 as number of item and 2 the floating number
    }
}
