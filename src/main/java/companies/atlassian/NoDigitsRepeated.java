package companies.atlassian;

import java.util.LinkedHashSet;

public class NoDigitsRepeated {

	public static void main(String[] args) {

		NoDigitsRepeated obj = new NoDigitsRepeated();

		int L = 101, R = 102;

		System.out.println(obj.solve(L, R));

	}

	private int solve(int L, int R) {
		int answer = 0;

		// Traversing through the range
		for (int i = L; i <= R; ++i) {

			// Add 1 to the answer if i has
			// no repeated digit else 0
			answer = answer + repeated_digit(i);
		}

		return answer;
	}

	private int repeated_digit(int n) {
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		while (n != 0) {
			int d = n % 10;

			if (s.contains(d)) {
				// return 0 if the number
				// has repeated digit
				return 0;
			}
			s.add(d);
			n = n / 10;
		}
		return 1;
	}

}
