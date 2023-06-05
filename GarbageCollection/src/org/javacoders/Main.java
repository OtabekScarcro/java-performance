package org.javacoders;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Runtime runtime = Runtime.getRuntime();
		long availablebytes = runtime.freeMemory();
		System.out.println("Available memory at start: " + availablebytes / 1024 + "k");
		
		// let's create lots of objects
		List<Customer> customers = new ArrayList<Customer>();
		for(int i=0;i<1000000;i++) {
			customers.add(new Customer("Customer " + i));
		}
		
		availablebytes = runtime.freeMemory();
		System.out.println("Available memory when customers created: " + availablebytes / 1024 + "k");
		
		customers = new ArrayList<>();
		
		availablebytes = runtime.freeMemory();
		System.out.println("Available memory when customers no longer referenced: " + availablebytes / 1024 + "k");
		
		Thread.sleep(1000);
		
		availablebytes = runtime.freeMemory();
		System.out.println("Available memory after 1 second: " + availablebytes / 1024 + "k");
		
		System.gc();
		
		availablebytes = runtime.freeMemory();
		System.out.println("Available memory after GC command: " + availablebytes / 1024 + "k");
	}
}
