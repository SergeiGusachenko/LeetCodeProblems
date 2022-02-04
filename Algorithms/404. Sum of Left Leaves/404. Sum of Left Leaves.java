package 404. Sum of Left Leaves;

public class 404. Sum of Left Leaves {
	private static int sum = 0;
	public static int getNumber(TreeNode root, boolean isLeftNode){
        if(root.left != null)
            getNumber(root.left, true);
        if(root.right != null)
            getNumber(root.right, false);
        if(root.left == null && root.right == null && isLeftNode){
            sum+= root.val;
        }
        return sum;
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root != null || root.right == null && root.left == null)
            return 0;
        return getNumber(root,false);
    }
}
