package companies.amazon;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		SpiralMatrix spiral = new SpiralMatrix();
		int[][] matrix = {  { 1, 2, 3 }, 
							{ 4, 5, 6 }, 
							{ 7, 8, 9 } };
		List<Integer> result = spiral.spiralOrder(matrix);
		
		result.stream().forEach(System.out::print);

	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> nums = new ArrayList<Integer>();

		int top = 0;
		int botton = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		int size = matrix.length * matrix[0].length;

		while(nums.size() < size){
			for(int i = left; i <= right && nums.size()< size; i++) {
				nums.add(matrix[top][i]);
			}
			top++;
			for(int i = top; i <= botton && nums.size()< size; i++) {
				nums.add(matrix[i][right]);
			}
			right--;
			for (int i = right; i >= left && nums.size() < size; i--) {
				nums.add(matrix[botton][i]);
			}
			botton--;
			for (int i = botton; i >= top && nums.size() < size; i--) {
				nums.add(matrix[i][left]);
			}
			left++;
		}
		return nums;
	}

}
