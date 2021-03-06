package fundamentals.algorithms;

public class KadanesAlgorithm {
	/*
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest sum and return its sum.
	 * 
	 * Example:
	 * 
	 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the
	 * largest sum = 6. Follow up:
	 * 
	 * If you have figured out the O(n) solution, try coding another solution using
	 * the divide and conquer approach, which is more subtle.
	 */

	public static void main(String[] args) {

		KadanesAlgorithm max = new KadanesAlgorithm();

		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int result = max.maxSubArray(nums);
		System.out.println(result);
	}
	
	public int maxSubArray(int[] nums) {
		
		int max = nums[0];
		int curr_max = max;
		
		for (int i = 1; i < nums.length; i++) {
			curr_max = Math.max(nums[i]+curr_max, nums[i]);
			max = Math.max(max, curr_max);
		}

		return max;
	}

}
