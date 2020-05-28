package fundamentals.dynamicprogramming;

public class PriceOfWines {
	
	public static void main(String[] args) {
		
		PriceOfWines pw = new PriceOfWines();
		int[] wines = {2,3,5,1,4};
		int[][] cache = new int[wines.length][wines.length];
		int result = pw.profit(wines, 1, 0,wines.length-1, cache);
		
		System.out.println(result);
		
	}

	private int profit(int[] wines, int year,  int start, int finish, int[][] cache ) {
		if (start > finish) {
			return 0; 
		}
		
		if (cache[start][finish] > 0) {
			return cache[start][finish];
		}else {
			
			cache[start][finish] = Math.max(
					profit(wines, year+1, start+1, finish, cache)+ year * wines[start]
							,profit(wines, year+1, start, finish-1, cache)+ year * wines[finish]);
		}
		return cache[start][finish];
		
	}

}
