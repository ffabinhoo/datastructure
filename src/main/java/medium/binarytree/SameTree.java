package medium.binarytree;

import core.TreeNode;

public class SameTree {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		TreeNode pleft = new TreeNode(2);
		TreeNode pright = new TreeNode(3);
		
		p.left = pleft;
		p.right = pright;
		
		
		TreeNode q = new TreeNode(1);
		TreeNode qleft = new TreeNode(2);
		TreeNode qright = new TreeNode(3);
		
		q.left = qleft;
		q.right = qright;
		
		boolean ret = isSameTree(p, q);
		System.out.println(ret);
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		
		if (p==null && q==null) 
			return true;
		
		else if (p==null || q==null) {
			return false;
		}else if (p.val != q.val) {
			return false;
		}else {
			return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
		}
		
	}

}
