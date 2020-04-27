package medium.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IncreasingTriplet {

	public static void main(String[] args) {
		//int[] nums = {5,1,5,5,2,5,4};
		//int[] nums = {1,1,1,1,1,1,1,1,1,1};
		
		//int[] nums = {0,4,2,1,0,-1,-3};
		int[] nums = {1,2,3,4,5};
		
		System.out.println(increasingTriplet2(nums));
	}

	public static boolean increasingTripletOld(int[] nums) {
		
		int a_pointer = 0, b_pointer =1, tot = 1;
		
		List<Integer> set = new ArrayList();
		set.add(nums[a_pointer]);
		while(b_pointer < nums.length && set.size()<3) {
			if (nums[a_pointer]<=nums[b_pointer]) {
				set.add(nums[b_pointer]);
				b_pointer++;
				a_pointer++;
			}else {
				//set.remove(nums[a_pointer-1]);
				//set.add(nums[b_pointer]);
				set.clear();
				set.add(nums[b_pointer]);
				a_pointer++;
				b_pointer++;
			}
		}
		
		boolean equal = true;
		Integer ant = 0;
		
		if (set.size()==3) {
			for (int i = 1; i < set.size(); i++) {
				if(set.get(0)!=set.get(i)) {
					equal = false;
				}
			}
		}
		if(equal) {
			return false;
		}
		
		if (set.size()==3) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public static boolean increasingTriplet2(int[] nums) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for (int n : nums) {
			
			if (n <= first) {
				first = n;
			}else if (n <= second) {
				second = n;
			}else {
				return true;
			}
		}
		
		
		return false;
	}
	
	
	public static boolean increasingTriplet(int[] nums) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int n : nums) {
			if (n <= first) {
				first = n;
			} else if (n <= second) {
				second = n;
			} else {
				return true;
			}
		}
		return false;
	}
	

}
