package companies.google;

public class ShortestWayToFormString {
	
	/*
	 * Given two strings (source and target) , return the minimum numbers of source
	 * such that their concatenation equals target.
	 * If the task is impossible return -1;
	 * 
	 */
	
	public static void main(String[] args) {
		ShortestWayToFormString s = new ShortestWayToFormString();
		
		String source = "abc";
		String target = "abcbc";
		int result = s.shortestWay(source, target);
		System.out.println(result);
	}
	
	public int shortestWay(String source, String target) {
		int numSubSequences = 0;
		String remaining = target;
		
		while(remaining.length()>0) {
			StringBuilder subsequence = new StringBuilder();
			int i = 0;
			int j = 0;
			
			while(i < source.length() && j < remaining.length()) {
				
				if (source.charAt(i)==remaining.charAt(j)) {
					subsequence.append(remaining.charAt(j));
					j++;
				}
				i++;
			}
			
			if (subsequence.length()==0) {
				return -1;
			}
			numSubSequences++;	
			remaining = remaining.substring(subsequence.length());
		}
		
		return numSubSequences;
	}

}
