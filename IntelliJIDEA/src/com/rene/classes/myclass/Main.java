package com.rene.classes.myclass;
import com.rene.classes.myclass.MyClass;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        MyClass myInfo = new MyClass(10, "MUNYESHYAKA", 42, "I'm Computer Science Engineer");
        System.out.println(myInfo.toString());
        System.out.println("New Member Here: ...............................................");
        MyClass myBrother = new MyClass(20, "SAFARI", 32, "I'm Soccer Player Professional");
        System.out.println(myBrother.toString());

        /*
        myInfo.id = 10;
        myInfo.name = "MUNYESHYAKA";
        myInfo.age = 42;
        myInfo.bio = "I'm software Engineer";
        System.out.println("My ID number is "+ myInfo.id + " my name is " + myInfo.name + " with " + myInfo.age + " years old" + " and "  + myInfo.bio);

        MyClass myBrother = new MyClass(); // this is called an object or instance
        myInfo.id = 20;
        myInfo.name = "SAFARI";
        myInfo.age = 24;
        myInfo.bio = "I'm soccer player";
        System.out.println("My ID number is "+ myInfo.id + " my name is " + myInfo.name + " with " + myInfo.age + " years old" + " and "  + myInfo.bio);
        */

    }
}
