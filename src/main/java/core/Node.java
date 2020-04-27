package core;

public class Node {
    public String data;
    public Node left;
    public Node right;

    public Node(String data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public String getData() {
        return this.data;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }
    
    @Override
	public String toString() {
		return " [Node val=" + data + " left=" + left + ", right=" + right + "]";
	}
}
