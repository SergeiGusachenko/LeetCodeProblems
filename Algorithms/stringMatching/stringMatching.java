public static String getSubstring(int i , int j, String [] words){
	int first = words[i].indexOf(words[j]);
	int second  = words[j].indexOf(words[i]);
	if(first != -1) {
		return words[j];
	}
	if(second != -1)
		return words[i];
	return null;
}

public static List<String> stringMatching(String[] words) {
	List<String> list = new ArrayList<>();

	for(int i = 0; i < words.length; i++){
		for( int j = i ; j < words.length ; j++){
			if(i != j) {
				String s = getSubstring(i, j , words);
				if(s!= null && !list.contains(s))
					list.add(s);
			}

		}
	}
	return list;
}