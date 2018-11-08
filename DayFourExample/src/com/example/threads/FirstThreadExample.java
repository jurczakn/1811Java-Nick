package com.example.threads;

public class FirstThreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		//Thread thread = new Thread(); 		//to create a thread
		
		Thread mainThread = Thread.currentThread(); //creates a reference to the thread we are in

		//Daemon does not stop even if the program is closed
		//Garbage collector is a daemon thread
		
		boolean isDeamon = mainThread.isDaemon(); //tests to see if the thread is a daemon thread
		System.out.println(isDeamon);
		
		Thread.sleep(5000); 
		
		String name = mainThread.getName();
		System.out.println("name: " + name);
		
	}

}
