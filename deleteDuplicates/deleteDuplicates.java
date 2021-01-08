
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

public static ListNode deleteDuplicates(ListNode head) {
	if(head == null)
		return null;
	ListNode result = new ListNode(head.val);
	ListNode before = result;
	while ( head != null) {
		if (head.val != before.val) {
			before.next = head;
			before = before.next;
		}
		head = head.next;
		before.next = null;
	}

	return result.next;
}