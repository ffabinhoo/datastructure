package medium.array;

import java.util.ArrayList;
import java.util.List;

public class RangeNumbersGoogle {
	
	
	public static void main(String[] args) {
		int[] arr = {-5, 0,1,2,7,8,11};
		System.out.println(rangeOfIntegers2(arr ));
	}
	
	private static List<String> rangeOfIntegers2(int[] nums) {
		List<String> ret = new ArrayList<String>();
		
		for (int i = 0; i < nums.length; i++) {
			int start = nums[i];
			
			while(i+1 < nums.length && nums[i]+1==nums[i+1]) {
				i++;
			}
			int end   = nums[i];
			
			String str_ret = "";
			
			if (start!=end) {
				str_ret = start + "->" + end;
			}else {
				str_ret += start;
			}
			
			ret.add(str_ret);
		}
		
		return ret;
	}


	public static List<String> rangeOfIntegers(int[] nums){
		
		List<String> ret = new ArrayList<String>();
		
		for (int i = 0; i < nums.length; i++) {
			int start = nums[i];
			
			while(i+1 < nums.length && nums[i]+1 == nums[i+1]) {
				i++;
			}
			
			int end = nums[i];
			
			String current_range = "";
			
			if (start!=end) {
				current_range = start + "->" + end;
			} else {
				current_range += start;
			}
			
			ret.add(current_range);			
			
			
		}
		
		
		return ret;
		
	}

}
