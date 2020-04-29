package easy.string;

public class UniqueString {

	public static void main(String[] args) {
		UniqueString unique = new UniqueString();
		
		String s = "abcdefa";
		boolean result = unique.isUnique(s );
		System.out.println(result);
	}
	
	
	private boolean isUnique(String s) {
		int[] cnt = new int[26];
		for (char c : s.toCharArray()) {
			if (++cnt[c - 'a'] > 1)
				return false;
		}
		return true;
	}

}
