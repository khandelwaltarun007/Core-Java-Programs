package com.multithreading;

class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
	}
}

class Thread2 extends Thread{
	
	@Override
	public void run() {
		for(int i=101;i<=200;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadsInJava {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();
	}
}
