package fundamentals.dynamicprogramming;

public class MinCostClimbingStairs {
	
	public static void main(String[] args) {
		
		MinCostClimbingStairs cl = new MinCostClimbingStairs();
		int[]arr = {10,15,20,10};
		
		int result = cl.calcCost(arr);
		System.out.println(result);
	}

	private int calcCost(int[] cost) {
		
		for (int i = 2; i < cost.length; i++) {
			cost[i] += Math.min(cost[i-1], cost[i-2]);
		}
		
		return Math.min(cost[cost.length-1], cost[cost.length-2]);
	}
	
	

}
