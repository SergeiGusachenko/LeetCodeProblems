package halvesAreAlike;

public class halvesAreAlike {
	public boolean halvesAreAlike(String s) {
        int first_half = 0;
        int second_half = 0;
        for(int i = 0; i < s.length(); i++){
            if(i < s.length() / 2 && (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) =='u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')){
                first_half++;
            }
            else if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) =='u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
                second_half++;
        }
        if(second_half == first_half)
            return true;
        return false;
    }
}
