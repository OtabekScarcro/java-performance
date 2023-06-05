package solution04.duplicatingObjects;

public class Main {
	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();
		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
		/**
		 * if we want to change the name John to Jane
		 */
		records.find("John").setName("Jane");
		
		for(Customer next: records.getCustomers().values()) {
			System.out.println(next);
		}
		
		/**
		 * Interesting side is that, the Key is still 'John'
		 */
		System.out.println(records.find("John"));
		
		/**
		 * AFTER FIXING the problem,
		 * we will get the real collection again
		 */
		
	}
}
