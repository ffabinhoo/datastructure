package fundamentals.dynamicprogramming;

public class ClimbingStairs {
	
	public static void main(String[] args) {
		ClimbingStairs c = new ClimbingStairs();
		
		int stairs = 45;
		
		int[] memo = new int[stairs+1];
		int result = c.climbStairs(stairs, memo);
		
		System.out.println(result);
	}

	private int climbStairs(int n, int[] memo) {
		if (n==0 || n==1) {
			return 1;
		}
		if(memo[n]>0) {
			return memo[n];
		}else {
			memo[n] = climbStairs(n-1, memo)+climbStairs(n-2, memo);
			return memo[n];
		}
	}
}
