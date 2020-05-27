package fundamentals.dynamicprogramming;

public class DynamicSum {
	
	public static void main(String[] args) {
		
		DynamicSum dy = new DynamicSum();
		
		int i = dy.sum(100);
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
