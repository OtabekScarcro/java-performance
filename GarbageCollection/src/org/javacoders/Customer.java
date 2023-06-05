package org.javacoders;

public class Customer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finallize() method from GC: destroying object by named: " + name);
	}
}
