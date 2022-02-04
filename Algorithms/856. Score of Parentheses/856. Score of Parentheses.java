package 856. Score of Parentheses;

public class 856. Score of Parentheses {
	public int scoreOfParentheses(String S) {
        int i = 0;
        int[] lvl = new int[26];
        for(char c: S.toCharArray()){
            if(c=='(') {
                i++;
            }
            else if(c==')') {
                lvl[i] += Math.max(2*lvl[i+1],1);
                lvl[i+1] = 0;
                i--;
            }
        }
        return lvl[1];
    }
}
