/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

	  public class Solution extends VersionControl {
		public int firstBadVersion(int n) {
			int left = 1, right = n, middle;
			while(left<=right){
				middle = left + (right -left)/2;
				if(isBadVersion(middle)){
					right = middle -1;
				}else
					left = middle + 1;
				if(isBadVersion(left))
					return left;
			}
			return left;
		}
	}