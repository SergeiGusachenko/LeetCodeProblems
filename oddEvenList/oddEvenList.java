package oddEvenList;

public ListNode oddEvenList(ListNode head) {
	if(head == null)
		return null;
	if(head.next == null)
		return head;
	ListNode dhead = head;
	ListNode odd = dhead;
	ListNode evenStart = dhead.next;
	ListNode even = dhead.next;
	while(odd != null && odd.next != null && odd.next.next != null)
	{
		ListNode tmp = even.next.next;
		odd.next = odd.next.next;
		even.next = tmp;
		even = tmp;
		odd = odd.next;
	}
	odd.next = evenStart;
	return head;
}