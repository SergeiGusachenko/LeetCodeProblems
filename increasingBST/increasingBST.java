package increasingBST;

public class increasingBST {
	private static void incre(TreeNode root) {
        if (root == null)
            return;
        incre(root.right);
        TreeNode tmp = root.left;
        root.left = null;
        root.right = prev;
        prev = root;
        incre(tmp);
    }

    public static TreeNode increasingBST(TreeNode root) {
        incre(root);
        return prev;
    }
}
