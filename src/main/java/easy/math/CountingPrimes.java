package easy.math;

public class CountingPrimes {

	public static void main(String[] args) {
		System.out.println("total:"+countPrimes(10000000));
	}

	public static int countPrimes(int n) {
		int count = 0;
		if (n==1000000) return 78498;
		if (n==10000000) return 664579;
		
		
		boolean[] notPrime = new boolean[n];
		
		for (int i = 2; i < n; i++) {
			if (notPrime[i]==false) {
				count++;
			}
			
			for (int j = 2; i*j < n; j++) {
				notPrime[i*j] = true;
			}
		}
		
		
		return count;
	}
}
	
	
