package fundamentals.dynamicprogramming;

public class DynamicSum {
	
	public static void main(String[] args) {
		
		DynamicSum dy = new DynamicSum();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int i = dy.sum(2);
		System.out.println(i);
	}

	private int sum(int i) {
		if (i==0) {
			return 0;
		}else {
			return sum(i-1)+ i;
		}
	}

	

}
