package countSubstrings;

public class countSubstrings {
	public static int findOccurance(String s, int left, int right){
        int occurance = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            occurance++;
        }
        return occurance;
    }

    public static int countSubstrings(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            System.out.println( "i = " + i + " i + 1 = " + (i+1));
            result += findOccurance(s,i,i);
            result += findOccurance(s,i,i + 1);
        }
        return result;
    }
}
