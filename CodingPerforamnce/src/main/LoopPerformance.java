package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class LoopPerformance {
	String[] firstNames = {"Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd",};
	String[] middleNames = {"Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd",};
	String[] sureNames = {"Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd",};
	
	private String generateName() {
		Random r = new Random();
		return firstNames[r.nextInt(8)] + " " + middleNames[r.nextInt(8)] + " " + sureNames[r.nextInt(8)];
	}
	
	private long calculateLength1(List<String> names) {
		long l = 0;
		for(String name : names) {
			l += name.length();
		}
		System.out.println(l);
		return l;
	}
	
	private long calculateLength2(List<String> names) {
		long l = 0;
		
		l = names.stream().mapToInt(s -> s.length()).sum();
		
		System.out.println(l);
		return l;
	}
	
	private long calculateLength3(List<String> names) {
		long l = 0;
		
		l = names.stream().flatMapToInt(s -> IntStream.of(s.length())).sum();
		
		System.out.println(l);
		return l;
	}
	
	private long calculateLength4(List<String> names) {
		long l = 0;
		
		l = names.parallelStream().mapToInt(s -> s.length()).sum();
		
		System.out.println(l);
		return l;
	}
	
	public void run() {
		
		List<String> names = new ArrayList<String>();
		for(int i=0;i<50000;i++) {
			names.add(generateName());
		}
		
		
		
		System.out.println("Warm up period is starting");

		calculateLength4(names);
		
		System.out.println("Warm up period is done");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("measurement period is starting");
		
		long start = System.currentTimeMillis();

		calculateLength4(names);
		
		long end = System.currentTimeMillis();
		
		System.out.println("measurement period is done");
		System.out.println("taken time: " + (end - start) + " ms.");
	}
	
}
