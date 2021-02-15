package 1019. Next Greater Node In Linked List;

public class 1019. Next Greater Node In Linked List {
	public static int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack = new Stack();
        Map<Integer,Integer> map = new HashMap();
        List<Integer> numbers = new ArrayList();
        int index = 0;
        while(head != null){
            numbers.add(head.val);
            while(!stack.isEmpty() && numbers.get(stack.peek()) < head.val){
                map.put(stack.pop(),head.val);
            }
            stack.add(index);
            index++;
            head = head.next;
        }
        int[] res = new int[numbers.size()];
        for(int i = 0;i < numbers.size();i++){
            res[i] = map.get(i) != null ? map.get(i) : 0;
        }
        return res;
    }
}
