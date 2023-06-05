package solution03.usingImmutableCollection;

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
}










