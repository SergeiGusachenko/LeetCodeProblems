package searchRange;

public class searchRange {
	public static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if (nums.length == 0 || target > nums[high] || target < nums[low])
            return new int[]{-1, -1};

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (target == nums[mid]) {
                int i = mid;
                int j = mid;
                while (i >= 0 && target == nums[i]) {
                    i--;
                }
                while (j <= nums.length - 1 && target == nums[j]) {
                    j++;
                }
                return new int[]{i + 1, j -1};
            }
            else if (target > nums[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
