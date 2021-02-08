package searchBST;

public class searchBST {
	public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode res = null;
        if(root.val == val)
            return root;
        if(root.left != null)
            res = searchBST(root.left,val);
        if(res != null)
            return res;
        if(root.right != null)
            res = searchBST(root.right,val);
        if(res != null)
            return res;
        return res;
    }
}
