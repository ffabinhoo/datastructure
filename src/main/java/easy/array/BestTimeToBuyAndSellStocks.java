package easy.array;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
		int[] prices = {1,2,4,2,5,7,2,4,9,0,9};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int max = 0;

		int i = 0;
		int j = 1;

		while (j < prices.length && i < j) {
			if (prices[j] > prices[i]) {
				if (max < prices[j] - prices[i]) {
					max = (prices[j] - prices[i]);
				}
			} else {
				i++;
				j = i;
			}
			j++;
		}
		return max;
	}
}
