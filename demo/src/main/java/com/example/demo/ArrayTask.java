package com.example.demo;


import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        int count = 0;
        int a[] = { 1, 4, 6, 7, 3, 15, 20, 1, 4, 6 };

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number");
            int in = sc.nextInt();

            for (int i = 0; i < a.length; i++) {
                if (a[i] % in == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("No multiples found.");
            } else {
                System.out.println("Number of multiples: " + count);
                System.out.println("Multiples:");
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % in == 0) {
                        System.out.println(a[j]);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number."+e);
        }
    }
}
