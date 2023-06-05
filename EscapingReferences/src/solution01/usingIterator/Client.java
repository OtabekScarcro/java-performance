package solution01.usingIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Client {
	
	static List<Client> clients = new ArrayList<Client>();
	
	private String name;
	private String surname;
	
	public Client(String name, String surname) {
		this.name = name;
		this.surname = surname;
		clients.add(this);
	}

	public static List<Client> getClients() {
		return new ArrayList<Client>(clients);
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", surname=" + surname + "]";
	}
	
	
	
	
	

}
