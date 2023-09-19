package com.example.demo;

import java.util.Scanner;

public class ThreadArrayTask {
    int[] a = new int[5];

    public ThreadArrayTask() {
        
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                
                synchronized (a) {
                    Scanner s = new Scanner(System.in);
                    System.out.println("Enter the elements : ");

                    for (int i = 0; i < 5; i++) {
                        a[i] = s.nextInt();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Writing done Successfully");
                }
            }
        });

        // Thread created for read operation
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                // Here the array is being synchronized
                synchronized (a) {
                    System.out.println("The elements are : ");

                    for (int i = 0; i < 5; i++) {
                        System.out.println(a[i]);
                    }

                    System.out.println("Reading done successfully");
                }
            }
        });

        // Write thread is started
        t1.start();

        // Read thread is started
        t2.start();
    }

    public static void main(String[] args) {
        new ThreadArrayTask();
    }
}
