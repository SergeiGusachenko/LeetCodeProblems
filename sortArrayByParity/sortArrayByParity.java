package sortArrayByParity;

public static int[] sortArrayByParity(int[] A) {
	int [] result = new int[A.length];
	int last = result.length - 1;
	int first = 0;
	for(int i = 0; i < A.length; i++)
	{
		if(last != first){
			if(A[i] % 2 == 0){
				result[first] = A[i];
				first++;
			}else{
				result[last] = A[i];
				last--;
			}
		}else{
			result[last] = A[i];
			break;
		}

	}

	return result;
}