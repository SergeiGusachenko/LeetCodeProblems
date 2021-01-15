public static int[] decode(int[] encoded, int first) {
	int []result = new int[encoded.length+1];
	result[0] = first;
	int n = 1;
	for(int i = 0;i < encoded.length; i++){
		result[n] = result[n - 1] ^ encoded[i];
		n++;
	}
	return result;
}