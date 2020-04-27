package easy.string;

import java.util.Stack;

public class ValidParenthesisString {

	public static void main(String[] args) {
		String s = "(((*)";
		boolean ret = checkValidString(s);
		System.out.println(ret);
	}

	public static boolean checkValidString(String s) {

		Stack<Integer> open = new Stack<Integer>();
		Stack<Integer> star = new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(')
				open.push(i);
			else if (c == '*')
				star.push(i);
			else {
				if (!open.isEmpty()) {
					open.pop();
				} else if (!star.isEmpty()) {
					star.pop();
				} else {
					return false;
				}
			}
		}

		while (!open.isEmpty()) {

			if (star.isEmpty()) {
				return false;
			} else if (open.peek() < star.peek()) {
				open.pop();
				star.pop();

			} else {
				return false;
			}

		}
		return true;
	}
}
