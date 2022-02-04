package 965. Univalued Binary Tree;

public class 965. Univalued Binary Tree {
	public static int number;
    public static boolean ans;
    public static boolean isUnivalTree(TreeNode root) {
        ans = true;
        number = root.val;
        checkTheTree(root);
        return ans;
    }

    private static boolean checkTheTree(TreeNode root) {
        if(root == null)
            return true;
        if(number != root.val){
            ans = false;
            return false;
        }
        checkTheTree(root.right);
        checkTheTree(root.left);
        return true;
    }
}
