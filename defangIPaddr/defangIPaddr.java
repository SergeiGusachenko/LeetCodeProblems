public static String defangIPaddr(String address) {
	address.toLowerCase();
	StringBuilder res = new StringBuilder(address);
	for(int i = 0; i < res.length(); i++){
		if(res.charAt(i) == '.'){
			res.replace(i,i + 1, "[.]");
			i++;
		}
	}
	return res.toString();
}