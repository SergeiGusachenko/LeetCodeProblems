package 1395. Count Number of Teams;

public class 1395. Count Number of Teams {
	public int numTeams(int[] rating) {
		int n = rating.length;
		int ans = 0;

		for(int i=0; i<n; i++) {
			int l = 0;
			int r = 0;

			for(int j=0; j<i; j++) {
				if (rating[j] < rating[i]) l++;
			}

			for(int k=i+1; k<n; k++) {
				if (rating[i] < rating[k]) r++;
			}

			ans += (l*r) + (i-l)*(n - i - r - 1);
		}

		return ans;
	 }
}
