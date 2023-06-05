package solution01.usingIterator;

import java.util.List;

public class Main1 {
	
	
	public static void main(String[] args) {
		
		Client clien1 = new Client("Otabek", "Otaboyev");
		Client clien2 = new Client("Ota", "Otv");
		Client clien3 = new Client("Otaddddddk", "dddddoyev");
		Client clien4 = new Client("Otabekfffffffffff", "Otafffff");
		
		List<Client> clients = Client.getClients();
		
		// actual List of clients
		System.out.println(clients);
		
		clients.remove(0);
		
		System.out.println(clients);
		
		// after changing
		System.out.println(Client.getClients());
		
	}
	
	
	
}
