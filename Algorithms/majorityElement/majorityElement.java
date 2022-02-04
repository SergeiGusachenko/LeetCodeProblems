package majorityElement;

public class majorityElement {
	public static int majorityElement(int[] nums) {
        int prev_occur = nums[0];
        int prev_max_occur = 0;
        int occur = nums[0];
        int max_occur = 0;
        int i = 0;
        int j = nums.length / 2;
        while(i <= nums.length / 2 && j < nums.length){
            if(nums[i] == nums[j]){
                if(prev_occur == nums[i]){
                    prev_max_occur++;
                }else{
                    prev_max_occur = 1;
                    prev_occur = nums[i];
                }
            }
            if(max_occur < prev_max_occur){
                max_occur = prev_max_occur;
                occur = prev_occur;
            }
            i++;
            j++;
        }
        return occur;
    }

}
