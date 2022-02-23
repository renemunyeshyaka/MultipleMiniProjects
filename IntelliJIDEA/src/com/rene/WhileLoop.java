package com.rene;

public class WhileLoop {
    public static void main (String[] args){
        int count = 1;
        while (count <= 10) // Condition is verified before printing. Its keeps printing as long as the condition value is less/equal to 10
        {
            System.out.println(count);
            count ++; // repeat and verify the condition and print the new value again until the last condition is verified.
        }

    }
}
