public class MinStack {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, middle;
        while(left <= right){
            middle = left + (right - left)/2;
            if(target == nums[middle])
                return middle;
            if(target > nums[middle])
                left = middle + 1;
            else
                right = middle - 1;
        }
        return left;
    }
}
