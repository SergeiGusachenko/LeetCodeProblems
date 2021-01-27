package numDecodings;

public class numDecodings {
	public static int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        if (s.length() == 1) return 1;

        int[] result = new int[s.length()];
        result[0] = 1;
        for (int i = 1; i < s.length();i++){
            if (s.charAt(i) != '0')
                result[i] += result[i-1];

            if (s.charAt(i-1) != '0' && (s.charAt(i-1) - '0') * 10 + s.charAt(i) - '0' <= 26)
                result[i] += (i >= 2 ? result[i-2] : 1);

            if (result[i] == 0)
                return 0;
        }
        return result[s.length()-1];
    }
}
