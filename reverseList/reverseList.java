
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

public static ListNode reverseList(ListNode head) {
	ListNode prev = null;
	ListNode current = head;

	while( current != null){
		ListNode nex = current.next;
		current.next = prev;
		prev = current;
		current = nex;
	}
	return prev;
}