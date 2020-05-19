package easy.array;

import java.util.HashSet;
import java.util.Set;

/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, 
	and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
 */

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,1};
		System.out.println(containsDuplicate(arr));

	}

	public static boolean containsDuplicate(int[] nums) {
		
		Set<Integer> mp = new HashSet();
		
		for (int i = 0; i < nums.length; i++) {
			if (mp.contains(nums[i])) {
				return true;
			}else {
				mp.add(nums[i]);
			}
			
		}
		
		return false;
	}

}
