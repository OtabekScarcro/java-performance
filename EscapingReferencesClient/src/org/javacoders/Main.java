package org.javacoders;

import org.javacoders.customers.CustomerRecords;
import org.javacoders.customers.ReadonlyCustomer;

public class Main {
	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();
		
		records.addCustomer("John");
		records.addCustomer("Simon");
		
		for(ReadonlyCustomer c : records) {
			System.out.println(c);
		}
		
		/**
		 * by this way we don't have any setName() method 
		 * and we cannot access to Customer object
		 * 
		 */
//		Customer c = new Customer();
//		or
//		Customer c = (Customer)records.find("John");
	}
}
