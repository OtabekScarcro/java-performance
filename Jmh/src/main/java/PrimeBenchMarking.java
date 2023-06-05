import org.openjdk.jmh.annotations.Benchmark;

public class PrimeBenchMarking {
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
	
	@Benchmark
	public void version1() {
		for(int i=0;i<50000;i++) {
			isPrime1(i);
		}
	}
	
	@Benchmark
	public void version2() {
		for(int i=0;i<50000;i++) {
			isPrime2(i);
		}
	}
}
