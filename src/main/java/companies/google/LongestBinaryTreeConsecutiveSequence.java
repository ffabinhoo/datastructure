package companies.google;

import core.TreeNode;

public class LongestBinaryTreeConsecutiveSequence {
	
	/*
	 * given a binary tree, find the longest consecutive sequence path
	 *     1
	 *      \ 
	 *       3  
	 *      / \
	 *     2   4
	 *          \
	 *           5
	 *      
	 */   
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		root.right = node3;
		node3.left = node2;
		node3.right = node4;
		node4.right = node5;
		
		
		LongestBinaryTreeConsecutiveSequence l = new LongestBinaryTreeConsecutiveSequence();
		l.longestTreeConsecutiveSequence(root);
	}
	
	public int longestTreeConsecutiveSequence(TreeNode root){
		
		int[] max = new int[1];
		int target = 0;
		int count = 0;
		helper(root, count, target, max);
		
		return max[0];
	}

	private void helper(TreeNode root, int count, int target, int[] max) {
		if (root==null) {
			return;
		}else if (root.val==target) {
			count++;
		} else {
			count=1;
		}
		
		max[0] = Math.max(max[0], count);
		
		helper(root.left, count, root.val+1, max);
		helper(root.right, count, root.val+1, max);
	}
}