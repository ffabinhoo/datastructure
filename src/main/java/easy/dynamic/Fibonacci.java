package easy.dynamic;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(10));
	}
	
	private static int fibonacci(int n) {
		int[] memo = new int[n+1];
		return fibonacci(n, memo);
	}

	public static int fibonacci(int n, int[] memo) {
		
		if (n==0) {
			return 0;
		}
		
		
		if (n==1) {
			return 	1;
		}
		
		if (memo[n] > 0) {
			return memo[n];
		}
		
		memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo);
		
		return memo[n];
	}

}
