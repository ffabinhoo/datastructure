package easy.string;

public class LongestCommonPosfix {

	public static void main(String[] args) {
		
		String[] strs =  {"Gloucestershire", "Hampshire", "Yorkshire", "shire", "Lancashire"};
		System.out.println("---");
		System.out.println(longestCommonPostFix(strs ));
		System.out.println("---");
	}

	public static String longestCommonPostFix(String[] strs) {
		if (strs.length==0) {
			return "";
		}
		
		String prefix = strs[0];
		
		for (int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(prefix) < 0) {
				
				
				prefix = prefix.substring(1,prefix.length());
				if (prefix.isEmpty()) return "" ;
			}
		}
		
		return prefix;
	}
	

}
