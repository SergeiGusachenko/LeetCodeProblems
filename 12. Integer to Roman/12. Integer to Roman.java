package 12. Integer to Roman;

public class 12. Integer to Roman {
	public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        while(num != 0){
            if(num / 1000 >= 1) {
                res.append('M');
                num = num - 1000;
            }else if(num / 900 >= 1){
                res.append("CM");
                num = num - 900;
            }else  if(num / 500 >= 1){
                res.append('D');
                num = num - 500;
            }else if(num / 400 >= 1){
                res.append("CD");
                num = num - 400;
            }else if(num / 100 >= 1){
                res.append("C");
                num = num - 100;
            }else if(num / 90 >= 1){
                res.append("XC");
                num = num - 90;
            }else if(num / 50 >= 1){
                res.append('L');
                num = num - 50;
            }else if(num / 40 >= 1){
                res.append("XL");
                num = num - 40;
            }else if(num / 10 >= 1){
                res.append('X');
                num = num - 10;
            } else if(num / 9 >= 1){
                res.append("IX");
                num = num - 9;
            }else if(num / 5 >= 1){
                res.append('V');
                num = num - 5;
            }else if(num / 4 >= 1){
                res.append("IV");
                num = num  - 4;
            }else if(num / 1 >= 1){
                res.append("I");
                num = num - 1;
            }
        }
        return res.toString();
    }


}
