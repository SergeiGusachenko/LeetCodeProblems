
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public static ListNode swapPairs(ListNode head) {
	ListNode result = new ListNode();
	result.next = head;
	ListNode current = result;
	while(current.next != null && current.next.next != null){
		ListNode first = current.next;
		ListNode second = current.next.next;
		first.next = second.next;
		current.next = second;
		current.next.next = first;
		current = current.next.next;
	}
	  return result.next;
 }