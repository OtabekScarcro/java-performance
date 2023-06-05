package main;

public class NumberChecker {
	
	public boolean isPrime1(int n) {
		for(int i=2;i<n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPrime2(int n) {
		int m = (int) Math.sqrt(n);
		for(int i=2;i<m;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
