package main;

import java.util.UUID;

public class GenerateCustomerTask implements Runnable{
	
	private CustomerManager cm;
	
	public GenerateCustomerTask(CustomerManager cm) {
		this.cm = cm;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				// this is just to slow things down so we can see what is going on!
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			String name = UUID.randomUUID().toString();
			Customer c = new Customer(name);
			cm.addCustomer(c);
		}
	}
}
