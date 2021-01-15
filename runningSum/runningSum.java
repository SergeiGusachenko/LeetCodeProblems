public int[] runningSum(int[] nums) {
	int result = nums[0];
	for(int i = 1; i < nums.length; i++){
		result += nums[i];
		nums[i] = result;
		result = nums[i];
	}
	return nums;
}