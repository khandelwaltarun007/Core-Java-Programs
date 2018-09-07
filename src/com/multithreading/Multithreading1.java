package com.multithreading;

class MultithreadingDemo extends Thread{
	public void run() {
		try {
			System.out.println("Thread : "+Thread.currentThread().getId()+" is running");
			System.out.println(Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}

public class Multithreading1 {
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<8;i++) {
			MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
			//System.out.println(Thread.currentThread().getName());
			multithreadingDemo.start();
			multithreadingDemo.join();
			//Thread.currentThread().join();
		}
	}
	
}
