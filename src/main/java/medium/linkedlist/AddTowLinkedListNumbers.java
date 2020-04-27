package medium.linkedlist;

import core.ListNode;

public class AddTowLinkedListNumbers {
	
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode l1 = new ListNode(3);
		
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode l2 = new ListNode(4);
		
		node1.next = node2;
		node2.next = l1;
		
		node4.next = node5;
		node5.next = l2;
		
		
		System.out.println(addTwoNumbers(node1, node4));
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
	    //initializing l1 and l2 to head
		ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    
	    
	    
	    while (p != null || q != null) {
	    	int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        
	        int sum = carry + x + y;
	        
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
		
		
		return dummyHead.next;
        
    }

}
