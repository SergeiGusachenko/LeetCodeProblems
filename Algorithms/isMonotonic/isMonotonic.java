package isMonotonic;


public static boolean isMonotonic(int[] A) {
	boolean increasing = false;
	boolean decreasing = false;
	for(int i = 1; i < A.length; i++){
		if(A[i] == A[i - 1])
			continue;
		else if(A[i] > A[i - 1])
			increasing = true;
		else
			decreasing = true;
	}
	if(decreasing == true && increasing == true)
		return false;
	return true;
}
