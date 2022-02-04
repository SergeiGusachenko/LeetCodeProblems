public int[] twoSum(int[] nums, int target) {
	int first = 0;
	int second = 0;
	Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
	for (int i = 0; i < nums.length; i++) {
		first = nums[i];
		if (hashmap.containsKey(target - nums[i])) {
			return new int[]{hashmap.get(target - nums[i]), i};
		} else
			hashmap.put(nums[i], i);
	}
	return new int[]{};
}