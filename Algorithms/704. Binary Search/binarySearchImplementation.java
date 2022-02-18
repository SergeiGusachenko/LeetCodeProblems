class Solution {
    public int search(int[] nums, int target) {
        int middle,left = 0, right = nums.length - 1;
        while(right >= left){
            middle = (right - left)/2 + left;
            if(target == nums[middle])
                return middle;
            if(target >= nums[middle])
                left = middle + 1;
            else
                right = middle - 1;

        }
        return -1;
    }
}