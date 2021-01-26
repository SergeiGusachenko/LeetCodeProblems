package maxPower;

public class maxPower {
	public static int maxPower(String s) {
        int max = 1;
        int final_max = 1;
        for(int i = 1 ; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1))
                max++;
            else
                max = 1;
            if(max > final_max)
                final_max = max;
        }
        return final_max;
    }
}
