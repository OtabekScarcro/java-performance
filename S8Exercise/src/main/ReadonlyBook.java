package main;

public interface ReadonlyBook {

	int getId();

	String getTitle();

	String getAuthor();

	Price getPrice();

	String toString();

}