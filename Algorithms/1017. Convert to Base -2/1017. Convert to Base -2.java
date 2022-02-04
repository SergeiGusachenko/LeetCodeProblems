package 1017. Convert to Base -2;

public class 1017. Convert to Base -2 {
	public String baseNeg2(int N) {
        if(N==0)return "0";
        StringBuilder res=new StringBuilder();
        while(N!=0){
            int mod=N%2;
            if(mod<0)mod=1;
            res.append(mod+"");
            N-=mod;
            N/=-2;
        }
        return res.reverse().toString();
    }
}
