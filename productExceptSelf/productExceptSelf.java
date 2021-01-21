package productExceptSelf;

public class productExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
		int [] arr= new int[nums.length];
		 arr[0]= 1;
		  for(int i = 1; i < nums.length; i++)
			  arr[i]= nums[i - 1] * arr[i - 1];
		  int tmp = 1;
		   for(int i = nums.length - 1; i >= 0; i--){
					  arr[i] = arr[i] * tmp;
					  tmp *= nums[i];
		   }
		  return arr;
	   }
}
