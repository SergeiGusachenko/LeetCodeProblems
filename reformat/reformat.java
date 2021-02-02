package reformat;

public class reformat {
	public static String reformat(String s) {
        int digits = 0;
        int letters = 0;
        StringBuilder l = new StringBuilder();
        StringBuilder d = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                letters++;
                l.append(s.charAt(i));
            }
            else{
                digits++;
                d.append(s.charAt(i));
            }

        }
        StringBuilder res = new StringBuilder(s);
     if(digits == letters || digits + 1 == letters || digits == letters + 1){
         int k = 0, j = 0;
         int set = 0;
         if(letters > digits){
            for(int i = 0; i < s.length();i++){
                if(set == 0){
                    res.setCharAt(i, l.charAt(k));
                    k++;
                    set = 1;
                }else {
                    res.setCharAt(i, d.charAt(j));
                    j++;
                    set = 0;
                }
            }
         }else{
             for(int i = 0; i < s.length();i++){
                 if(set == 0){
                     res.setCharAt(i, d.charAt(j));
                     j++;
                     set = 1;
                 }else {
                     res.setCharAt(i, l.charAt(k));
                     k++;
                     set = 0;
                 }
             }
         }
         return res.toString();
     }

        return new String();
    }
}
