package companies.google;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

	public static void main(String[] args) {

		SubSets sub = new SubSets();

		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = sub.subsets(nums);
		
		result.stream().forEach(System.out::println);

	}

	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> subsets = new ArrayList<List<Integer>>();
		generateSubsets(0, nums, new ArrayList<Integer>(), subsets);

		return subsets;

	}

	private void generateSubsets(int index, int[] nums, ArrayList<Integer> current, List<List<Integer>> subsets) {
		
		subsets.add(new ArrayList<>(current));
		
		for (int i = index; i < nums.length; i++) {
			current.add(nums[i]);
			generateSubsets(i + 1, nums, current, subsets);
			
			current.remove(current.size() - 1);
		}
	}
}
