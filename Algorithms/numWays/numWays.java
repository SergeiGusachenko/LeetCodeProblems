package numWays;

public class numWays {
	public static  int numWays(String s) {
        char[] sc = s.toCharArray();
        int[] ones = new int[s.length()];
        int one = 0;
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] == '1') {
                ones[one] = i;
                one++;
            }
        }
        if (one % 3 != 0)  return 0;
        if (one == 0) {
            return (int)(((long)(s.length() - 2) *
                    (long)(s.length() - 1) / 2L) % 1000000007L);
        }

        int end1 = ones[one / 3 - 1];
        int start2 = ones[one / 3];
        int end2 = ones[one * 2 / 3 - 1];
        int start3 = ones[one * 2 / 3];
        return (int)((long)(start2 - end1) *
                (long)(start3 - end2) % 1000000007L);
    }
}
