package main;

public class CustomerHarness {
	public static void main(String[] args) {
		CustomerManager cm = new CustomerManager();
		GenerateCustomerTask gt = new GenerateCustomerTask(cm);
		ProcessCustomerTask pt = new ProcessCustomerTask(cm);
		
		for(int user=0;user<10;user++) {
			Thread t = new Thread(gt);
			t.start();
		}
		
		Thread t = new Thread(pt);
		t.start();
		
		// Main thread is now acting as the monitoring thread
		while(true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cm.howManyCustomers();
			System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() / 1024 + "k");
		}
	}
}
