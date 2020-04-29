package easy.math;

import java.util.ArrayList;
import java.util.List;

public class PowerOf2 {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		PowerOf2 p = new PowerOf2();

		p.powerOf2(1150);
		
		list.forEach(System.out::println);

	}
	

	public int powerOf2(int n) {
		if (n < 1) {
			list.add(0);
			return 0;
		} else if (n == 1) {
			list.add(1);
			return 1;
		} else {
			int prev = powerOf2(n / 2);
			int curr = prev * 2;
			list.add(curr);
			return curr;
		}
	}
}
