package circularArrayLoop;

public static boolean circularArrayLoop(int[] nums) {
	for(int i = 0; i < nums.length; i++) {
		int index = (i + nums[i] + 1000 * nums.length) % nums.length;
		System.out.println("here1");
		while(nums[index] * nums[i] > 0 && index >= i && nums[index] % nums.length != 0) {
			if(i == index) return true;
			int val = nums[index];
			nums[index] = i - index + (nums[index] > 0 ? nums.length : 0);
			index = (index + val + 1000 * nums.length) % nums.length;
			System.out.println("here");
		}
	}
	return false;
}