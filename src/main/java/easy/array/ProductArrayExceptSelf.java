package easy.array;

public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		//			 {24,12,8,6}
		productExceptSelf(nums);
	}

	public static int[] productExceptSelf(int[] nums) {
		
		int size = nums.length;
		
		int[] L = new int[size];
		int[] R = new int[size];
		
		int[] answer = new int[size];
		
		
		L[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			L[i] = nums[i-1] * L[i-1];
		}
		
		R[size-1] = 1;
		for (int i = size-2; i >= 0; i--) {
			R[i] = nums[i+1] * R[i+1];	
		}
		
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = L[i] * R[i];
		}
		
		
		return answer;
		
	}

}
