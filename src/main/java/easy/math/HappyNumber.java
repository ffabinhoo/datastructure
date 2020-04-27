package easy.math;

import java.util.*;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 1000000;
		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {

		String str = String.valueOf(n);
		int val = 0;

		for (int i = 0; i < str.length(); i++) {
			char t = str.charAt(i);
			val += Math.multiplyExact(Integer.valueOf(String.valueOf(t)), Integer.valueOf(String.valueOf(t)));
		}

		if (val == 1) {
			return true;
		} else if (n < 6) {
			return false;
		} else {
			return isHappy(val);
		}

	}
	
	public static boolean isHappy2(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
	    int squareSum,remain;
		while (inLoop.add(n)) {
			squareSum = 0;
			while (n > 0) {
			    remain = n%10;
				squareSum += remain*remain;
				n = n/ 10;
			}
			if (squareSum == 1)
				return true;
			else
				n = squareSum;

		}
		return false;
        
    }

}
