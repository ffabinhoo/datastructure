package easy.array;

public class CountAndSay2 {
	
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
		String str = "1";
		for (int i = 1; i < n; i++) {
			StringBuilder temp = new StringBuilder();
			char prev = str.charAt(0);
			int counter = 1;
			
			for (int j = 1; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch != prev) {
					temp.append(counter);
					temp.append(prev);
					counter = 1;
					prev = ch;
				}else {
					counter++;
				}
			}
			temp.append(counter);
			temp.append(prev);
			//System.out.println(temp);
			str = temp.toString();
			
			
		}
		return str;
	}

	

}
