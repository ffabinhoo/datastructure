package easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
