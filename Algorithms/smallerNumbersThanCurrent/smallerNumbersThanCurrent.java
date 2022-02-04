package smallerNumbersThanCurrent;

public class smallerNumbersThanCurrent {
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.putIfAbsent(arr[i], i);
        }
        for(int i = 0; i < nums.length;i++){
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
