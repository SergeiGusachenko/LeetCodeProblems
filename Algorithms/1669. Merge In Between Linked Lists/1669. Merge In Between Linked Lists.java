public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
	ListNode result = list1;
	ListNode a_point = null;
	int counter = 0;
	while(list1 != null){
		if(counter == a)
			break;
		counter++;
		a_point = list1;
		list1 = list1.next;
	}
	ListNode sec_end = null;
	ListNode sec_start = list2;
	while(list2 != null){
		sec_end = list2;
		list2 = list2.next;
	}
	while(list1 != null){
		if(counter == b + 1)
			break;
		counter++;
		list1 = list1.next;
	}
	a_point.next = sec_start;
	sec_end.next = list1;
	return result;
}