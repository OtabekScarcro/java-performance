package main;

public class PrimitivePerformace{

	private long addNumbers1(long l) {
		long r = 0;
		for(int i=0;i<=l;i++) {
			r += 17l;
		}
		return r;
	}
	
	@SuppressWarnings("unused")
	private long addNumbers2(Long l) {
		Long r = 0l;
		Long a = 17l;
		for(int i=0;i<=l;i++) {
			r += a;
		}
		return r;
	}
	
	public void run() {
		System.out.println("Warm up period is starting");
		addNumbers1(1000l);
		System.out.println("Warm up period is done");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("measurement period is starting");
		long start = System.currentTimeMillis();
		addNumbers1(1000000l);
		long end = System.currentTimeMillis();
		System.out.println("measurement period is done");
		System.out.println("taken time: " + (end - start) + " ms.");
	}

}
