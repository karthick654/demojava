package com.example.demo;

import java.util.Scanner;

public class NestedDemo {
    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the age");
            int age = s.nextInt();
            System.out.println("Enter the gender");
            String gender = s.next();

            if (age >= 18) {
                if (gender.equals("male")) {
                    System.out.println("Eligible for vote");
                } else if (gender.equals("female")) {
                    System.out.println("Eligible for vote");
                } else {
                    System.out.println("Invalid gender");
                }
            } else {
                System.out.println("Age is not allowed for voting.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
