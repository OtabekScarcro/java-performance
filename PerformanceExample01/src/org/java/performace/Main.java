package org.java.performace;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Integer max = Integer.parseInt(args[0]);
		generateNumbers(max);
	}
	
	private static List<Integer> primes;
	
	private static boolean isPrime(Integer n) {
		for(int i=2;i<n;i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	private static Integer getNextPrime(int previous) {
		Integer n = previous+1;
		while(!isPrime(n)) {
			n++;
		}
		return n;
	}
	
	public static void generateNumbers(Integer max) {
		primes = new ArrayList<>();
		primes.add(2);
		
		Integer next = 2;
		while(primes.size() <= max) {
			next = getNextPrime(next);
			primes.add(next);
		}
		System.out.println(primes);
	}
	
}
