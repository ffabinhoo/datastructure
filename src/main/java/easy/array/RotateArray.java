package easy.array;

public class RotateArray {

	public static void main(String[] args) {
		
		int k = 3;
		
		int[] nums = {1,2};
		//int[] nums = {1,2,3,4,5,6,7};
		
		
		rotate(nums, k);

	}

	public static void rotate(int[] nums, int k) {
		
		int[] a = new int[nums.length];
        
		for (int i = 0; i < nums.length; i++) {
			
			a[(i+k)%nums.length] = nums[i];
			
		}
		
		
		for (int i = 0; i < a.length; i++) {
			
			nums[i] = a[i];
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			
		}

	}

}
