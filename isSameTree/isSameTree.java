package isSameTree;

public class isSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean res = true;
        if(p == null || q == null){
            if(p == q)
                res = true;
            else
                res = false;
            return res;
        }
        if(p.val != q.val)
             return false;
        res = isSameTree(p.right, q.right);
        if(!res)
            return false;
        res = isSameTree(p.left, q.left);
        if(!res)
            return false;
        return res;
    }

}
