package fundamentals.algorithms;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

import core.NodeT;
import core.Tree;

public class BFS {

	public static void main(String[] args) {
		Tree<Integer> root = Tree.of(10);
		Tree<Integer> rootFirstChild = root.addChild(2);
		Tree<Integer> depthMostChild = rootFirstChild.addChild(3);
		Tree<Integer> rootSecondChild = root.addChild(4);

		NodeT<Integer> start;
		NodeT<Integer> firstNeighbor;
		NodeT<Integer> firstNeighborNeighbor;
		NodeT<Integer> secondNeighbor;

		start = new NodeT<Integer>(1);
		firstNeighbor = new NodeT<Integer>(2);
		start.connect(firstNeighbor);
		
		secondNeighbor = new NodeT<Integer>(3);
		start.connect(secondNeighbor);

		
		firstNeighborNeighbor = new NodeT<Integer>(4);
		firstNeighbor.connect(firstNeighborNeighbor);
		firstNeighborNeighbor.connect(start);

		
		BFSearch(start, 2);

	}

	public static <T> Optional<Tree<T>> BFSearch(Tree<T> root, T value) {
		Queue<Tree<T>> queue = new ArrayDeque<>();
		queue.add(root);
		
		System.out.println(queue);
		
		
		Tree<T> currentNode;
		while (!queue.isEmpty()) {
			currentNode = queue.remove();
			System.out.println("Visited node with value: " + currentNode.getValue());

			if (currentNode.getValue().equals(value)) {
				return Optional.of(currentNode);
			} else {
				queue.addAll(currentNode.getChildren());
			}
		}

		return Optional.empty();
	}

	public static <T> Optional<NodeT<T>> BFSearch(NodeT<T> start, T value) {
		Queue<NodeT<T>> queue = new ArrayDeque<>();
		queue.add(start);
		
		System.out.println(queue);

		NodeT<T> currentNode;
		Set<NodeT<T>> alreadyVisited = new HashSet<>();

		while (!queue.isEmpty()) {
			currentNode = queue.remove();
			System.out.println("visiting..." + currentNode.getValue());
			
			if (currentNode.getValue().equals(value)) {
				System.out.println("found..." + currentNode.getValue());
				return Optional.of(currentNode);
			} else {
				alreadyVisited.add(currentNode);
				queue.addAll(currentNode.getNeighbors());
				queue.removeAll(alreadyVisited);
			}
		}

		return Optional.empty();
	}
}
