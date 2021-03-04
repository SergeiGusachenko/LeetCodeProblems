package 1022. Sum of Root To Leaf Binary Numbers;

public class 1022. Sum of Root To Leaf Binary Numbers {
	public  int sumRootToLeaf(TreeNode root) {
        return getSumOfTree(root, 0);
    }

    public int sumOfRes = 0;
    private int getSumOfTree(TreeNode root, int res) {
        res = res * 2 + root.val;
        if(root.left != null)
            getSumOfTree(root.left, res);
        else if(root.right == null){
            sumOfRes += res;
            res = 0;
        }
        if(root.right != null)
            getSumOfTree(root.right, res);
        else if(root.left == null){
            sumOfRes += res;
            res = 0;
        }

        return sumOfRes;
    }
}
