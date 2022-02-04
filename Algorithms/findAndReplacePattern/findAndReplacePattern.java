package findAndReplacePattern;

public class findAndReplacePattern {
	public static int getPermutationNumber(String s){
		int permutation = 1;
		int [] map = new int[32];
		for(int i = 0; i <  s.length(); i++){
			int c = map[s.charAt(i)- 'a'] ;
			if(map[s.charAt(i) - 'a']  != 0)
				permutation += i * map[s.charAt(i) - 'a'];
			else
				map[s.charAt(i) - 'a'] = i + 1;
		}
		return permutation;
}

public static List<String> findAndReplacePattern(String[] words, String pattern) {
  List<String> list = new ArrayList<String>();
  int permutation = getPermutationNumber(pattern);
for(int i = 0; i < words.length; i++){
	int c = getPermutationNumber(words[i]);
	  if(permutation == getPermutationNumber(words[i]))
		  list.add(words[i]);
}
  return list;
}
}
