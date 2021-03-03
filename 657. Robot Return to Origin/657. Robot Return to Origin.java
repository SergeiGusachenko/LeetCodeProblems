package 657. Robot Return to Origin;

public class 657. Robot Return to Origin {
    public static boolean judgeCircle(String moves) {
        int left = 0;
        int up = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U')
                up++;
            else if(moves.charAt(i) == 'L')
                left++;
            else if(moves.charAt(i) == 'R')
                left--;
            else
                up--;

        }
        return left == 0 && up == 0;
    }
}
