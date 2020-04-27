package easy.math;

public class SumRecursion {
	
	public static void main(String[] args) {
		int x = 1000;
		int result = sum(x);
		
		System.out.println(result);
	}

	private static int sum(int x) {
		
		if (x<=0) {
			return 0;
		}else {
			return x + sum(x-1);
		}
		
	}
	
	

}
