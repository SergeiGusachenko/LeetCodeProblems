package minFlips;

public class minFlips {
	public static int minFlips(String target) {
        char change = '0';
        int result = 0;
        for(int i = 0; i < target.length();i++){
            if(target.charAt(i) != change){
                change = (change == '0') ? '1' : '0';
                result++;
            }
        }
        return result;
    }
}
