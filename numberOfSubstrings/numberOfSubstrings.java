package numberOfSubstrings;

public class numberOfSubstrings {
	public static int numberOfSubstrings(String s) {
		int[] arr = new int[3];
		long  result = (long) s.length() * (s.length() + 1) / 2;
		int left = 0;
		int right = 0;
		while(right < s.length()){
			arr[s.charAt(right) - 'a']++;
			right++;
			while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0){
				arr[s.charAt(left) - 'a']--;
				left++;
			}
			result -= right - left;
		}
		return (int)result;
	}
}
