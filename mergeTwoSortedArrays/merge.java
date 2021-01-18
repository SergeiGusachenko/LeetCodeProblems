package mergeTwoSortedArrays;

public static void merge(int[] nums1, int m, int[] nums2, int n) {
	if (n == 0) return;
	int first = 0;
	int last = 0;

	while (first < m && last < n) {
		if (nums1[first] < nums2[last]) {
			first++;
		} else {
			for (int i = m - 1; i >= first; i--) {
				nums1[i + 1] = nums1[i];
			}
			nums1[first] = nums2[last];
			last++;
			m++;
		}
	}
	while (first < nums1.length && last < n) {
		nums1[first++] = nums2[last++];
	}
}