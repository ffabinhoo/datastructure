package companies.amazon;

import java.util.Arrays;

/*
You are given coins of different denominations and a total amount of money amount. 
Write a function to compute the fewest number of coins that you need to make up that amount. 
If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3 
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Note:
You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChange {

	public static void main(String[] args) {
		CoinChange c = new CoinChange();
		int amount =  264;
		int[] coins = {474, 83,404,3};
		int result = c.coinChange(coins, amount);
		
		System.out.println(result);
	}

	public int coinChange(int[] coins, int amount) {
		
		int dp[] = new int [amount+1];
		
		Arrays.fill(dp, amount+1);
		dp[0] = 0;
		
		Arrays.sort(coins);
		
		for (int i = 0; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j]<=i ) {
					//System.out.println(1+dp[i-coins[j]]);
					dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
				}else {
					break;
				}
			}
		}
		
		return dp[amount] > amount ? -1 : dp[amount];
		
	}

}
