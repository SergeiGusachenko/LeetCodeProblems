package 539. Minimum Time Difference;

public class 539. Minimum Time Difference {
	public static int findMinDifference(List<String> timePoints) {
        int [] arr = new int[timePoints.size()];
        int i = 0;
        int diff = Integer.MAX_VALUE;
        for(String s : timePoints){
            String [] s1 = s.split(":");
            arr[i] = Math.abs(Integer.parseInt(s1[0]) * 60 + Integer.parseInt(s1[1]));
            i++;
        }
        Arrays.sort(arr);
        i = 0;
        for( i = 0; i < arr.length - 1;i++)
            diff = Math.min(diff, arr[i + 1] - arr[i]);
        diff = Math.min(diff, arr[0] + (24 * 60 - arr[i]));
        return diff;
    }
}
