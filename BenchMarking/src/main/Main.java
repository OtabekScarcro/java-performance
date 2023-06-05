package main;

public class Main {
	public static void main(String[] args) {
		NumberChecker nc = new NumberChecker();
		
		// Warm up period
		for(int i=0;i<10000;i++) {
			nc.isPrime2(i);
		}
		
		System.out.println("warp up finished, now measuring");
		
		long start = System.currentTimeMillis();
		for(int i=1;i<500000;i++) {
			nc.isPrime2(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken " + (end - start) + " ms");
	}
}
