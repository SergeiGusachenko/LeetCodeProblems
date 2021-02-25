package 1509. Minimum Difference Between Largest and Smallest Value in Three Moves;

public class 1509. Minimum Difference Between Largest and Smallest Value in Three Moves {
	public static int minDifference(int[] nums) {
        if (nums.length < 5)
            return 0;
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for (int i=0; i<4; i++) {
            result = Math.min(result, nums[nums.length-4+i] - nums[i]);
        }
        return result;
    }
}
