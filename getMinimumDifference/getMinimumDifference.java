package getMinimumDifference;

public class getMinimumDifference {
	public static int getMinimumDifference(TreeNode root) {
        if (root == null)
            return min;

        getMinimumDifference(root.right);
        min = Math.min(min, Math.abs(last - root.val));
        last = root.val;
        getMinimumDifference(root.left);
        return min;
    }
}
