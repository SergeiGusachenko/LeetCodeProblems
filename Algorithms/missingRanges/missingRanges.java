package missingRanges;

public class missingRanges {
	public static List<String> missingRanges(int []arr, int lower, int upper){
		List<String> res = new ArrayList<>(arr.length - 1);
		if(lower != arr[0] && arr[0] - lower != 2)
			res.add(String.valueOf(lower) + "->" + (arr[0] - 1));
		   else if( arr[0] - lower == 2)
			   res.add(String.valueOf(arr[0] - 1));
		for(int i = 1; i < arr.length; i++){
			if(arr[i] - arr[i - 1] > 1 && arr[i] - arr[i - 1] != 2)
			   res.add((arr[i - 1] + 1) + "->" + (arr[i] - 1));
			 else if(arr[i] - arr[i - 1] == 2 )
				res.add(String.valueOf(arr[i] - 1));
		}
		if(upper  > arr[arr.length - 1]  &&   upper - arr[arr.length - 1] != 2)
			res.add(String.valueOf(arr[arr.length - 1] + 1) + "->" + (upper));
		   else if( upper - arr[arr.length - 1] == 2)
			   res.add(String.valueOf(arr[arr.length - 1] + 1));
 return res;
}
}
