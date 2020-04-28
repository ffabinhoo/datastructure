package companies.amazon;

import core.TreeNode;

public class SubTreeOfAnotherTree {
	
	/*
	 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
	 */

	public static void main(String[] args) {
		SubTreeOfAnotherTree st = new SubTreeOfAnotherTree();
		
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		
		t3.left = t4;
		t3.right = t5;
		t4.left = t1;
		t4.right = t2;
		
		
		TreeNode tt1 = new TreeNode(1);
		TreeNode tt2 = new TreeNode(2);
		TreeNode tt4 = new TreeNode(4);
		
		tt4.left = tt1;
		tt4.right = tt2;
		
		
		
		boolean ret = st.isSubtree(t3, tt4);
		
		System.out.println(ret);
		
		
	}

	public boolean isSubtree(TreeNode s, TreeNode t) {
		
		if (s==null) {
			return false;
		}else if (isSameTree(s, t)) {
			return true;
		}else {
			return isSubtree(s.left, t) || isSubtree(s.right, t);
		}
		
	}

	private boolean isSameTree(TreeNode s, TreeNode t) {
		if (s==null || t==null) {
			return s==null && t==null;
		} else if (s.val == t.val) {
			return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
		} else {
			return false;
		}
		
		
	}

}
