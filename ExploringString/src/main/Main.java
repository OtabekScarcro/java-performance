package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Date start = new Date();
		List<String> list = new ArrayList<>();
		for(Integer i=1;i<10000000;i++) {
			String s = i.toString().intern();
			list.add(s);
		}
		Date end = new Date();
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + "ms.");
	}
}
