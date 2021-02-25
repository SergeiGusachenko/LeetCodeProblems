package 414. Third Maximum Number;

public class 414. Third Maximum Number {
	public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        for(int i = nums.length - 1; i >= 1; i--){
            if(nums[i] > nums[i - 1])
                counter++;
            if(counter == 2)
                return nums[i - 1];
        }
        return nums[nums.length - 1];
    }
}
