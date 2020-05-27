package companies.facebook;

import core.TreeNode;

/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:

    2
   / \
  1   3

Input: [2,1,3]
Output: true
Example 2:

    5
   / \
  1   4
     / \
    3   6

Input: [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
 */

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		ValidateBinarySearchTree validate = new ValidateBinarySearchTree();
		
		TreeNode root = new TreeNode(0);
		validate.isValidBST(root);
	}

	private boolean isValidBST(TreeNode root) {
		
		return validate(root, null, null);
		
	}

	private boolean validate(TreeNode root, Integer max, Integer min) {
		
		if (root ==null) {
			return true;
		}
			
		if (max != null && root.val >= max || min != null && root.val <= min) {
			return false;
		}else {
			
			return validate(root.left, root.val, min) && validate(root.right, max, root.val);
		}
	}
}
