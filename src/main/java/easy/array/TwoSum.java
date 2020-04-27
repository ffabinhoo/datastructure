package easy.array;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,1,9,4,4,56,90,3};
		int target = 8;
		int[] tt = (twoSum(nums, target ));
		
		for (int i = 0; i < tt.length; i++) {
			System.out.println(tt[i]);	
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] arr =new int[2];
		int j = 0;
		
		for (int i = j+1; i < nums.length; i++) {
			if(nums[j] + nums[i]==target) {
				arr[0] = j;
				arr[1] = i;
				return arr;
			}else if((nums.length -1)==i){
				j++;
				i = j;
			}
		}
		return arr;
	}

}
