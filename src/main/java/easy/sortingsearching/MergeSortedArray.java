package easy.sortingsearching;

public class MergeSortedArray {

	public static void main(String[] args) {
		// arr = {1,2,3,0,0,0}
		int[] nums1 = {1,2,3,0,0,0 };
		int[] nums2 = { 2,5,6 };
		int m = 3;
		int n = 3;
		int[] tt = merge(nums1, m, nums2, n);

		for (int i = 0; i < tt.length; i++) {

			System.out.println(tt[i]);
		}

	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int tail1 = m-1; int tail2 = n-1; int finished = m + n -1;
		
		while(tail1 >=0 && tail2>=0) {
			if (nums1[tail1] > nums2[tail2]) {
				nums1[finished--] = nums1[tail1--];
			}else {
				nums1[finished--] = nums2[tail2--];
			}
		}
		
		while(tail2>=0) {
			nums1[finished--] = nums2[tail2--];
		}
	    
	    
	    return nums1;
	}
	
}
