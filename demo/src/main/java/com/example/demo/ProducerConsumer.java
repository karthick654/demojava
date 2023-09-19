package com.example.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{

	BlockingQueue<Integer>Buffer;
	
	public Producer(BlockingQueue<Integer>Buffer) {
		this.Buffer=Buffer;
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(i);
				Buffer.put(i);
				Thread.sleep(200);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
class consumer implements Runnable{

	@Override
	public void run() {
	
		
	}
	
}
public class ProducerConsumer {
	public static void main(String[] args) {
		BlockingQueue<Integer>Buffer = new ArrayBlockingQueue<>(5);
		Thread producerThread = new Thread(new Producer(Buffer));
//		Thread consumerThread = new Thread(new consumer(Buffer));
		producerThread.start();
	}
}

