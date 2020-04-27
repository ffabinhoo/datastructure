package companies.facebook;

public class ContainerWithMostWater {
	/*
	 * Given n non-negative integers a1, a2, ..., an , where each represents a point
	 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
	 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
	 * x-axis forms a container, such that the container contains the most water.
	 * 
	 * Note: You may not slant the container and n is at least 2.
	 */

	public static void main(String[] args) {

		ContainerWithMostWater c = new ContainerWithMostWater();
		int[] height = {1,8,6,2,5,4,8,3,7};
		int result = c.maxArea(height);
		System.out.println(result);

	}
	
public int maxArea(int[] height) {
		
		int max = Integer.MIN_VALUE;
		
		int i = 0;
		int j = height.length -1;
		
		while(i<j) {
			int min = Math.min(height[i], height[j]);
			
			max = Math.max(max, min * ( j - i ));
			
			if (height[i] < height[j]) {
				i++;
			}else {
				j--;
			}
		}
		
		
		return max;
	}

	public int maxArea2(int[] height) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < height.length; i++) {
			
			for (int j = i+1; j < height.length; j++) {
				int min = Math.min(height[i], height[j]);
				
				max = Math.max(max, min*(j-i));
			}
			
		}
		
		
		return max;
	}

}
