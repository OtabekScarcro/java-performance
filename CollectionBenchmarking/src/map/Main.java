package map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		/*
		Date start = new Date();
		
		// if the initial size of the map is too big,
		// it will be wasting memory 
		Map<Book, Double> books = new HashMap<Book, Double>(10000000);
		for(int i=0;i<10000000;i++) {
			books.put(new Book(i, "Jane Eyre", "Charlotte Bronte", 14.99), 14.99);
		}
		Date end = new Date();
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");
		*/
		Book b1 = new Book(1, "Jane Eyre", "Charlotte Bronte", 14.99);
		Book b2 = new Book(1, "Jane Eyre", "Charlotte Bronte", 14.99);
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}
}
