package fundamentals.dynamicprogramming;

public class DynamicSum {
	
	public static void main(String[] args) {
		
		DynamicSum dy = new DynamicSum();
		int n = 6000;
		int[] memo = new int[n+1];
		Integer i = dy.sum(n, memo);
		System.out.println(i);
	}

	private int sum(Integer i, int[] memo) {
		if (i==0) {
			return 0;
		}
		
		if (memo[i] > 0) {
			return memo[i];
		}else {
			memo[i] =  sum(i-1, memo)+ i;
			return memo[i];
		}
	}

	

}
