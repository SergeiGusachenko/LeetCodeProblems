package isBSTUtil;

public class isBSTUtil {
	public boolean isValidBST(TreeNode root) {
        return isBSTUtil(root, null, null);
    }

    static boolean isBSTUtil(TreeNode root, TreeNode left, TreeNode right) {
        if (root == null)
            return true;

        if (left != null && left.val >= root.val)
            return false;

        if (right != null && right.val <= root.val)
            return false;

        return isBSTUtil(root.left, left, root) && isBSTUtil(root.right, root, right);
    }
}
