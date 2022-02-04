package 82. Remove Duplicates from Sorted List II;

public class 82. Remove Duplicates from Sorted List II {
	public static ListNode deleteDuplicates(ListNode head) {
        int [] res = new int[201];

        ListNode nodes = new ListNode(0);
        ListNode result = nodes;
        while(head != null){
            if(res[head.val + 100] == 0)
                res[head.val + 100]++;
            else
                res[head.val + 100] = -1;
            head = head.next;
        }
        for(int i = 0; i < res.length; i++){
            if(res[i] == 1){
                nodes.next = new ListNode(i - 100);
                nodes = nodes.next;
            }
        }
        return result.next;
    }
}
