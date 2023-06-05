package main;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("---Start of Problem 1---");
		//Print out the current exchange rates
		System.out.println("The current exchanging rates are USD 1 = ");
		Price price = new Price(1.0);
		price.getRates().forEach( (k, v) -> System.out.println(k + " " + v) );
		
		// Problem 1 - can we change one of the rates?
		// After fixing the problem we cannot access to this method
//		price.getRates().put("USD", 2d);
		System.out.println("The current exchanging rates are USD 1 = ");
		price.getRates().forEach( (k, v) -> System.out.println(k + " " + v) );
		
		System.out.println("---The end of the problem 1---");
		System.out.println();
		System.out.println("---The start of the problem 2---");
		
		// Get all the books printed out
		BookCollection bc = new BookCollection();
		bc.printAllBooks();
		System.out.println();
		// Problem 2 - can we change a book?
		//Book emma = bc.findBookByName("Emma");
		
		// after fixing
		ReadonlyBook emma = bc.findBookByName("Emma");
		// We don't have an access to this method
//		emma.setPrice(999d);
		bc.printAllBooks();
		
		System.out.println("---The end of the problem 2---");
		System.out.println();
		System.out.println("---The start of the problem 3---");
		
		// Print out The Price of the book Tom Jones
	    ReadonlyBook book = bc.findBookByName("Tom Jones");
		System.out.println("Tom Jones cost USD " + book.getPrice());
		System.out.println("Tom Jones cost EUR " + book.getPrice().convert("EUR"));
		System.out.println("Tom Jones cost GBP " + book.getPrice().convert("GBP"));
		System.out.println("---The end of the problem 3---");
		
		
	}
}

















