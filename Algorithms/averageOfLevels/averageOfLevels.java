package averageOfLevels;

public class averageOfLevels {
	public static void maxDepth(TreeNode root){
        if(root == null)
            return;
        depth++;
        if(depth > max_depth)
            max_depth = depth;
        maxDepth(root.left);
        maxDepth(root.right);
        if(depth > 1)
            depth --;
    }

    private static void countNums(TreeNode root, Map<Integer, Double> map, int[] numOnLevel) {
        if(root == null){
            return;
        }
        depth++;
        map.put(depth - 1, map.getOrDefault(depth - 1,.0) + root.val);
        numOnLevel[depth - 1]++;
        countNums(root.left, map, numOnLevel);
        countNums(root.right,map, numOnLevel);
        if(depth > 1)
            depth --;
    }

    public static List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();
        Map<Integer, Double> map= new HashMap<>();
        maxDepth(root);
        int[] numOnLevel = new int[max_depth];
        depth = 0;
        countNums(root, map, numOnLevel);
        for(int i = 0; i < numOnLevel.length; i++){
            Double num = (double) (map.get(i) / numOnLevel[i]);
            res.add(num);
        }
        return res;
    }

}
