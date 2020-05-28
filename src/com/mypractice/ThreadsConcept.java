package com.mypractice;

public class ThreadsConcept extends Thread {

	public synchronized void run() {
		int n=10;
		for (int i=0;i<=n;i++) {
			System.out.println("The value of i is " + i);
		}
	}
	
	public static synchronized void main(String[] args) {
		ThreadsConcept tc = new ThreadsConcept();
		tc.start();
		System.out.println("Main thread running");
		for (int i=0;i<=10;i++) {
			System.out.println("The value of Mainthread is " + i);
		}

	}
	
	
}
