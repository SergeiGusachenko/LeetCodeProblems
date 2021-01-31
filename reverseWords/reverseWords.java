
     public static String reverseWords(String s) {
		s = s.trim();
		String[] strings = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = strings.length - 1; i >= 0; i--) {
			sb.append(strings[i] + " ");
		}
		return sb.toString().trim();
	}