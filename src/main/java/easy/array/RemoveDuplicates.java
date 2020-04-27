package easy.array;

class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
		
    	int j = 0;
    	
    	for (int i = 1; i < nums.length; i++) {
    		
    		if (nums.length ==0) return 0;
    		
    		if (nums[j]!= nums[i]) {
    			j++;
    			nums[j] = nums[i];
    		}
    		
			
		}
    	
    	return j+1;
    	
    	
        
    }
    
    
    public static void main(String[] args) {
    	int nums[] = {0,0,0,1,20};
        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
	}
    
    
    
}
