class Solution {
	public String reverseWords(String s) {
	StringBuilder word = new StringBuilder();
	StringBuilder result = new StringBuilder();
	for(int i = 0; i < s.length(); i++){
		if(s.charAt(i) != ' ')
			word.append(s.charAt(i));
		else{
			result.append(word.reverse());
			result.append(' ');
			word.setLength(0);
		}

	}
	result.append(word.reverse());
	return result.toString();
}
}