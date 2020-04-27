package medium.string;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		String s = "xywrrmp";
		String t = "xywrrmu#p";
		boolean result = backspaceCompare(s, t);
		System.out.println(result);
	}

	public static boolean backspaceCompare(String s, String t) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (sb.length() > 0) {
					sb.delete(sb.length() - 1, sb.length());
				}
			} else {
				sb.append(s.charAt(i));
			}
		}

		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == '#') {
				if (sb1.length() > 0) {
					sb1.delete(sb1.length() - 1, sb1.length());
				}
			} else {
				sb1.append(t.charAt(i));
			}
		}

		return sb.toString().equals(sb1.toString());
	}

}
