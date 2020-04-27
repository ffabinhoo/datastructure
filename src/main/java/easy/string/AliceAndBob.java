package easy.string;

public class AliceAndBob {

	public static void main(String[] args) {
		
		
        int g = 1;
        for(int i = 0; i < g; i++){
            int n = 10;
            //    System.out.println(sieve(n));
            if(sieve(n) % 2 == 0)
                System.out.println("Bob");
            else
                System.out.println("Alice"); 
        }

	}

	static int sieve(int n) {
		int primes = 0;
		boolean[] catch_the_sieve = new boolean[n + 1];
		for (int x = 2; x <= n; x++) {
			if (catch_the_sieve[x] == false) {
				primes++;
				for (int i = x; i <= n; i += x) {
					catch_the_sieve[i] = true;
				}
			}
		}
		return primes;
	}

}
