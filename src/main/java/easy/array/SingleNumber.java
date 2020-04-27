package easy.array;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {

		int[] arr = {2,2,1};
		
		System.out.println(singleNumber2(arr));

	}

	public static int singleNumber(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap();
		
		for (int i = 0; i < nums.length; i++) {
			
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
		}
		
		for (Entry<Integer, Integer> i : map.entrySet()) {
			if (i.getValue()==1) {
				return i.getKey();
			}
			
		}
		
		return 0;

	}
	public static int singleNumber2(int[] nums) {
        int xor = 0;
        
        for (int i = 0; i < nums.length; i++) {
			xor ^= nums[i];
		}
        return xor;
		
    }

}
