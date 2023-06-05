package main;

import java.util.Random;

public class StringBuilderPerformance {
	
	String[] firstNames = {"Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd",};
	String[] middleNames = {"Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd",};
	String[] sureNames = {"Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd", "Otadfd",};
	
	private String generateNames1() {
		Random r = new Random();
		String rs = firstNames[r.nextInt(8)];
		rs = rs + " ";
		rs = middleNames[r.nextInt(8)];
		rs = rs + " ";
		rs = sureNames[r.nextInt(8)];
		rs = rs + " and ";
		rs = firstNames[r.nextInt(8)];
		rs = rs + " ";
		rs = middleNames[r.nextInt(8)];
		rs = rs + " ";
		rs = sureNames[r.nextInt(8)];
		return rs;
	}
	
	private String generateNames2() {
		Random r = new Random();
		StringBuilder rs = new StringBuilder();
		rs.append(firstNames[r.nextInt(8)]);
		rs.append(" ");
		rs.append(middleNames[r.nextInt(8)]);
		rs.append(" ");
		rs.append(sureNames[r.nextInt(8)]);
		rs.append(" and ");
		rs.append(firstNames[r.nextInt(8)]);
		rs.append(" ");
		rs.append(middleNames[r.nextInt(8)]);
		rs.append(" ");
		rs.append(sureNames[r.nextInt(8)]);
		return rs.toString();
	}
	
	public void run() {
		System.out.println("Warm up period is starting");
		for(int i=1;i<50000;i++) {
			generateNames2();
		}
		System.out.println("Warm up period is done");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("measurement period is starting");
		
		long start = System.currentTimeMillis();

		for(int i=1;i<500000;i++) {
			generateNames2();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("measurement period is done");
		System.out.println("taken time: " + (end - start) + " ms.");
	}
	
}
