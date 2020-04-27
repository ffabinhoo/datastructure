package easy.string;

public class StrStrImplementation {

	public static void main(String[] args) {
		String haystack = "aaaaa";
		String needle = "bba";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
		
		int idx = haystack.indexOf(needle);
		
		return idx;
	}

}
