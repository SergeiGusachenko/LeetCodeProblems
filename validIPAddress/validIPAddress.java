package validIPAddress;

public class validIPAddress {
	public static String validIPAddress(String IP) {
        int column = 0;
        int dot = 0;
        for(int i = 0; i < IP.length(); i++){
            if(IP.charAt(i) == ':')
                column++;
            else if(IP.charAt(i) == '.')
                dot++;
        }
        if(dot != 3 && column != 7)
            return "Neither";
        String [] ip = null;
        ip = IP.split("\\.");
        if(ip.length != 4)
            ip = IP.split("\\:");
        if( ip.length != 8 && ip.length != 4)
            return "Neither";


        int isIp = 0;
        isIp = ip.length;
        if(isIp == 4){
            for(int i = 0; i < ip.length; i++){
                if (ip[i].length() < 1 || ip[i].length() > 3)
                    return "Neither";
                for(int j = 0; j < ip[i].length(); j++){
                    if(Character.isDigit(ip[i].charAt(j))){
                        if(j == 0 && ip[i].length() > 1 && ip[i].charAt(j) == '0')
                            return "Neither";
                    }else
                        return "Neither";
                }
                int num = Integer.parseInt(ip[i]);
                if(num < 0 || num > 255)
                    return "Neither";
            }
            return "IPv4";
        }else {
            for(int i = 0; i < ip.length; i++){
                int len = ip[i].length();
                if(len < 1 || len > 4)
                    return "Neither";
                if(ip[i].length() == 0)
                    return "Neither";
                for(int j = 0; j < ip[i].length(); j++){

                    if(!Character.isDigit(ip[i].charAt(j)) && !((ip[i].charAt(j) >='a' && ip[i].charAt(j) <= 'f') || ((ip[i].charAt(j) >='A' && ip[i].charAt(j) <= 'F'))))
                        return "Neither";
                }
            }
            return "IPv6";
        }
    }
}
