package 537. Complex Number Multiplication;

public class 537. Complex Number Multiplication {
	public String complexNumberMultiply(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i=0;
        int j=0;
        int r1 = 0;
        int r2=0;
        int i1=0;
        int i2=0;
        while(i<a.length()&&a.charAt(i)!='+')
            i++;
        while(j<b.length()&&b.charAt(j)!='+')
            j++;
        r1 = Integer.parseInt(a.substring(0, i));
        r2 = Integer.parseInt(b.substring(0, j));
        i1 = Integer.parseInt(a.substring(i + 1,a.length() - 1));
        i2 = Integer.parseInt(b.substring(j + 1,b.length() - 1));
        res.append(r1 * r2 - (i1 * i2) + "+" + (r1 * i2 + r2 * i1) + "i");
        return res.toString();
    }
}
