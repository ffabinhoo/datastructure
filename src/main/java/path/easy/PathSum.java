package path.easy;

import core.TreeNode;

/*
 Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

 
 */

public class PathSum {
	
	public static void main(String[] args) {
		
		PathSum pathSum = new PathSum();
		
		int sum = 22;
		
		TreeNode root 		= new TreeNode(5);
		TreeNode root_4     = new TreeNode(4);
		TreeNode root_8     = new TreeNode(8);
		TreeNode node_11 	= new TreeNode(11);
		TreeNode node_13 	= new TreeNode(13);
		TreeNode node_4  	= new TreeNode(4);
		TreeNode node_7  	= new TreeNode(7);
		TreeNode node_2  	= new TreeNode(2);
		TreeNode node_1  	= new TreeNode(1);
		
		root.left = root_4;
		root.right = root_8;

		root_4.left = node_11;
		
		root_8.left = node_13;
		root_8.right = node_4;
		
		node_11.left = node_7;
		node_11.right = node_2;
		
		node_4.right = node_1;
		
		boolean result = pathSum.hasPathSum(root, sum );
		
		System.out.println(result);
	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
		
		if (root==null) return false;
		
		if(sum-root.val <0) return false;
		
		System.out.println(sum - root.val);
		
		//Base case true - sum - root.val ==0 and left and right equals null
		if (root.left==null && root.right==null && sum - root.val==0) {
			return true;
		}else {
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}
	}
}
