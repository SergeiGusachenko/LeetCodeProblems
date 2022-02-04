package compress;

public class compress {
	public static int compress(char[] chars) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i + 1] != chars[i]) {
                chars[j++] = chars[k];
                if (i > k) {
                    int n = i - k + 1;
                    for (char c: Integer.toString(n).toCharArray())
                        chars[j++] = c;
                }
                k = i + 1;
            }
        }
        return j;
    }
}
