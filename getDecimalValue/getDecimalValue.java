public int getDecimalValue(ListNode head) {
	if(head == null)
		return 0;
	int result = head.val;
	head = head.next;
	while(head != null){
		result = result *2 + head.val;
		head = head.next;
	}
	return result;
}