package path.medium;

/*

Given a square array of integers A, we want the minimum sum of a falling path through A.

A falling path starts at any element in the first row, and chooses one element from each row.  The next row's choice must be in a column that is different from the previous row's column by at most one.

 

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: 12
Explanation: 
The possible falling paths are:
[1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]
[2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]
[3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]
The falling path with the smallest sum is [1,4,7], so the answer is 12.


 */
public class MinimumFallingPathSum {

	public static void main(String[] args) {
		MinimumFallingPathSum minimumFallingPathSum = new MinimumFallingPathSum();
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		minimumFallingPathSum.minFallingPathSum(a);
	}

	public int minFallingPathSum(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		
		int[][] dp = new int [m][n];
		
		for (int i = 0; i < n; i++) {
			dp[0][i] = mat[0][i];
		}
		
		
		for (int i = 1; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (j==0) {
					dp[i][j] = mat[i][j]+Math.min(dp[i-1][j], dp[i-1][j+1]);
				}else if (j==n-1) {
					dp[i][j] = mat[i][j]+Math.min(dp[i-1][j], dp[i-1][j-1]);
				}else {
					dp[i][j] = mat[i][j]+Math.min(dp[i-1][j], Math.min(dp[i-1][j-1],dp[i-1][j+1]));
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(dp[m-1][i], min);
		}
		
		
		return min;
	}

}
