package easy.array;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println(generate(5));

	}
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		
		if (numRows==0) return triangle;
		
		List<Integer> first_row = new ArrayList<Integer>();

		first_row.add(1);
		triangle.add(first_row);

		for (int i = 1; i < numRows; i++) {

			List<Integer> prev_row = triangle.get(i - 1);
			List<Integer> curr_row = new ArrayList<Integer>();

			curr_row.add(1);

			for (int j = 1; j < i; j++) {
				curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
			}
			curr_row.add(1);
			triangle.add(curr_row);

		}
		return triangle;
	}
}
