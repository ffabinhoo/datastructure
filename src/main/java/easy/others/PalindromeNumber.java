package easy.others;

public class PalindromeNumber {

	public static void main(String[] args) {

		PalindromeNumber pn = new PalindromeNumber();

		int x = 1011;
		boolean result = pn.isPalindrome(x);
		
		System.out.println(result);

	}

	public boolean isPalindrome(int x) {

		String str = String.valueOf(x);

		int left = 0;
		int right = str.length()-1;

		while (left < right) {
			//int mid = left + (right - left) / 2;
			if (str.charAt(left)!= str.charAt(right)) {
				return false;
			}else {
				left++;
				right--;
			}
		}
		return true;

	}
}
