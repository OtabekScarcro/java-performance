package solution02.copyOfCollection;

public class Main {
	public static void main(String[] args) {
		
		CustomerRecords records = new CustomerRecords();
		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
		// when we try to damage the collection,
		// the original collection will stay safe
		records.getCustomers().clear();
		
		for(Customer next: records.getCustomers().values()) {
			System.out.println(next);
		}
		
	}
}
