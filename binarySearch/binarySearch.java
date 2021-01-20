package binarySearch;

public class binarySearch {

	private static boolean binarySearch(int nums[], int target)
    {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midle = left + (right - left) / 2;
            if (nums[midle] == target)
                return true;
            if (nums[midle] < target)
                left = midle + 1;
            else
                right = midle - 1;
        }
        return false;
    }

}
