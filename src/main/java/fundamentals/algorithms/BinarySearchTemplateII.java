package fundamentals.algorithms;

public class BinarySearchTemplateII {
	
	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 17, 18, 19 };
		int target = 4;
		int ret = binarySearch(nums, target);
		System.out.println(ret);
	}

	static int binarySearch(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;

		int left = 0, right = nums.length;
		while (left < right) {
			// Prevent (left + right) overflow
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		// Post-processing:
		// End Condition: left == right
		if (left != nums.length && nums[left] == target)
			return left;
		return -1;
	}

}
