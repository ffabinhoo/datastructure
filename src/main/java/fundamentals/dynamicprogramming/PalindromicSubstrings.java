package fundamentals.dynamicprogramming;

public class PalindromicSubstrings {

	public static void main(String[] args) {
		PalindromicSubstrings pal = new PalindromicSubstrings();
		String s = "abc";
		int result = pal.countSubstrings(s );
		System.out.println(result);
	}
	
	public int countSubstrings(String s) {
		
		if (s.isEmpty()) return 0;
		
		char[] arr = s.toCharArray();
		int n = arr.length;
		int[][] dp = new int[n][n];
		
		if (n < 2) return n;
		
		for (int i = 0; i < n; i++) {
			dp[i][i] = 1;
		}
		
		int count = n;
		
		//lenght==2
		for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i + 1]) {
                count++;
                dp[i][i + 1] = 1;
            }
        }
        
		//lenght>=3
		for(int len = 1; len < n; len++){
            for(int i = 0; i + len < n; i++){
                int j = len + i;
                if(arr[i] == arr[j]&&dp[i + 1][j - 1]==1){
                    count++;
                    dp[i][j] = 1;
                }
            }
        }
        return count;

	}

}
