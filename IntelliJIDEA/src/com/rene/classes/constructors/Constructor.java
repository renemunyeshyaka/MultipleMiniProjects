package com.rene.classes.constructors;

public class Constructor {
   int x, y, z;
   public int getaverage ()
   {
       return (int) ((x*y*z)/3);
   }
   Constructor()
   {
       System.out.println("This is our constructor!:");
       x = 10;
       y = 10;
       z = 10;
   }
   Constructor (int i , int b, int c)
   {
       x = i;
       y = b;
       z = c;
   }
}
