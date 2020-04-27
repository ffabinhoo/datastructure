package easy.array;

public class BestTimeBuyAndSellStockII {

	public static void main(String[] args) {

		int prices[] = { 3,4,1,7 };
					   //1, 2, 3, 4, 5
		
		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {
		
		int maxProf = 0;
		
		
		int j = 0;
		for (int i = 1; i < prices.length; i++) {
			
			if(prices[i]>prices[j]) {
				
				maxProf += (prices[i]-prices[j]);
			}
			j++;
			
		}
		
		
		return maxProf ;

	}

}
