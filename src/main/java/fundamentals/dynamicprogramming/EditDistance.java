package fundamentals.dynamicprogramming;

/*
 
 Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character
Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')

 */
public class EditDistance {
	public static void main(String[] args) {
		EditDistance ed = new EditDistance();
		String word1 = "horse";
		String word2 = "ros";
		int result = ed.minDistance(word1, word2);
		System.out.println(result);
	}

	public int minDistance(String word1, String word2) {
		
		if (word1.isEmpty() && word2.isEmpty()) {
			return 0;
		}
		
		
		char[] cs = word1.toCharArray();
		char[] cs2 = word2.toCharArray();
		
		int[][] dp = new int [cs.length+1][cs2.length+1];
		
		for (int i = 1; i <= cs.length; i++) {
			dp[i][0] = i;
		}
		
		for (int i = 1; i <= cs2.length; i++) {
			dp[0][i] = i;
		}
		
		
		for( int i = 1; i <= cs.length; i++){
			for( int j = 1; j <= cs2.length; j++){
				if(cs[i - 1] == cs2[j - 1]){
					dp[i][j] = dp[i - 1][j - 1];
				}
				else{
					
					dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
				}
			}
		}
		return dp[cs.length][cs2.length];
	}
}
