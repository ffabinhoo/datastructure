package easy.math;

public class FactorialTrailingZeros {

	public static void main(String[] args) {

		int n = 5;
		int result = 0;
		result = trailingZeroes(n);
		
		System.out.println(result);

	}

	public static int trailingZeroes(int n) {
		
		int count = 0;
        while (n != 0) {
            int tmp = n / 5;
            count += tmp;
            n = tmp;
        }
        return count;

	}

}
