package findLength;

public  static int findLength(int[] A, int[] B) {
	int[][] result = new int[A.length][B.length];
	int final_max = 0;
	int max = 0;
	for (int i = 0; i < A.length; i++) {
		for (int j = 0; j < B.length; j++) {
			if (A[i] == B[j]) {
				if(i - 1 >= 0 && j - 1 >= 0)
					result[i][j] = result[i - 1][j - 1] + 1;
				else
					result[i][j] = 1;
				if (result[i][j] > max)
					max = result[i][j];
			}
			if (max > final_max)
				final_max = max;
		}
	}
	return final_max;
}
