package sortedArrayToBST;

public class sortedArrayToBST {
	private static TreeNode buildBTSTree(int [] nums, int first, int last) {
        if(first > last)
            return null;
        int middle = (first + last)/2;
        TreeNode tree = new TreeNode(nums[middle]);
        tree.left = buildBTSTree(nums, first, middle - 1);
        tree.right = buildBTSTree(nums, middle + 1, last);
        return tree;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length < 0)
            return null;
        return buildBTSTree(nums, 0, nums.length - 1) ;
        }

}
