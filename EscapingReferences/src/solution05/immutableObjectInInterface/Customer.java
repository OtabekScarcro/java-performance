package solution05.immutableObjectInInterface;

public class Customer implements ReadonlyCustomer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public Customer(ReadonlyCustomer c) {
		this.name = c.getName();
	}

	@Override
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
