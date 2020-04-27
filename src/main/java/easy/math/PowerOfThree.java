package easy.math;

public class PowerOfThree {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(isPowerOfThree(n));
	}

	public static boolean isPowerOfThree(int n) {
		
		if (n<1) return false;
		
		
		while(n%3==0) {
			n = n/3;
		}
		
		if (n==1) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
