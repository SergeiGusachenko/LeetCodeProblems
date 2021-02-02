package minSteps;

public class minSteps {
	public static int minSteps(String s, String t) {
		int[] letters = new int[30];
		int count = 0;

		for (int i=0; i< s.length();i++){
			letters[s.charAt(i) - 'a']++;
			letters[t.charAt(i) - 'a']--;
		}

		for (int i = 0; i < 30;i++){
			if (letters[i] > 0)
				count += letters[i];
		}

		return count;
	}

}
