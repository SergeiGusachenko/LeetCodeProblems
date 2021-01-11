package middleNode;

public ListNode middleNode(ListNode head) {
	ListNode p1 = head;
	if(head == null)
		return null;
	int size = 0;
	while(head.next != null){
		size++;
		head = head.next;
	}
	int i = 0;
	while( i < size){
		p1 = p1.next;
		i = i + 2;
	}
	return p1;
}