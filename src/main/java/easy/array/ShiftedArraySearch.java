package easy.array;

public class ShiftedArraySearch {

	public static void main(String[] args) {
		int[] nums = { 8, 9, 1, 3, 5, 7 };
		int num = 5;

		int pivot = findPivot(nums);

		if (pivot == -1) {
			System.out.println(binarySearch(nums, 0, nums.length - 1, num));
		}

		if (pivot == 0 || num >= nums[0]) {

			System.out.println(binarySearch(nums, 0, pivot, num));
		} else {
			System.out.println(binarySearch(nums, pivot, nums.length - 1, num));
		}
	}

	public static int binarySearch(int[] arr, int left, int right, int num) {

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (mid >= arr.length) {
				return -1;
			}
			
			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] > num) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public static int findPivot(int[] nums) {
		int low = 0;
		int high = nums.length - 1;

		if (nums[low] <= nums[high]) {
			return -1;
		}

		while (low <= high) {
			int middle = (high + low) / 2;

			if (nums[middle] > nums[middle + 1]) {
				return middle + 1;
			}

			if (nums[middle] < nums[low]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -1;
	}
}
