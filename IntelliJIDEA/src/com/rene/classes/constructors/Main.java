package com.rene.classes.constructors;

public class Main {
    public static void main(String[] args)
    {
        Constructor avr = new Constructor(); // Default constructor
        System.out.println(avr.getaverage());

        Constructor avr1 = new Constructor( 10, 10, 10);
        System.out.println(avr.getaverage());

    }
}
