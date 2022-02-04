package RobberHouse;

public static int rob(int[] nums) {
	if(nums.length == 0)
		return 0;
	if(nums.length < 2)
		return nums[0];
	int []result = new int[nums.length + 1];
	result[1] = nums[0];
	for(int i = 1; i < nums.length; i++){
		result[i + 1] = (result[i] > result[i - 1] + nums[i]) ? result[i] : result[i - 1] + nums[i];
	}
	return result[nums.length];
}