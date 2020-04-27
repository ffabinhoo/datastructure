package easy.array;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		//int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		int [] digits = {9,9};
		int[] arr = plusOne(digits);
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		
		System.out.println(new BigInteger(sb.toString()));
		
	}

	public static int[] plusOne(int[] digits) {
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < digits.length; i++) {
			sb.append(digits[i]);
		}
		
		
		BigInteger val = new BigInteger(sb.toString());
		BigInteger val2 = val.add(new BigInteger("1"));
		
		String str = val2.toString();
		
		int aux[] = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			
			char x = str.charAt(i);
			
			aux[i] = Integer.valueOf(Character.toString(x));
			
		}
		
		return aux;
		
	}

}
