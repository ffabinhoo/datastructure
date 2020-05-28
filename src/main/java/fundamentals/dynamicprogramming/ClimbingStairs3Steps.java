package fundamentals.dynamicprogramming;

/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps or 3 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
4. 3 steps 

*/
public class ClimbingStairs3Steps {
	
	public static void main(String[] args) {
		ClimbingStairs3Steps c = new ClimbingStairs3Steps();
		
		int stairs = 20;
		
		int[] memo = new int[stairs+1];
		int result = c.climbStairs(stairs, memo);
		
		System.out.println(result);
	}

	private int climbStairs(int n, int[] memo) {
		if (n==0 || n==1) {
			return 1;
		}
		if (n==2) {
			return 2;
		}
		if(memo[n]>0) {
			return memo[n];
		}else {
			memo[n] = climbStairs(n-1, memo)+climbStairs(n-2, memo) +climbStairs(n-3, memo);
			return memo[n];
		}
	}
}
