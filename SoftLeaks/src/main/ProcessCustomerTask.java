package main;

import java.util.Optional;

public class ProcessCustomerTask implements Runnable{
	private CustomerManager cm;
	
	public ProcessCustomerTask(CustomerManager cm) {
		this.cm = cm;
	}
	
	@Override
	public void run() {
		while(true) {
			Optional<Customer> customer = cm.getNextCustomer();
			if(!customer.isEmpty()) {
				// no Customers in queue so pause for half a second
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			else {
				// processing take place here!
			}
		}
	}
}
