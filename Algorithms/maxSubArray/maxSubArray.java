package maxSubArray;

public static int maxSubArray(int[] nums) {
	if(nums == null)
		return -1;
	if(nums.length == 1)
		return nums[0];
	int final_max = nums[0];
	int current_max = nums[0];
	int current_min= nums[0];
	for(int i = 1; i < nums.length; i++){
		current_max = Math.max(current_max+nums[i], nums[i]);
		if(current_max > final_max)
			final_max = current_max;
	}
	return final_max;
}