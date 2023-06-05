package solution03.usingImmutableCollection;

public class Main {
	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();
		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
		// when we try to change the collection,
		// it will rise an Exception, 
		// it means, it is not possible to damage the real collection
		// for example by: 
		// records.getCustomers().clear();
		
		for(Customer next: records.getCustomers().values()) {
			System.out.println(next);
		}
	}
}
