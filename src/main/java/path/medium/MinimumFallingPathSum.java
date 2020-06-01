package path.medium;

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
