
public int[] plusOne(int[] digits) {
	int mem = 1;
	int[] array = new int[digits.length + 1];
	for(int i = digits.length - 1; i >= 0; i--){
		if(digits[i]+ mem >= 10){
			mem = 1;
			digits[i] = 0;
			array[i + 1] = 0;
		}else {
			digits[i] += mem;
			array[i + 1] = digits[i];
			mem = 0;
		}
	}
	if(mem == 1){
		array[0] = mem;
		return array;
	}
	return digits;
}
