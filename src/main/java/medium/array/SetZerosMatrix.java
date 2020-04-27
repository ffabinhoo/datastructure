package medium.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetZerosMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 4, 4, 4 }, { 4, 0, 4 }, { 4,4,4 } };
		setZeroes(matrix);
	}

	public static void setZeroes(int[][] matrix) {

		Set<Integer> row = new HashSet();
		Set<Integer> col = new HashSet();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {
					row.add(i);
					col.add(j);

				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(row.contains(i) || col.contains(j)) {
					matrix[i][j] =0;
				}
				
			}
			
		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(" "+ matrix[i][j]);
				
			}
			
		}
	}

}
