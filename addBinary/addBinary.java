package addBinary;

public class addBinary {
	public static String addBinary(String a, String b) {
        boolean ostatok = false;
        int size = Math.max(a.length(), b.length());
        StringBuilder res = new StringBuilder();
        StringBuilder a1 = new StringBuilder(a);
        a1 = a1.reverse();
        StringBuilder b1 = new StringBuilder(b);
        b1 = b1.reverse();
        for(int i = 0; i < size; i++){
            if(i < a.length() && i < b.length()) {
                if (a1.charAt(i) == '1' && b1.charAt(i) == '1') {
                    if(ostatok){
                        res.append('1');
                    }else{
                        ostatok = true;
                        res.append('0');
                    }
                } else if (a1.charAt(i) == '0' && b1.charAt(i) == '0'){
                    if(ostatok){
                        ostatok = false;
                        res.append('1');
                    }else
                        res.append('0');
                }else if(a1.charAt(i) == '1' && b1.charAt(i) == '0' || a1.charAt(i) == '0' && b1.charAt(i) == '1'){
                    if(ostatok)
                        res.append('0');
                    else
                        res.append('1');
                }
            }else if(i < a.length()){
                if(a1.charAt(i) == '1') {
                    if(ostatok)
                        res.append('0');
                    else
                        res.append('1');
                }
                else{
                    if(ostatok){
                        ostatok = false;
                        res.append('1');
                    }else
                        res.append('0');
                }
            }else if(i < b.length()){
                if(b1.charAt(i) == '1') {
                    if (ostatok)
                        res.append('0');
                    else
                        res.append('1');
                }
                else{
                    if(ostatok){
                        ostatok = false;
                        res.append('1');
                    }else
                        res.append('0');
                }
            }
        }
        if(ostatok)
            res.append('1');
        return res.reverse().toString();
    }

}
