package easy.shortestpath;

/*
 A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. 
	The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
 */
public class UniquePaths {

	public static void main(String[] args) {
		UniquePaths uniquePaths = new UniquePaths();

		int n = 3;
		int m = 2;
		int result = uniquePaths.uniquePaths(m, n);
		System.out.println(result);
	}

	public int uniquePaths(int m, int n) {
		
		int[][] dp = new int[m][n];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j] = dp[i-1][j]+dp[i][j-1];
			}
		}
		
		return dp[m-1][n-1];
    }

}
