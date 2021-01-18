package maxProduct;

public static int maxProduct(int[] nums) {
	if(nums.length == 0)
		return 0;
	int current_max = nums[0];
	int current_min = nums[0];;
	int final_max = nums[0];
	for(int i = 1; i < nums.length; i++){
		int tmp =current_max;
		 current_max = Math.max(Math.max(current_max * nums[i],current_min * nums[i] ),nums[i]);
		 current_min = Math.min(Math.min(tmp * nums[i],current_min * nums[i] ),nums[i]);
		if(final_max < current_max)
			final_max = current_max;
	}
	return final_max;
}
