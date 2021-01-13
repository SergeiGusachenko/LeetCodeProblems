package findShortestSubArray;

public static int findShortestSubArray(int[] nums) {
	HashMap<Integer, Integer> frequency = new HashMap<>();
	HashMap<Integer, Integer> firstIndex = new HashMap<>();
	int degree = 0;
	int distance = Integer.MAX_VALUE;
	for(int i = 0; i < nums.length; i++){
		frequency.put(nums[i],frequency.getOrDefault(nums[i],0) + 1);
		firstIndex.putIfAbsent(nums[i],i);
		if(frequency.get(nums[i]) >= degree){
			if(frequency.get(nums[i]) == degree){
				distance = Math.min(distance, i - firstIndex.get(nums[i]) + 1);
			}else{
				degree = frequency.get(nums[i]);
				distance = i - firstIndex.get(nums[i]) + 1;
			}
		}
	}
	return distance;
}