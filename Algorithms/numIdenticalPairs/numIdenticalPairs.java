package numIdenticalPairs;

public static int numIdenticalPairs(int[] nums) {
	Map<Integer, Integer> map = new HashMap<>();
	int result = 0;
	for(int i = 0; i < nums.length; i++){
		if(!map.containsKey(nums[i]))
			map.put(nums[i], 1);
		else
			map.put(nums[i],map.get(nums[i]) + 1);
	}
	for(Map.Entry<Integer,Integer> etry : map.entrySet()){
		result += ((etry.getValue() - 1) * etry.getValue()) / 2 ;
	}
	return result;
}