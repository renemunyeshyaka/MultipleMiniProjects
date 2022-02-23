package com.rene;

public class ForLoop {
    public static void main(String[] args){
            /*
            It executes a set of statement until the condition to meet is true
            It's a loop statement in Java
             */

        for (int x = 0; x<5; x++) // initialization
        {
            System.out.println("X value is: " +x);
        }
        System.out.println("----------------------------------");
        int[] array = {10,29,13,4,5,6,7,8,9,10};
        for (int num = 0; num <5;num++ ) // initialization, condition1, condition2
        {
            System.out.println(array[num]);
        }
        System.out.println("----------------------------------");

        int[] arrays = {10,29,13,4,5,6,7,8,9,10};
        for (int number : arrays )
        {
            System.out.println(number);
        }

        System.out.println("----------------------------------");

        String[] names = {"Jean", "Paul", "Peter"};
        for (String firsName : names )
        {
            System.out.println(firsName);
        }

     /*   System.out.println("Infinite Loop");


        for (;; )
        {
            System.out.println("Ndakwisabye");
        }*/



    }
}
