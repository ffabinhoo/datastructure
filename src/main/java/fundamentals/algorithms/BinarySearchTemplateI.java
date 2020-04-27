package fundamentals.algorithms;

public class BinarySearchTemplateI {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 17, 18, 19 };
		int target;
		int ret = binarySearch(nums, 17);
		System.out.println(ret);
	}

	static int binarySearch(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;

		int left = 0, right = nums.length - 1;
		while (left <= right) {
			// Prevent (left + right) overflow
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		// End Condition: left > right
		return -1;
	}

}
