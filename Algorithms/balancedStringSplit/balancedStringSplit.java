package balancedStringSplit;

public class balancedStringSplit {
	public static int balancedStringSplit(String s) {
        int pairs = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R')
                count++;
            if(s.charAt(i) == 'L')
                count--;
            if(count == 0)
                pairs++;
        }
        return pairs;
    }
}
