package com.rene.classes.opp;
/*
 * AuthorName: Jean René MUNYESHYAKA
 * Concept: encapsulation
 */


public class MyClass {
    private int id = 11;
    private String names = "JEAN RENE MUNYESHYAKA";
    private int age = 58;
    private String bio = "I am a programmer";


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
