/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
	public Node connect(Node root) {
	   if(root == null)
		   return null;
		ArrayDeque<Node> q = new ArrayDeque();
		q.add(root);
		Node tempNode = null;
		while(!q.isEmpty()){
			int count = q.size();
			while(count > 0) {
				tempNode = q.poll();
				count--;
				if(count > 0) tempNode.next = q.peek();
				if(tempNode.left != null)
					q.add(tempNode.left);
				if(tempNode.right != null)
					q.add(tempNode.right);
			}
		}
		return root;
	}

}