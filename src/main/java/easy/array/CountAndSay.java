package easy.array;

public class CountAndSay {
	
	/*
	 * 
The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
	 */

	public static void main(String[] args) {
		int n = 6;
		System.out.println(countAndSay(n));
	}

	public static String countAndSay(int n) {

		String s = "1";
		for (int i = 1; i < n; i++) {
			s = countIdx(s);
		}
		return s;
	}

	public static String countIdx(String s) {
		StringBuilder sb = new StringBuilder();
		char c = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			} else {
				sb.append(count);
				sb.append(c);
				c = s.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(c);
		return sb.toString();
	}

}
