package com.home.interfaces;

public class InferThreads {

	public static void main(String[] args) {
		
		Runnable run = new Runnable() {
			public void run() {
				System.out.println("Executing Run Method");
			}
		};
		Thread t = new Thread(run);
		t.start();
		System.out.println("Executing Main Thread");
		
		Thread t1 = new Thread(new Runnable(){
				public void run()
				{
				System.out.println("Display Inner Methods");
				}
				});
		t1.start();
		InferThreads IT = new InferThreads() {
			public void innerclassmethod(){
				System.out.println("Executing Last Thread");
			}
		};	
	}
}
