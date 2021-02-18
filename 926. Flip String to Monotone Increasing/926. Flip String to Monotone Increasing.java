package 926. Flip String to Monotone Increasing;

public class 926. Flip String to Monotone Increasing {
	public static int minFlipsMonoIncr(String S) {
        int zeros = 0, increasing_seq = 0;

        for(int i = 0; i < S.length(); i++)
        {
            if(S.charAt(i) == '0')
                zeros++;
            else
                increasing_seq++;
            increasing_seq = Math.max(increasing_seq, zeros);
        }

        return S.length() - increasing_seq;
    }
}
