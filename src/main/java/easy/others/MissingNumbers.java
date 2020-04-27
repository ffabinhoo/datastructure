package easy.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumbers {

	public static void main(String[] args) {
		
		int[] nums = {0,1,2,4,5};
		System.out.println(missingNumber(nums));

	}

	public static int missingNumber(int[] nums) {
		
		
		Arrays.sort(nums);
		
		if (nums[0]!= 0) {
			return 0;
		}
		
		if (nums.length==1) {
			return 1;
		}else if (nums.length>0) {
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i]!=i) {
					return i;
				}
			}
		}
		return nums.length;

	}

}
