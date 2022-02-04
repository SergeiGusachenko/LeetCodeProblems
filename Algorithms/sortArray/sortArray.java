package sortArray;

private static int getPivot(int[] nums, int low, int pivot) {
	int i = low - 1;
	for(int j = low; j < pivot; j++){
		if(nums[j] < nums[pivot]) {
			i++;
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}
	}
	int tmp = nums[i + 1];
	nums[i + 1] = nums[pivot];
	nums[pivot] = tmp;
	return i + 1;
}

private static void quickSort(int[] nums, int low, int high) {
	if(low < high){
		int pivot = getPivot(nums, low, high);
		quickSort(nums, low, pivot - 1);
		quickSort(nums, pivot + 1, high);
	}
}

public static int[] sortArray(int[] nums) {
	quickSort(nums,0, nums.length - 1);
	return nums;
}
