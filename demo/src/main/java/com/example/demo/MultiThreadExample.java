package com.example.demo;

class MyThreads extends Thread {
    public MyThreads(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName()+ " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
    	MyThreads thread1 = new MyThreads("Thread 1");
    	MyThreads thread2 = new MyThreads("Thread 2");
        MyThreads thread3 = new MyThreads("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
