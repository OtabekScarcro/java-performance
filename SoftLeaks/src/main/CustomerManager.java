package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class CustomerManager {
	private List<Customer> customers = new ArrayList<Customer>();
	private int nextAvailableId = 0;
	
	public void addCustomer(Customer c) {
		synchronized (this) {
			c.setId(nextAvailableId);
			synchronized (customers) {
				customers.add(c);
			}
			nextAvailableId++;
		}
	}
	
	public Optional<Customer> getNextCustomer(){
		synchronized (customers) {
			if(customers.size() > 0) {
				return Optional.of(customers.remove(0));
			}
		}
		return Optional.empty();
	}
	
	public void howManyCustomers() {
		System.out.println("" + new Date() + " Customers in queue : " + customers.size() + " of " + nextAvailableId);
	}
}
