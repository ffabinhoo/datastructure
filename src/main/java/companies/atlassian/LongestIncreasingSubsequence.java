package companies.atlassian;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence();
		
		int[] nums = {10,9,2,5,3,4};
		int ret = obj.lengthOfLIS(nums );
		System.out.println(ret);
	}

	public int lengthOfLIS(int[] nums) {
		
		if(nums == null || nums.length == 0) {
	        return 0;
	    }
	    int[] res = new int[nums.length];
	    int max = 0;
	    for(int i = 0; i < nums.length; i++) {
	        res[i] = 1;
	        for(int j = 0; j < i; j++) {
	            if(nums[j] < nums[i]) {
	                res[i] = (res[i] > res[j]) ? res[i] : (res[j] + 1);
	            }
	        }
	        max = Math.max(max, res[i]);
	    }
	    return max;
	}

}
