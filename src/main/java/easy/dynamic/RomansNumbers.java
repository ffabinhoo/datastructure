package easy.dynamic;

public class RomansNumbers {

	public static void main(String[] args) {

		String s = "XVI";
		
		System.out.println(romanToInt(s));

	}
	
	


	public static int romanToInt(String s) {
		char[] arr = s.toCharArray();
		int[] nums = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			 switch(arr[i]){
			 case 'M':
	                nums[i]=1000;
	                break;
	            case 'D':
	                nums[i]=500;
	                break;
	            case 'C':
	                nums[i]=100;
	                break;
	            case 'L':
	                nums[i]=50;
	                break;
	            case 'X' :
	                nums[i]=10;
	                break;
	            case 'V':
	                nums[i]=5;
	                break;
	            case 'I':
	                nums[i]=1;
	                break;
		     }
			
		}
		
		int sum = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]<nums[i+1]) {
				sum= sum - nums[i];
			}else {
				sum = sum + nums[i];
			}
			
		}
		
		return sum+nums[nums.length-1];
		
	    
	}

}
