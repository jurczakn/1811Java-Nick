package com.example.threads;

public class MyThread extends Thread{
	
	@Override //annotation
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("\t" + Thread.currentThread().getName());
		}
	}

}
