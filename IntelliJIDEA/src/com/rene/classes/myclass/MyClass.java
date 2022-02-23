package com.rene.classes.myclass;

public class MyClass {
    int id;
    String name;
    int age;
    String bio;

    public MyClass (int id, String name, int age, String bio) // Constructor builder
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bio = bio;
    }

    public String toString ()
    {
        return "My id is: " + id + "\n My name is: " + name + " \n This is my age: " + age + " \n This is my bio: " +bio;
    }
}
