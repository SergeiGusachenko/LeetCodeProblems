package sortColors;

public class sortColors {
	public static void sortColors(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;
        while(mid <= end){
            if(nums[mid] == 0){
                int tmp = nums[mid];
                nums[mid++] = nums[start];
                nums[start++] = tmp;
            }else if(nums[mid] == 1)
                mid++;
            else if(nums[mid] == 2){
                int tmp = nums[end];
                nums[end--] = nums[mid];
                nums[mid] = tmp;
            }
        }
    }

}
