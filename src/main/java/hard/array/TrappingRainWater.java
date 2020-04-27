package hard.array;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		
		TrappingRainWater obj = new TrappingRainWater();
		int result = obj.trap(height);

		System.out.println(result);

	}

	public int trap(int[] height) {
		int water = 0;

		if (height.length <= 2)
			return water;

		int maxIndex = 0;
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[i] > max) {
				maxIndex = i;
			}
			max = Math.max(max, height[i]);
		}

		int leftMax = height[0];
		for (int i = 1; i < maxIndex; i++) {
			if (height[i] > leftMax) {
				leftMax = height[i];
			} else {
				water += leftMax - height[i];
			}
		}

		int rightMax = height[height.length - 1];

		for (int i = height.length - 2; i > maxIndex; i--) {
			if (height[i] > rightMax) {
				rightMax = height[i];
			} else {
				water += rightMax - height[i];
			}
		}

		return water;
	}

}
