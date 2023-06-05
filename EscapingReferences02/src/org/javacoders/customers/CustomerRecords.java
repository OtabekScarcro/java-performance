package org.javacoders.customers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.javacoders.customers.customerImplementations.Customer;

public class CustomerRecords implements Iterable<Customer>{
	private Map<String, Customer> records;

	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(String name) {
		this.records.put(name, new Customer(name));
	}
	
	/**
	 * By making the real collection immutable, 
	 * it cannot be updated from outside of the class
	 */
	public Map<String, Customer> getCustomers(){
		
		// Java 9 or below
//		return Collections.unmodifiableMap(records);
		
		// Java 10 or above
		return Map.copyOf(records);
		
	}
	
	/**
	 * ESCAPING REFERENCE
	 * let's assume that, we want to have a method
	 * to find a particular customer by it's name
	 */
//	public Customer find(String name) {
//		return records.get(name);
//	}
	
	/**
	 * FIXING
	 */
	public ReadonlyCustomer find(String name) {
		return new Customer(records.get(name));
	}

	@Override
	public Iterator<Customer> iterator() {
		return records.values().iterator();
	}
}










