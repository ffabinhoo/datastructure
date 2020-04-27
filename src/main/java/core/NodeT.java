package core;

import java.util.HashSet;
import java.util.Set;

public class NodeT<T> {
	
    public T value;
    public Set<NodeT<T>> neighbors;
 
    public NodeT(T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }
    

	public void connect(NodeT<T> node) {
        if (this == node) throw new IllegalArgumentException("Can't connect node to itself");
        this.neighbors.add(node);
        node.neighbors.add(this);
    }
    
 
    public Set<NodeT<T>> getNeighbors() {
		return neighbors;
	}



	public void setNeighbors(Set<NodeT<T>> neighbors) {
		this.neighbors = neighbors;
	}



	public T getValue() {
		return value;
	}



	public void setValue(T value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "NodeT [value=" + value;
	}

	

}
