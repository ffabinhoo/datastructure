package fundamentals.algorithms;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Stack;

import core.Node;

public class DFS_and_BFS {

	public static void main(String[] args) {

		Node nodeG = new Node("G", null, null);
		Node nodeD = new Node("D", null, null);
		Node nodeE = new Node("E", null, null);
		Node nodeH = new Node("H", null, null);
		;
		Node nodeF = new Node("F", nodeG, nodeH);

		Node nodeB = new Node("B", nodeD, nodeE);
		Node nodeC = new Node("C", null, nodeF);
		Node root = new Node("A", nodeB, nodeC);
		System.out.println(root);

		// executeDFS(root);
		// executeBFS(root);
		
		inOrderTraversal(root);
		
		//First is A
		//preOrderTraversal(root);
		
		//Last is A
		//postOrderTraversal(root);
	}

	private static void inOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.data);
			inOrderTraversal(node.right);
		}
	}
	
	private static void preOrderTraversal(Node node) {
		if (node != null) {
			System.out.println(node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	private static void postOrderTraversal(Node node) {
		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.data);
		}
	}
	
	

	public static void executeDFS(Node root) {
		Stack<Node> nodeStack = new Stack();
		Node currentNode = root;
		System.out.println("==================== DFS traversal =====================");
		nodeStack.push(currentNode);

		while (!nodeStack.isEmpty()) {
			currentNode = nodeStack.pop();
			System.out.println("-- " + currentNode.getData() + "--");

			if (currentNode.getLeft() == null && currentNode.getRight() == null) {
				continue;
			}

			else {
				if (currentNode.getRight() != null) {
					nodeStack.push(currentNode.getRight());
				}
				if (currentNode.getLeft() != null) {
					nodeStack.push(currentNode.getLeft());
				}
			}

		}
	}

	public static void executeBFS(Node root) {
		Queue<Node> nodeQueue = new ArrayDeque();
		Node currentNode = root;
		System.out.println("==================== BFS ============================");
		nodeQueue.add(currentNode);

		while (!nodeQueue.isEmpty()) {
			currentNode = nodeQueue.remove();
			System.out.println(currentNode.getData());
			if (currentNode.getLeft() == null && currentNode.getRight() == null) {
				continue;
			} else {
				if (currentNode.getLeft() != null) {
					nodeQueue.add(currentNode.getLeft());
				}
				if (currentNode.getRight() != null) {
					nodeQueue.add(currentNode.getRight());
				}
			}
		}
	}

}
