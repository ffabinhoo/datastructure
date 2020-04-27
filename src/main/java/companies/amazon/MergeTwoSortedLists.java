package companies.amazon;

import core.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node4 = new ListNode(4);
		
		l1.next = node2;
		node2.next = node4;
		
		ListNode l2 = new ListNode(1);
		ListNode node13 = new ListNode(3);
		ListNode node14 = new ListNode(4);
		
		l2.next = node13;
		node13.next = node14;
		
		MergeTwoSortedLists m = new MergeTwoSortedLists();
		ListNode ret = m.mergeTwoLists(l1, l2);
		
		System.out.println(ret);

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        
		while(l1!=null && l2!=null) {
			
			if(l1.val<=l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			}else {
				dummy.next = l2;
				l2 = l2.next;
			}
			
			dummy = dummy.next;
		}
		
		if(l1 != null) {
			dummy.next = l1;
		}else {
			dummy.next  = l2;
		}
		
		return head.next;

	}

}
