package 160. Intersection of Two Linked Lists;

public class 160. Intersection of Two Linked Lists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1 = headA;
        ListNode head2 = headB;
        while(head1 != null){
            while(head2 != null){
                if(head1 == head2)
                    return head1;
                head2 = head2.next;
            }
            head2 = headB;
            head1 = head1.next;
        }
        return null;
    }

}
