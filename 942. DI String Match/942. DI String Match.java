package 942. DI String Match;

public class 942. DI String Match {
	public static int[] diStringMatch(String S) {
        int n= S.length();
        int I = 0, D = n;
        char ch[] = S.toCharArray();
        int res [] = new int [n+1];
        for(int i=0;i<n;i++)
        {
            if(ch[i] == 'I')
                res[i] = I++;
            else
                res[i] = D--;
        }
        res[n] = I;
        return res;
    }
}
