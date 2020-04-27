package easy.array;

import core.TreeNode;

public class SortedArrayBinarySearchTree {
		
/*
Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5

*/

	public static void main(String[] args) {

		int[] nums = {-10,-3,0,5,9};
		System.out.println(sortedArrayToBST(nums));

	}

	public static TreeNode sortedArrayToBST(int[] nums) {
		
		if (nums.length == 0) {
	        return null;
	    }
	    TreeNode head = helper(nums, 0, nums.length - 1);
	    return head;

	}

	private static TreeNode helper(int[] nums, int low, int high) {
		
		if (low > high) {
			return null;
		}
		
		int mid = (low + high) /2;
		
		TreeNode node = new TreeNode(nums[0]);
		
		node.left = helper(nums, low, mid-1);
		node.right = helper(nums, mid+1, high);
		
		
		return node;
		
		
	}

}