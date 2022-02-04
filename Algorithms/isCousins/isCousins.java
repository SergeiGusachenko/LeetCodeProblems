package isCousins;

public class isCousins {
	public static int parent = -1;

    public static int x_parent = -1;
    public static int x_depth = -1;
    public static int y_parent = -1;
    public static int y_depth = -1;
    public static int depth = 0;
    public static int max_depth = 0;
	public static void traverse(TreeNode root, int x,int y){
        if(root == null){
            return;
        }
        depth++;
        if(x == root.val){
            x_depth = depth;
            x_parent = parent;
        }
        if(y == root.val){
            y_parent = parent;
            y_depth = depth;
        }
        parent = root.val;
        traverse(root.left,x, y);
        parent = root.val;
        traverse(root.right,x, y);
        if(depth > 1)
            depth --;
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        parent = root.val;
        traverse(root, x, y);
        if(x_parent != y_parent && y_depth == x_depth)
            return true;
        return false;
    }

}
