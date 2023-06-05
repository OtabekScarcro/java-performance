package solution02.copyOfCollection;

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
	 * By returning copy of the collection, 
	 * it cannot be damaged from outside of the class
	 * @return
	 */
	public Map<String, Customer> getCustomers(){
		return new HashMap<>(this.records);
	}
	
	
}
