package easy.math;

public class FactorialImplementation {
	
	
	public static void main(String[] args) {
		
		int x = 4;
		
		int result = factorial(x);
		System.out.println(result);
		
		
	}

	private static int factorial(int x) {
		if (x <=1) {
			return 1;
		}else {
			return x * factorial(x-1);
		}
		
	}
	
	

}
