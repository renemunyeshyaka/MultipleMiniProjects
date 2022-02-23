package com.rene;
import java.util.Arrays;
import java.util.Scanner;
public class AndOperator {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Marks: ");
        int marks = scan.nextInt();
        if ((marks>=80)&& (marks<=100)) {
            System.out.println("Distinction");
        }
            else if((marks>=60)&&(marks<=79)){
                System.out.println("needs some improvement");
            }
            else{
            System.out.println("go out of the house");
        }
        }

    }
