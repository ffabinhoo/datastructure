package easy.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

import core.TreeNode;

public class DiameterOfBinaryTree {
	
	static int ans;
	public static void main(String[] args) {
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		
		
		int ret = diameterOfBinaryTree(node1);
		System.out.println(ret);
	}
	
    public static int diameterOfBinaryTree(TreeNode root) {
    	ans = 1;
        depth(root);
        return ans - 1;
    }
    public static int depth(TreeNode node) {
       if (node==null) return 0;
       
       int L = depth(node.left);
       int R = depth(node.right);
       
       ans = Math.max(ans, L+R+1);
       
       return Math.max(L, R) +1;
        
    }
    
    
    
}
