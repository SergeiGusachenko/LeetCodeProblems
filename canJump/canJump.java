package canJump;

public class canJump {
	public static boolean canJump(int[] nums) {
        int index = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(index <= nums[i] + i)
                index = i;
        }
        if(index == 0)
            return true;
        return false;
    }
}
