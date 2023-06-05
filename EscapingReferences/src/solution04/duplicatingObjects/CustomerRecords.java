package solution04.duplicatingObjects;

import java.util.HashMap;
import java.util.Map;

public class CustomerRecords {
	private Map<String, Customer> records;

	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
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
	public Customer find(String name) {
		return new Customer(records.get(name));
	}
}










