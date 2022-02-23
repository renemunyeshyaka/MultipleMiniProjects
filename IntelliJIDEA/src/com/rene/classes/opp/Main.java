package com.rene.classes.opp;

/*
 * AuthorName: Jean René MUNYESHYAKA
 * Concept: encapsulation
*/
public class Main {
    public static void main(String[] args)
    {
        MyClass rene = new MyClass();

        /*System.out.println("ID: "+ rene.getAge() + "\n Names: " + rene.getName() + "\n Age: " + rene.getAge() + "\n Biböiography: " + rene.getBio());*/

        rene.setId(10);
        rene.setNames("JEAN RENE MUNYESHYAKA");
        rene.setAge(44);
        rene.setBio("He is cool to work with!");
        System.out.println("ID: "+ rene.getId() + "\n Names: " + rene.getName() + "\n Age: " + rene.getAge() + "\n Biböiography: " + rene.getBio());

    }
}
