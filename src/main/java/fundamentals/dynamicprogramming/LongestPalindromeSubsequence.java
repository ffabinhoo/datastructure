package fundamentals.dynamicprogramming;

public class LongestPalindromeSubsequence {
	
	
	public static void main(String[] args) {
		LongestPalindromeSubsequence lp = new LongestPalindromeSubsequence();
		
		String str = "tttaat";
		int result = lp.longestPalindrome(str );
		System.out.println(result);
	}

	private int longestPalindrome(String str) {
		
		if (str.isEmpty()) return 0;
		
		char[] arr = str.toCharArray();
		int n = arr.length;
		int[][] dp = new int[n][n]; 
		
		for(int i = 0; i < n; i++){
            dp[i][i] = 1;
        }
		
		for (int len = 1; len < n; len++) {
				for (int i = 0; i+len <n; i++) {
					int j = i+len;
					if (arr[i]==arr[j]) {
						dp[i][j] = 2+dp[i+1][j-1];
					}else {
						dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
					}
				}
		}
		
		return dp[0][n - 1];
	}

}
