package path.medium;

public class FidingOutofBoundaries {

	public static void main(String[] args) {
		FidingOutofBoundaries fidingOutofBoundaries = new FidingOutofBoundaries();
		

		//int m = 45, n = 35, N = 47, i = 20, j = 31;
		int m = 2, n = 2, N = 2, i = 0, j = 0;
		
		int result = fidingOutofBoundaries.findPaths(m, n, N, i, j);
		System.out.println(result);
	}

	public int findPaths(int m, int n, int N, int i, int j) {
		
		int[][][] dp = new int [N+1][m][n];

		return dfs(m, n, N, i, j, dp);
	}

	private int dfs(int m, int n, int N, int r, int c, int[][][] dp) {
		int mod = 1000000007;
		if (r < 0 || c < 0 || r >= m || c >= n) return 1;
		if (N == 0) return 0;
		if (dp[N][r][c] >0) return dp[N][r][c]%mod;
		
		int moves = 0;
		moves =  (moves + dfs(m, n, N-1, r, c+1, dp))%mod;
		moves =  (moves + dfs(m, n, N-1, r, c-1, dp))%mod;
		moves =  (moves + dfs(m, n, N-1, r+1, c, dp))%mod;
		moves =  (moves + dfs(m, n, N-1, r-1, c, dp))%mod;
		
		dp[N][r][c] = moves%mod;
		return dp[N][r][c];
		
	}

}
