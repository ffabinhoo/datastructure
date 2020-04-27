package medium.array;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = {0,0,1,0,3,4,0,12};
		moveZeroes(nums );
	}

	public static void moveZeroes(int[] nums) {
		int j = 0;
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
