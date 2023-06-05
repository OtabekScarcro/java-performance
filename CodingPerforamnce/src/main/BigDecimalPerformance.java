package main;

import java.math.BigDecimal;

public class BigDecimalPerformance {
	
	private BigDecimal addNumbers1(long l) {
		BigDecimal r = BigDecimal.ZERO;
		BigDecimal a = new BigDecimal(17.31);
		for(int i=0;i<=l;i++) {
			r = r.add(a);
		}
		return r;
	}
	
	@SuppressWarnings("unused")
	private BigDecimal addNumbers2(long l) {
		Double r = 0d;
		Double a = 17.31d;
		for(int i=0;i<=l;i++) {
			r = r + a;
		}
		return new BigDecimal(r);
	}
	
	public void run() {
		System.out.println("Warm up period is starting");
		addNumbers2(1000l);
		System.out.println("Warm up period is done");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("measurement period is starting");
		long start = System.currentTimeMillis();
		addNumbers2(1000000l);
		long end = System.currentTimeMillis();
		System.out.println("measurement period is done");
		System.out.println("taken time: " + (end - start) + " ms.");
	}
}
