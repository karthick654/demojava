package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private ExecutorService executor;

    public ThreadPool() {
        // Create a thread pool with 10 threads
        executor = Executors.newFixedThreadPool(10);
    }

    public void execute(Runnable task) {
        executor.execute(task);
    }

    public void close() {
        executor.shutdown(); // Shutdown the executor
    }

    public static void main(String[] args) {
        ThreadPool threads = new ThreadPool();

        for (int i = 0; i < 10; i++) {
            int taskNo = i;               //lambda expression
            threads.execute(() -> {
                String message = Thread.currentThread().getName() + " Task " + taskNo;
                System.out.println(message);
            });
        }

        // Wait for all threads to finish
        threads.close();
    }
}
