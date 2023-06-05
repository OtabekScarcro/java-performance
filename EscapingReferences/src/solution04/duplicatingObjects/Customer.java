package solution04.duplicatingObjects;

public class Customer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public Customer(Customer c) {
		this.name = c.getName();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
