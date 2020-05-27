package fundamentals.algorithms;

public class TemplateString {
	
	
	public static void main(String[] args) {
		
		String  s1 = "fabio";
		String  s2 = "costa";
		
		TemplateString template = new TemplateString();
		
		template.twoStrings(s1.toCharArray(),s2.toCharArray());
		
		//template.oneString(s1.toCharArray());
	}

	private void oneString(char[] s1) {
		for( int len = 1; len <= s1.length; len++){
			for( int i = 1; i + len <= s1.length; i++){
				int j = i + len;
				System.out.println("comparing " + s1[i - 1] + " and " + s1[j - 1]);
				if(s1[i - 1] == s1[j - 1]){
					System.out.println("equal=======>>>:" + s1[i - 1]);
				}
				else{
					System.out.println("diff:" + s1[j - 1]);
				}
			}
		}
		
	}

	private void twoStrings(char[] cs, char[] cs2) {
		for( int i = 1; i <= cs.length; i++){
			for( int j = 1; j <= cs2.length; j++){
				if(cs[i - 1] == cs2[j - 1]){
					System.out.println("===1===");
					System.out.println(cs[i - 1]);
					System.out.println(cs2[j - 1]);
				}
				else{
					System.out.println("===2===");
					System.out.println(cs[i - 1]);
					System.out.println(cs2[j - 1]);
				}
			}
		}
		
	}

}
