package 1051. Height Checker;

public class 1051. Height Checker {
	public int heightChecker(int[] heights) {
		int [] arr = heights;
		   int res = 0;
		   Arrays.sort(arr);
		   for(int i =0; i < heights.length; i++){
			   if(arr[i] != heights[i])
				   res++;
		   }
		   return res;
	   }
}
