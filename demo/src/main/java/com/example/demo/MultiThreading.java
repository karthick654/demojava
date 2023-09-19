package com.example.demo;

class CommonThread extends Thread {  //declare in integer list 
    int a[] = {1, 2, 3, 4, 5, 6};// declare 
//    String b[] = {"laptop", "computer", "java", "python"};

    public void run() {
        System.out.println("Thread is Running");

        try {
            for (int i = 0; i < a.length; i++) {
                System.out.println("a[" + i + "] = " + (a[i] + 1));
                Thread.sleep(2000);
            }
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        for (int i = 0; i <a.length; i++) {
            System.out.println("b[" + i + "] = " + (a[i] - 1));
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }

        System.out.println("Thread is done");
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        CommonThread obj = new CommonThread();
        obj.start();

        
//        try {
//            obj.join(); 
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }

    }
}
