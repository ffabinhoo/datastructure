package fundamentals.algorithms;

public class BinarySearch {
	
	public static void main(String[] args) {
		int [] arr = {-11,-2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int target = 0;
		
		int ret = binarySearch(arr, target);
		System.out.println(ret);
		
	}
	public static int binarySearch(int []arr, int target){
		
		int left = 0;
		int right = arr.length;
		
		while(left<=right) {
			int mid = left + (right - left) /2;
			
			if (mid >= arr.length) return -1;
			
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		
		return -1;
	}
}
