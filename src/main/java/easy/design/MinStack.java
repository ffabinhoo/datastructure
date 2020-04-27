package easy.design;

import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
	
	Stack<Integer> stack = new Stack();
	
    public MinStack() {
        
    }
    
    
    public static void main(String[] args) {
    	MinStack minStack = new MinStack();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	minStack.getMin();  // --> Returns -3.
    	minStack.pop();
    	minStack.top();     // --> Returns 0.
    	minStack.getMin();  // --> Returns -2.
	}
    
    public void push(int x) {
    	Integer pu = stack.push(x);
        System.out.println(pu);
    }
    
    public void pop() {
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
        
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
    	for (int i = 0; i < this.stack.size(); i++) {
			if (min > this.stack.get(i)) {
				min = this.stack.get(i);
			}
		}
    	System.out.println(min);
    	return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */