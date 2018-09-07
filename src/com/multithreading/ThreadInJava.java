package com.multithreading;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" i : " + i);
		}

	}

}

public class ThreadInJava {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread thread2 = new Thread(thread);
		thread2.start();
	}
}
