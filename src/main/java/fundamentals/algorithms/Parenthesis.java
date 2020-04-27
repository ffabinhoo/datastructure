package fundamentals.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

 class Parenthesis {
	private HashMap<Character, Character> map;

	public static void main(String[] args) {
		Parenthesis ss = new Parenthesis();
		String s = "{[]}()";
		System.out.println(ss.isValid(s));
	}
	
	

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

}
