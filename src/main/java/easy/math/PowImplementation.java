package easy.math;

public class PowImplementation {

	public static void main(String[] args) {

		double x = 2;
		int n = 10;
		double result = pow(x, n);

		System.out.println(result);
	}

	public static double myPow(double x, int n) {
		double result = 1;
		int i = 1;
		Math.abs(n);
		while (i <= Math.abs(n)) {
			if (n > 0) {
				result *= (x);
			} else {
				result = result * (1 / x);
			}

			i++;

		}

		return result;
	}

	public static double pow(double x, int n) {
		double temp = x;
		if (n == 0)
			return 1;
		temp = pow(x, n / 2);
		if (n % 2 == 0)
			return temp * temp;
		else {
			if (n > 0)
				return x * temp * temp;
			else
				return (temp * temp) / x;
		}

	}

}
