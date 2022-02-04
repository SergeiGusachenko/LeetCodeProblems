package maximumWealth;


public static int maximumWealth(int[][] accounts) {
	int sum = 0;
	int max = 0;
	int m = accounts.length;
	int n;
	for(int i = 0; i < m ; i++){
		n = accounts[i].length;
		for(int j = 0; j < n; j++){
			sum = sum + accounts[i][j];
		}
		if(sum > max)
			max = sum;
		sum = 0;
	}

	return max;
}