package tree2str;

public class tree2str {
	public void godeeper(TreeNode node){
        sb.append(node.val);
        if(node.left == null && node.right==null)
            return ;

        sb.append("(");
        if(node.left != null)
            godeeper(node.left);

        sb.append(")");
        if(node.right != null){
            sb.append("(");
            godeeper(node.right);
            sb.append(")");
        }
    }


    public String tree2str(TreeNode t) {
        if(t == null)
            return sb.toString();
        godeeper(t);
        return sb.toString();
    }
}
