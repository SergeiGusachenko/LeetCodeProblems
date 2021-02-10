package rangeSumBST;

public class rangeSumBST {
	public static void godeeperAndFindSum(TreeNode node, int low, int high){

        if(low <= node.val && node.val <= high)
            sum+= node.val;
        if(node.left == null && node.right==null)
            return ;
        if(node.left != null)
            godeeperAndFindSum(node.left, low, high);
        if(node.right != null)
            godeeperAndFindSum(node.right, low, high);
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        godeeperAndFindSum(root, low, high);
        return sum;
    }
}
