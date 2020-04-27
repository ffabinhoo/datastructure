package medium.dynamic;

public class MakeChange {

	/*
	 * Given an integer representing a given amount of change, write a function to
	 * 	compute the total number of coins required to make that amount of change. 
	 * You can assume that there is always a 1¢ coin.
	 * 
	 */
	
	private int[] coins = new int[]{200,100,50, 25,10, 5, 1};
	
	public static void main(String[] args) {
		MakeChange makeChange = new MakeChange();
		int result = makeChange.makeChange(1000000);
		
		System.out.println(result);
		
	}

	public int makeChange(int c) {
		// Initialize cache with values as -1
		int[] cache = new int[c + 1]; for (int i = 1; i < c + 1; i++) cache[i] = -1;
		return makeChange(c, cache);
		}
		// Overloaded recursive function
		private int makeChange(int c, int[] cache) {
		  // Return the value if it’s in the cache
		if (cache[c] >= 0) return cache[c];
		int minCoins = Integer.MAX_VALUE;
		  // Find the best coin
		for (int coin : coins) { if (c - coin >= 0) { int currMinCoins =
		makeChange(c - coin, cache); if (currMinCoins < minCoins) minCoins = currMinCoins;
		} }
		  // Save the value into the cache
		cache[c] = minCoins + 1;
		  return cache[c];
		}

}
