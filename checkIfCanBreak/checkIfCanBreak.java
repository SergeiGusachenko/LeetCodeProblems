package checkIfCanBreak;

public class checkIfCanBreak {
	public static boolean checkIfCanBreak(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b[i]) {
                res++;
            }
        }
        if (res == a.length)
            return true;
        res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= b[i]) {
                res++;
            }
        }
        return res == a.length;
    }
}
