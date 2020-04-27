package medium.backtracking;

public class NumberIslands {
	public static void main(String[] args) {

		NumberIslands nb = new NumberIslands();

		char[][] grid = { { '1', '1', '1', '1', '0' }, 
						  { '1', '1', '0', '1', '0' }, 
						  { '1', '0', '0', '1', '1' }, 
						  { '1', '1', '0', '0', '0' },
						  { '0', '0', '0', '0', '0' } };

		char[][] grid2 = { { '0', '0', '0', '0', '0' }, 
						   { '1', '1', '0', '1', '0' }, 
						   { '1', '0', '0', '0', '0' }, 
						   { '1', '1', '1', '1', '1' }, };

		int result = nb.numIslands(grid2);
		System.out.println(result);
	}

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;

		int numIslands = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					// System.out.println("here-->i:" + i+ " j:" + j);
					numIslands += dfs(grid, i, j);
				}
			}
		}

		return numIslands;
	}

	private int dfs(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
			return 0;
		}

		grid[i][j] = '0';
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);
		return 1;
	}
}
