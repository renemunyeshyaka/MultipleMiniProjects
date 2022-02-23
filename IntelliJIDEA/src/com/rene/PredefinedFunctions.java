package com.rene;
import java.util.Random; // search for "JAVA Documentation" at mayyan.org or google.com: go in "java.util.Random", to see all info
public class PredefinedFunctions
    {
    public static void main(String [] args)
    {
        int die1, die2, countDouble = 0;
        Random rand = new Random();

        for (int i = 0; i < 100; i++)
        {
            die1 = rand.nextInt(6)+1;
             die2 = rand.nextInt(6)+1;
             if (die1 == die2)
             {
                countDouble++;
             }
        }
        System.out.println("I rolled = " + countDouble + " doubles");
    }
}
